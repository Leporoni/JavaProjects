
package com.leporonitech.exchange.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "records"
})
public class Result implements Serializable
{

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("records")
    private List<Record> records = null;
    @JsonProperty("developerMessage")
    private String developerMessage;
    @JsonProperty("userMessage")
    private String userMessage;
    @JsonProperty("errorCode")
    private Long errorCode;
    @JsonProperty("moreInfo")
    private String moreInfo;
    @JsonIgnore
    private HttpStatus statusCode;
    private final static long serialVersionUID = 5237088585377155107L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param records
     * @param meta
     */
    public Result(Meta meta, List<Record> records) {
        super();
        this.meta = meta;
        this.records = records;
    }
    

    public HttpStatus getStatusCode() {
    	return statusCode;
    }
    

    public void setStatusCode(HttpStatus statusCode) {
    	this.statusCode= statusCode;
    }
    
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("records")
    public List<Record> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<Record> records) {
        this.records = records;
    }
    
    
    @JsonProperty("developerMessage")
	public String getDeveloperMessage() {
		return developerMessage;
	}
    
    @JsonProperty("developerMessage")
	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

    @JsonProperty("userMessage")
	public String getUserMessage() {
		return userMessage;
	}

    @JsonProperty("userMessage")
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

    @JsonProperty("errorCode")
	public Long getErrorCode() {
		return errorCode;
	}

    @JsonProperty("errorCode")
	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}
    
    @JsonProperty("moreInfo")
	public String getMoreInfo() {
		return moreInfo;
	}

    @JsonProperty("moreInfo")
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

	@Override
	public String toString() {
		return "Result [meta=" + meta + ", records=" + records + "]";
	}
    
	
    
}
