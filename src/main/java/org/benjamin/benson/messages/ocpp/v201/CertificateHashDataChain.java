
package org.benjamin.benson.messages.ocpp.v201;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customData",
    "certificateHashData",
    "certificateType",
    "childCertificateHashData"
})
@Generated("jsonschema2pojo")
public class CertificateHashDataChain {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    private CustomData customData;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificateHashData")
    private CertificateHashData certificateHashData;
    /**
     * Indicates the type of the requested certificate(s).
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificateType")
    @JsonPropertyDescription("Indicates the type of the requested certificate(s).\r\n")
    private GetCertificateIdUseEnum certificateType;
    @JsonProperty("childCertificateHashData")
    private List<CertificateHashData> childCertificateHashData = new ArrayList<CertificateHashData>();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    @JsonProperty("customData")
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificateHashData")
    public CertificateHashData getCertificateHashData() {
        return certificateHashData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificateHashData")
    public void setCertificateHashData(CertificateHashData certificateHashData) {
        this.certificateHashData = certificateHashData;
    }

    /**
     * Indicates the type of the requested certificate(s).
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificateType")
    public GetCertificateIdUseEnum getCertificateType() {
        return certificateType;
    }

    /**
     * Indicates the type of the requested certificate(s).
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificateType")
    public void setCertificateType(GetCertificateIdUseEnum certificateType) {
        this.certificateType = certificateType;
    }

    @JsonProperty("childCertificateHashData")
    public List<CertificateHashData> getChildCertificateHashData() {
        return childCertificateHashData;
    }

    @JsonProperty("childCertificateHashData")
    public void setChildCertificateHashData(List<CertificateHashData> childCertificateHashData) {
        this.childCertificateHashData = childCertificateHashData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CertificateHashDataChain.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customData");
        sb.append('=');
        sb.append(((this.customData == null)?"<null>":this.customData));
        sb.append(',');
        sb.append("certificateHashData");
        sb.append('=');
        sb.append(((this.certificateHashData == null)?"<null>":this.certificateHashData));
        sb.append(',');
        sb.append("certificateType");
        sb.append('=');
        sb.append(((this.certificateType == null)?"<null>":this.certificateType));
        sb.append(',');
        sb.append("childCertificateHashData");
        sb.append('=');
        sb.append(((this.childCertificateHashData == null)?"<null>":this.childCertificateHashData));
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
        result = ((result* 31)+((this.customData == null)? 0 :this.customData.hashCode()));
        result = ((result* 31)+((this.childCertificateHashData == null)? 0 :this.childCertificateHashData.hashCode()));
        result = ((result* 31)+((this.certificateHashData == null)? 0 :this.certificateHashData.hashCode()));
        result = ((result* 31)+((this.certificateType == null)? 0 :this.certificateType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CertificateHashDataChain) == false) {
            return false;
        }
        CertificateHashDataChain rhs = ((CertificateHashDataChain) other);
        return (((((this.customData == rhs.customData)||((this.customData!= null)&&this.customData.equals(rhs.customData)))&&((this.childCertificateHashData == rhs.childCertificateHashData)||((this.childCertificateHashData!= null)&&this.childCertificateHashData.equals(rhs.childCertificateHashData))))&&((this.certificateHashData == rhs.certificateHashData)||((this.certificateHashData!= null)&&this.certificateHashData.equals(rhs.certificateHashData))))&&((this.certificateType == rhs.certificateType)||((this.certificateType!= null)&&this.certificateType.equals(rhs.certificateType))));
    }

}
