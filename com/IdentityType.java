
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="identityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="BACK_OFFICE"/&gt;
 *     &lt;enumeration value="CLIENT_SERVER"/&gt;
 *     &lt;enumeration value="CLIENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "identityType")
@XmlEnum
public enum IdentityType {

    BACK_OFFICE,
    CLIENT_SERVER,
    CLIENT;

    public String value() {
        return name();
    }

    public static IdentityType fromValue(String v) {
        return valueOf(v);
    }

}
