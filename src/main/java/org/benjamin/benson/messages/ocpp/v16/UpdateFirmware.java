
package org.benjamin.benson.messages.ocpp.v16;

import java.net.URI;
import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateFirmwareRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location",
    "retries",
    "retrieveDate",
    "retryInterval"
})
@Generated("jsonschema2pojo")
public class UpdateFirmware {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    private URI location;
    @JsonProperty("retries")
    private Integer retries;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retrieveDate")
    private Date retrieveDate;
    @JsonProperty("retryInterval")
    private Integer retryInterval;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public URI getLocation() {
        return location;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public void setLocation(URI location) {
        this.location = location;
    }

    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retrieveDate")
    public Date getRetrieveDate() {
        return retrieveDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("retrieveDate")
    public void setRetrieveDate(Date retrieveDate) {
        this.retrieveDate = retrieveDate;
    }

    @JsonProperty("retryInterval")
    public Integer getRetryInterval() {
        return retryInterval;
    }

    @JsonProperty("retryInterval")
    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UpdateFirmware.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("retries");
        sb.append('=');
        sb.append(((this.retries == null)?"<null>":this.retries));
        sb.append(',');
        sb.append("retrieveDate");
        sb.append('=');
        sb.append(((this.retrieveDate == null)?"<null>":this.retrieveDate));
        sb.append(',');
        sb.append("retryInterval");
        sb.append('=');
        sb.append(((this.retryInterval == null)?"<null>":this.retryInterval));
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
        result = ((result* 31)+((this.retries == null)? 0 :this.retries.hashCode()));
        result = ((result* 31)+((this.retrieveDate == null)? 0 :this.retrieveDate.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.retryInterval == null)? 0 :this.retryInterval.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UpdateFirmware) == false) {
            return false;
        }
        UpdateFirmware rhs = ((UpdateFirmware) other);
        return (((((this.retries == rhs.retries)||((this.retries!= null)&&this.retries.equals(rhs.retries)))&&((this.retrieveDate == rhs.retrieveDate)||((this.retrieveDate!= null)&&this.retrieveDate.equals(rhs.retrieveDate))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.retryInterval == rhs.retryInterval)||((this.retryInterval!= null)&&this.retryInterval.equals(rhs.retryInterval))));
    }

}
