
package org.benjamin.benson.messages.ocpp.v201;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "evse",
    "requestedMessage"
})
@Generated("jsonschema2pojo")
public class TriggerMessageRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     * 
     * 
     */
    @JsonProperty("evse")
    @JsonPropertyDescription("EVSE\r\nurn:x-oca:ocpp:uid:2:233123\r\nElectric Vehicle Supply Equipment\r\n")
    private EVSE evse;
    /**
     * Type of message to be triggered.
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedMessage")
    @JsonPropertyDescription("Type of message to be triggered.\r\n")
    private MessageTriggerEnum requestedMessage;

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

    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     * 
     * 
     */
    @JsonProperty("evse")
    public EVSE getEvse() {
        return evse;
    }

    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     * 
     * 
     */
    @JsonProperty("evse")
    public void setEvse(EVSE evse) {
        this.evse = evse;
    }

    /**
     * Type of message to be triggered.
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedMessage")
    public MessageTriggerEnum getRequestedMessage() {
        return requestedMessage;
    }

    /**
     * Type of message to be triggered.
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedMessage")
    public void setRequestedMessage(MessageTriggerEnum requestedMessage) {
        this.requestedMessage = requestedMessage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TriggerMessageRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("evse");
        sb.append('=');
        sb.append(((this.evse == null)?"<null>":this.evse));
        sb.append(',');
        sb.append("requestedMessage");
        sb.append('=');
        sb.append(((this.requestedMessage == null)?"<null>":this.requestedMessage));
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
        result = ((result* 31)+((this.evse == null)? 0 :this.evse.hashCode()));
        result = ((result* 31)+((this.requestedMessage == null)? 0 :this.requestedMessage.hashCode()));
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TriggerMessageRequest) == false) {
            return false;
        }
        TriggerMessageRequest rhs = ((TriggerMessageRequest) other);
        return ((((this.evse == rhs.evse)||((this.evse!= null)&&this.evse.equals(rhs.evse)))&&((this.requestedMessage == rhs.requestedMessage)||((this.requestedMessage!= null)&&this.requestedMessage.equals(rhs.requestedMessage))))&&((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData))));
    }

}
