
package com.leporonitech.exchange.model;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "ecommerceId",
    "status",
    "createdAt",
    "updatedAt",
    "items",
    "invoices",
    "shipping"
})
public class SubOrder implements Serializable
{

    @JsonProperty("id")
    private Long id;
    @JsonProperty("ecommerceId")
    private Long ecommerceId;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("invoices")
    private List<Invoice> invoices = null;
    @JsonProperty("shipping")
    private Shipping shipping;
    private final static long serialVersionUID = 1712890276230276433L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SubOrder() {
    }

    /**
     * 
     * @param updatedAt
     * @param id
     * @param shipping
     * @param items
     * @param status
     * @param createdAt
     * @param ecommerceId
     * @param invoices
     */
    public SubOrder(Long id, Long ecommerceId, Status status, String createdAt, String updatedAt, List<Item> items, List<Invoice> invoices, Shipping shipping) {
        super();
        this.id = id;
        this.ecommerceId = ecommerceId;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.items = items;
        this.invoices = invoices;
        this.shipping = shipping;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("ecommerceId")
    public Long getEcommerceId() {
        return ecommerceId;
    }

    @JsonProperty("ecommerceId")
    public void setEcommerceId(Long ecommerceId) {
        this.ecommerceId = ecommerceId;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("invoices")
    public List<Invoice> getInvoices() {
        return invoices;
    }

    @JsonProperty("invoices")
    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    @JsonProperty("shipping")
    public Shipping getShipping() {
        return shipping;
    }

    @JsonProperty("shipping")
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

	@Override
	public String toString() {
		return "SubOrder [id=" + id + ", ecommerceId=" + ecommerceId + ", status=" + status + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", items=" + items + ", invoices=" + invoices + ", shipping=" + shipping
				+ "]";
	}
    
    
}
