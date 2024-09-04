
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateSource" type="{urn:com.flexnet.lfs.webservice}updateSource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseRequest", propOrder = {
    "userName",
    "userId",
    "updateSource"
})
@XmlSeeAlso({
    CreateHostRequest.class,
    GetHostRequest.class,
    EditHostRequest.class,
    GetFeaturesRequest.class,
    GetMaxMappableRequest.class,
    GetMaxMappableWithoutCallbackRequest.class,
    GetServerRequest.class,
    GetHostsRequest.class,
    GetServedClientRequest.class,
    GetAddOnMappingsRequest.class,
    GetAddOnMappingsCountRequest.class,
    FindServersForEnterpriseRequest.class,
    SearchServersRequest.class,
    SearchServedClientsRequest.class,
    GetIdentityRequest.class,
    CreateIdentityRequest.class,
    UpdateIdentityRequest.class,
    GetSignersRequest.class,
    CreateTenantRequest.class,
    ListIdentitiesRequest.class,
    ListPublishersRequest.class,
    CreatePublisherRequest.class,
    CreateDeviceRequest.class,
    SearchDeviceRequest.class,
    EditDeviceRequest.class,
    ReturnDeviceRequest.class,
    ReturnHostRequest.class,
    ClaimDeviceRequest.class,
    GetDeviceRequest.class,
    ProcessBinaryRequestInput.class,
    CapabilityResponseInput.class,
    GetSupportedHostIdTypesRequest.class,
    SearchHostHistoryRequest.class,
    SearchRequestHistoryInput.class,
    UpdateHostOwnerRequest.class,
    SearchSyncHistoryRequest.class,
    CreateDeviceSeriesRequest.class,
    UpdateDeviceModelRequest.class,
    UpdateDeviceSeriesRequest.class,
    ListDeviceSeriesRequest.class,
    GetDeviceSeriesRequest.class,
    GetDeviceModelRequest.class,
    ListDeviceModelsRequest.class,
    ListHostTypesRequest.class,
    GenerateLicenseFileRequest.class,
    ObsoleteHostRequest.class,
    DeleteHostRequest.class,
    ListServerHostTypesRequest.class,
    GetDeviceLicenseFileRequest.class,
    SearchDeviceModelsRequest.class,
    GetConfigurationMetadataRequest.class,
    GetConfigurationRequest.class,
    SetConfigurationRequest.class,
    EditServerRequest.class,
    GetServerHostTypeRequest.class,
    UpdateServerHostTypeRequest.class,
    EditServedClientRequest.class,
    MoveDevicesRequest.class,
    GetUsageSummaryRequest.class,
    IsLicenseGeneratedRequest.class,
    GetPendingFulfillCountRequest.class,
    IsCatalogItemMappedRequest.class,
    IsBaseProductUsedInLimitedSeriesRequest.class,
    GetFilteredIDTypesForClientRequest.class,
    GetFilteredIDTypesForServerRequest.class,
    GetAllowedIDTypesRequest.class,
    IsRightsIdMappedRequest.class,
    IsCatalogItemMappedToLimitedSeriesRequest.class,
    GetDefaultServerForEnterpriseRequest.class,
    GetHostsForEntitlementTransferRequest.class,
    IsOwnerReferencedRequest.class,
    SearchAddOnsRequest.class,
    ReturnAddOnsRequest.class,
    UpdateMatchingHostOwnersRequest.class,
    GenerateCloneDetectionReportRequest.class,
    UsedByDeviceSeriesRequest.class,
    SetHostedServerAdminPasswordRequest.class,
    HostTypeBase.class,
    HostTypeData.class,
    ServerAttributes.class,
    AddOnMappingData.class,
    MoveHostRequest.class
})
public class BaseRequest {

    protected String userName;
    protected String userId;
    @XmlSchemaType(name = "NMTOKEN")
    protected UpdateSource updateSource;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the updateSource property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSource }
     *     
     */
    public UpdateSource getUpdateSource() {
        return updateSource;
    }

    /**
     * Sets the value of the updateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSource }
     *     
     */
    public void setUpdateSource(UpdateSource value) {
        this.updateSource = value;
    }

}
