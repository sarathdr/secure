
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="configItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STRING"/&gt;
 *     &lt;enumeration value="BOOLEAN"/&gt;
 *     &lt;enumeration value="INTEGER"/&gt;
 *     &lt;enumeration value="UNSIGNED"/&gt;
 *     &lt;enumeration value="FLOAT"/&gt;
 *     &lt;enumeration value="ENUM"/&gt;
 *     &lt;enumeration value="DURATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "configItemType")
@XmlEnum
public enum ConfigItemType {

    STRING,
    BOOLEAN,
    INTEGER,
    UNSIGNED,
    FLOAT,
    ENUM,
    DURATION;

    public String value() {
        return name();
    }

    public static ConfigItemType fromValue(String v) {
        return valueOf(v);
    }

}
