
package org.benjamin.benson.messages.ocpp.v16;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "context",
    "format",
    "measurand",
    "phase",
    "location",
    "unit"
})
@Generated("jsonschema2pojo")
public class SampledValue__1 {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private String value;
    @JsonProperty("context")
    private SampledValue__1 .Context context;
    @JsonProperty("format")
    private SampledValue__1 .Format format;
    @JsonProperty("measurand")
    private SampledValue__1 .Measurand measurand;
    @JsonProperty("phase")
    private SampledValue__1 .Phase phase;
    @JsonProperty("location")
    private SampledValue__1 .Location location;
    @JsonProperty("unit")
    private SampledValue__1 .Unit unit;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("context")
    public SampledValue__1 .Context getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(SampledValue__1 .Context context) {
        this.context = context;
    }

    @JsonProperty("format")
    public SampledValue__1 .Format getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(SampledValue__1 .Format format) {
        this.format = format;
    }

    @JsonProperty("measurand")
    public SampledValue__1 .Measurand getMeasurand() {
        return measurand;
    }

    @JsonProperty("measurand")
    public void setMeasurand(SampledValue__1 .Measurand measurand) {
        this.measurand = measurand;
    }

    @JsonProperty("phase")
    public SampledValue__1 .Phase getPhase() {
        return phase;
    }

    @JsonProperty("phase")
    public void setPhase(SampledValue__1 .Phase phase) {
        this.phase = phase;
    }

    @JsonProperty("location")
    public SampledValue__1 .Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(SampledValue__1 .Location location) {
        this.location = location;
    }

    @JsonProperty("unit")
    public SampledValue__1 .Unit getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(SampledValue__1 .Unit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SampledValue__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("measurand");
        sb.append('=');
        sb.append(((this.measurand == null)?"<null>":this.measurand));
        sb.append(',');
        sb.append("phase");
        sb.append('=');
        sb.append(((this.phase == null)?"<null>":this.phase));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
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
        result = ((result* 31)+((this.phase == null)? 0 :this.phase.hashCode()));
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.measurand == null)? 0 :this.measurand.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SampledValue__1) == false) {
            return false;
        }
        SampledValue__1 rhs = ((SampledValue__1) other);
        return ((((((((this.phase == rhs.phase)||((this.phase!= null)&&this.phase.equals(rhs.phase)))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.measurand == rhs.measurand)||((this.measurand!= null)&&this.measurand.equals(rhs.measurand))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

    @Generated("jsonschema2pojo")
    public enum Context {

        INTERRUPTION_BEGIN("Interruption.Begin"),
        INTERRUPTION_END("Interruption.End"),
        SAMPLE_CLOCK("Sample.Clock"),
        SAMPLE_PERIODIC("Sample.Periodic"),
        TRANSACTION_BEGIN("Transaction.Begin"),
        TRANSACTION_END("Transaction.End"),
        TRIGGER("Trigger"),
        OTHER("Other");
        private final String value;
        private final static Map<String, SampledValue__1 .Context> CONSTANTS = new HashMap<String, SampledValue__1 .Context>();

        static {
            for (SampledValue__1 .Context c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Context(String value) {
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
        public static SampledValue__1 .Context fromValue(String value) {
            SampledValue__1 .Context constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum Format {

        RAW("Raw"),
        SIGNED_DATA("SignedData");
        private final String value;
        private final static Map<String, SampledValue__1 .Format> CONSTANTS = new HashMap<String, SampledValue__1 .Format>();

        static {
            for (SampledValue__1 .Format c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Format(String value) {
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
        public static SampledValue__1 .Format fromValue(String value) {
            SampledValue__1 .Format constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum Location {

        CABLE("Cable"),
        EV("EV"),
        INLET("Inlet"),
        OUTLET("Outlet"),
        BODY("Body");
        private final String value;
        private final static Map<String, SampledValue__1 .Location> CONSTANTS = new HashMap<String, SampledValue__1 .Location>();

        static {
            for (SampledValue__1 .Location c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Location(String value) {
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
        public static SampledValue__1 .Location fromValue(String value) {
            SampledValue__1 .Location constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum Measurand {

        ENERGY_ACTIVE_EXPORT_REGISTER("Energy.Active.Export.Register"),
        ENERGY_ACTIVE_IMPORT_REGISTER("Energy.Active.Import.Register"),
        ENERGY_REACTIVE_EXPORT_REGISTER("Energy.Reactive.Export.Register"),
        ENERGY_REACTIVE_IMPORT_REGISTER("Energy.Reactive.Import.Register"),
        ENERGY_ACTIVE_EXPORT_INTERVAL("Energy.Active.Export.Interval"),
        ENERGY_ACTIVE_IMPORT_INTERVAL("Energy.Active.Import.Interval"),
        ENERGY_REACTIVE_EXPORT_INTERVAL("Energy.Reactive.Export.Interval"),
        ENERGY_REACTIVE_IMPORT_INTERVAL("Energy.Reactive.Import.Interval"),
        POWER_ACTIVE_EXPORT("Power.Active.Export"),
        POWER_ACTIVE_IMPORT("Power.Active.Import"),
        POWER_OFFERED("Power.Offered"),
        POWER_REACTIVE_EXPORT("Power.Reactive.Export"),
        POWER_REACTIVE_IMPORT("Power.Reactive.Import"),
        POWER_FACTOR("Power.Factor"),
        CURRENT_IMPORT("Current.Import"),
        CURRENT_EXPORT("Current.Export"),
        CURRENT_OFFERED("Current.Offered"),
        VOLTAGE("Voltage"),
        FREQUENCY("Frequency"),
        TEMPERATURE("Temperature"),
        SO_C("SoC"),
        RPM("RPM");
        private final String value;
        private final static Map<String, SampledValue__1 .Measurand> CONSTANTS = new HashMap<String, SampledValue__1 .Measurand>();

        static {
            for (SampledValue__1 .Measurand c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Measurand(String value) {
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
        public static SampledValue__1 .Measurand fromValue(String value) {
            SampledValue__1 .Measurand constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum Phase {

        L_1("L1"),
        L_2("L2"),
        L_3("L3"),
        N("N"),
        L_1_N("L1-N"),
        L_2_N("L2-N"),
        L_3_N("L3-N"),
        L_1_L_2("L1-L2"),
        L_2_L_3("L2-L3"),
        L_3_L_1("L3-L1");
        private final String value;
        private final static Map<String, SampledValue__1 .Phase> CONSTANTS = new HashMap<String, SampledValue__1 .Phase>();

        static {
            for (SampledValue__1 .Phase c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Phase(String value) {
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
        public static SampledValue__1 .Phase fromValue(String value) {
            SampledValue__1 .Phase constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum Unit {

        WH("Wh"),
        K_WH("kWh"),
        VARH("varh"),
        KVARH("kvarh"),
        W("W"),
        K_W("kW"),
        VA("VA"),
        K_VA("kVA"),
        VAR("var"),
        KVAR("kvar"),
        A("A"),
        V("V"),
        K("K"),
        CELCIUS("Celcius"),
        FAHRENHEIT("Fahrenheit"),
        PERCENT("Percent");
        private final String value;
        private final static Map<String, SampledValue__1 .Unit> CONSTANTS = new HashMap<String, SampledValue__1 .Unit>();

        static {
            for (SampledValue__1 .Unit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Unit(String value) {
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
        public static SampledValue__1 .Unit fromValue(String value) {
            SampledValue__1 .Unit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
