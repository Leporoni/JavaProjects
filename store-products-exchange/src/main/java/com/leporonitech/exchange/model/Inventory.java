
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "branch"
})
public class Inventory implements Serializable
{

    @JsonProperty("branch")
    private Branch branch;
    private final static long serialVersionUID = 3574545896911490116L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Inventory() {
    }

    /**
     * 
     * @param branch
     */
    public Inventory(Branch branch) {
        super();
        this.branch = branch;
    }

    @JsonProperty("branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

	@Override
	public String toString() {
		return "Inventory [branch=" + branch + "]";
	}
    
    
}
