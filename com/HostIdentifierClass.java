
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostIdentifierClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="hostIdentifierClass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="SERVER"/&gt;
 *     &lt;enumeration value="CLIENT"/&gt;
 *     &lt;enumeration value="SERVED_CLIENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "hostIdentifierClass")
@XmlEnum
public enum HostIdentifierClass {

    SERVER,
    CLIENT,
    SERVED_CLIENT;

    public String value() {
        return name();
    }

    public static HostIdentifierClass fromValue(String v) {
        return valueOf(v);
    }

}
