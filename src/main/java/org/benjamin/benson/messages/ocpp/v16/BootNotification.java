
package org.benjamin.benson.messages.ocpp.v16;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BootNotificationRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chargePointVendor",
    "chargePointModel",
    "chargePointSerialNumber",
    "chargeBoxSerialNumber",
    "firmwareVersion",
    "iccid",
    "imsi",
    "meterType",
    "meterSerialNumber"
})
@Generated("jsonschema2pojo")
public class BootNotification {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointVendor")
    private String chargePointVendor;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointModel")
    private String chargePointModel;
    @JsonProperty("chargePointSerialNumber")
    private String chargePointSerialNumber;
    @JsonProperty("chargeBoxSerialNumber")
    private String chargeBoxSerialNumber;
    @JsonProperty("firmwareVersion")
    private String firmwareVersion;
    @JsonProperty("iccid")
    private String iccid;
    @JsonProperty("imsi")
    private String imsi;
    @JsonProperty("meterType")
    private String meterType;
    @JsonProperty("meterSerialNumber")
    private String meterSerialNumber;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointVendor")
    public String getChargePointVendor() {
        return chargePointVendor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointVendor")
    public void setChargePointVendor(String chargePointVendor) {
        this.chargePointVendor = chargePointVendor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointModel")
    public String getChargePointModel() {
        return chargePointModel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chargePointModel")
    public void setChargePointModel(String chargePointModel) {
        this.chargePointModel = chargePointModel;
    }

    @JsonProperty("chargePointSerialNumber")
    public String getChargePointSerialNumber() {
        return chargePointSerialNumber;
    }

    @JsonProperty("chargePointSerialNumber")
    public void setChargePointSerialNumber(String chargePointSerialNumber) {
        this.chargePointSerialNumber = chargePointSerialNumber;
    }

    @JsonProperty("chargeBoxSerialNumber")
    public String getChargeBoxSerialNumber() {
        return chargeBoxSerialNumber;
    }

    @JsonProperty("chargeBoxSerialNumber")
    public void setChargeBoxSerialNumber(String chargeBoxSerialNumber) {
        this.chargeBoxSerialNumber = chargeBoxSerialNumber;
    }

    @JsonProperty("firmwareVersion")
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    @JsonProperty("firmwareVersion")
    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    @JsonProperty("iccid")
    public String getIccid() {
        return iccid;
    }

    @JsonProperty("iccid")
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @JsonProperty("meterType")
    public String getMeterType() {
        return meterType;
    }

    @JsonProperty("meterType")
    public void setMeterType(String meterType) {
        this.meterType = meterType;
    }

    @JsonProperty("meterSerialNumber")
    public String getMeterSerialNumber() {
        return meterSerialNumber;
    }

    @JsonProperty("meterSerialNumber")
    public void setMeterSerialNumber(String meterSerialNumber) {
        this.meterSerialNumber = meterSerialNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BootNotification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chargePointVendor");
        sb.append('=');
        sb.append(((this.chargePointVendor == null)?"<null>":this.chargePointVendor));
        sb.append(',');
        sb.append("chargePointModel");
        sb.append('=');
        sb.append(((this.chargePointModel == null)?"<null>":this.chargePointModel));
        sb.append(',');
        sb.append("chargePointSerialNumber");
        sb.append('=');
        sb.append(((this.chargePointSerialNumber == null)?"<null>":this.chargePointSerialNumber));
        sb.append(',');
        sb.append("chargeBoxSerialNumber");
        sb.append('=');
        sb.append(((this.chargeBoxSerialNumber == null)?"<null>":this.chargeBoxSerialNumber));
        sb.append(',');
        sb.append("firmwareVersion");
        sb.append('=');
        sb.append(((this.firmwareVersion == null)?"<null>":this.firmwareVersion));
        sb.append(',');
        sb.append("iccid");
        sb.append('=');
        sb.append(((this.iccid == null)?"<null>":this.iccid));
        sb.append(',');
        sb.append("imsi");
        sb.append('=');
        sb.append(((this.imsi == null)?"<null>":this.imsi));
        sb.append(',');
        sb.append("meterType");
        sb.append('=');
        sb.append(((this.meterType == null)?"<null>":this.meterType));
        sb.append(',');
        sb.append("meterSerialNumber");
        sb.append('=');
        sb.append(((this.meterSerialNumber == null)?"<null>":this.meterSerialNumber));
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
        result = ((result* 31)+((this.chargePointModel == null)? 0 :this.chargePointModel.hashCode()));
        result = ((result* 31)+((this.iccid == null)? 0 :this.iccid.hashCode()));
        result = ((result* 31)+((this.chargePointVendor == null)? 0 :this.chargePointVendor.hashCode()));
        result = ((result* 31)+((this.chargePointSerialNumber == null)? 0 :this.chargePointSerialNumber.hashCode()));
        result = ((result* 31)+((this.chargeBoxSerialNumber == null)? 0 :this.chargeBoxSerialNumber.hashCode()));
        result = ((result* 31)+((this.meterType == null)? 0 :this.meterType.hashCode()));
        result = ((result* 31)+((this.meterSerialNumber == null)? 0 :this.meterSerialNumber.hashCode()));
        result = ((result* 31)+((this.imsi == null)? 0 :this.imsi.hashCode()));
        result = ((result* 31)+((this.firmwareVersion == null)? 0 :this.firmwareVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BootNotification) == false) {
            return false;
        }
        BootNotification rhs = ((BootNotification) other);
        return ((((((((((this.chargePointModel == rhs.chargePointModel)||((this.chargePointModel!= null)&&this.chargePointModel.equals(rhs.chargePointModel)))&&((this.iccid == rhs.iccid)||((this.iccid!= null)&&this.iccid.equals(rhs.iccid))))&&((this.chargePointVendor == rhs.chargePointVendor)||((this.chargePointVendor!= null)&&this.chargePointVendor.equals(rhs.chargePointVendor))))&&((this.chargePointSerialNumber == rhs.chargePointSerialNumber)||((this.chargePointSerialNumber!= null)&&this.chargePointSerialNumber.equals(rhs.chargePointSerialNumber))))&&((this.chargeBoxSerialNumber == rhs.chargeBoxSerialNumber)||((this.chargeBoxSerialNumber!= null)&&this.chargeBoxSerialNumber.equals(rhs.chargeBoxSerialNumber))))&&((this.meterType == rhs.meterType)||((this.meterType!= null)&&this.meterType.equals(rhs.meterType))))&&((this.meterSerialNumber == rhs.meterSerialNumber)||((this.meterSerialNumber!= null)&&this.meterSerialNumber.equals(rhs.meterSerialNumber))))&&((this.imsi == rhs.imsi)||((this.imsi!= null)&&this.imsi.equals(rhs.imsi))))&&((this.firmwareVersion == rhs.firmwareVersion)||((this.firmwareVersion!= null)&&this.firmwareVersion.equals(rhs.firmwareVersion))));
    }

}
