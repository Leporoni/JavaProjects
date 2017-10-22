
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "packingList"
})
public class Carrier implements Serializable
{

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("packingList")
    private Long packingList;
    private final static long serialVersionUID = -1279549593640202779L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Carrier() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param packingList
     */
    public Carrier(Long id, String name, Long packingList) {
        super();
        this.id = id;
        this.name = name;
        this.packingList = packingList;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("packingList")
    public Long getPackingList() {
        return packingList;
    }

    @JsonProperty("packingList")
    public void setPackingList(Long packingList) {
        this.packingList = packingList;
    }

	@Override
	public String toString() {
		return "Carrier [id=" + id + ", name=" + name + ", packingList=" + packingList + "]";
	}
    
    
}
