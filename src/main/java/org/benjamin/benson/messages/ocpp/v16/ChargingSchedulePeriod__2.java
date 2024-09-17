
package org.benjamin.benson.messages.ocpp.v16;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startPeriod",
    "limit",
    "numberPhases"
})
@Generated("jsonschema2pojo")
public class ChargingSchedulePeriod__2 {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startPeriod")
    private Integer startPeriod;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limit")
    private Double limit;
    @JsonProperty("numberPhases")
    private Integer numberPhases;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startPeriod")
    public Integer getStartPeriod() {
        return startPeriod;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startPeriod")
    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limit")
    public Double getLimit() {
        return limit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limit")
    public void setLimit(Double limit) {
        this.limit = limit;
    }

    @JsonProperty("numberPhases")
    public Integer getNumberPhases() {
        return numberPhases;
    }

    @JsonProperty("numberPhases")
    public void setNumberPhases(Integer numberPhases) {
        this.numberPhases = numberPhases;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChargingSchedulePeriod__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startPeriod");
        sb.append('=');
        sb.append(((this.startPeriod == null)?"<null>":this.startPeriod));
        sb.append(',');
        sb.append("limit");
        sb.append('=');
        sb.append(((this.limit == null)?"<null>":this.limit));
        sb.append(',');
        sb.append("numberPhases");
        sb.append('=');
        sb.append(((this.numberPhases == null)?"<null>":this.numberPhases));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.limit == null)? 0 :this.limit.hashCode()));
        result = ((result* 31)+((this.startPeriod == null)? 0 :this.startPeriod.hashCode()));
        result = ((result* 31)+((this.numberPhases == null)? 0 :this.numberPhases.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChargingSchedulePeriod__2) == false) {
            return false;
        }
        ChargingSchedulePeriod__2 rhs = ((ChargingSchedulePeriod__2) other);
        return ((((this.limit == rhs.limit)||((this.limit!= null)&&this.limit.equals(rhs.limit)))&&((this.startPeriod == rhs.startPeriod)||((this.startPeriod!= null)&&this.startPeriod.equals(rhs.startPeriod))))&&((this.numberPhases == rhs.numberPhases)||((this.numberPhases!= null)&&this.numberPhases.equals(rhs.numberPhases))));
    }

}
