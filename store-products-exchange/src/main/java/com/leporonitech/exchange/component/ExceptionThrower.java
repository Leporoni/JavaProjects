package com.leporonitech.exchange.component;

import org.springframework.http.HttpStatus;

import com.leporonitech.exchange.model.CustomException;

public class ExceptionThrower {
	public void throwGeneralException() throws Exception{
		Exception e = new Exception("Error from General Exception");
		throw e;
	}
	
	public void throwCustomException(String developerMessage, String userMessage, Long errorCode, String moreInfo, HttpStatus httpStatus) throws CustomException{
		CustomException e = new CustomException();
		e.setDeveloperMessage(developerMessage);
		e.setUserMessage(userMessage);
		e.setErrorCode(errorCode);
		e.setMoreInfo(moreInfo);
		e.setHttpStatus(httpStatus);
		throw e;
	}
}
