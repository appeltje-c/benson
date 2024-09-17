
package org.benjamin.benson.messages.ocpp.v16;

import java.net.URI;
import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetDiagnosticsRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location",
    "retries",
    "retryInterval",
    "startTime",
    "stopTime"
})
@Generated("jsonschema2pojo")
public class GetDiagnostics {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    private URI location;
    @JsonProperty("retries")
    private Integer retries;
    @JsonProperty("retryInterval")
    private Integer retryInterval;
    @JsonProperty("startTime")
    private Date startTime;
    @JsonProperty("stopTime")
    private Date stopTime;

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

    @JsonProperty("retryInterval")
    public Integer getRetryInterval() {
        return retryInterval;
    }

    @JsonProperty("retryInterval")
    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    @JsonProperty("startTime")
    public Date getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("stopTime")
    public Date getStopTime() {
        return stopTime;
    }

    @JsonProperty("stopTime")
    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetDiagnostics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("retries");
        sb.append('=');
        sb.append(((this.retries == null)?"<null>":this.retries));
        sb.append(',');
        sb.append("retryInterval");
        sb.append('=');
        sb.append(((this.retryInterval == null)?"<null>":this.retryInterval));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("stopTime");
        sb.append('=');
        sb.append(((this.stopTime == null)?"<null>":this.stopTime));
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
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.retryInterval == null)? 0 :this.retryInterval.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.stopTime == null)? 0 :this.stopTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetDiagnostics) == false) {
            return false;
        }
        GetDiagnostics rhs = ((GetDiagnostics) other);
        return ((((((this.retries == rhs.retries)||((this.retries!= null)&&this.retries.equals(rhs.retries)))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.retryInterval == rhs.retryInterval)||((this.retryInterval!= null)&&this.retryInterval.equals(rhs.retryInterval))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.stopTime == rhs.stopTime)||((this.stopTime!= null)&&this.stopTime.equals(rhs.stopTime))));
    }

}
