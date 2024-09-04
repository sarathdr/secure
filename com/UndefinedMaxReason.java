
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for undefinedMaxReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="undefinedMaxReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVATION_ID_NOT_FOUND"/&gt;
 *     &lt;enumeration value="OWNER_MISMATCH"/&gt;
 *     &lt;enumeration value="LICENSE_MODEL_INVALID"/&gt;
 *     &lt;enumeration value="NO_FULFILL_ALLOWED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "undefinedMaxReason")
@XmlEnum
public enum UndefinedMaxReason {

    ACTIVATION_ID_NOT_FOUND,
    OWNER_MISMATCH,
    LICENSE_MODEL_INVALID,
    NO_FULFILL_ALLOWED;

    public String value() {
        return name();
    }

    public static UndefinedMaxReason fromValue(String v) {
        return valueOf(v);
    }

}
