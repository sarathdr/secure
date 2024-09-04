
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionFormatOpt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VersionFormatOpt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIXED"/&gt;
 *     &lt;enumeration value="DATE_BASED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VersionFormatOpt")
@XmlEnum
public enum VersionFormatOpt {

    FIXED,
    DATE_BASED;

    public String value() {
        return name();
    }

    public static VersionFormatOpt fromValue(String v) {
        return valueOf(v);
    }

}
