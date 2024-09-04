
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="updateSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="FNOC_PP"/&gt;
 *     &lt;enumeration value="FNOC_EP"/&gt;
 *     &lt;enumeration value="LFS_CAPREQ"/&gt;
 *     &lt;enumeration value="SQL"/&gt;
 *     &lt;enumeration value="FNOC_WS"/&gt;
 *     &lt;enumeration value="FNO_PP"/&gt;
 *     &lt;enumeration value="FNO_EP"/&gt;
 *     &lt;enumeration value="FNO_WS"/&gt;
 *     &lt;enumeration value="SOAPUI"/&gt;
 *     &lt;enumeration value="CAP_REQ"/&gt;
 *     &lt;enumeration value="SYNC_REQ"/&gt;
 *     &lt;enumeration value="SYNC_MSG"/&gt;
 *     &lt;enumeration value="SYNC_PROC"/&gt;
 *     &lt;enumeration value="JSON"/&gt;
 *     &lt;enumeration value="UAS_JOB"/&gt;
 *     &lt;enumeration value="ORPHAN_JOB"/&gt;
 *     &lt;enumeration value="EXPIAO_JOB"/&gt;
 *     &lt;enumeration value="FNO_JOB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "updateSource")
@XmlEnum
public enum UpdateSource {

    FNOC_PP,
    FNOC_EP,
    LFS_CAPREQ,
    SQL,
    FNOC_WS,
    FNO_PP,
    FNO_EP,
    FNO_WS,
    SOAPUI,
    CAP_REQ,
    SYNC_REQ,
    SYNC_MSG,
    SYNC_PROC,
    JSON,
    UAS_JOB,
    ORPHAN_JOB,
    EXPIAO_JOB,
    FNO_JOB;

    public String value() {
        return name();
    }

    public static UpdateSource fromValue(String v) {
        return valueOf(v);
    }

}
