
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOnQuerySortKey.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="addOnQuerySortKey"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="ACTIVATION_ID"/&gt;
 *     &lt;enumeration value="EXPIRATION_DATE"/&gt;
 *     &lt;enumeration value="MAPPED_DATE"/&gt;
 *     &lt;enumeration value="MAPPED_QUANTITY"/&gt;
 *     &lt;enumeration value="STATUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "addOnQuerySortKey")
@XmlEnum
public enum AddOnQuerySortKey {

    ACTIVATION_ID,
    EXPIRATION_DATE,
    MAPPED_DATE,
    MAPPED_QUANTITY,
    STATUS;

    public String value() {
        return name();
    }

    public static AddOnQuerySortKey fromValue(String v) {
        return valueOf(v);
    }

}
