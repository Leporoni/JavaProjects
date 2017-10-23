package com.leporonitech.exchange.business;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leporonitech.exchange.component.ExceptionThrower;
import com.leporonitech.exchange.model.CustomException;
import com.leporonitech.exchange.model.Item;
import com.leporonitech.exchange.model.Record;
import com.leporonitech.exchange.model.Result;
import com.leporonitech.exchange.model.SubOrder;
import com.leporonitech.exchange.security.AuthenticationToken;
import com.luizalabs.resource.exceptions.EntityNotFoundException;

@Service
@Transactional
public class ResultBusiness extends AuthenticationToken {

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	// metodo que consulta os parametros na webconfig
	public String consultParams(String param) throws JsonParseException, JsonMappingException, IOException {

		String url = "http://localhost:8081/v1/template/webconfigs/" + param;

		Result params;
		String result = null;
		

		ResponseEntity<Result> responseEntity = null;

		try {

			responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<Result>() {
			});
			params = responseEntity.getBody();
			result = params.getRecords().get(0).getValor();

		} catch (EntityNotFoundException e) {

			throw new EntityNotFoundException("Parameters");
		}

		return result;

	}

	// Metodo que retorna a diferença de dias entre a data de entrega e a data atual
	public Long differenceDays(String date) {
		LocalDateTime dtToday = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		LocalDateTime dtOther = LocalDateTime.parse(date, formatter);

		Long days = ChronoUnit.DAYS.between(dtOther, dtToday);

		return days;
	}

	public Result findOrdersPeriod(Integer offset, Integer limit, String customer_cpf, String customer_cnpj, String customer_id) throws JsonParseException, JsonMappingException, IOException, CustomException{
		String url = "/v2/legacy/orders?offset="+offset+"&limit="+limit; //Informar url dos dados para serem utilizados na pesquisa
		
		Result orders = null;
		
		if(!(customer_cpf.equalsIgnoreCase("0"))) {
			url += "&customer.cpf="+customer_cpf;
		}
		if(!(customer_cnpj.equalsIgnoreCase("0"))) {
			url += "&customer.cnpj="+customer_cnpj;
		}
		if(!(customer_id.equalsIgnoreCase("0"))) {
			url += "&customer.id="+customer_id;
		}
		
		
		ObjectMapper mapper = new ObjectMapper();
        ResponseEntity<Result> responseEntity = null; 

        try {
            responseEntity = restTemplate.exchange(url, HttpMethod.GET, AuthenticationToken.tokenAuthentication(), new ParameterizedTypeReference<Result>() {});                     	
            orders = responseEntity.getBody();
        }catch(HttpClientErrorException e) {
        	
          // converte o erro da api consumida em objeto
          Result obj = mapper.readValue(e.getResponseBodyAsString(), Result.class);
        	
        	
        	//throw new EntityNotFoundException("Orders");
        	
        	ExceptionThrower eT = new ExceptionThrower();
        	eT.throwCustomException(obj.getDeveloperMessage(),obj.getUserMessage(), obj.getErrorCode(), obj.getMoreInfo(), e.getStatusCode());
        	}
 

        //long busca o resultado do parametro de quantidades de dias para troca
        Long quantityDaysTDC = Long.valueOf(consultParams("QtdDiasLimiteTroca"));
  
       
        // Percorre objeto para verificar a elegibilidade dos itens  a partir da data de entrega dos itens
        for(Record r : orders.getRecords()) {
        	
        	for(SubOrder s : r.getSubOrders()) {
        		
        		// Long busca a diferença de dias entre a entrega do pedido e a data atual
        		Long daysDifference = differenceDays(s.getCreatedAt()); /*ALTERAR*/
        																	// UTILIZAR A DATA DE ENTREGA DO PEDIDO E REMOVER ESSA ANOTAÇÂO
        		   		
        		// Regra 1° verifica prazo de troca do produto
        		if(daysDifference > quantityDaysTDC) {
        			for(Item i : s.getItems()) {
        				i.setElegible(false);
        				i.setDetails("Produto fora do prazo de troca");
            		}
        		}
        	}
        }
      
        return orders;
	}

	public Result findOrdersEligibility(Integer offset, Integer limit, String sub_ecommerce_id){
		String url = "/v2/legacy/orders?offset="+offset+"&limit="+limit; //Informar url dos dados para serem utilizados na pesquisa
		
		Result orders = null;
		
		if(!(sub_ecommerce_id.equalsIgnoreCase("0"))) {
			url += "&suborders.ecommerceid="+sub_ecommerce_id;
		}
		
		
		
		
        ResponseEntity<Result> responseEntity = null; 

        try {
            responseEntity = restTemplate.exchange(url, HttpMethod.GET, AuthenticationToken.tokenAuthentication(), new ParameterizedTypeReference<Result>() {});                     	
            orders = responseEntity.getBody();
        }catch(HttpClientErrorException e) {
        	   

        
        	throw new EntityNotFoundException("Orders");
        	
        	
        	}
 

        // Percorre objeto para verificar a elegibilidade dos itens  a partir da data de entrega dos itens
        for(Record r : orders.getRecords()) {
        	
        	for(SubOrder s : r.getSubOrders()) {
       
        		// Regra que verifica se pedido possui vendedor vinculado
        		if (r.getSeller().getId().toString().isEmpty() || r.getSeller().getId() == 0) {
        		     for (Item i : s.getItems()) {
        		      i.setElegible(false);
        		      i.setDetails("Pedido não possui vendedor vinculado");
        		     }
        		}
        	}
        }
        	
        return orders;
	}
}
