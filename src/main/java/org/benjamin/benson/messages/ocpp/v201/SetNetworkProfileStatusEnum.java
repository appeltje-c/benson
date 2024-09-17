
package org.benjamin.benson.messages.ocpp.v201;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Result of operation.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum SetNetworkProfileStatusEnum {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    FAILED("Failed");
    private final String value;
    private final static Map<String, SetNetworkProfileStatusEnum> CONSTANTS = new HashMap<String, SetNetworkProfileStatusEnum>();

    static {
        for (SetNetworkProfileStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SetNetworkProfileStatusEnum(String value) {
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
    public static SetNetworkProfileStatusEnum fromValue(String value) {
        SetNetworkProfileStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
