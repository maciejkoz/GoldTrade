package com.example.GoldTradeDemo.exchange;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "spreadProfile",
        "bidSpread",
        "askSpread",
        "bid",
        "ask"
})
public class SpreadProfilePrice {

    @JsonProperty("spreadProfile")
    private String spreadProfile;
    @JsonProperty("bidSpread")
    private Double bidSpread;
    @JsonProperty("askSpread")
    private Double askSpread;
    @JsonProperty("bid")
    private Double bid;
    @JsonProperty("ask")
    private Double ask;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("spreadProfile")
    public String getSpreadProfile() {
        return spreadProfile;
    }

    @JsonProperty("spreadProfile")
    public void setSpreadProfile(String spreadProfile) {
        this.spreadProfile = spreadProfile;
    }

    @JsonProperty("bidSpread")
    public Double getBidSpread() {
        return bidSpread;
    }

    @JsonProperty("bidSpread")
    public void setBidSpread(Double bidSpread) {
        this.bidSpread = bidSpread;
    }

    @JsonProperty("askSpread")
    public Double getAskSpread() {
        return askSpread;
    }

    @JsonProperty("askSpread")
    public void setAskSpread(Double askSpread) {
        this.askSpread = askSpread;
    }

    @JsonProperty("bid")
    public Double getBid() {
        return bid;
    }

    @JsonProperty("bid")
    public void setBid(Double bid) {
        this.bid = bid;
    }

    @JsonProperty("ask")
    public Double getAsk() {
        return ask;
    }

    @JsonProperty("ask")
    public void setAsk(Double ask) {
        this.ask = ask;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}