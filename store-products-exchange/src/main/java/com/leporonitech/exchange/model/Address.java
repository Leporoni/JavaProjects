
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "zipcode",
    "street",
    "number",
    "complement",
    "district",
    "city",
    "state"
})
public class Address implements Serializable
{

    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("street")
    private String street;
    @JsonProperty("number")
    private String number;
    @JsonProperty("complement")
    private String complement;
    @JsonProperty("district")
    private String district;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    private final static long serialVersionUID = 3575857067871142930L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param complement
     * @param street
     * @param zipcode
     * @param state
     * @param number
     * @param district
     * @param city
     */
    public Address(String zipcode, String street, String number, String complement, String district, String city, String state) {
        super();
        this.zipcode = zipcode;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("complement")
    public String getComplement() {
        return complement;
    }

    @JsonProperty("complement")
    public void setComplement(String complement) {
        this.complement = complement;
    }

    @JsonProperty("district")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + ", street=" + street + ", number=" + number + ", complement="
				+ complement + ", district=" + district + ", city=" + city + ", state=" + state + "]";
	}

    
}
