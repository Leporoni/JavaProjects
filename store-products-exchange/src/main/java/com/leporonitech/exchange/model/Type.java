
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "description"
})
public class Type implements Serializable
{

    @JsonProperty("id")
    private Long id;
    @JsonProperty("description")
    private String description;
    private final static long serialVersionUID = -818734806469662490L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Type() {
    }

    /**
     * 
     * @param id
     * @param description
     */
    public Type(Long id, String description) {
        super();
        this.id = id;
        this.description = description;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

	@Override
	public String toString() {
		return "Type [id=" + id + ", description=" + description + "]";
	}
    
    
}
