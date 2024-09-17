
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "expiryDate",
    "parentIdTag",
    "status"
})
@Generated("jsonschema2pojo")
public class IdTagInfo {

    @JsonProperty("expiryDate")
    private Date expiryDate;
    @JsonProperty("parentIdTag")
    private String parentIdTag;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private IdTagInfo.Status status;

    @JsonProperty("expiryDate")
    public Date getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("expiryDate")
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("parentIdTag")
    public String getParentIdTag() {
        return parentIdTag;
    }

    @JsonProperty("parentIdTag")
    public void setParentIdTag(String parentIdTag) {
        this.parentIdTag = parentIdTag;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public IdTagInfo.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(IdTagInfo.Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IdTagInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("parentIdTag");
        sb.append('=');
        sb.append(((this.parentIdTag == null)?"<null>":this.parentIdTag));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
        result = ((result* 31)+((this.parentIdTag == null)? 0 :this.parentIdTag.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdTagInfo) == false) {
            return false;
        }
        IdTagInfo rhs = ((IdTagInfo) other);
        return ((((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate)))&&((this.parentIdTag == rhs.parentIdTag)||((this.parentIdTag!= null)&&this.parentIdTag.equals(rhs.parentIdTag))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        ACCEPTED("Accepted"),
        BLOCKED("Blocked"),
        EXPIRED("Expired"),
        INVALID("Invalid"),
        CONCURRENT_TX("ConcurrentTx");
        private final String value;
        private final static Map<String, IdTagInfo.Status> CONSTANTS = new HashMap<String, IdTagInfo.Status>();

        static {
            for (IdTagInfo.Status c: values()) {
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
        public static IdTagInfo.Status fromValue(String value) {
            IdTagInfo.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
