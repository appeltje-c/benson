
package org.benjamin.benson.messages.ocpp.v16;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetConfigurationRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key"
})
@Generated("jsonschema2pojo")
public class GetConfiguration {

    @JsonProperty("key")
    private List<String> key = new ArrayList<String>();

    @JsonProperty("key")
    public List<String> getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(List<String> key) {
        this.key = key;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
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
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetConfiguration) == false) {
            return false;
        }
        GetConfiguration rhs = ((GetConfiguration) other);
        return ((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key)));
    }

}
