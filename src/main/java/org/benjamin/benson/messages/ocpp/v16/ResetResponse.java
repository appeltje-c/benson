
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
 * ResetResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status"
})
@Generated("jsonschema2pojo")
public class ResetResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private ResetResponse.Status status;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public ResetResponse.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(ResetResponse.Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResetResponse) == false) {
            return false;
        }
        ResetResponse rhs = ((ResetResponse) other);
        return ((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status)));
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        ACCEPTED("Accepted"),
        REJECTED("Rejected");
        private final String value;
        private final static Map<String, ResetResponse.Status> CONSTANTS = new HashMap<String, ResetResponse.Status>();

        static {
            for (ResetResponse.Status c: values()) {
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
        public static ResetResponse.Status fromValue(String value) {
            ResetResponse.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
