
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id"
})
public class Modal implements Serializable
{

    @JsonProperty("id")
    private String id;
    private final static long serialVersionUID = -6847329589236648086L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Modal() {
    }

    /**
     * 
     * @param id
     */
    public Modal(String id) {
        super();
        this.id = id;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

	@Override
	public String toString() {
		return "Modal [id=" + id + "]";
	}
    
    
}
