
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "origin",
    "modality",
    "modal",
    "carrier",
    "recipient",
    "date"
})
public class Shipping implements Serializable
{

    @JsonProperty("origin")
    private Origin origin;
    @JsonProperty("modality")
    private Modality modality;
    @JsonProperty("modal")
    private Modal modal;
    @JsonProperty("carrier")
    private Carrier carrier;
    @JsonProperty("recipient")
    private Recipient recipient;
    @JsonProperty("date")
    private String date;
    private final static long serialVersionUID = -4681394796655694105L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Shipping() {
    }

    /**
     * 
     * @param origin
     * @param carrier
     * @param modality
     * @param modal
     * @param recipient
     */
    public Shipping(Origin origin, Modality modality, Modal modal, Carrier carrier, Recipient recipient, String date) {
        super();
        this.origin = origin;
        this.modality = modality;
        this.modal = modal;
        this.carrier = carrier;
        this.recipient = recipient;
        this.date = date;
    }
    
    
    
    @JsonProperty("date")
    public String getDate() {
		return date;
	}
    
    @JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("origin")
    public Origin getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    @JsonProperty("modality")
    public Modality getModality() {
        return modality;
    }

    @JsonProperty("modality")
    public void setModality(Modality modality) {
        this.modality = modality;
    }

    @JsonProperty("modal")
    public Modal getModal() {
        return modal;
    }

    @JsonProperty("modal")
    public void setModal(Modal modal) {
        this.modal = modal;
    }

    @JsonProperty("carrier")
    public Carrier getCarrier() {
        return carrier;
    }

    @JsonProperty("carrier")
    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("recipient")
    public Recipient getRecipient() {
        return recipient;
    }

    @JsonProperty("recipient")
    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

	@Override
	public String toString() {
		return "Shipping [origin=" + origin + ", modality=" + modality + ", modal=" + modal + ", carrier=" + carrier
				+ ", recipient=" + recipient + "]";
	}
    
    
}
