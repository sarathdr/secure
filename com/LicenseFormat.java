
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for licenseFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="licenseFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="MIXED"/&gt;
 *     &lt;enumeration value="BUFFER"/&gt;
 *     &lt;enumeration value="TRUSTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "licenseFormat")
@XmlEnum
public enum LicenseFormat {

    MIXED,
    BUFFER,
    TRUSTED;

    public String value() {
        return name();
    }

    public static LicenseFormat fromValue(String v) {
        return valueOf(v);
    }

}
