
package org.benjamin.benson.messages.ocpp.v16;

import java.util.ArrayList;
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
 * SendLocalListRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "listVersion",
    "localAuthorizationList",
    "updateType"
})
@Generated("jsonschema2pojo")
public class SendLocalList {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("listVersion")
    private Integer listVersion;
    @JsonProperty("localAuthorizationList")
    private List<LocalAuthorization> localAuthorizationList = new ArrayList<LocalAuthorization>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updateType")
    private SendLocalList.UpdateType updateType;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("listVersion")
    public Integer getListVersion() {
        return listVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("listVersion")
    public void setListVersion(Integer listVersion) {
        this.listVersion = listVersion;
    }

    @JsonProperty("localAuthorizationList")
    public List<LocalAuthorization> getLocalAuthorizationList() {
        return localAuthorizationList;
    }

    @JsonProperty("localAuthorizationList")
    public void setLocalAuthorizationList(List<LocalAuthorization> localAuthorizationList) {
        this.localAuthorizationList = localAuthorizationList;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updateType")
    public SendLocalList.UpdateType getUpdateType() {
        return updateType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updateType")
    public void setUpdateType(SendLocalList.UpdateType updateType) {
        this.updateType = updateType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SendLocalList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("listVersion");
        sb.append('=');
        sb.append(((this.listVersion == null)?"<null>":this.listVersion));
        sb.append(',');
        sb.append("localAuthorizationList");
        sb.append('=');
        sb.append(((this.localAuthorizationList == null)?"<null>":this.localAuthorizationList));
        sb.append(',');
        sb.append("updateType");
        sb.append('=');
        sb.append(((this.updateType == null)?"<null>":this.updateType));
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
        result = ((result* 31)+((this.listVersion == null)? 0 :this.listVersion.hashCode()));
        result = ((result* 31)+((this.localAuthorizationList == null)? 0 :this.localAuthorizationList.hashCode()));
        result = ((result* 31)+((this.updateType == null)? 0 :this.updateType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SendLocalList) == false) {
            return false;
        }
        SendLocalList rhs = ((SendLocalList) other);
        return ((((this.listVersion == rhs.listVersion)||((this.listVersion!= null)&&this.listVersion.equals(rhs.listVersion)))&&((this.localAuthorizationList == rhs.localAuthorizationList)||((this.localAuthorizationList!= null)&&this.localAuthorizationList.equals(rhs.localAuthorizationList))))&&((this.updateType == rhs.updateType)||((this.updateType!= null)&&this.updateType.equals(rhs.updateType))));
    }

    @Generated("jsonschema2pojo")
    public enum UpdateType {

        DIFFERENTIAL("Differential"),
        FULL("Full");
        private final String value;
        private final static Map<String, SendLocalList.UpdateType> CONSTANTS = new HashMap<String, SendLocalList.UpdateType>();

        static {
            for (SendLocalList.UpdateType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        UpdateType(String value) {
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
        public static SendLocalList.UpdateType fromValue(String value) {
            SendLocalList.UpdateType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
