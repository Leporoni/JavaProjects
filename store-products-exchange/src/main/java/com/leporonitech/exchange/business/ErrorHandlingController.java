package com.leporonitech.exchange.business;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.leporonitech.exchange.model.CustomException;
import com.leporonitech.exchange.model.ExceptionResponse;

@ControllerAdvice
public class ErrorHandlingController {
	
	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ExceptionResponse>specialException(CustomException e) throws Exception{
		
		ExceptionResponse eR = new ExceptionResponse();
		eR.setDeveloperMessage(e.getDeveloperMessage());
		eR.setUserMessage(e.getUserMessage());
		eR.setErrorCode(e.getErrorCode());
		eR.setMoreInfo(e.getMoreInfo());
		
		return new ResponseEntity<ExceptionResponse>(eR, e.getHttpStatus());
	}
	
}
