
package org.benjamin.benson.messages.ocpp.v16;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * StopTransactionRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idTag",
    "meterStop",
    "timestamp",
    "transactionId",
    "reason",
    "transactionData"
})
@Generated("jsonschema2pojo")
public class StopTransaction {

    @JsonProperty("idTag")
    private String idTag;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterStop")
    private Integer meterStop;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    private Date timestamp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionId")
    private Integer transactionId;
    @JsonProperty("reason")
    private StopTransaction.Reason reason;
    @JsonProperty("transactionData")
    private List<TransactionDatum> transactionData = new ArrayList<TransactionDatum>();

    @JsonProperty("idTag")
    public String getIdTag() {
        return idTag;
    }

    @JsonProperty("idTag")
    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterStop")
    public Integer getMeterStop() {
        return meterStop;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meterStop")
    public void setMeterStop(Integer meterStop) {
        this.meterStop = meterStop;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionId")
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionId")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("reason")
    public StopTransaction.Reason getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(StopTransaction.Reason reason) {
        this.reason = reason;
    }

    @JsonProperty("transactionData")
    public List<TransactionDatum> getTransactionData() {
        return transactionData;
    }

    @JsonProperty("transactionData")
    public void setTransactionData(List<TransactionDatum> transactionData) {
        this.transactionData = transactionData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StopTransaction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("idTag");
        sb.append('=');
        sb.append(((this.idTag == null)?"<null>":this.idTag));
        sb.append(',');
        sb.append("meterStop");
        sb.append('=');
        sb.append(((this.meterStop == null)?"<null>":this.meterStop));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("transactionId");
        sb.append('=');
        sb.append(((this.transactionId == null)?"<null>":this.transactionId));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("transactionData");
        sb.append('=');
        sb.append(((this.transactionData == null)?"<null>":this.transactionData));
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
        result = ((result* 31)+((this.transactionData == null)? 0 :this.transactionData.hashCode()));
        result = ((result* 31)+((this.idTag == null)? 0 :this.idTag.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.transactionId == null)? 0 :this.transactionId.hashCode()));
        result = ((result* 31)+((this.meterStop == null)? 0 :this.meterStop.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopTransaction) == false) {
            return false;
        }
        StopTransaction rhs = ((StopTransaction) other);
        return (((((((this.transactionData == rhs.transactionData)||((this.transactionData!= null)&&this.transactionData.equals(rhs.transactionData)))&&((this.idTag == rhs.idTag)||((this.idTag!= null)&&this.idTag.equals(rhs.idTag))))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.transactionId == rhs.transactionId)||((this.transactionId!= null)&&this.transactionId.equals(rhs.transactionId))))&&((this.meterStop == rhs.meterStop)||((this.meterStop!= null)&&this.meterStop.equals(rhs.meterStop))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

    @Generated("jsonschema2pojo")
    public enum Reason {

        EMERGENCY_STOP("EmergencyStop"),
        EV_DISCONNECTED("EVDisconnected"),
        HARD_RESET("HardReset"),
        LOCAL("Local"),
        OTHER("Other"),
        POWER_LOSS("PowerLoss"),
        REBOOT("Reboot"),
        REMOTE("Remote"),
        SOFT_RESET("SoftReset"),
        UNLOCK_COMMAND("UnlockCommand"),
        DE_AUTHORIZED("DeAuthorized");
        private final String value;
        private final static Map<String, StopTransaction.Reason> CONSTANTS = new HashMap<String, StopTransaction.Reason>();

        static {
            for (StopTransaction.Reason c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Reason(String value) {
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
        public static StopTransaction.Reason fromValue(String value) {
            StopTransaction.Reason constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
