
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SupportAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UPGRADE"/&gt;
 *     &lt;enumeration value="UPSELL"/&gt;
 *     &lt;enumeration value="RENEWAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupportAction")
@XmlEnum
public enum SupportAction {

    UPGRADE,
    UPSELL,
    RENEWAL;

    public String value() {
        return name();
    }

    public static SupportAction fromValue(String v) {
        return valueOf(v);
    }

}
