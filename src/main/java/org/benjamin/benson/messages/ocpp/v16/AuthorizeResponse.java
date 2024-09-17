
package org.benjamin.benson.messages.ocpp.v16;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AuthorizeResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idTagInfo"
})
@Generated("jsonschema2pojo")
public class AuthorizeResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idTagInfo")
    private IdTagInfo idTagInfo;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idTagInfo")
    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idTagInfo")
    public void setIdTagInfo(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuthorizeResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("idTagInfo");
        sb.append('=');
        sb.append(((this.idTagInfo == null)?"<null>":this.idTagInfo));
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
        result = ((result* 31)+((this.idTagInfo == null)? 0 :this.idTagInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthorizeResponse) == false) {
            return false;
        }
        AuthorizeResponse rhs = ((AuthorizeResponse) other);
        return ((this.idTagInfo == rhs.idTagInfo)||((this.idTagInfo!= null)&&this.idTagInfo.equals(rhs.idTagInfo)));
    }

}
