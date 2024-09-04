
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="hostStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="TEST"/&gt;
 *     &lt;enumeration value="OBSOLETE"/&gt;
 *     &lt;enumeration value="RETURNED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "hostStatus")
@XmlEnum
public enum HostStatus {

    ACTIVE,
    TEST,
    OBSOLETE,
    RETURNED;

    public String value() {
        return name();
    }

    public static HostStatus fromValue(String v) {
        return valueOf(v);
    }

}
