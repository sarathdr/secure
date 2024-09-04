
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servedStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="servedStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="NORMAL"/&gt;
 *     &lt;enumeration value="RETURNED"/&gt;
 *     &lt;enumeration value="EXPIRED"/&gt;
 *     &lt;enumeration value="DROPPED"/&gt;
 *     &lt;enumeration value="ONE_TIME_ACTIVATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "servedStatus")
@XmlEnum
public enum ServedStatus {

    NORMAL,
    RETURNED,
    EXPIRED,
    DROPPED,
    ONE_TIME_ACTIVATION;

    public String value() {
        return name();
    }

    public static ServedStatus fromValue(String v) {
        return valueOf(v);
    }

}
