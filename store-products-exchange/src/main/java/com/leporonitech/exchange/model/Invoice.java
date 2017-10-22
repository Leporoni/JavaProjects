
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "number",
    "serie",
    "issueDate",
    "type",
    "branch",
    "value"
})
public class Invoice implements Serializable
{

    @JsonProperty("key")
    private String key;
    @JsonProperty("number")
    private Long number;
    @JsonProperty("serie")
    private String serie;
    @JsonProperty("issueDate")
    private String issueDate;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("branch")
    private Branch branch;
    @JsonProperty("value")
    private Double value;
    private final static long serialVersionUID = -8941674614272711051L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Invoice() {
    }

    /**
     * 
     * @param serie
     * @param value
     * @param branch
     * @param issueDate
     * @param number
     * @param type
     * @param key
     */
    public Invoice(String key, Long number, String serie, String issueDate, Type type, Branch branch, Double value) {
        super();
        this.key = key;
        this.number = number;
        this.serie = serie;
        this.issueDate = issueDate;
        this.type = type;
        this.branch = branch;
        this.value = value;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Long number) {
        this.number = number;
    }

    @JsonProperty("serie")
    public String getSerie() {
        return serie;
    }

    @JsonProperty("serie")
    public void setSerie(String serie) {
        this.serie = serie;
    }

    @JsonProperty("issueDate")
    public String getIssueDate() {
        return issueDate;
    }

    @JsonProperty("issueDate")
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    @JsonProperty("branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

	@Override
	public String toString() {
		return "Invoice [key=" + key + ", number=" + number + ", serie=" + serie + ", issueDate=" + issueDate
				+ ", type=" + type + ", branch=" + branch + ", value=" + value + "]";
	}
    
    
}
