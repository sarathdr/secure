
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DurationUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SECONDS"/&gt;
 *     &lt;enumeration value="MINUTES"/&gt;
 *     &lt;enumeration value="HOURS"/&gt;
 *     &lt;enumeration value="DAYS"/&gt;
 *     &lt;enumeration value="WEEKS"/&gt;
 *     &lt;enumeration value="MONTHS"/&gt;
 *     &lt;enumeration value="YEARS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DurationUnit")
@XmlEnum
public enum DurationUnit {

    SECONDS,
    MINUTES,
    HOURS,
    DAYS,
    WEEKS,
    MONTHS,
    YEARS;

    public String value() {
        return name();
    }

    public static DurationUnit fromValue(String v) {
        return valueOf(v);
    }

}
