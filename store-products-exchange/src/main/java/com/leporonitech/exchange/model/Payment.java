
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "condition"
})
public class Payment implements Serializable
{

    @JsonProperty("condition")
    private Condition condition;
    private final static long serialVersionUID = 5684810180717710773L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payment() {
    }

    /**
     * 
     * @param condition
     */
    public Payment(Condition condition) {
        super();
        this.condition = condition;
    }

    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

	@Override
	public String toString() {
		return "Payment [condition=" + condition + "]";
	}
    
    
}
