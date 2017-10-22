
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product",
    "quantity",
    "value"
})
public class Item implements Serializable
{

    @JsonProperty("product")
    private Product product;
    @JsonProperty("quantity")
    private Long quantity;
    @JsonProperty("value")
    private Double value;
    @JsonProperty("elegible")
    private Boolean elegible = true;
    @JsonProperty("details")
    private String details = "Item passivel de troca";
    private final static long serialVersionUID = 3642096403773406948L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param product
     * @param value
     * @param quantity
     */
    public Item(Product product, Long quantity, Double value) {
        super();
        this.product = product;
        this.quantity = quantity;
        this.value = value;
    }
    
    
    @JsonProperty("elegible")
    public Boolean getElegible() {
		return elegible;
	}
    
    @JsonProperty("elegible")
	public void setElegible(Boolean elegible) {
		this.elegible = elegible;
	}
	
	@JsonProperty("details")
	public String getDetails() {
		return details;
	}

	@JsonProperty("details")
	public void setDetails(String details) {
		this.details = details;
	}

	@JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonProperty("quantity")
    public Long getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
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
		return "Item [product=" + product + ", quantity=" + quantity + ", value=" + value + "]";
	}
    
    
}
