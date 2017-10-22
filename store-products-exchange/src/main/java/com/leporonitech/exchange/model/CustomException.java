package com.leporonitech.exchange.model;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class CustomException extends Exception {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String developerMessage;
		private String userMessage;
		private Long errorCode;
		private String moreInfo;
		private HttpStatus httpStatus;
		
		
		
		public HttpStatus getHttpStatus() {
			return httpStatus;
		}
		public void setHttpStatus(HttpStatus httpStatus) {
			this.httpStatus = httpStatus;
		}
		public String getDeveloperMessage() {
			return developerMessage;
		}
		public void setDeveloperMessage(String developerMessage) {
			this.developerMessage = developerMessage;
		}
		public String getUserMessage() {
			return userMessage;
		}
		public void setUserMessage(String userMessage) {
			this.userMessage = userMessage;
		}
		public Long getErrorCode() {
			return errorCode;
		}
		public void setErrorCode(Long errorCode) {
			this.errorCode = errorCode;
		}
		public String getMoreInfo() {
			return moreInfo;
		}
		public void setMoreInfo(String moreInfo) {
			this.moreInfo = moreInfo;
		}
		
		
		
		
}
