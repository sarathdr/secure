
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOnStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="addOnStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="LICENSE_NOT_GENERATED"/&gt;
 *     &lt;enumeration value="COPIES_INCREASING"/&gt;
 *     &lt;enumeration value="COPIES_DECREASING"/&gt;
 *     &lt;enumeration value="WAIT_FOR_CONFIRMATION"/&gt;
 *     &lt;enumeration value="LICENSE_GENERATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "addOnStatus")
@XmlEnum
public enum AddOnStatus {

    LICENSE_NOT_GENERATED,
    COPIES_INCREASING,
    COPIES_DECREASING,
    WAIT_FOR_CONFIRMATION,
    LICENSE_GENERATED;

    public String value() {
        return name();
    }

    public static AddOnStatus fromValue(String v) {
        return valueOf(v);
    }

}
