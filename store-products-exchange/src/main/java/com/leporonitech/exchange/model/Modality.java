
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
public class Modality implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("description")
    private String description;
    private final static long serialVersionUID = -8062142406162538613L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Modality() {
    }

    /**
     * 
     * @param id
     * @param description
     */
    public Modality(String id, String description) {
        super();
        this.id = id;
        this.description = description;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
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
		return "Modality [id=" + id + ", description=" + description + "]";
	}
    
    
}
