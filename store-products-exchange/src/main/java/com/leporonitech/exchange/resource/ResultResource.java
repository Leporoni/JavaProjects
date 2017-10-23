package com.leporonitech.exchange.resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.http.HttpStatus.OK;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.leporonitech.exchange.business.ResultBusiness;
import com.leporonitech.exchange.model.CustomException;
import com.leporonitech.exchange.model.Result;
import com.luizalabs.resource.BaseResource;

@RestController
@RequestMapping("/v1/eligibility/orders")
public class ResultResource extends BaseResource {

	private final Logger LOGGER = Logger.getLogger(ResultResource.class);
	
	@Autowired
	private final ResultBusiness resultBusiness;

	@Autowired
	public ResultResource(ResultBusiness resultBusiness) {
		this.resultBusiness = resultBusiness;
	}

	@RequestMapping(value="/swap/period", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseEntity<?> listSwapPeriod(
			@RequestParam(name = "offset", required = false, defaultValue = "0") Integer offset,
			@RequestParam(name = "limit", required = false, defaultValue = "50") Integer limit,
			@RequestParam(name = "customer.cpf", required = false, defaultValue = "0") String customer_cpf,
			@RequestParam(name= "customer.cnpj", required = false, defaultValue= "0") String customer_cnpj,
			@RequestParam(name= "customer.id", required = false, defaultValue= "0") String customer_id) throws JsonParseException, JsonMappingException, IOException, CustomException{

		LOGGER.info("GET /v1/period");

	
        Result orders =  resultBusiness.findOrdersPeriod(offset, limit, customer_cpf, customer_cnpj, customer_id);
        
        
        
		return new ResponseEntity<>(orders, OK);
 
	}
	
	@RequestMapping(value="/swap/eligibility", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseEntity<?> listEligibilitySwap(
			@RequestParam(name = "offset", required = false, defaultValue = "0") Integer offset,
			@RequestParam(name = "limit", required = false, defaultValue = "50") Integer limit,
			@RequestParam(name = "suborders.ecommerceid", required = false, defaultValue = "0") String sub_ecommerce_id){

		LOGGER.info("GET /v1/eligibility");

	
        Result orders =  resultBusiness.findOrdersEligibility(offset, limit, sub_ecommerce_id);
        
        
        
		return new ResponseEntity<>(orders, OK);
 
	}


}
