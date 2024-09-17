
package org.benjamin.benson.messages.ocpp.v16;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SetChargingProfileRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connectorId",
    "csChargingProfiles"
})
@Generated("jsonschema2pojo")
public class SetChargingProfile {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorId")
    private Integer connectorId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("csChargingProfiles")
    private CsChargingProfiles csChargingProfiles;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("csChargingProfiles")
    public CsChargingProfiles getCsChargingProfiles() {
        return csChargingProfiles;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("csChargingProfiles")
    public void setCsChargingProfiles(CsChargingProfiles csChargingProfiles) {
        this.csChargingProfiles = csChargingProfiles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SetChargingProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("connectorId");
        sb.append('=');
        sb.append(((this.connectorId == null)?"<null>":this.connectorId));
        sb.append(',');
        sb.append("csChargingProfiles");
        sb.append('=');
        sb.append(((this.csChargingProfiles == null)?"<null>":this.csChargingProfiles));
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
        result = ((result* 31)+((this.csChargingProfiles == null)? 0 :this.csChargingProfiles.hashCode()));
        result = ((result* 31)+((this.connectorId == null)? 0 :this.connectorId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetChargingProfile) == false) {
            return false;
        }
        SetChargingProfile rhs = ((SetChargingProfile) other);
        return (((this.csChargingProfiles == rhs.csChargingProfiles)||((this.csChargingProfiles!= null)&&this.csChargingProfiles.equals(rhs.csChargingProfiles)))&&((this.connectorId == rhs.connectorId)||((this.connectorId!= null)&&this.connectorId.equals(rhs.connectorId))));
    }

}
