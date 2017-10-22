
package com.leporonitech.exchange.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "server",
    "limit",
    "offset",
    "recordCount"
})
public class Meta implements Serializable
{

    @JsonProperty("server")
    private String server;
    @JsonProperty("limit")
    private Long limit;
    @JsonProperty("offset")
    private Long offset;
    @JsonProperty("recordCount")
    private Long recordCount;
    private final static long serialVersionUID = -4213192925378921531L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param recordCount
     * @param limit
     * @param server
     * @param offset
     */
    public Meta(String server, Long limit, Long offset, Long recordCount) {
        super();
        this.server = server;
        this.limit = limit;
        this.offset = offset;
        this.recordCount = recordCount;
    }

    @JsonProperty("server")
    public String getServer() {
        return server;
    }

    @JsonProperty("server")
    public void setServer(String server) {
        this.server = server;
    }

    @JsonProperty("limit")
    public Long getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    @JsonProperty("offset")
    public Long getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Long offset) {
        this.offset = offset;
    }

    @JsonProperty("recordCount")
    public Long getRecordCount() {
        return recordCount;
    }

    @JsonProperty("recordCount")
    public void setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
    }

	@Override
	public String toString() {
		return "Meta [server=" + server + ", limit=" + limit + ", offset=" + offset + ", recordCount=" + recordCount
				+ "]";
	}
    
    
}
