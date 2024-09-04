
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionDateOpt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VersionDateOpt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFINE_NOW"/&gt;
 *     &lt;enumeration value="USE_START_DATE"/&gt;
 *     &lt;enumeration value="USE_ACTIVATION_DATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VersionDateOpt")
@XmlEnum
public enum VersionDateOpt {

    DEFINE_NOW,
    USE_START_DATE,
    USE_ACTIVATION_DATE;

    public String value() {
        return name();
    }

    public static VersionDateOpt fromValue(String v) {
        return valueOf(v);
    }

}
