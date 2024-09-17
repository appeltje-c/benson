
package org.benjamin.benson.messages.ocpp.v16;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetLocalListVersionResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "listVersion"
})
@Generated("jsonschema2pojo")
public class GetLocalListVersionResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("listVersion")
    private Integer listVersion;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetLocalListVersionResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("listVersion");
        sb.append('=');
        sb.append(((this.listVersion == null)?"<null>":this.listVersion));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetLocalListVersionResponse) == false) {
            return false;
        }
        GetLocalListVersionResponse rhs = ((GetLocalListVersionResponse) other);
        return ((this.listVersion == rhs.listVersion)||((this.listVersion!= null)&&this.listVersion.equals(rhs.listVersion)));
    }

}
