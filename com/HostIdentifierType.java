
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostIdentifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="hostIdentifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="ETHERNET"/&gt;
 *     &lt;enumeration value="USER"/&gt;
 *     &lt;enumeration value="STRING"/&gt;
 *     &lt;enumeration value="INTERNET"/&gt;
 *     &lt;enumeration value="INTERNET6"/&gt;
 *     &lt;enumeration value="FLEXID9"/&gt;
 *     &lt;enumeration value="FLEXID10"/&gt;
 *     &lt;enumeration value="VM_UUID"/&gt;
 *     &lt;enumeration value="TOLERANT"/&gt;
 *     &lt;enumeration value="EXTENDED"/&gt;
 *     &lt;enumeration value="PUBLISHER_DEFINED"/&gt;
 *     &lt;enumeration value="CONTAINER_ID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "hostIdentifierType")
@XmlEnum
public enum HostIdentifierType {

    ETHERNET("ETHERNET"),
    USER("USER"),
    STRING("STRING"),
    INTERNET("INTERNET"),
    @XmlEnumValue("INTERNET6")
    INTERNET_6("INTERNET6"),
    @XmlEnumValue("FLEXID9")
    FLEXID_9("FLEXID9"),
    @XmlEnumValue("FLEXID10")
    FLEXID_10("FLEXID10"),
    VM_UUID("VM_UUID"),
    TOLERANT("TOLERANT"),
    EXTENDED("EXTENDED"),
    PUBLISHER_DEFINED("PUBLISHER_DEFINED"),
    CONTAINER_ID("CONTAINER_ID");
    private final String value;

    HostIdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostIdentifierType fromValue(String v) {
        for (HostIdentifierType c: HostIdentifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
