
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for querySortKey.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="querySortKey"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="HOST_ID"/&gt;
 *     &lt;enumeration value="HOST_ALIAS"/&gt;
 *     &lt;enumeration value="HOST_CLASS"/&gt;
 *     &lt;enumeration value="HOST_CLOUD"/&gt;
 *     &lt;enumeration value="HOST_MACHINE_TYPE"/&gt;
 *     &lt;enumeration value="ENTERPRISE_ID"/&gt;
 *     &lt;enumeration value="HOSTID_TYPE"/&gt;
 *     &lt;enumeration value="HOST_TYPE_NAME"/&gt;
 *     &lt;enumeration value="HOST_TYPE_ALIAS"/&gt;
 *     &lt;enumeration value="HOST_SERIES_NAME"/&gt;
 *     &lt;enumeration value="HOST_SERIES_ALIAS"/&gt;
 *     &lt;enumeration value="HOST_USER"/&gt;
 *     &lt;enumeration value="SIGNATURE_NAME"/&gt;
 *     &lt;enumeration value="HOST_STATUS"/&gt;
 *     &lt;enumeration value="ACCOUNT_ID"/&gt;
 *     &lt;enumeration value="ACCOUNT_NAME"/&gt;
 *     &lt;enumeration value="SERVED_BY"/&gt;
 *     &lt;enumeration value="REQUEST_HISTORY_ID"/&gt;
 *     &lt;enumeration value="HOST_IDENTIFIER"/&gt;
 *     &lt;enumeration value="HISTORY_TYPE"/&gt;
 *     &lt;enumeration value="HOST_IDENTIFIER_TYPE"/&gt;
 *     &lt;enumeration value="HISTORY_DATE"/&gt;
 *     &lt;enumeration value="LAST_MODIFIED_DATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "querySortKey")
@XmlEnum
public enum QuerySortKey {

    HOST_ID,
    HOST_ALIAS,
    HOST_CLASS,
    HOST_CLOUD,
    HOST_MACHINE_TYPE,
    ENTERPRISE_ID,
    HOSTID_TYPE,
    HOST_TYPE_NAME,
    HOST_TYPE_ALIAS,
    HOST_SERIES_NAME,
    HOST_SERIES_ALIAS,
    HOST_USER,
    SIGNATURE_NAME,
    HOST_STATUS,
    ACCOUNT_ID,
    ACCOUNT_NAME,
    SERVED_BY,
    REQUEST_HISTORY_ID,
    HOST_IDENTIFIER,
    HISTORY_TYPE,
    HOST_IDENTIFIER_TYPE,
    HISTORY_DATE,
    LAST_MODIFIED_DATE;

    public String value() {
        return name();
    }

    public static QuerySortKey fromValue(String v) {
        return valueOf(v);
    }

}
