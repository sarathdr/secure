
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for machineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="machineType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="PHYSICAL"/&gt;
 *     &lt;enumeration value="VIRTUAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "machineType")
@XmlEnum
public enum MachineType {

    UNKNOWN,
    PHYSICAL,
    VIRTUAL;

    public String value() {
        return name();
    }

    public static MachineType fromValue(String v) {
        return valueOf(v);
    }

}
