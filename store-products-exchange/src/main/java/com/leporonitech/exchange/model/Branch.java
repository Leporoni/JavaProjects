
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id"
})
public class Branch implements Serializable
{

    @JsonProperty("id")
    private Long id;
    private final static long serialVersionUID = -3557892077974315021L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Branch() {
    }

    /**
     * 
     * @param id
     */
    public Branch(Long id) {
        super();
        this.id = id;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

	@Override
	public String toString() {
		return "Branch [id=" + id + "]";
	}
    
    
}
