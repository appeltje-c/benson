
package org.benjamin.benson.messages.ocpp.v16;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * StatusNotificationRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connectorId",
    "errorCode",
    "info",
    "status",
    "timestamp",
    "vendorId",
    "vendorErrorCode"
})
@Generated("jsonschema2pojo")
public class StatusNotification {

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
    @JsonProperty("errorCode")
    private StatusNotification.ErrorCode errorCode;
    @JsonProperty("info")
    private String info;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private StatusNotification.Status status;
    @JsonProperty("timestamp")
    private Date timestamp;
    @JsonProperty("vendorId")
    private String vendorId;
    @JsonProperty("vendorErrorCode")
    private String vendorErrorCode;

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
    @JsonProperty("errorCode")
    public StatusNotification.ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("errorCode")
    public void setErrorCode(StatusNotification.ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public StatusNotification.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(StatusNotification.Status status) {
        this.status = status;
    }

    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }

    @JsonProperty("vendorId")
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @JsonProperty("vendorErrorCode")
    public String getVendorErrorCode() {
        return vendorErrorCode;
    }

    @JsonProperty("vendorErrorCode")
    public void setVendorErrorCode(String vendorErrorCode) {
        this.vendorErrorCode = vendorErrorCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StatusNotification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("connectorId");
        sb.append('=');
        sb.append(((this.connectorId == null)?"<null>":this.connectorId));
        sb.append(',');
        sb.append("errorCode");
        sb.append('=');
        sb.append(((this.errorCode == null)?"<null>":this.errorCode));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("vendorId");
        sb.append('=');
        sb.append(((this.vendorId == null)?"<null>":this.vendorId));
        sb.append(',');
        sb.append("vendorErrorCode");
        sb.append('=');
        sb.append(((this.vendorErrorCode == null)?"<null>":this.vendorErrorCode));
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
        result = ((result* 31)+((this.connectorId == null)? 0 :this.connectorId.hashCode()));
        result = ((result* 31)+((this.errorCode == null)? 0 :this.errorCode.hashCode()));
        result = ((result* 31)+((this.vendorId == null)? 0 :this.vendorId.hashCode()));
        result = ((result* 31)+((this.vendorErrorCode == null)? 0 :this.vendorErrorCode.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatusNotification) == false) {
            return false;
        }
        StatusNotification rhs = ((StatusNotification) other);
        return ((((((((this.connectorId == rhs.connectorId)||((this.connectorId!= null)&&this.connectorId.equals(rhs.connectorId)))&&((this.errorCode == rhs.errorCode)||((this.errorCode!= null)&&this.errorCode.equals(rhs.errorCode))))&&((this.vendorId == rhs.vendorId)||((this.vendorId!= null)&&this.vendorId.equals(rhs.vendorId))))&&((this.vendorErrorCode == rhs.vendorErrorCode)||((this.vendorErrorCode!= null)&&this.vendorErrorCode.equals(rhs.vendorErrorCode))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

    @Generated("jsonschema2pojo")
    public enum ErrorCode {

        CONNECTOR_LOCK_FAILURE("ConnectorLockFailure"),
        EV_COMMUNICATION_ERROR("EVCommunicationError"),
        GROUND_FAILURE("GroundFailure"),
        HIGH_TEMPERATURE("HighTemperature"),
        INTERNAL_ERROR("InternalError"),
        LOCAL_LIST_CONFLICT("LocalListConflict"),
        NO_ERROR("NoError"),
        OTHER_ERROR("OtherError"),
        OVER_CURRENT_FAILURE("OverCurrentFailure"),
        POWER_METER_FAILURE("PowerMeterFailure"),
        POWER_SWITCH_FAILURE("PowerSwitchFailure"),
        READER_FAILURE("ReaderFailure"),
        RESET_FAILURE("ResetFailure"),
        UNDER_VOLTAGE("UnderVoltage"),
        OVER_VOLTAGE("OverVoltage"),
        WEAK_SIGNAL("WeakSignal");
        private final String value;
        private final static Map<String, StatusNotification.ErrorCode> CONSTANTS = new HashMap<String, StatusNotification.ErrorCode>();

        static {
            for (StatusNotification.ErrorCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ErrorCode(String value) {
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
        public static StatusNotification.ErrorCode fromValue(String value) {
            StatusNotification.ErrorCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum Status {

        AVAILABLE("Available"),
        PREPARING("Preparing"),
        CHARGING("Charging"),
        SUSPENDED_EVSE("SuspendedEVSE"),
        SUSPENDED_EV("SuspendedEV"),
        FINISHING("Finishing"),
        RESERVED("Reserved"),
        UNAVAILABLE("Unavailable"),
        FAULTED("Faulted");
        private final String value;
        private final static Map<String, StatusNotification.Status> CONSTANTS = new HashMap<String, StatusNotification.Status>();

        static {
            for (StatusNotification.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static StatusNotification.Status fromValue(String value) {
            StatusNotification.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
