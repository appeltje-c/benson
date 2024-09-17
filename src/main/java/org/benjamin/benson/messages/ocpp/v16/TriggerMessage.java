
package org.benjamin.benson.messages.ocpp.v16;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TriggerMessageRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requestedMessage",
    "connectorId"
})
@Generated("jsonschema2pojo")
public class TriggerMessage {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedMessage")
    private TriggerMessage.RequestedMessage requestedMessage;
    @JsonProperty("connectorId")
    private Integer connectorId;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedMessage")
    public TriggerMessage.RequestedMessage getRequestedMessage() {
        return requestedMessage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("requestedMessage")
    public void setRequestedMessage(TriggerMessage.RequestedMessage requestedMessage) {
        this.requestedMessage = requestedMessage;
    }

    @JsonProperty("connectorId")
    public Integer getConnectorId() {
        return connectorId;
    }

    @JsonProperty("connectorId")
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TriggerMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requestedMessage");
        sb.append('=');
        sb.append(((this.requestedMessage == null)?"<null>":this.requestedMessage));
        sb.append(',');
        sb.append("connectorId");
        sb.append('=');
        sb.append(((this.connectorId == null)?"<null>":this.connectorId));
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
        result = ((result* 31)+((this.requestedMessage == null)? 0 :this.requestedMessage.hashCode()));
        result = ((result* 31)+((this.connectorId == null)? 0 :this.connectorId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TriggerMessage) == false) {
            return false;
        }
        TriggerMessage rhs = ((TriggerMessage) other);
        return (((this.requestedMessage == rhs.requestedMessage)||((this.requestedMessage!= null)&&this.requestedMessage.equals(rhs.requestedMessage)))&&((this.connectorId == rhs.connectorId)||((this.connectorId!= null)&&this.connectorId.equals(rhs.connectorId))));
    }

    @Generated("jsonschema2pojo")
    public enum RequestedMessage {

        BOOT_NOTIFICATION("BootNotification"),
        DIAGNOSTICS_STATUS_NOTIFICATION("DiagnosticsStatusNotification"),
        FIRMWARE_STATUS_NOTIFICATION("FirmwareStatusNotification"),
        HEARTBEAT("Heartbeat"),
        METER_VALUES("MeterValues"),
        STATUS_NOTIFICATION("StatusNotification");
        private final String value;
        private final static Map<String, TriggerMessage.RequestedMessage> CONSTANTS = new HashMap<String, TriggerMessage.RequestedMessage>();

        static {
            for (TriggerMessage.RequestedMessage c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RequestedMessage(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static TriggerMessage.RequestedMessage fromValue(String value) {
            TriggerMessage.RequestedMessage constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
