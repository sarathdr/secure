
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deployment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="deployment"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="LOCAL"/&gt;
 *     &lt;enumeration value="CLOUD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "deployment")
@XmlEnum
public enum Deployment {

    LOCAL,
    CLOUD;

    public String value() {
        return name();
    }

    public static Deployment fromValue(String v) {
        return valueOf(v);
    }

}
