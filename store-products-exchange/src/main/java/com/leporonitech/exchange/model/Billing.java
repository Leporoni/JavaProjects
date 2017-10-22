
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "branch",
    "createdAt"
})
public class Billing implements Serializable
{

    @JsonProperty("branch")
    private Branch branch;
    @JsonProperty("createdAt")
    private String createdAt;
    private final static long serialVersionUID = -2271644413236136197L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Billing() {
    }

    /**
     * 
     * @param createdAt
     * @param branch
     */
    public Billing(Branch branch, String createdAt) {
        super();
        this.branch = branch;
        this.createdAt = createdAt;
    }

    @JsonProperty("branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

	@Override
	public String toString() {
		return "Billing [branch=" + branch + ", createdAt=" + createdAt + "]";
	}
    
    
}
