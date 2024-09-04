
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostHistoryEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="hostHistoryEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="ERROR_RESPONSE_SENT"/&gt;
 *     &lt;enumeration value="SYNC_REQUEST"/&gt;
 *     &lt;enumeration value="SYNC_DOWNLOAD"/&gt;
 *     &lt;enumeration value="SYNC_ACKNOWLEDGE"/&gt;
 *     &lt;enumeration value="SYNC_UPLOAD"/&gt;
 *     &lt;enumeration value="SYNC_UPLOAD_COMPLETE"/&gt;
 *     &lt;enumeration value="SYNC_UPLOAD_MISMATCH"/&gt;
 *     &lt;enumeration value="HOST_CREATED_FROM_SYNC"/&gt;
 *     &lt;enumeration value="HOST_SYNC_ADDED"/&gt;
 *     &lt;enumeration value="HOST_UPDATED_FROM_SYNC"/&gt;
 *     &lt;enumeration value="HOST_SYNC_DELETED"/&gt;
 *     &lt;enumeration value="HOST_SYNC_RETURNED"/&gt;
 *     &lt;enumeration value="HOST_SYNC_EXPIRED"/&gt;
 *     &lt;enumeration value="HOST_SYNC_REPARENTED"/&gt;
 *     &lt;enumeration value="HOST_SYNC_ADOPTED"/&gt;
 *     &lt;enumeration value="HOST_CREATE_FROM_SYNC_FAILED"/&gt;
 *     &lt;enumeration value="HOST_UPDATE_FROM_SYNC_FAILED"/&gt;
 *     &lt;enumeration value="CAPABILITY_RESPONSE_GENERATED"/&gt;
 *     &lt;enumeration value="CAPABILITY_RESPONSE_GENERATED_NO_REQUEST"/&gt;
 *     &lt;enumeration value="CAPABILITY_RESPONSE_SENT"/&gt;
 *     &lt;enumeration value="CAPABILITY_REQUEST_UPLOADED"/&gt;
 *     &lt;enumeration value="CAPABILITY_REQUEST_RECEIVED"/&gt;
 *     &lt;enumeration value="HOST_ALIAS_CHANGED"/&gt;
 *     &lt;enumeration value="NO_RESPONSE_SENT"/&gt;
 *     &lt;enumeration value="ADD_ON_REDUCTION_CONFIRMED"/&gt;
 *     &lt;enumeration value="ADD_ON_REMOVAL_CONFIRMED"/&gt;
 *     &lt;enumeration value="ADD_ON_COPIES_INCREASED"/&gt;
 *     &lt;enumeration value="ADD_ON_COPIES_DECREASED"/&gt;
 *     &lt;enumeration value="ADD_ON_REMOVED"/&gt;
 *     &lt;enumeration value="ADD_ON_MARK_REMOVED"/&gt;
 *     &lt;enumeration value="ADD_ON_MAPPED"/&gt;
 *     &lt;enumeration value="HOST_CREATED"/&gt;
 *     &lt;enumeration value="HOST_DELETED"/&gt;
 *     &lt;enumeration value="REQUEST_HOST_ID_CHANGED"/&gt;
 *     &lt;enumeration value="HOST_ENTERPRISE_ID_CHANGED"/&gt;
 *     &lt;enumeration value="HOST_ENTERPRISE_ID_ASSOCIATED"/&gt;
 *     &lt;enumeration value="HOST_PROFILE_TYPE_CHANGED"/&gt;
 *     &lt;enumeration value="HOST_ID_HEALED"/&gt;
 *     &lt;enumeration value="HOST_UUID_GENERATED"/&gt;
 *     &lt;enumeration value="HOST_UUID_ASSIGNED"/&gt;
 *     &lt;enumeration value="ADD_ON_MAPPING_CHANGED"/&gt;
 *     &lt;enumeration value="SHORT_CODE_RESPONSE_GENERATED"/&gt;
 *     &lt;enumeration value="HOST_TYPE_CREATED"/&gt;
 *     &lt;enumeration value="HOST_TYPE_SUBSTITUTED"/&gt;
 *     &lt;enumeration value="HOST_TRUSTED_CHANGED"/&gt;
 *     &lt;enumeration value="BUFFER_LICENSE_GENERATED"/&gt;
 *     &lt;enumeration value="HOST_SITE_NAME_CHANGED"/&gt;
 *     &lt;enumeration value="CAP_RESPONSE_REJECTED_FOR_OVERAGE"/&gt;
 *     &lt;enumeration value="STATUS_ACTIVE"/&gt;
 *     &lt;enumeration value="STATUS_OBSOLETE"/&gt;
 *     &lt;enumeration value="STATUS_TEST"/&gt;
 *     &lt;enumeration value="STATUS_RETURNED"/&gt;
 *     &lt;enumeration value="CLONE_SUSPECT"/&gt;
 *     &lt;enumeration value="RESET_BINDING"/&gt;
 *     &lt;enumeration value="HOST_ID_CHANGED"/&gt;
 *     &lt;enumeration value="HOST_TYPE_CHANGED"/&gt;
 *     &lt;enumeration value="INVALID_FEATURE_ID"/&gt;
 *     &lt;enumeration value="SIGNATURE_CHANGED"/&gt;
 *     &lt;enumeration value="USER_ID_CHANGED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "hostHistoryEventType")
