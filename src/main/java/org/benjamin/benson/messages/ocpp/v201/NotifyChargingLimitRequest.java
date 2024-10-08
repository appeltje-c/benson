
package org.benjamin.benson.messages.ocpp.v201;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "chargingSchedule",
    "evseId",
    "chargingLimit"
})
@Generated("jsonschema2pojo")
public class NotifyChargingLimitRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    @JsonProperty("chargingSchedule")
    private List<ChargingSchedule> chargingSchedule = new ArrayList<ChargingSchedule>();
    /**
     * The charging schedule contained in this notification applies to an EVSE. evseId must be &gt; 0.
     * 
     * 
     */
    @JsonProperty("evseId")
    @JsonPropertyDescription("The charging schedule contained in this notification applies to an EVSE. evseId must be &gt; 0.\r\n")
    private Integer evseId;
    /**
     * Charging_ Limit
     * urn:x-enexis:ecdm:uid:2:234489
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingLimit")
    @JsonPropertyDescription("Charging_ Limit\r\nurn:x-enexis:ecdm:uid:2:234489\r\n")
    private ChargingLimit chargingLimit;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    @JsonProperty("chargingSchedule")
    public List<ChargingSchedule> getChargingSchedule() {
        return chargingSchedule;
    }

    @JsonProperty("chargingSchedule")
    public void setChargingSchedule(List<ChargingSchedule> chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    /**
     * The charging schedule contained in this notification applies to an EVSE. evseId must be &gt; 0.
     * 
     * 
     */
    @JsonProperty("evseId")
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The charging schedule contained in this notification applies to an EVSE. evseId must be &gt; 0.
     * 
     * 
     */
    @JsonProperty("evseId")
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Charging_ Limit
     * urn:x-enexis:ecdm:uid:2:234489
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingLimit")
    public ChargingLimit getChargingLimit() {
        return chargingLimit;
    }

    /**
     * Charging_ Limit
     * urn:x-enexis:ecdm:uid:2:234489
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargingLimit")
    public void setChargingLimit(ChargingLimit chargingLimit) {
        this.chargingLimit = chargingLimit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NotifyChargingLimitRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("chargingSchedule");
        sb.append('=');
        sb.append(((this.chargingSchedule == null)?"<null>":this.chargingSchedule));
        sb.append(',');
        sb.append("evseId");
        sb.append('=');
        sb.append(((this.evseId == null)?"<null>":this.evseId));
        sb.append(',');
        sb.append("chargingLimit");
        sb.append('=');
        sb.append(((this.chargingLimit == null)?"<null>":this.chargingLimit));
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
        result = ((result* 31)+((this.evseId == null)? 0 :this.evseId.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.chargingSchedule == null)? 0 :this.chargingSchedule.hashCode()));
        result = ((result* 31)+((this.chargingLimit == null)? 0 :this.chargingLimit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotifyChargingLimitRequest) == false) {
            return false;
        }
        NotifyChargingLimitRequest rhs = ((NotifyChargingLimitRequest) other);
        return (((((this.evseId == rhs.evseId)||((this.evseId!= null)&&this.evseId.equals(rhs.evseId)))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))))&&((this.chargingSchedule == rhs.chargingSchedule)||((this.chargingSchedule!= null)&&this.chargingSchedule.equals(rhs.chargingSchedule))))&&((this.chargingLimit == rhs.chargingLimit)||((this.chargingLimit!= null)&&this.chargingLimit.equals(rhs.chargingLimit))));
    }

}
