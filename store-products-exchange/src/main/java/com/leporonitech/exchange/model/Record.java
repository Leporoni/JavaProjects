
package com.leporonitech.exchange.model;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "branch",
    "inventory",
    "billing",
    "seller",
    "subOrders",
    "customer",
    "payment",
    "shipping"
})
public class Record implements Serializable
{

    @JsonProperty("id")
    private Long id;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("branch")
    private Branch branch;
    @JsonProperty("inventory")
    private Inventory inventory;
    @JsonProperty("billing")
    private Billing billing;
    @JsonProperty("seller")
    private Seller seller;
    @JsonProperty("subOrders")
    private List<SubOrder> subOrders = null;
    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("payment")
    private Payment payment;
    @JsonProperty("shipping")
    private Shipping shipping;
    @JsonProperty("chave")
    private String chave;
    @JsonProperty("valor")
    private String valor;
    @JsonProperty("obs")
    private String obs;
    private final static long serialVersionUID = 4008457325343348094L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record() {
    }

    /**
     * 
     * @param id
     * @param shipping
     * @param billing
     * @param payment
     * @param inventory
     * @param branch
     * @param customer
     * @param type
     * @param seller
     * @param subOrders
     */
    public Record(Long id, Type type, Branch branch, Inventory inventory, Billing billing, Seller seller, List<SubOrder> subOrders, Customer customer, Payment payment, Shipping shipping) {
        super();
        this.id = id;
        this.type = type;
        this.branch = branch;
        this.inventory = inventory;
        this.billing = billing;
        this.seller = seller;
        this.subOrders = subOrders;
        this.customer = customer;
        this.payment = payment;
        this.shipping = shipping;
    }
    
    
    @JsonProperty("chave")
    public String getChave() {
		return chave;
	}

    @JsonProperty("chave")
	public void setChave(String chave) {
		this.chave = chave;
	}

    @JsonProperty("valor")
	public String getValor() {
		return valor;
	}

    @JsonProperty("valor")
	public void setValor(String valor) {
		this.valor = valor;
	}

    @JsonProperty("obs")
	public String getObs() {
		return obs;
	}

    @JsonProperty("obs")
	public void setObs(String obs) {
		this.obs = obs;
	}

	@JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
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

    @JsonProperty("inventory")
    public Inventory getInventory() {
        return inventory;
    }

    @JsonProperty("inventory")
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @JsonProperty("billing")
    public Billing getBilling() {
        return billing;
    }

    @JsonProperty("billing")
    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    @JsonProperty("seller")
    public Seller getSeller() {
        return seller;
    }

    @JsonProperty("seller")
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @JsonProperty("subOrders")
    public List<SubOrder> getSubOrders() {
        return subOrders;
    }

    @JsonProperty("subOrders")
    public void setSubOrders(List<SubOrder> subOrders) {
        this.subOrders = subOrders;
    }

    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonProperty("payment")
    public Payment getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(Payment payment) {
        this.payment = payment;
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
		return "Record [id=" + id + ", type=" + type + ", branch=" + branch + ", inventory=" + inventory + ", billing="
				+ billing + ", seller=" + seller + ", subOrders=" + subOrders + ", customer=" + customer + ", payment="
				+ payment + ", shipping=" + shipping + "]";
	}
    
    
}	
