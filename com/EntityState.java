
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EntityState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DRAFT"/&gt;
 *     &lt;enumeration value="DEPLOYED"/&gt;
 *     &lt;enumeration value="INACTIVE"/&gt;
 *     &lt;enumeration value="OBSOLETE"/&gt;
 *     &lt;enumeration value="TEST"/&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="ON_HOLD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityState")
@XmlEnum
public enum EntityState {

    DRAFT,
    DEPLOYED,
    INACTIVE,
    OBSOLETE,
    TEST,
    ACTIVE,
    ON_HOLD;

    public String value() {
        return name();
    }

    public static EntityState fromValue(String v) {
        return valueOf(v);
    }

}
