
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="searchSummary" type="{urn:com.flexnet.lfs.webservice}searchSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseResponse", propOrder = {
    "status",
    "details",
    "searchSummary"
})
@XmlSeeAlso({
    CreateServerResponse.class,
    CreateHostResponse.class,
    GetHostResponse.class,
    EditHostResponse.class,
    GetFeaturesResponse.class,
    GetMaxMappableResponse.class,
    GetServerResponse.class,
    GetHostsResponse.class,
    GetServedClientResponse.class,
    GetAddOnMappingsResponse.class,
    GetAddOnMappingsCountResponse.class,
    FindServersForEnterpriseResponse.class,
    SearchServersResponse.class,
    SearchServedClientsResponse.class,
    GetIdentityResponse.class,
    CreateIdentityResponse.class,
    UpdateIdentityResponse.class,
    GetSignersResponse.class,
    CreateTenantResponse.class,
    ListIdentitiesResponse.class,
    ListPublishersResponse.class,
    CreatePublisherResponse.class,
    CreateDeviceResponse.class,
    SearchDeviceResponse.class,
    EditDeviceResponse.class,
    ReturnDeviceResponse.class,
    ReturnHostResponse.class,
    ClaimDeviceResponse.class,
    GetDeviceResponse.class,
    ProcessBinaryRequestOutput.class,
    CapabilityResponseOutput.class,
    GetSupportedHostIdTypesResponse.class,
    SearchHostHistoryResponse.class,
    SearchRequestHistoryResponse.class,
    UpdateHostOwnerResponse.class,
    SearchSyncHistoryResponse.class,
    CreateDeviceSeriesResponse.class,
    CreateHostTypeResponse.class,
    CreateDeviceModelResponse.class,
    UpdateDeviceModelResponse.class,
    UpdateDeviceSeriesResponse.class,
    ListDeviceSeriesResponse.class,
    GetDeviceSeriesResponse.class,
    GetDeviceModelResponse.class,
    ListDeviceModelsResponse.class,
    ListHostTypesResponse.class,
    CreateServerHostTypeResponse.class,
    GenerateLicenseFileResponse.class,
    ObsoleteHostResponse.class,
    DeleteHostResponse.class,
    ListServerHostTypesResponse.class,
    GetDeviceLicenseFileResponse.class,
    SearchDeviceModelsResponse.class,
    GetConfigurationMetadataResponse.class,
    GetConfigurationResponse.class,
    SetConfigurationResponse.class,
    EditServerResponse.class,
    DetachUserResponse.class,
    GetServerHostTypeResponse.class,
    UpdateServerHostTypeResponse.class,
    EditServedClientResponse.class,
    MoveDeviceResponse.class,
    MoveDevicesResponse.class,
    MoveServerResponse.class,
    GetUsageSummaryResponse.class,
    IsLicenseGeneratedResponse.class,
    GetPendingFulfillCountResponse.class,
    IsCatalogItemMappedResponse.class,
    IsBaseProductUsedInLimitedSeriesResponse.class,
    GetFilteredIDTypesForClientResponse.class,
    GetFilteredIDTypesForServerResponse.class,
    GetAllowedIDTypesResponse.class,
    IsRightsIdMappedResponse.class,
    IsCatalogItemMappedToLimitedSeriesResponse.class,
    GetHostsForEntitlementTransferResponse.class,
    IsOwnerReferencedResponse.class,
    SearchAddOnsResponse.class,
    UpdateMatchingHostOwnersResponse.class,
    GenerateCloneDetectionReportResponse.class,
    UsedByDeviceSeriesResponse.class,
    SetHostedServerAdminPasswordResponse.class,
    AddOnMappingResponse.class
})
public class BaseResponse {

    @XmlElement(required = true, defaultValue = "SUCCESS")
    protected String status;
    protected String details;
    protected SearchSummary searchSummary;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the searchSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSummary }
     *     
     */
    public SearchSummary getSearchSummary() {
        return searchSummary;
    }

    /**
     * Sets the value of the searchSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSummary }
     *     
     */
    public void setSearchSummary(SearchSummary value) {
        this.searchSummary = value;
    }

}
