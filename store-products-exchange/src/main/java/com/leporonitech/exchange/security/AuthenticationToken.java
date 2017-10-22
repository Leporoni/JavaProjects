package com.leporonitech.exchange.security;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class AuthenticationToken {

	public static HttpEntity<String> tokenAuthentication(){
		

		String accessToken = "nGKhEAhzBugMQxUdK4RhHiUGQRGN";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer "+accessToken);
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		return entity;
	}
	
}