@XmlEnum
public enum HostHistoryEventType {

    UNKNOWN,
    ERROR_RESPONSE_SENT,
    SYNC_REQUEST,
    SYNC_DOWNLOAD,
    SYNC_ACKNOWLEDGE,
    SYNC_UPLOAD,
    SYNC_UPLOAD_COMPLETE,
    SYNC_UPLOAD_MISMATCH,
    HOST_CREATED_FROM_SYNC,
    HOST_SYNC_ADDED,
    HOST_UPDATED_FROM_SYNC,
    HOST_SYNC_DELETED,
    HOST_SYNC_RETURNED,
    HOST_SYNC_EXPIRED,
    HOST_SYNC_REPARENTED,
    HOST_SYNC_ADOPTED,
    HOST_CREATE_FROM_SYNC_FAILED,
    HOST_UPDATE_FROM_SYNC_FAILED,
    CAPABILITY_RESPONSE_GENERATED,
    CAPABILITY_RESPONSE_GENERATED_NO_REQUEST,
    CAPABILITY_RESPONSE_SENT,
    CAPABILITY_REQUEST_UPLOADED,
    CAPABILITY_REQUEST_RECEIVED,
    HOST_ALIAS_CHANGED,
    NO_RESPONSE_SENT,
    ADD_ON_REDUCTION_CONFIRMED,
    ADD_ON_REMOVAL_CONFIRMED,
    ADD_ON_COPIES_INCREASED,
    ADD_ON_COPIES_DECREASED,
    ADD_ON_REMOVED,
    ADD_ON_MARK_REMOVED,
    ADD_ON_MAPPED,
    HOST_CREATED,
    HOST_DELETED,
    REQUEST_HOST_ID_CHANGED,
    HOST_ENTERPRISE_ID_CHANGED,
    HOST_ENTERPRISE_ID_ASSOCIATED,
    HOST_PROFILE_TYPE_CHANGED,
    HOST_ID_HEALED,
    HOST_UUID_GENERATED,
    HOST_UUID_ASSIGNED,
    ADD_ON_MAPPING_CHANGED,
    SHORT_CODE_RESPONSE_GENERATED,
    HOST_TYPE_CREATED,
    HOST_TYPE_SUBSTITUTED,
    HOST_TRUSTED_CHANGED,
    BUFFER_LICENSE_GENERATED,
    HOST_SITE_NAME_CHANGED,
    CAP_RESPONSE_REJECTED_FOR_OVERAGE,
    STATUS_ACTIVE,
    STATUS_OBSOLETE,
    STATUS_TEST,
    STATUS_RETURNED,
    CLONE_SUSPECT,
    RESET_BINDING,
    HOST_ID_CHANGED,
    HOST_TYPE_CHANGED,
    INVALID_FEATURE_ID,
    SIGNATURE_CHANGED,
    USER_ID_CHANGED;

    public String value() {
        return name();
    }

    public static HostHistoryEventType fromValue(String v) {
        return valueOf(v);
    }

}
