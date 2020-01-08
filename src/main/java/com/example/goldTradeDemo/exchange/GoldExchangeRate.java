package com.example.goldTradeDemo.exchange;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "topo",
        "spreadProfilePrices",
        "ts"
})
public class GoldExchangeRate {

    @JsonProperty("topo")
    private Topo topo;
    @JsonProperty("spreadProfilePrices")
    private List<SpreadProfilePrice> spreadProfilePrices = null;
    @JsonProperty("ts")
    private Integer ts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("topo")
    public Topo getTopo() {
        return topo;
    }

    @JsonProperty("topo")
    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    @JsonProperty("spreadProfilePrices")
    public List<SpreadProfilePrice> getSpreadProfilePrices() {
        return spreadProfilePrices;
    }

    @JsonProperty("spreadProfilePrices")
    public void setSpreadProfilePrices(List<SpreadProfilePrice> spreadProfilePrices) {
        this.spreadProfilePrices = spreadProfilePrices;
    }

    @JsonProperty("ts")
    public Integer getTs() {
        return ts;
    }

    @JsonProperty("ts")
    public void setTs(Integer ts) {
        this.ts = ts;
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