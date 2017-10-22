
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "digit",
    "name",
    "address",
    "cpf"
})
public class Customer implements Serializable
{

    @JsonProperty("id")
    private Long id;
    @JsonProperty("digit")
    private Long digit;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("cnpj")
    private String cnpj;
    private final static long serialVersionUID = -3106096626065281156L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Customer() {
    }

    /**
     * 
     * @param digit
     * @param id
     * @param address
     * @param name
     * @param cpf
     */
    public Customer(Long id, Long digit, String name, Address address, String cpf) {
        super();
        this.id = id;
        this.digit = digit;
        this.name = name;
        this.address = address;
        this.cpf = cpf;
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

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
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
		return "Customer [id=" + id + ", digit=" + digit + ", name=" + name + ", address=" + address + ", cpf=" + cpf
				+ "]";
	}
    
    
}
