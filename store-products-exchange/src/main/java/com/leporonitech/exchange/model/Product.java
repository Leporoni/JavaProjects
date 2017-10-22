
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "digit",
    "sku",
    "price",
    "description",
    "barcode"
})
public class Product implements Serializable
{

    @JsonProperty("id")
    private Long id;
    @JsonProperty("digit")
    private Long digit;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("description")
    private String description;
    @JsonProperty("barcode")
    private Long barcode;
    private final static long serialVersionUID = -6146208862538062007L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param digit
     * @param id
     * @param price
     * @param description
     * @param barcode
     * @param sku
     */
    public Product(Long id, Long digit, String sku, Double price, String description, Long barcode) {
        super();
        this.id = id;
        this.digit = digit;
        this.sku = sku;
        this.price = price;
        this.description = description;
        this.barcode = barcode;
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

    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("barcode")
    public Long getBarcode() {
        return barcode;
    }

    @JsonProperty("barcode")
    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", digit=" + digit + ", sku=" + sku + ", price=" + price + ", description="
				+ description + ", barcode=" + barcode + "]";
	}
    
    
}
