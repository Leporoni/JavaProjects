
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "id",
    "digit",
    "name",
    "cpf"
})
public class Recipient implements Serializable
{

    @JsonProperty("address")
    private Address address;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("digit")
    private Long digit;
    @JsonProperty("name")
    private String name;
    @JsonProperty("cpf")
    private String cpf;
    private final static long serialVersionUID = 1353545335638400457L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Recipient() {
    }

    /**
     * 
     * @param digit
     * @param id
     * @param address
     * @param name
     * @param cpf
     */
    public Recipient(Address address, Long id, Long digit, String name, String cpf) {
        super();
        this.address = address;
        this.id = id;
        this.digit = digit;
        this.name = name;
        this.cpf = cpf;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("digit")
    public Long getDigit() {
        return digit;
    }

    @JsonProperty("digit")
    public void setDigit(Long digit) {
        this.digit = digit;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("cpf")
    public String getCpf() {
        return cpf;
    }

    @JsonProperty("cpf")
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

	@Override
	public String toString() {
		return "Recipient [address=" + address + ", id=" + id + ", digit=" + digit + ", name=" + name + ", cpf=" + cpf
				+ "]";
	}
    
    
}
