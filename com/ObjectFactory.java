
package secure.com;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.lfs.flexnet.com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LFSFaultResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "LFSFaultResponse");
    private final static QName _CreateServerRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createServerRequest");
    private final static QName _CreateServerResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createServerResponse");
    private final static QName _CreateHostRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createHostRequest");
    private final static QName _CreateHostResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createHostResponse");
    private final static QName _GetHostRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getHostRequest");
    private final static QName _GetHostResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getHostResponse");
    private final static QName _EditHostRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "editHostRequest");
    private final static QName _EditHostResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "editHostResponse");
    private final static QName _GetFeaturesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getFeaturesRequest");
    private final static QName _GetFeaturesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getFeaturesResponse");
    private final static QName _GetMaxMappableRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getMaxMappableRequest");
    private final static QName _GetMaxMappableResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getMaxMappableResponse");
    private final static QName _GetMaxMappableWithoutCallbackRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getMaxMappableWithoutCallbackRequest");
    private final static QName _MapAddOnsRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "mapAddOnsRequest");
    private final static QName _MapAddOnsResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "mapAddOnsResponse");
    private final static QName _GetServerRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getServerRequest");
    private final static QName _GetServerResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getServerResponse");
    private final static QName _GetHostsRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getHostsRequest");
    private final static QName _GetHostsResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getHostsResponse");
    private final static QName _GetServedClientRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getServedClientRequest");
    private final static QName _GetServedClientResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getServedClientResponse");
    private final static QName _GetAddOnMappingsRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getAddOnMappingsRequest");
    private final static QName _GetAddOnMappingsResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getAddOnMappingsResponse");
    private final static QName _GetAddOnMappingsCountRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getAddOnMappingsCountRequest");
    private final static QName _GetAddOnMappingsCountResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getAddOnMappingsCountResponse");
    private final static QName _FindServersForEnterpriseRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "findServersForEnterpriseRequest");
    private final static QName _FindServersForEnterpriseResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "findServersForEnterpriseResponse");
    private final static QName _SearchServersRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchServersRequest");
    private final static QName _SearchServersResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchServersResponse");
    private final static QName _SearchServedClientsRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchServedClientsRequest");
    private final static QName _SearchServedClientsResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchServedClientsResponse");
    private final static QName _GetIdentityRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getIdentityRequest");
    private final static QName _GetIdentityResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getIdentityResponse");
    private final static QName _CreateIdentityRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createIdentityRequest");
    private final static QName _CreateIdentityResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createIdentityResponse");
    private final static QName _UpdateIdentityRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateIdentityRequest");
    private final static QName _UpdateIdentityResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateIdentityResponse");
    private final static QName _GetSignersRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getSignersRequest");
    private final static QName _GetSignersResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getSignersResponse");
    private final static QName _CreateTenantRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createTenantRequest");
    private final static QName _CreateTenantResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createTenantResponse");
    private final static QName _ListIdentitiesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listIdentitiesRequest");
    private final static QName _ListIdentitiesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listIdentitiesResponse");
    private final static QName _ListPublishersRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listPublishersRequest");
    private final static QName _ListPublishersResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listPublishersResponse");
    private final static QName _CreatePublisherRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createPublisherRequest");
    private final static QName _CreatePublisherResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createPublisherResponse");
    private final static QName _CreateDeviceRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createDeviceRequest");
    private final static QName _CreateDeviceResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createDeviceResponse");
    private final static QName _SearchDeviceRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchDeviceRequest");
    private final static QName _SearchDeviceResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchDeviceResponse");
    private final static QName _EditDeviceRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "editDeviceRequest");
    private final static QName _EditDeviceResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "editDeviceResponse");
    private final static QName _ReturnDeviceRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "returnDeviceRequest");
    private final static QName _ReturnDeviceResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "returnDeviceResponse");
    private final static QName _ReturnHostRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "returnHostRequest");
    private final static QName _ReturnHostResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "returnHostResponse");
    private final static QName _ClaimDeviceRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "claimDeviceRequest");
    private final static QName _ClaimDeviceResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "claimDeviceResponse");
    private final static QName _RemoveAddOnsRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "removeAddOnsRequest");
    private final static QName _RemoveAddOnsResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "removeAddOnsResponse");
    private final static QName _AddAddOnsRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "addAddOnsRequest");
    private final static QName _AddAddOnsResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "addAddOnsResponse");
    private final static QName _GetDeviceRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getDeviceRequest");
    private final static QName _GetDeviceResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getDeviceResponse");
    private final static QName _ProcessBinaryRequestInput_QNAME = new QName("urn:com.flexnet.lfs.webservice", "processBinaryRequestInput");
    private final static QName _ProcessBinaryRequestOutput_QNAME = new QName("urn:com.flexnet.lfs.webservice", "processBinaryRequestOutput");
    private final static QName _CapabilityResponseOutput_QNAME = new QName("urn:com.flexnet.lfs.webservice", "capabilityResponseOutput");
    private final static QName _GetCapabilityResponseInput_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getCapabilityResponseInput");
    private final static QName _GenerateCapabilityResponseInput_QNAME = new QName("urn:com.flexnet.lfs.webservice", "generateCapabilityResponseInput");
    private final static QName _GetSupportedHostIdTypesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getSupportedHostIdTypesRequest");
    private final static QName _GetSupportedHostIdTypesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getSupportedHostIdTypesResponse");
    private final static QName _SearchHostHistoryRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchHostHistoryRequest");
    private final static QName _SearchHostHistoryResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchHostHistoryResponse");
    private final static QName _SearchRequestHistoryInput_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchRequestHistoryInput");
    private final static QName _SearchRequestHistoryResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchRequestHistoryResponse");
    private final static QName _UpdateHostOwnerRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateHostOwnerRequest");
    private final static QName _UpdateHostOwnerResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateHostOwnerResponse");
    private final static QName _SearchSyncHistoryRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchSyncHistoryRequest");
    private final static QName _SearchSyncHistoryResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchSyncHistoryResponse");
    private final static QName _CreateDeviceSeriesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createDeviceSeriesRequest");
    private final static QName _CreateDeviceSeriesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createDeviceSeriesResponse");
    private final static QName _CreateHostTypeRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createHostTypeRequest");
    private final static QName _CreateHostTypeResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createHostTypeResponse");
    private final static QName _CreateDeviceModelRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createDeviceModelRequest");
    private final static QName _CreateDeviceModelResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createDeviceModelResponse");
    private final static QName _UpdateDeviceModelRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateDeviceModelRequest");
    private final static QName _UpdateDeviceModelResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateDeviceModelResponse");
    private final static QName _UpdateDeviceSeriesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateDeviceSeriesRequest");
    private final static QName _UpdateDeviceSeriesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateDeviceSeriesResponse");
    private final static QName _ListDeviceSeriesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listDeviceSeriesRequest");
    private final static QName _ListDeviceSeriesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listDeviceSeriesResponse");
    private final static QName _GetDeviceSeriesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getDeviceSeriesRequest");
    private final static QName _GetDeviceSeriesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getDeviceSeriesResponse");
    private final static QName _GetDeviceModelRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getDeviceModelRequest");
    private final static QName _GetDeviceModelResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getDeviceModelResponse");
    private final static QName _ListDeviceModelsRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listDeviceModelsRequest");
    private final static QName _ListDeviceModelsResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listDeviceModelsResponse");
    private final static QName _ListHostTypesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listHostTypesRequest");
    private final static QName _ListHostTypesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listHostTypesResponse");
    private final static QName _CreateServerHostTypeRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createServerHostTypeRequest");
    private final static QName _CreateServerHostTypeResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "createServerHostTypeResponse");
    private final static QName _GenerateLicenseFileRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "generateLicenseFileRequest");
    private final static QName _GenerateLicenseFileResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "generateLicenseFileResponse");
    private final static QName _ObsoleteHostRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "obsoleteHostRequest");
    private final static QName _ObsoleteHostResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "obsoleteHostResponse");
    private final static QName _DeleteHostRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "deleteHostRequest");
    private final static QName _DeleteHostResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "deleteHostResponse");
    private final static QName _ListServerHostTypesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listServerHostTypesRequest");
    private final static QName _ListServerHostTypesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "listServerHostTypesResponse");
    private final static QName _GetDeviceLicenseFileRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getDeviceLicenseFileRequest");
    private final static QName _GetDeviceLicenseFileResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getDeviceLicenseFileResponse");
    private final static QName _SearchDeviceModelsRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchDeviceModelsRequest");
    private final static QName _SearchDeviceModelsResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchDeviceModelsResponse");
    private final static QName _GetConfigurationMetadataRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getConfigurationMetadataRequest");
    private final static QName _GetConfigurationMetadataResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getConfigurationMetadataResponse");
    private final static QName _GetConfigurationRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getConfigurationRequest");
    private final static QName _GetConfigurationResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getConfigurationResponse");
    private final static QName _SetConfigurationRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "setConfigurationRequest");
    private final static QName _SetConfigurationResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "setConfigurationResponse");
    private final static QName _EditServerRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "editServerRequest");
    private final static QName _EditServerResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "editServerResponse");
    private final static QName _DetachUserRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "detachUserRequest");
    private final static QName _DetachUserResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "detachUserResponse");
    private final static QName _GetServerHostTypeRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getServerHostTypeRequest");
    private final static QName _GetServerHostTypeResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getServerHostTypeResponse");
    private final static QName _UpdateServerHostTypeRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateServerHostTypeRequest");
    private final static QName _UpdateServerHostTypeResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateServerHostTypeResponse");
    private final static QName _EditServedClientRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "editServedClientRequest");
    private final static QName _EditServedClientResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "editServedClientResponse");
    private final static QName _MoveDeviceRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "moveDeviceRequest");
    private final static QName _MoveDeviceResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "moveDeviceResponse");
    private final static QName _MoveDevicesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "moveDevicesRequest");
    private final static QName _MoveDevicesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "moveDevicesResponse");
    private final static QName _MoveServerRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "moveServerRequest");
    private final static QName _MoveServerResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "moveServerResponse");
    private final static QName _GetUsageSummaryRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getUsageSummaryRequest");
    private final static QName _GetUsageSummaryResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getUsageSummaryResponse");
    private final static QName _IsLicenseGeneratedResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isLicenseGeneratedResponse");
    private final static QName _IsLicenseGeneratedRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isLicenseGeneratedRequest");
    private final static QName _GetPendingFulfillCountRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getPendingFulfillCountRequest");
    private final static QName _GetPendingFulfillCountResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getPendingFulfillCountResponse");
    private final static QName _IsCatalogItemMappedResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isCatalogItemMappedResponse");
    private final static QName _IsCatalogItemMappedRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isCatalogItemMappedRequest");
    private final static QName _IsBaseProductUsedInLimitedSeriesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isBaseProductUsedInLimitedSeriesResponse");
    private final static QName _IsBaseProductUsedInLimitedSeriesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isBaseProductUsedInLimitedSeriesRequest");
    private final static QName _GetFilteredIDTypesForClientResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getFilteredIDTypesForClientResponse");
    private final static QName _GetFilteredIDTypesForClientRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getFilteredIDTypesForClientRequest");
    private final static QName _GetFilteredIDTypesForServerResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getFilteredIDTypesForServerResponse");
    private final static QName _GetFilteredIDTypesForServerRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getFilteredIDTypesForServerRequest");
    private final static QName _GetAllowedIDTypesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getAllowedIDTypesResponse");
    private final static QName _GetAllowedIDTypesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getAllowedIDTypesRequest");
    private final static QName _IsRightsIdMappedResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isRightsIdMappedResponse");
    private final static QName _IsRightsIdMappedRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isRightsIdMappedRequest");
    private final static QName _IsCatalogItemMappedToLimitedSeriesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isCatalogItemMappedToLimitedSeriesResponse");
    private final static QName _IsCatalogItemMappedToLimitedSeriesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isCatalogItemMappedToLimitedSeriesRequest");
    private final static QName _GetDefaultServerForEnterpriseRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getDefaultServerForEnterpriseRequest");
    private final static QName _GetHostsForEntitlementTransferRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getHostsForEntitlementTransferRequest");
    private final static QName _GetHostsForEntitlementTransferResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "getHostsForEntitlementTransferResponse");
    private final static QName _IsOwnerReferencedResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isOwnerReferencedResponse");
    private final static QName _IsOwnerReferencedRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isOwnerReferencedRequest");
    private final static QName _SearchAddOnsResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchAddOnsResponse");
    private final static QName _SearchAddOnsRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "searchAddOnsRequest");
    private final static QName _ReturnAddOnsRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "returnAddOnsRequest");
    private final static QName _ReturnAddOnsResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "returnAddOnsResponse");
    private final static QName _UpdateMatchingHostOwnersRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateMatchingHostOwnersRequest");
    private final static QName _UpdateMatchingHostOwnersResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "updateMatchingHostOwnersResponse");
    private final static QName _GenerateCloneDetectionReportRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "generateCloneDetectionReportRequest");
    private final static QName _GenerateCloneDetectionReportResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "generateCloneDetectionReportResponse");
    private final static QName _UsedByDeviceSeriesRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "usedByDeviceSeriesRequest");
    private final static QName _UsedByDeviceSeriesResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "usedByDeviceSeriesResponse");
    private final static QName _SetHostedServerAdminPasswordRequest_QNAME = new QName("urn:com.flexnet.lfs.webservice", "setHostedServerAdminPasswordRequest");
    private final static QName _SetHostedServerAdminPasswordResponse_QNAME = new QName("urn:com.flexnet.lfs.webservice", "setHostedServerAdminPasswordResponse");
    private final static QName _FeatureDataServerHostId_QNAME = new QName("urn:com.flexnet.lfs.webservice", "serverHostId");
    private final static QName _HostIdentifierLastSyncTime_QNAME = new QName("urn:com.flexnet.lfs.webservice", "lastSyncTime");
    private final static QName _HostIdentifierIsCloud_QNAME = new QName("urn:com.flexnet.lfs.webservice", "isCloud");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.lfs.flexnet.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LFSFaultResponse }
     * 
     */
    public LFSFaultResponse createLFSFaultResponse() {
        return new LFSFaultResponse();
    }

    /**
     * Create an instance of {@link CreateServerRequest }
     * 
     */
    public CreateServerRequest createCreateServerRequest() {
        return new CreateServerRequest();
    }

    /**
     * Create an instance of {@link CreateServerResponse }
     * 
     */
    public CreateServerResponse createCreateServerResponse() {
        return new CreateServerResponse();
    }

    /**
     * Create an instance of {@link CreateHostRequest }
     * 
     */
    public CreateHostRequest createCreateHostRequest() {
        return new CreateHostRequest();
    }

    /**
     * Create an instance of {@link CreateHostResponse }
     * 
     */
    public CreateHostResponse createCreateHostResponse() {
        return new CreateHostResponse();
    }

    /**
     * Create an instance of {@link GetHostRequest }
     * 
     */
    public GetHostRequest createGetHostRequest() {
        return new GetHostRequest();
    }

    /**
     * Create an instance of {@link GetHostResponse }
     * 
     */
    public GetHostResponse createGetHostResponse() {
        return new GetHostResponse();
    }

    /**
     * Create an instance of {@link EditHostRequest }
     * 
     */
    public EditHostRequest createEditHostRequest() {
        return new EditHostRequest();
    }

    /**
     * Create an instance of {@link EditHostResponse }
     * 
     */
    public EditHostResponse createEditHostResponse() {
        return new EditHostResponse();
    }

    /**
     * Create an instance of {@link GetFeaturesRequest }
     * 
     */
    public GetFeaturesRequest createGetFeaturesRequest() {
        return new GetFeaturesRequest();
    }

    /**
     * Create an instance of {@link GetFeaturesResponse }
     * 
     */
    public GetFeaturesResponse createGetFeaturesResponse() {
        return new GetFeaturesResponse();
    }

    /**
     * Create an instance of {@link GetMaxMappableRequest }
     * 
     */
    public GetMaxMappableRequest createGetMaxMappableRequest() {
        return new GetMaxMappableRequest();
    }

    /**
     * Create an instance of {@link GetMaxMappableResponse }
     * 
     */
    public GetMaxMappableResponse createGetMaxMappableResponse() {
        return new GetMaxMappableResponse();
    }

    /**
     * Create an instance of {@link GetMaxMappableWithoutCallbackRequest }
     * 
     */
    public GetMaxMappableWithoutCallbackRequest createGetMaxMappableWithoutCallbackRequest() {
        return new GetMaxMappableWithoutCallbackRequest();
    }

    /**
     * Create an instance of {@link MapAddOnsRequest }
     * 
     */
    public MapAddOnsRequest createMapAddOnsRequest() {
        return new MapAddOnsRequest();
    }

    /**
     * Create an instance of {@link MapAddOnsResponse }
     * 
     */
    public MapAddOnsResponse createMapAddOnsResponse() {
        return new MapAddOnsResponse();
    }

    /**
     * Create an instance of {@link GetServerRequest }
     * 
     */
    public GetServerRequest createGetServerRequest() {
        return new GetServerRequest();
    }

    /**
     * Create an instance of {@link GetServerResponse }
     * 
     */
    public GetServerResponse createGetServerResponse() {
        return new GetServerResponse();
    }

    /**
     * Create an instance of {@link GetHostsRequest }
     * 
     */
    public GetHostsRequest createGetHostsRequest() {
        return new GetHostsRequest();
    }

    /**
     * Create an instance of {@link GetHostsResponse }
     * 
     */
    public GetHostsResponse createGetHostsResponse() {
        return new GetHostsResponse();
    }

    /**
     * Create an instance of {@link GetServedClientRequest }
     * 
     */
    public GetServedClientRequest createGetServedClientRequest() {
        return new GetServedClientRequest();
    }

    /**
     * Create an instance of {@link GetServedClientResponse }
     * 
     */
    public GetServedClientResponse createGetServedClientResponse() {
        return new GetServedClientResponse();
    }

    /**
     * Create an instance of {@link GetAddOnMappingsRequest }
     * 
     */
    public GetAddOnMappingsRequest createGetAddOnMappingsRequest() {
        return new GetAddOnMappingsRequest();
    }

    /**
     * Create an instance of {@link GetAddOnMappingsResponse }
     * 
     */
    public GetAddOnMappingsResponse createGetAddOnMappingsResponse() {
        return new GetAddOnMappingsResponse();
    }

    /**
     * Create an instance of {@link GetAddOnMappingsCountRequest }
     * 
     */
    public GetAddOnMappingsCountRequest createGetAddOnMappingsCountRequest() {
        return new GetAddOnMappingsCountRequest();
    }

    /**
     * Create an instance of {@link GetAddOnMappingsCountResponse }
     * 
     */
    public GetAddOnMappingsCountResponse createGetAddOnMappingsCountResponse() {
        return new GetAddOnMappingsCountResponse();
    }

    /**
     * Create an instance of {@link FindServersForEnterpriseRequest }
     * 
     */
    public FindServersForEnterpriseRequest createFindServersForEnterpriseRequest() {
        return new FindServersForEnterpriseRequest();
    }

    /**
     * Create an instance of {@link FindServersForEnterpriseResponse }
     * 
     */
    public FindServersForEnterpriseResponse createFindServersForEnterpriseResponse() {
        return new FindServersForEnterpriseResponse();
    }

    /**
     * Create an instance of {@link SearchServersRequest }
     * 
     */
    public SearchServersRequest createSearchServersRequest() {
        return new SearchServersRequest();
    }

    /**
     * Create an instance of {@link SearchServersResponse }
     * 
     */
    public SearchServersResponse createSearchServersResponse() {
        return new SearchServersResponse();
    }

    /**
     * Create an instance of {@link SearchServedClientsRequest }
     * 
     */
    public SearchServedClientsRequest createSearchServedClientsRequest() {
        return new SearchServedClientsRequest();
    }

    /**
     * Create an instance of {@link SearchServedClientsResponse }
     * 
     */
    public SearchServedClientsResponse createSearchServedClientsResponse() {
        return new SearchServedClientsResponse();
    }

    /**
     * Create an instance of {@link GetIdentityRequest }
     * 
     */
    public GetIdentityRequest createGetIdentityRequest() {
        return new GetIdentityRequest();
    }

    /**
     * Create an instance of {@link GetIdentityResponse }
     * 
     */
    public GetIdentityResponse createGetIdentityResponse() {
        return new GetIdentityResponse();
    }

    /**
     * Create an instance of {@link CreateIdentityRequest }
     * 
     */
    public CreateIdentityRequest createCreateIdentityRequest() {
        return new CreateIdentityRequest();
    }

    /**
     * Create an instance of {@link CreateIdentityResponse }
     * 
     */
    public CreateIdentityResponse createCreateIdentityResponse() {
        return new CreateIdentityResponse();
    }

    /**
     * Create an instance of {@link UpdateIdentityRequest }
     * 
     */
    public UpdateIdentityRequest createUpdateIdentityRequest() {
        return new UpdateIdentityRequest();
    }

    /**
     * Create an instance of {@link UpdateIdentityResponse }
     * 
     */
    public UpdateIdentityResponse createUpdateIdentityResponse() {
        return new UpdateIdentityResponse();
    }

    /**
     * Create an instance of {@link GetSignersRequest }
     * 
     */
    public GetSignersRequest createGetSignersRequest() {
        return new GetSignersRequest();
    }

    /**
     * Create an instance of {@link GetSignersResponse }
     * 
     */
    public GetSignersResponse createGetSignersResponse() {
        return new GetSignersResponse();
    }

    /**
     * Create an instance of {@link CreateTenantRequest }
     * 
     */
    public CreateTenantRequest createCreateTenantRequest() {
        return new CreateTenantRequest();
    }

    /**
     * Create an instance of {@link CreateTenantResponse }
     * 
     */
    public CreateTenantResponse createCreateTenantResponse() {
        return new CreateTenantResponse();
    }

    /**
     * Create an instance of {@link ListIdentitiesRequest }
     * 
     */
    public ListIdentitiesRequest createListIdentitiesRequest() {
        return new ListIdentitiesRequest();
    }

    /**
     * Create an instance of {@link ListIdentitiesResponse }
     * 
     */
    public ListIdentitiesResponse createListIdentitiesResponse() {
        return new ListIdentitiesResponse();
    }

    /**
     * Create an instance of {@link ListPublishersRequest }
     * 
     */
    public ListPublishersRequest createListPublishersRequest() {
        return new ListPublishersRequest();
    }

    /**
     * Create an instance of {@link ListPublishersResponse }
     * 
     */
    public ListPublishersResponse createListPublishersResponse() {
        return new ListPublishersResponse();
    }

    /**
     * Create an instance of {@link CreatePublisherRequest }
     * 
     */
    public CreatePublisherRequest createCreatePublisherRequest() {
        return new CreatePublisherRequest();
    }

    /**
     * Create an instance of {@link CreatePublisherResponse }
     * 
     */
    public CreatePublisherResponse createCreatePublisherResponse() {
        return new CreatePublisherResponse();
    }

    /**
     * Create an instance of {@link CreateDeviceRequest }
     * 
     */
    public CreateDeviceRequest createCreateDeviceRequest() {
        return new CreateDeviceRequest();
    }

    /**
     * Create an instance of {@link CreateDeviceResponse }
     * 
     */
    public CreateDeviceResponse createCreateDeviceResponse() {
        return new CreateDeviceResponse();
    }

    /**
     * Create an instance of {@link SearchDeviceRequest }
     * 
     */
    public SearchDeviceRequest createSearchDeviceRequest() {
        return new SearchDeviceRequest();
    }

    /**
     * Create an instance of {@link SearchDeviceResponse }
     * 
     */
    public SearchDeviceResponse createSearchDeviceResponse() {
        return new SearchDeviceResponse();
    }

    /**
     * Create an instance of {@link EditDeviceRequest }
     * 
     */
    public EditDeviceRequest createEditDeviceRequest() {
        return new EditDeviceRequest();
    }

    /**
     * Create an instance of {@link EditDeviceResponse }
     * 
     */
    public EditDeviceResponse createEditDeviceResponse() {
        return new EditDeviceResponse();
    }

    /**
     * Create an instance of {@link ReturnDeviceRequest }
     * 
     */
    public ReturnDeviceRequest createReturnDeviceRequest() {
        return new ReturnDeviceRequest();
    }

    /**
     * Create an instance of {@link ReturnDeviceResponse }
     * 
     */
    public ReturnDeviceResponse createReturnDeviceResponse() {
        return new ReturnDeviceResponse();
    }

    /**
     * Create an instance of {@link ReturnHostRequest }
     * 
     */
    public ReturnHostRequest createReturnHostRequest() {
        return new ReturnHostRequest();
    }

    /**
     * Create an instance of {@link ReturnHostResponse }
     * 
     */
    public ReturnHostResponse createReturnHostResponse() {
        return new ReturnHostResponse();
    }

    /**
     * Create an instance of {@link ClaimDeviceRequest }
     * 
     */
    public ClaimDeviceRequest createClaimDeviceRequest() {
        return new ClaimDeviceRequest();
    }

    /**
     * Create an instance of {@link ClaimDeviceResponse }
     * 
     */
    public ClaimDeviceResponse createClaimDeviceResponse() {
        return new ClaimDeviceResponse();
    }

    /**
     * Create an instance of {@link RemoveAddOnsRequest }
     * 
     */
    public RemoveAddOnsRequest createRemoveAddOnsRequest() {
        return new RemoveAddOnsRequest();
    }

    /**
     * Create an instance of {@link RemoveAddOnsResponse }
     * 
     */
    public RemoveAddOnsResponse createRemoveAddOnsResponse() {
        return new RemoveAddOnsResponse();
    }

    /**
     * Create an instance of {@link AddAddOnsRequest }
     * 
     */
    public AddAddOnsRequest createAddAddOnsRequest() {
        return new AddAddOnsRequest();
    }

    /**
     * Create an instance of {@link AddAddOnsResponse }
     * 
     */
    public AddAddOnsResponse createAddAddOnsResponse() {
        return new AddAddOnsResponse();
    }

    /**
     * Create an instance of {@link GetDeviceRequest }
     * 
     */
    public GetDeviceRequest createGetDeviceRequest() {
        return new GetDeviceRequest();
    }

    /**
     * Create an instance of {@link GetDeviceResponse }
     * 
     */
    public GetDeviceResponse createGetDeviceResponse() {
        return new GetDeviceResponse();
    }

    /**
     * Create an instance of {@link ProcessBinaryRequestInput }
     * 
     */
    public ProcessBinaryRequestInput createProcessBinaryRequestInput() {
        return new ProcessBinaryRequestInput();
    }

    /**
     * Create an instance of {@link ProcessBinaryRequestOutput }
     * 
     */
    public ProcessBinaryRequestOutput createProcessBinaryRequestOutput() {
        return new ProcessBinaryRequestOutput();
    }

    /**
     * Create an instance of {@link CapabilityResponseOutput }
     * 
     */
    public CapabilityResponseOutput createCapabilityResponseOutput() {
        return new CapabilityResponseOutput();
    }

    /**
     * Create an instance of {@link CapabilityResponseInput }
     * 
     */
    public CapabilityResponseInput createCapabilityResponseInput() {
        return new CapabilityResponseInput();
    }

    /**
     * Create an instance of {@link GenerateCapabilityResponseInput }
     * 
     */
    public GenerateCapabilityResponseInput createGenerateCapabilityResponseInput() {
        return new GenerateCapabilityResponseInput();
    }

    /**
     * Create an instance of {@link GetSupportedHostIdTypesRequest }
     * 
     */
    public GetSupportedHostIdTypesRequest createGetSupportedHostIdTypesRequest() {
        return new GetSupportedHostIdTypesRequest();
    }

    /**
     * Create an instance of {@link GetSupportedHostIdTypesResponse }
     * 
     */
    public GetSupportedHostIdTypesResponse createGetSupportedHostIdTypesResponse() {
        return new GetSupportedHostIdTypesResponse();
    }

    /**
     * Create an instance of {@link SearchHostHistoryRequest }
     * 
     */
    public SearchHostHistoryRequest createSearchHostHistoryRequest() {
        return new SearchHostHistoryRequest();
    }

    /**
     * Create an instance of {@link SearchHostHistoryResponse }
     * 
     */
    public SearchHostHistoryResponse createSearchHostHistoryResponse() {
        return new SearchHostHistoryResponse();
    }

    /**
     * Create an instance of {@link SearchRequestHistoryInput }
     * 
     */
    public SearchRequestHistoryInput createSearchRequestHistoryInput() {
        return new SearchRequestHistoryInput();
    }

    /**
     * Create an instance of {@link SearchRequestHistoryResponse }
     * 
     */
    public SearchRequestHistoryResponse createSearchRequestHistoryResponse() {
        return new SearchRequestHistoryResponse();
    }

    /**
     * Create an instance of {@link UpdateHostOwnerRequest }
     * 
     */
    public UpdateHostOwnerRequest createUpdateHostOwnerRequest() {
        return new UpdateHostOwnerRequest();
    }

    /**
     * Create an instance of {@link UpdateHostOwnerResponse }
     * 
     */
    public UpdateHostOwnerResponse createUpdateHostOwnerResponse() {
        return new UpdateHostOwnerResponse();
    }

    /**
     * Create an instance of {@link SearchSyncHistoryRequest }
     * 
     */
    public SearchSyncHistoryRequest createSearchSyncHistoryRequest() {
        return new SearchSyncHistoryRequest();
    }

    /**
     * Create an instance of {@link SearchSyncHistoryResponse }
     * 
     */
    public SearchSyncHistoryResponse createSearchSyncHistoryResponse() {
        return new SearchSyncHistoryResponse();
    }

    /**
     * Create an instance of {@link CreateDeviceSeriesRequest }
     * 
     */
    public CreateDeviceSeriesRequest createCreateDeviceSeriesRequest() {
        return new CreateDeviceSeriesRequest();
    }

    /**
     * Create an instance of {@link CreateDeviceSeriesResponse }
     * 
     */
    public CreateDeviceSeriesResponse createCreateDeviceSeriesResponse() {
        return new CreateDeviceSeriesResponse();
    }

    /**
     * Create an instance of {@link CreateHostTypeRequest }
     * 
     */
    public CreateHostTypeRequest createCreateHostTypeRequest() {
        return new CreateHostTypeRequest();
    }

    /**
     * Create an instance of {@link CreateHostTypeResponse }
     * 
     */
    public CreateHostTypeResponse createCreateHostTypeResponse() {
        return new CreateHostTypeResponse();
    }

    /**
     * Create an instance of {@link CreateDeviceModelRequest }
     * 
     */
    public CreateDeviceModelRequest createCreateDeviceModelRequest() {
        return new CreateDeviceModelRequest();
    }

    /**
     * Create an instance of {@link CreateDeviceModelResponse }
     * 
     */
    public CreateDeviceModelResponse createCreateDeviceModelResponse() {
        return new CreateDeviceModelResponse();
    }

    /**
     * Create an instance of {@link UpdateDeviceModelRequest }
     * 
     */
    public UpdateDeviceModelRequest createUpdateDeviceModelRequest() {
        return new UpdateDeviceModelRequest();
    }

    /**
     * Create an instance of {@link UpdateDeviceModelResponse }
     * 
     */
    public UpdateDeviceModelResponse createUpdateDeviceModelResponse() {
        return new UpdateDeviceModelResponse();
    }

    /**
     * Create an instance of {@link UpdateDeviceSeriesRequest }
     * 
     */
    public UpdateDeviceSeriesRequest createUpdateDeviceSeriesRequest() {
        return new UpdateDeviceSeriesRequest();
    }

    /**
     * Create an instance of {@link UpdateDeviceSeriesResponse }
     * 
     */
    public UpdateDeviceSeriesResponse createUpdateDeviceSeriesResponse() {
        return new UpdateDeviceSeriesResponse();
    }

    /**
     * Create an instance of {@link ListDeviceSeriesRequest }
     * 
     */
    public ListDeviceSeriesRequest createListDeviceSeriesRequest() {
        return new ListDeviceSeriesRequest();
    }

    /**
     * Create an instance of {@link ListDeviceSeriesResponse }
     * 
     */
    public ListDeviceSeriesResponse createListDeviceSeriesResponse() {
        return new ListDeviceSeriesResponse();
    }

    /**
     * Create an instance of {@link GetDeviceSeriesRequest }
     * 
     */
    public GetDeviceSeriesRequest createGetDeviceSeriesRequest() {
        return new GetDeviceSeriesRequest();
    }

    /**
     * Create an instance of {@link GetDeviceSeriesResponse }
     * 
     */
    public GetDeviceSeriesResponse createGetDeviceSeriesResponse() {
        return new GetDeviceSeriesResponse();
    }

    /**
     * Create an instance of {@link GetDeviceModelRequest }
     * 
     */
    public GetDeviceModelRequest createGetDeviceModelRequest() {
        return new GetDeviceModelRequest();
    }

    /**
     * Create an instance of {@link GetDeviceModelResponse }
     * 
     */
    public GetDeviceModelResponse createGetDeviceModelResponse() {
        return new GetDeviceModelResponse();
    }

    /**
     * Create an instance of {@link ListDeviceModelsRequest }
     * 
     */
    public ListDeviceModelsRequest createListDeviceModelsRequest() {
        return new ListDeviceModelsRequest();
    }

    /**
     * Create an instance of {@link ListDeviceModelsResponse }
     * 
     */
    public ListDeviceModelsResponse createListDeviceModelsResponse() {
        return new ListDeviceModelsResponse();
    }

    /**
     * Create an instance of {@link ListHostTypesRequest }
     * 
     */
    public ListHostTypesRequest createListHostTypesRequest() {
        return new ListHostTypesRequest();
    }

    /**
     * Create an instance of {@link ListHostTypesResponse }
     * 
     */
    public ListHostTypesResponse createListHostTypesResponse() {
        return new ListHostTypesResponse();
    }

    /**
     * Create an instance of {@link CreateServerHostTypeRequest }
     * 
     */
    public CreateServerHostTypeRequest createCreateServerHostTypeRequest() {
        return new CreateServerHostTypeRequest();
    }

    /**
     * Create an instance of {@link CreateServerHostTypeResponse }
     * 
     */
    public CreateServerHostTypeResponse createCreateServerHostTypeResponse() {
        return new CreateServerHostTypeResponse();
    }

    /**
     * Create an instance of {@link GenerateLicenseFileRequest }
     * 
     */
    public GenerateLicenseFileRequest createGenerateLicenseFileRequest() {
        return new GenerateLicenseFileRequest();
    }

    /**
     * Create an instance of {@link GenerateLicenseFileResponse }
     * 
     */
    public GenerateLicenseFileResponse createGenerateLicenseFileResponse() {
        return new GenerateLicenseFileResponse();
    }

    /**
     * Create an instance of {@link ObsoleteHostRequest }
     * 
     */
    public ObsoleteHostRequest createObsoleteHostRequest() {
        return new ObsoleteHostRequest();
    }

    /**
     * Create an instance of {@link ObsoleteHostResponse }
     * 
     */
    public ObsoleteHostResponse createObsoleteHostResponse() {
        return new ObsoleteHostResponse();
    }

    /**
     * Create an instance of {@link DeleteHostRequest }
     * 
     */
    public DeleteHostRequest createDeleteHostRequest() {
        return new DeleteHostRequest();
    }

    /**
     * Create an instance of {@link DeleteHostResponse }
     * 
     */
    public DeleteHostResponse createDeleteHostResponse() {
        return new DeleteHostResponse();
    }

    /**
     * Create an instance of {@link ListServerHostTypesRequest }
     * 
     */
    public ListServerHostTypesRequest createListServerHostTypesRequest() {
        return new ListServerHostTypesRequest();
    }

    /**
     * Create an instance of {@link ListServerHostTypesResponse }
     * 
     */
    public ListServerHostTypesResponse createListServerHostTypesResponse() {
        return new ListServerHostTypesResponse();
    }

    /**
     * Create an instance of {@link GetDeviceLicenseFileRequest }
     * 
     */
    public GetDeviceLicenseFileRequest createGetDeviceLicenseFileRequest() {
        return new GetDeviceLicenseFileRequest();
    }

    /**
     * Create an instance of {@link GetDeviceLicenseFileResponse }
     * 
     */
    public GetDeviceLicenseFileResponse createGetDeviceLicenseFileResponse() {
        return new GetDeviceLicenseFileResponse();
    }

    /**
     * Create an instance of {@link SearchDeviceModelsRequest }
     * 
     */
    public SearchDeviceModelsRequest createSearchDeviceModelsRequest() {
        return new SearchDeviceModelsRequest();
    }

    /**
     * Create an instance of {@link SearchDeviceModelsResponse }
     * 
     */
    public SearchDeviceModelsResponse createSearchDeviceModelsResponse() {
        return new SearchDeviceModelsResponse();
    }

    /**
     * Create an instance of {@link GetConfigurationMetadataRequest }
     * 
     */
    public GetConfigurationMetadataRequest createGetConfigurationMetadataRequest() {
        return new GetConfigurationMetadataRequest();
    }

    /**
     * Create an instance of {@link GetConfigurationMetadataResponse }
     * 
     */
    public GetConfigurationMetadataResponse createGetConfigurationMetadataResponse() {
        return new GetConfigurationMetadataResponse();
    }

    /**
     * Create an instance of {@link GetConfigurationRequest }
     * 
     */
    public GetConfigurationRequest createGetConfigurationRequest() {
        return new GetConfigurationRequest();
    }

    /**
     * Create an instance of {@link GetConfigurationResponse }
     * 
     */
    public GetConfigurationResponse createGetConfigurationResponse() {
        return new GetConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetConfigurationRequest }
     * 
     */
    public SetConfigurationRequest createSetConfigurationRequest() {
        return new SetConfigurationRequest();
    }

    /**
     * Create an instance of {@link SetConfigurationResponse }
     * 
     */
    public SetConfigurationResponse createSetConfigurationResponse() {
        return new SetConfigurationResponse();
    }

    /**
     * Create an instance of {@link EditServerRequest }
     * 
     */
    public EditServerRequest createEditServerRequest() {
        return new EditServerRequest();
    }

    /**
     * Create an instance of {@link EditServerResponse }
     * 
     */
    public EditServerResponse createEditServerResponse() {
        return new EditServerResponse();
    }

    /**
     * Create an instance of {@link DetachUserRequest }
     * 
     */
    public DetachUserRequest createDetachUserRequest() {
        return new DetachUserRequest();
    }

    /**
     * Create an instance of {@link DetachUserResponse }
     * 
     */
    public DetachUserResponse createDetachUserResponse() {
        return new DetachUserResponse();
    }

    /**
     * Create an instance of {@link GetServerHostTypeRequest }
     * 
     */
    public GetServerHostTypeRequest createGetServerHostTypeRequest() {
        return new GetServerHostTypeRequest();
    }

    /**
     * Create an instance of {@link GetServerHostTypeResponse }
     * 
     */
    public GetServerHostTypeResponse createGetServerHostTypeResponse() {
        return new GetServerHostTypeResponse();
    }

    /**
     * Create an instance of {@link UpdateServerHostTypeRequest }
     * 
     */
    public UpdateServerHostTypeRequest createUpdateServerHostTypeRequest() {
        return new UpdateServerHostTypeRequest();
    }

    /**
     * Create an instance of {@link UpdateServerHostTypeResponse }
     * 
     */
    public UpdateServerHostTypeResponse createUpdateServerHostTypeResponse() {
        return new UpdateServerHostTypeResponse();
    }

    /**
     * Create an instance of {@link EditServedClientRequest }
     * 
     */
    public EditServedClientRequest createEditServedClientRequest() {
        return new EditServedClientRequest();
    }

    /**
     * Create an instance of {@link EditServedClientResponse }
     * 
     */
    public EditServedClientResponse createEditServedClientResponse() {
        return new EditServedClientResponse();
    }

    /**
     * Create an instance of {@link MoveDeviceRequest }
     * 
     */
    public MoveDeviceRequest createMoveDeviceRequest() {
        return new MoveDeviceRequest();
    }

    /**
     * Create an instance of {@link MoveDeviceResponse }
     * 
     */
    public MoveDeviceResponse createMoveDeviceResponse() {
        return new MoveDeviceResponse();
    }

    /**
     * Create an instance of {@link MoveDevicesRequest }
     * 
     */
    public MoveDevicesRequest createMoveDevicesRequest() {
        return new MoveDevicesRequest();
    }

    /**
     * Create an instance of {@link MoveDevicesResponse }
     * 
     */
    public MoveDevicesResponse createMoveDevicesResponse() {
        return new MoveDevicesResponse();
    }

    /**
     * Create an instance of {@link MoveServerRequest }
     * 
     */
    public MoveServerRequest createMoveServerRequest() {
        return new MoveServerRequest();
    }

    /**
     * Create an instance of {@link MoveServerResponse }
     * 
     */
    public MoveServerResponse createMoveServerResponse() {
        return new MoveServerResponse();
    }

    /**
     * Create an instance of {@link GetUsageSummaryRequest }
     * 
     */
    public GetUsageSummaryRequest createGetUsageSummaryRequest() {
        return new GetUsageSummaryRequest();
    }

    /**
     * Create an instance of {@link GetUsageSummaryResponse }
     * 
     */
    public GetUsageSummaryResponse createGetUsageSummaryResponse() {
        return new GetUsageSummaryResponse();
    }

    /**
     * Create an instance of {@link IsLicenseGeneratedResponse }
     * 
     */
    public IsLicenseGeneratedResponse createIsLicenseGeneratedResponse() {
        return new IsLicenseGeneratedResponse();
    }

    /**
     * Create an instance of {@link IsLicenseGeneratedRequest }
     * 
     */
    public IsLicenseGeneratedRequest createIsLicenseGeneratedRequest() {
        return new IsLicenseGeneratedRequest();
    }

    /**
     * Create an instance of {@link GetPendingFulfillCountRequest }
     * 
     */
    public GetPendingFulfillCountRequest createGetPendingFulfillCountRequest() {
        return new GetPendingFulfillCountRequest();
    }

    /**
     * Create an instance of {@link GetPendingFulfillCountResponse }
     * 
     */
    public GetPendingFulfillCountResponse createGetPendingFulfillCountResponse() {
        return new GetPendingFulfillCountResponse();
    }

    /**
     * Create an instance of {@link IsCatalogItemMappedResponse }
     * 
     */
    public IsCatalogItemMappedResponse createIsCatalogItemMappedResponse() {
        return new IsCatalogItemMappedResponse();
    }

    /**
     * Create an instance of {@link IsCatalogItemMappedRequest }
     * 
     */
    public IsCatalogItemMappedRequest createIsCatalogItemMappedRequest() {
        return new IsCatalogItemMappedRequest();
    }

    /**
     * Create an instance of {@link IsBaseProductUsedInLimitedSeriesResponse }
     * 
     */
    public IsBaseProductUsedInLimitedSeriesResponse createIsBaseProductUsedInLimitedSeriesResponse() {
        return new IsBaseProductUsedInLimitedSeriesResponse();
    }

    /**
     * Create an instance of {@link IsBaseProductUsedInLimitedSeriesRequest }
     * 
     */
    public IsBaseProductUsedInLimitedSeriesRequest createIsBaseProductUsedInLimitedSeriesRequest() {
        return new IsBaseProductUsedInLimitedSeriesRequest();
    }

    /**
     * Create an instance of {@link GetFilteredIDTypesForClientResponse }
     * 
     */
    public GetFilteredIDTypesForClientResponse createGetFilteredIDTypesForClientResponse() {
        return new GetFilteredIDTypesForClientResponse();
    }

    /**
     * Create an instance of {@link GetFilteredIDTypesForClientRequest }
     * 
     */
    public GetFilteredIDTypesForClientRequest createGetFilteredIDTypesForClientRequest() {
        return new GetFilteredIDTypesForClientRequest();
    }

    /**
     * Create an instance of {@link GetFilteredIDTypesForServerResponse }
     * 
     */
    public GetFilteredIDTypesForServerResponse createGetFilteredIDTypesForServerResponse() {
        return new GetFilteredIDTypesForServerResponse();
    }

    /**
     * Create an instance of {@link GetFilteredIDTypesForServerRequest }
     * 
     */
    public GetFilteredIDTypesForServerRequest createGetFilteredIDTypesForServerRequest() {
        return new GetFilteredIDTypesForServerRequest();
    }

    /**
     * Create an instance of {@link GetAllowedIDTypesResponse }
     * 
     */
    public GetAllowedIDTypesResponse createGetAllowedIDTypesResponse() {
        return new GetAllowedIDTypesResponse();
    }

    /**
     * Create an instance of {@link GetAllowedIDTypesRequest }
     * 
     */
    public GetAllowedIDTypesRequest createGetAllowedIDTypesRequest() {
        return new GetAllowedIDTypesRequest();
    }

    /**
     * Create an instance of {@link IsRightsIdMappedResponse }
     * 
     */
    public IsRightsIdMappedResponse createIsRightsIdMappedResponse() {
        return new IsRightsIdMappedResponse();
    }

    /**
     * Create an instance of {@link IsRightsIdMappedRequest }
     * 
     */
    public IsRightsIdMappedRequest createIsRightsIdMappedRequest() {
        return new IsRightsIdMappedRequest();
    }

    /**
     * Create an instance of {@link IsCatalogItemMappedToLimitedSeriesResponse }
     * 
     */
    public IsCatalogItemMappedToLimitedSeriesResponse createIsCatalogItemMappedToLimitedSeriesResponse() {
        return new IsCatalogItemMappedToLimitedSeriesResponse();
    }

    /**
     * Create an instance of {@link IsCatalogItemMappedToLimitedSeriesRequest }
     * 
     */
    public IsCatalogItemMappedToLimitedSeriesRequest createIsCatalogItemMappedToLimitedSeriesRequest() {
        return new IsCatalogItemMappedToLimitedSeriesRequest();
    }

    /**
     * Create an instance of {@link GetDefaultServerForEnterpriseRequest }
     * 
     */
    public GetDefaultServerForEnterpriseRequest createGetDefaultServerForEnterpriseRequest() {
        return new GetDefaultServerForEnterpriseRequest();
    }

    /**
     * Create an instance of {@link GetHostsForEntitlementTransferRequest }
     * 
     */
    public GetHostsForEntitlementTransferRequest createGetHostsForEntitlementTransferRequest() {
        return new GetHostsForEntitlementTransferRequest();
    }

    /**
     * Create an instance of {@link GetHostsForEntitlementTransferResponse }
     * 
     */
    public GetHostsForEntitlementTransferResponse createGetHostsForEntitlementTransferResponse() {
        return new GetHostsForEntitlementTransferResponse();
    }

    /**
     * Create an instance of {@link IsOwnerReferencedResponse }
     * 
     */
    public IsOwnerReferencedResponse createIsOwnerReferencedResponse() {
        return new IsOwnerReferencedResponse();
    }

    /**
     * Create an instance of {@link IsOwnerReferencedRequest }
     * 
     */
    public IsOwnerReferencedRequest createIsOwnerReferencedRequest() {
        return new IsOwnerReferencedRequest();
    }

    /**
     * Create an instance of {@link SearchAddOnsResponse }
     * 
     */
    public SearchAddOnsResponse createSearchAddOnsResponse() {
        return new SearchAddOnsResponse();
    }

    /**
     * Create an instance of {@link SearchAddOnsRequest }
     * 
     */
    public SearchAddOnsRequest createSearchAddOnsRequest() {
        return new SearchAddOnsRequest();
    }

    /**
     * Create an instance of {@link ReturnAddOnsRequest }
     * 
     */
    public ReturnAddOnsRequest createReturnAddOnsRequest() {
        return new ReturnAddOnsRequest();
    }

    /**
     * Create an instance of {@link ReturnAddOnsResponse }
     * 
     */
    public ReturnAddOnsResponse createReturnAddOnsResponse() {
        return new ReturnAddOnsResponse();
    }

    /**
     * Create an instance of {@link UpdateMatchingHostOwnersRequest }
     * 
     */
    public UpdateMatchingHostOwnersRequest createUpdateMatchingHostOwnersRequest() {
        return new UpdateMatchingHostOwnersRequest();
    }

    /**
     * Create an instance of {@link UpdateMatchingHostOwnersResponse }
     * 
     */
    public UpdateMatchingHostOwnersResponse createUpdateMatchingHostOwnersResponse() {
        return new UpdateMatchingHostOwnersResponse();
    }

    /**
     * Create an instance of {@link GenerateCloneDetectionReportRequest }
     * 
     */
    public GenerateCloneDetectionReportRequest createGenerateCloneDetectionReportRequest() {
        return new GenerateCloneDetectionReportRequest();
    }

    /**
     * Create an instance of {@link GenerateCloneDetectionReportResponse }
     * 
     */
    public GenerateCloneDetectionReportResponse createGenerateCloneDetectionReportResponse() {
        return new GenerateCloneDetectionReportResponse();
    }

    /**
     * Create an instance of {@link UsedByDeviceSeriesRequest }
     * 
     */
    public UsedByDeviceSeriesRequest createUsedByDeviceSeriesRequest() {
        return new UsedByDeviceSeriesRequest();
    }

    /**
     * Create an instance of {@link UsedByDeviceSeriesResponse }
     * 
     */
    public UsedByDeviceSeriesResponse createUsedByDeviceSeriesResponse() {
        return new UsedByDeviceSeriesResponse();
    }

    /**
     * Create an instance of {@link SetHostedServerAdminPasswordRequest }
     * 
     */
    public SetHostedServerAdminPasswordRequest createSetHostedServerAdminPasswordRequest() {
        return new SetHostedServerAdminPasswordRequest();
    }

    /**
     * Create an instance of {@link SetHostedServerAdminPasswordResponse }
     * 
     */
    public SetHostedServerAdminPasswordResponse createSetHostedServerAdminPasswordResponse() {
        return new SetHostedServerAdminPasswordResponse();
    }

    /**
     * Create an instance of {@link BaseRequest }
     * 
     */
    public BaseRequest createBaseRequest() {
        return new BaseRequest();
    }

    /**
     * Create an instance of {@link BaseRecordInResponse }
     * 
     */
    public BaseRecordInResponse createBaseRecordInResponse() {
        return new BaseRecordInResponse();
    }

    /**
     * Create an instance of {@link BaseResponse }
     * 
     */
    public BaseResponse createBaseResponse() {
        return new BaseResponse();
    }

    /**
     * Create an instance of {@link SearchSummary }
     * 
     */
    public SearchSummary createSearchSummary() {
        return new SearchSummary();
    }

    /**
     * Create an instance of {@link PaginationInput }
     * 
     */
    public PaginationInput createPaginationInput() {
        return new PaginationInput();
    }

    /**
     * Create an instance of {@link ErrorParameters }
     * 
     */
    public ErrorParameters createErrorParameters() {
        return new ErrorParameters();
    }

    /**
     * Create an instance of {@link EnterpriseIdList }
     * 
     */
    public EnterpriseIdList createEnterpriseIdList() {
        return new EnterpriseIdList();
    }

    /**
     * Create an instance of {@link FeatureNameList }
     * 
     */
    public FeatureNameList createFeatureNameList() {
        return new FeatureNameList();
    }

    /**
     * Create an instance of {@link FeatureInUseStatus }
     * 
     */
    public FeatureInUseStatus createFeatureInUseStatus() {
        return new FeatureInUseStatus();
    }

    /**
     * Create an instance of {@link RightsIdList }
     * 
     */
    public RightsIdList createRightsIdList() {
        return new RightsIdList();
    }

    /**
     * Create an instance of {@link FeatureIds }
     * 
     */
    public FeatureIds createFeatureIds() {
        return new FeatureIds();
    }

    /**
     * Create an instance of {@link CloneSuspect }
     * 
     */
    public CloneSuspect createCloneSuspect() {
        return new CloneSuspect();
    }

    /**
     * Create an instance of {@link HostIdAndType }
     * 
     */
    public HostIdAndType createHostIdAndType() {
        return new HostIdAndType();
    }

    /**
     * Create an instance of {@link HostIdentifier }
     * 
     */
    public HostIdentifier createHostIdentifier() {
        return new HostIdentifier();
    }

    /**
     * Create an instance of {@link SupportedHostIdTypes }
     * 
     */
    public SupportedHostIdTypes createSupportedHostIdTypes() {
        return new SupportedHostIdTypes();
    }

    /**
     * Create an instance of {@link DeviceResponseConfig }
     * 
     */
    public DeviceResponseConfig createDeviceResponseConfig() {
        return new DeviceResponseConfig();
    }

    /**
     * Create an instance of {@link AddOnList }
     * 
     */
    public AddOnList createAddOnList() {
        return new AddOnList();
    }

    /**
     * Create an instance of {@link AddOnData }
     * 
     */
    public AddOnData createAddOnData() {
        return new AddOnData();
    }

    /**
     * Create an instance of {@link AddOnSearchData }
     * 
     */
    public AddOnSearchData createAddOnSearchData() {
        return new AddOnSearchData();
    }

    /**
     * Create an instance of {@link AddOnSearchResults }
     * 
     */
    public AddOnSearchResults createAddOnSearchResults() {
        return new AddOnSearchResults();
    }

    /**
     * Create an instance of {@link EnterpriseData }
     * 
     */
    public EnterpriseData createEnterpriseData() {
        return new EnterpriseData();
    }

    /**
     * Create an instance of {@link AddOnInputList }
     * 
     */
    public AddOnInputList createAddOnInputList() {
        return new AddOnInputList();
    }

    /**
     * Create an instance of {@link AddOnInput }
     * 
     */
    public AddOnInput createAddOnInput() {
        return new AddOnInput();
    }

    /**
     * Create an instance of {@link SortBy }
     * 
     */
    public SortBy createSortBy() {
        return new SortBy();
    }

    /**
     * Create an instance of {@link HostDetail }
     * 
     */
    public HostDetail createHostDetail() {
        return new HostDetail();
    }

    /**
     * Create an instance of {@link HostData }
     * 
     */
    public HostData createHostData() {
        return new HostData();
    }

    /**
     * Create an instance of {@link HostDataExtension }
     * 
     */
    public HostDataExtension createHostDataExtension() {
        return new HostDataExtension();
    }

    /**
     * Create an instance of {@link Identity }
     * 
     */
    public Identity createIdentity() {
        return new Identity();
    }

    /**
     * Create an instance of {@link PublisherIdentity }
     * 
     */
    public PublisherIdentity createPublisherIdentity() {
        return new PublisherIdentity();
    }

    /**
     * Create an instance of {@link PublisherIdentityList }
     * 
     */
    public PublisherIdentityList createPublisherIdentityList() {
        return new PublisherIdentityList();
    }

    /**
     * Create an instance of {@link PublisherList }
     * 
     */
    public PublisherList createPublisherList() {
        return new PublisherList();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Create an instance of {@link ArrayOfHexString }
     * 
     */
    public ArrayOfHexString createArrayOfHexString() {
        return new ArrayOfHexString();
    }

    /**
     * Create an instance of {@link SignerStrengthList }
     * 
     */
    public SignerStrengthList createSignerStrengthList() {
        return new SignerStrengthList();
    }

    /**
     * Create an instance of {@link SignerStrength }
     * 
     */
    public SignerStrength createSignerStrength() {
        return new SignerStrength();
    }

    /**
     * Create an instance of {@link Signer }
     * 
     */
    public Signer createSigner() {
        return new Signer();
    }

    /**
     * Create an instance of {@link AvailableSigners }
     * 
     */
    public AvailableSigners createAvailableSigners() {
        return new AvailableSigners();
    }

    /**
     * Create an instance of {@link IdentityData }
     * 
     */
    public IdentityData createIdentityData() {
        return new IdentityData();
    }

    /**
     * Create an instance of {@link DeviceSearchResults }
     * 
     */
    public DeviceSearchResults createDeviceSearchResults() {
        return new DeviceSearchResults();
    }

    /**
     * Create an instance of {@link HostBase }
     * 
     */
    public HostBase createHostBase() {
        return new HostBase();
    }

    /**
     * Create an instance of {@link Device }
     * 
     */
    public Device createDevice() {
        return new Device();
    }

    /**
     * Create an instance of {@link DeviceLookupParameters }
     * 
     */
    public DeviceLookupParameters createDeviceLookupParameters() {
        return new DeviceLookupParameters();
    }

    /**
     * Create an instance of {@link HostLookupInput }
     * 
     */
    public HostLookupInput createHostLookupInput() {
        return new HostLookupInput();
    }

    /**
     * Create an instance of {@link HostEditInput }
     * 
     */
    public HostEditInput createHostEditInput() {
        return new HostEditInput();
    }

    /**
     * Create an instance of {@link DeviceEditParameters }
     * 
     */
    public DeviceEditParameters createDeviceEditParameters() {
        return new DeviceEditParameters();
    }

    /**
     * Create an instance of {@link ServedClientEditParameters }
     * 
     */
    public ServedClientEditParameters createServedClientEditParameters() {
        return new ServedClientEditParameters();
    }

    /**
     * Create an instance of {@link ServerLookupParameters }
     * 
     */
    public ServerLookupParameters createServerLookupParameters() {
        return new ServerLookupParameters();
    }

    /**
     * Create an instance of {@link UserParameter }
     * 
     */
    public UserParameter createUserParameter() {
        return new UserParameter();
    }

    /**
     * Create an instance of {@link HostEditParameters }
     * 
     */
    public HostEditParameters createHostEditParameters() {
        return new HostEditParameters();
    }

    /**
     * Create an instance of {@link ServerEditParameters }
     * 
     */
    public ServerEditParameters createServerEditParameters() {
        return new ServerEditParameters();
    }

    /**
     * Create an instance of {@link HostSearchParameters }
     * 
     */
    public HostSearchParameters createHostSearchParameters() {
        return new HostSearchParameters();
    }

    /**
     * Create an instance of {@link HostHistoryRecords }
     * 
     */
    public HostHistoryRecords createHostHistoryRecords() {
        return new HostHistoryRecords();
    }

    /**
     * Create an instance of {@link HostHistoryRecord }
     * 
     */
    public HostHistoryRecord createHostHistoryRecord() {
        return new HostHistoryRecord();
    }

    /**
     * Create an instance of {@link RequestHistoryRecord }
     * 
     */
    public RequestHistoryRecord createRequestHistoryRecord() {
        return new RequestHistoryRecord();
    }

    /**
     * Create an instance of {@link RequestHistoryRecords }
     * 
     */
    public RequestHistoryRecords createRequestHistoryRecords() {
        return new RequestHistoryRecords();
    }

    /**
     * Create an instance of {@link SyncHistoryList }
     * 
     */
    public SyncHistoryList createSyncHistoryList() {
        return new SyncHistoryList();
    }

    /**
     * Create an instance of {@link SyncHistoryData }
     * 
     */
    public SyncHistoryData createSyncHistoryData() {
        return new SyncHistoryData();
    }

    /**
     * Create an instance of {@link CorrelationIds }
     * 
     */
    public CorrelationIds createCorrelationIds() {
        return new CorrelationIds();
    }

    /**
     * Create an instance of {@link DeviceSeriesList }
     * 
     */
    public DeviceSeriesList createDeviceSeriesList() {
        return new DeviceSeriesList();
    }

    /**
     * Create an instance of {@link DeviceSeriesData }
     * 
     */
    public DeviceSeriesData createDeviceSeriesData() {
        return new DeviceSeriesData();
    }

    /**
     * Create an instance of {@link DeviceModelList }
     * 
     */
    public DeviceModelList createDeviceModelList() {
        return new DeviceModelList();
    }

    /**
     * Create an instance of {@link DeviceModelData }
     * 
     */
    public DeviceModelData createDeviceModelData() {
        return new DeviceModelData();
    }

    /**
     * Create an instance of {@link HostTypeList }
     * 
     */
    public HostTypeList createHostTypeList() {
        return new HostTypeList();
    }

    /**
     * Create an instance of {@link FeatureLimitList }
     * 
     */
    public FeatureLimitList createFeatureLimitList() {
        return new FeatureLimitList();
    }

    /**
     * Create an instance of {@link FeatureLimitData }
     * 
     */
    public FeatureLimitData createFeatureLimitData() {
        return new FeatureLimitData();
    }

    /**
     * Create an instance of {@link HostTypeBase }
     * 
     */
    public HostTypeBase createHostTypeBase() {
        return new HostTypeBase();
    }

    /**
     * Create an instance of {@link HostTypes }
     * 
     */
    public HostTypes createHostTypes() {
        return new HostTypes();
    }

    /**
     * Create an instance of {@link HostTypeData }
     * 
     */
    public HostTypeData createHostTypeData() {
        return new HostTypeData();
    }

    /**
     * Create an instance of {@link FeatureList }
     * 
     */
    public FeatureList createFeatureList() {
        return new FeatureList();
    }

    /**
     * Create an instance of {@link FeatureData }
     * 
     */
    public FeatureData createFeatureData() {
        return new FeatureData();
    }

    /**
     * Create an instance of {@link ServedClientsSearchParameters }
     * 
     */
    public ServedClientsSearchParameters createServedClientsSearchParameters() {
        return new ServedClientsSearchParameters();
    }

    /**
     * Create an instance of {@link DeviceModelEditParameters }
     * 
     */
    public DeviceModelEditParameters createDeviceModelEditParameters() {
        return new DeviceModelEditParameters();
    }

    /**
     * Create an instance of {@link HostTypeEditParameters }
     * 
     */
    public HostTypeEditParameters createHostTypeEditParameters() {
        return new HostTypeEditParameters();
    }

    /**
     * Create an instance of {@link ServerAttributes }
     * 
     */
    public ServerAttributes createServerAttributes() {
        return new ServerAttributes();
    }

    /**
     * Create an instance of {@link AddOnMappingData }
     * 
     */
    public AddOnMappingData createAddOnMappingData() {
        return new AddOnMappingData();
    }

    /**
     * Create an instance of {@link AddOnMappingResponse }
     * 
     */
    public AddOnMappingResponse createAddOnMappingResponse() {
        return new AddOnMappingResponse();
    }

    /**
     * Create an instance of {@link ServersFound }
     * 
     */
    public ServersFound createServersFound() {
        return new ServersFound();
    }

    /**
     * Create an instance of {@link ServedClientsFound }
     * 
     */
    public ServedClientsFound createServedClientsFound() {
        return new ServedClientsFound();
    }

    /**
     * Create an instance of {@link ServedClientHostData }
     * 
     */
    public ServedClientHostData createServedClientHostData() {
        return new ServedClientHostData();
    }

    /**
     * Create an instance of {@link UsageData }
     * 
     */
    public UsageData createUsageData() {
        return new UsageData();
    }

    /**
     * Create an instance of {@link KeyValuePair }
     * 
     */
    public KeyValuePair createKeyValuePair() {
        return new KeyValuePair();
    }

    /**
     * Create an instance of {@link DictionaryEntries }
     * 
     */
    public DictionaryEntries createDictionaryEntries() {
        return new DictionaryEntries();
    }

    /**
     * Create an instance of {@link OldToNewAddOnMap }
     * 
     */
    public OldToNewAddOnMap createOldToNewAddOnMap() {
        return new OldToNewAddOnMap();
    }

    /**
     * Create an instance of {@link MoveHostRequest }
     * 
     */
    public MoveHostRequest createMoveHostRequest() {
        return new MoveHostRequest();
    }

    /**
     * Create an instance of {@link EnterpriseInfo }
     * 
     */
    public EnterpriseInfo createEnterpriseInfo() {
        return new EnterpriseInfo();
    }

    /**
     * Create an instance of {@link AddOnDetail }
     * 
     */
    public AddOnDetail createAddOnDetail() {
        return new AddOnDetail();
    }

    /**
     * Create an instance of {@link MoveDeviceStatus }
     * 
     */
    public MoveDeviceStatus createMoveDeviceStatus() {
        return new MoveDeviceStatus();
    }

    /**
     * Create an instance of {@link MoveDeviceStatusResults }
     * 
     */
    public MoveDeviceStatusResults createMoveDeviceStatusResults() {
        return new MoveDeviceStatusResults();
    }

    /**
     * Create an instance of {@link HostResponseConfig }
     * 
     */
    public HostResponseConfig createHostResponseConfig() {
        return new HostResponseConfig();
    }

    /**
     * Create an instance of {@link MappableData }
     * 
     */
    public MappableData createMappableData() {
        return new MappableData();
    }

    /**
     * Create an instance of {@link OwnerData }
     * 
     */
    public OwnerData createOwnerData() {
        return new OwnerData();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link FeatureCountType }
     * 
     */
    public FeatureCountType createFeatureCountType() {
        return new FeatureCountType();
    }

    /**
     * Create an instance of {@link PermanentExpiration }
     * 
     */
    public PermanentExpiration createPermanentExpiration() {
        return new PermanentExpiration();
    }

    /**
     * Create an instance of {@link DurationBasedExpiration }
     * 
     */
    public DurationBasedExpiration createDurationBasedExpiration() {
        return new DurationBasedExpiration();
    }

    /**
     * Create an instance of {@link FixedExpiration }
     * 
     */
    public FixedExpiration createFixedExpiration() {
        return new FixedExpiration();
    }

    /**
     * Create an instance of {@link FulfillmentStartDate }
     * 
     */
    public FulfillmentStartDate createFulfillmentStartDate() {
        return new FulfillmentStartDate();
    }

    /**
     * Create an instance of {@link FirstFulfillmentStartDate }
     * 
     */
    public FirstFulfillmentStartDate createFirstFulfillmentStartDate() {
        return new FirstFulfillmentStartDate();
    }

    /**
     * Create an instance of {@link FixedStartDate }
     * 
     */
    public FixedStartDate createFixedStartDate() {
        return new FixedStartDate();
    }

    /**
     * Create an instance of {@link OverdraftType }
     * 
     */
    public OverdraftType createOverdraftType() {
        return new OverdraftType();
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link Features }
     * 
     */
    public Features createFeatures() {
        return new Features();
    }

    /**
     * Create an instance of {@link ParentActivationListType }
     * 
     */
    public ParentActivationListType createParentActivationListType() {
        return new ParentActivationListType();
    }

    /**
     * Create an instance of {@link LineItemDetails }
     * 
     */
    public LineItemDetails createLineItemDetails() {
        return new LineItemDetails();
    }

    /**
     * Create an instance of {@link AddOnSortBy }
     * 
     */
    public AddOnSortBy createAddOnSortBy() {
        return new AddOnSortBy();
    }

    /**
     * Create an instance of {@link StatusInfo }
     * 
     */
    public StatusInfo createStatusInfo() {
        return new StatusInfo();
    }

    /**
     * Create an instance of {@link ConfigSetId }
     * 
     */
    public ConfigSetId createConfigSetId() {
        return new ConfigSetId();
    }

    /**
     * Create an instance of {@link ConfigEnum }
     * 
     */
    public ConfigEnum createConfigEnum() {
        return new ConfigEnum();
    }

    /**
     * Create an instance of {@link ConfigItem }
     * 
     */
    public ConfigItem createConfigItem() {
        return new ConfigItem();
    }

    /**
     * Create an instance of {@link ConfigGroup }
     * 
     */
    public ConfigGroup createConfigGroup() {
        return new ConfigGroup();
    }

    /**
     * Create an instance of {@link ConfigValue }
     * 
     */
    public ConfigValue createConfigValue() {
        return new ConfigValue();
    }

    /**
     * Create an instance of {@link GetConfigItem }
     * 
     */
    public GetConfigItem createGetConfigItem() {
        return new GetConfigItem();
    }

    /**
     * Create an instance of {@link SetConfigItem }
     * 
     */
    public SetConfigItem createSetConfigItem() {
        return new SetConfigItem();
    }

    /**
     * Create an instance of {@link CatalogData }
     * 
     */
    public CatalogData createCatalogData() {
        return new CatalogData();
    }

    /**
     * Create an instance of {@link ActivationIds }
     * 
     */
    public ActivationIds createActivationIds() {
        return new ActivationIds();
    }

    /**
     * Create an instance of {@link PendingCountData }
     * 
     */
    public PendingCountData createPendingCountData() {
        return new PendingCountData();
    }

    /**
     * Create an instance of {@link PendingCounts }
     * 
     */
    public PendingCounts createPendingCounts() {
        return new PendingCounts();
    }

    /**
     * Create an instance of {@link BaseProductIdList }
     * 
     */
    public BaseProductIdList createBaseProductIdList() {
        return new BaseProductIdList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LFSFaultResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LFSFaultResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "LFSFaultResponse")
    public JAXBElement<LFSFaultResponse> createLFSFaultResponse(LFSFaultResponse value) {
        return new JAXBElement<LFSFaultResponse>(_LFSFaultResponse_QNAME, LFSFaultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServerRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateServerRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createServerRequest")
    public JAXBElement<CreateServerRequest> createCreateServerRequest(CreateServerRequest value) {
        return new JAXBElement<CreateServerRequest>(_CreateServerRequest_QNAME, CreateServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createServerResponse")
    public JAXBElement<CreateServerResponse> createCreateServerResponse(CreateServerResponse value) {
        return new JAXBElement<CreateServerResponse>(_CreateServerResponse_QNAME, CreateServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateHostRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateHostRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createHostRequest")
    public JAXBElement<CreateHostRequest> createCreateHostRequest(CreateHostRequest value) {
        return new JAXBElement<CreateHostRequest>(_CreateHostRequest_QNAME, CreateHostRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateHostResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateHostResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createHostResponse")
    public JAXBElement<CreateHostResponse> createCreateHostResponse(CreateHostResponse value) {
        return new JAXBElement<CreateHostResponse>(_CreateHostResponse_QNAME, CreateHostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHostRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHostRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getHostRequest")
    public JAXBElement<GetHostRequest> createGetHostRequest(GetHostRequest value) {
        return new JAXBElement<GetHostRequest>(_GetHostRequest_QNAME, GetHostRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHostResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHostResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getHostResponse")
    public JAXBElement<GetHostResponse> createGetHostResponse(GetHostResponse value) {
        return new JAXBElement<GetHostResponse>(_GetHostResponse_QNAME, GetHostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditHostRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditHostRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "editHostRequest")
    public JAXBElement<EditHostRequest> createEditHostRequest(EditHostRequest value) {
        return new JAXBElement<EditHostRequest>(_EditHostRequest_QNAME, EditHostRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditHostResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditHostResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "editHostResponse")
    public JAXBElement<EditHostResponse> createEditHostResponse(EditHostResponse value) {
        return new JAXBElement<EditHostResponse>(_EditHostResponse_QNAME, EditHostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFeaturesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFeaturesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getFeaturesRequest")
    public JAXBElement<GetFeaturesRequest> createGetFeaturesRequest(GetFeaturesRequest value) {
        return new JAXBElement<GetFeaturesRequest>(_GetFeaturesRequest_QNAME, GetFeaturesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFeaturesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFeaturesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getFeaturesResponse")
    public JAXBElement<GetFeaturesResponse> createGetFeaturesResponse(GetFeaturesResponse value) {
        return new JAXBElement<GetFeaturesResponse>(_GetFeaturesResponse_QNAME, GetFeaturesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxMappableRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMaxMappableRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getMaxMappableRequest")
    public JAXBElement<GetMaxMappableRequest> createGetMaxMappableRequest(GetMaxMappableRequest value) {
        return new JAXBElement<GetMaxMappableRequest>(_GetMaxMappableRequest_QNAME, GetMaxMappableRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxMappableResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMaxMappableResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getMaxMappableResponse")
    public JAXBElement<GetMaxMappableResponse> createGetMaxMappableResponse(GetMaxMappableResponse value) {
        return new JAXBElement<GetMaxMappableResponse>(_GetMaxMappableResponse_QNAME, GetMaxMappableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxMappableWithoutCallbackRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMaxMappableWithoutCallbackRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getMaxMappableWithoutCallbackRequest")
    public JAXBElement<GetMaxMappableWithoutCallbackRequest> createGetMaxMappableWithoutCallbackRequest(GetMaxMappableWithoutCallbackRequest value) {
        return new JAXBElement<GetMaxMappableWithoutCallbackRequest>(_GetMaxMappableWithoutCallbackRequest_QNAME, GetMaxMappableWithoutCallbackRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapAddOnsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MapAddOnsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "mapAddOnsRequest")
    public JAXBElement<MapAddOnsRequest> createMapAddOnsRequest(MapAddOnsRequest value) {
        return new JAXBElement<MapAddOnsRequest>(_MapAddOnsRequest_QNAME, MapAddOnsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapAddOnsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MapAddOnsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "mapAddOnsResponse")
    public JAXBElement<MapAddOnsResponse> createMapAddOnsResponse(MapAddOnsResponse value) {
        return new JAXBElement<MapAddOnsResponse>(_MapAddOnsResponse_QNAME, MapAddOnsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServerRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getServerRequest")
    public JAXBElement<GetServerRequest> createGetServerRequest(GetServerRequest value) {
        return new JAXBElement<GetServerRequest>(_GetServerRequest_QNAME, GetServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getServerResponse")
    public JAXBElement<GetServerResponse> createGetServerResponse(GetServerResponse value) {
        return new JAXBElement<GetServerResponse>(_GetServerResponse_QNAME, GetServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHostsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHostsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getHostsRequest")
    public JAXBElement<GetHostsRequest> createGetHostsRequest(GetHostsRequest value) {
        return new JAXBElement<GetHostsRequest>(_GetHostsRequest_QNAME, GetHostsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHostsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHostsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getHostsResponse")
    public JAXBElement<GetHostsResponse> createGetHostsResponse(GetHostsResponse value) {
        return new JAXBElement<GetHostsResponse>(_GetHostsResponse_QNAME, GetHostsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServedClientRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServedClientRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getServedClientRequest")
    public JAXBElement<GetServedClientRequest> createGetServedClientRequest(GetServedClientRequest value) {
        return new JAXBElement<GetServedClientRequest>(_GetServedClientRequest_QNAME, GetServedClientRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServedClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServedClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getServedClientResponse")
    public JAXBElement<GetServedClientResponse> createGetServedClientResponse(GetServedClientResponse value) {
        return new JAXBElement<GetServedClientResponse>(_GetServedClientResponse_QNAME, GetServedClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddOnMappingsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddOnMappingsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getAddOnMappingsRequest")
    public JAXBElement<GetAddOnMappingsRequest> createGetAddOnMappingsRequest(GetAddOnMappingsRequest value) {
        return new JAXBElement<GetAddOnMappingsRequest>(_GetAddOnMappingsRequest_QNAME, GetAddOnMappingsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddOnMappingsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddOnMappingsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getAddOnMappingsResponse")
    public JAXBElement<GetAddOnMappingsResponse> createGetAddOnMappingsResponse(GetAddOnMappingsResponse value) {
        return new JAXBElement<GetAddOnMappingsResponse>(_GetAddOnMappingsResponse_QNAME, GetAddOnMappingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddOnMappingsCountRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddOnMappingsCountRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getAddOnMappingsCountRequest")
    public JAXBElement<GetAddOnMappingsCountRequest> createGetAddOnMappingsCountRequest(GetAddOnMappingsCountRequest value) {
        return new JAXBElement<GetAddOnMappingsCountRequest>(_GetAddOnMappingsCountRequest_QNAME, GetAddOnMappingsCountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddOnMappingsCountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddOnMappingsCountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getAddOnMappingsCountResponse")
    public JAXBElement<GetAddOnMappingsCountResponse> createGetAddOnMappingsCountResponse(GetAddOnMappingsCountResponse value) {
        return new JAXBElement<GetAddOnMappingsCountResponse>(_GetAddOnMappingsCountResponse_QNAME, GetAddOnMappingsCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindServersForEnterpriseRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindServersForEnterpriseRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "findServersForEnterpriseRequest")
    public JAXBElement<FindServersForEnterpriseRequest> createFindServersForEnterpriseRequest(FindServersForEnterpriseRequest value) {
        return new JAXBElement<FindServersForEnterpriseRequest>(_FindServersForEnterpriseRequest_QNAME, FindServersForEnterpriseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindServersForEnterpriseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindServersForEnterpriseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "findServersForEnterpriseResponse")
    public JAXBElement<FindServersForEnterpriseResponse> createFindServersForEnterpriseResponse(FindServersForEnterpriseResponse value) {
        return new JAXBElement<FindServersForEnterpriseResponse>(_FindServersForEnterpriseResponse_QNAME, FindServersForEnterpriseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchServersRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchServersRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchServersRequest")
    public JAXBElement<SearchServersRequest> createSearchServersRequest(SearchServersRequest value) {
        return new JAXBElement<SearchServersRequest>(_SearchServersRequest_QNAME, SearchServersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchServersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchServersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchServersResponse")
    public JAXBElement<SearchServersResponse> createSearchServersResponse(SearchServersResponse value) {
        return new JAXBElement<SearchServersResponse>(_SearchServersResponse_QNAME, SearchServersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchServedClientsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchServedClientsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchServedClientsRequest")
    public JAXBElement<SearchServedClientsRequest> createSearchServedClientsRequest(SearchServedClientsRequest value) {
        return new JAXBElement<SearchServedClientsRequest>(_SearchServedClientsRequest_QNAME, SearchServedClientsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchServedClientsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchServedClientsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchServedClientsResponse")
    public JAXBElement<SearchServedClientsResponse> createSearchServedClientsResponse(SearchServedClientsResponse value) {
        return new JAXBElement<SearchServedClientsResponse>(_SearchServedClientsResponse_QNAME, SearchServedClientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentityRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdentityRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getIdentityRequest")
    public JAXBElement<GetIdentityRequest> createGetIdentityRequest(GetIdentityRequest value) {
        return new JAXBElement<GetIdentityRequest>(_GetIdentityRequest_QNAME, GetIdentityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdentityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getIdentityResponse")
    public JAXBElement<GetIdentityResponse> createGetIdentityResponse(GetIdentityResponse value) {
        return new JAXBElement<GetIdentityResponse>(_GetIdentityResponse_QNAME, GetIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIdentityRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateIdentityRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createIdentityRequest")
    public JAXBElement<CreateIdentityRequest> createCreateIdentityRequest(CreateIdentityRequest value) {
        return new JAXBElement<CreateIdentityRequest>(_CreateIdentityRequest_QNAME, CreateIdentityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIdentityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateIdentityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createIdentityResponse")
    public JAXBElement<CreateIdentityResponse> createCreateIdentityResponse(CreateIdentityResponse value) {
        return new JAXBElement<CreateIdentityResponse>(_CreateIdentityResponse_QNAME, CreateIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdentityRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateIdentityRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateIdentityRequest")
    public JAXBElement<UpdateIdentityRequest> createUpdateIdentityRequest(UpdateIdentityRequest value) {
        return new JAXBElement<UpdateIdentityRequest>(_UpdateIdentityRequest_QNAME, UpdateIdentityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdentityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateIdentityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateIdentityResponse")
    public JAXBElement<UpdateIdentityResponse> createUpdateIdentityResponse(UpdateIdentityResponse value) {
        return new JAXBElement<UpdateIdentityResponse>(_UpdateIdentityResponse_QNAME, UpdateIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignersRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSignersRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getSignersRequest")
    public JAXBElement<GetSignersRequest> createGetSignersRequest(GetSignersRequest value) {
        return new JAXBElement<GetSignersRequest>(_GetSignersRequest_QNAME, GetSignersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSignersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getSignersResponse")
    public JAXBElement<GetSignersResponse> createGetSignersResponse(GetSignersResponse value) {
        return new JAXBElement<GetSignersResponse>(_GetSignersResponse_QNAME, GetSignersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTenantRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTenantRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createTenantRequest")
    public JAXBElement<CreateTenantRequest> createCreateTenantRequest(CreateTenantRequest value) {
        return new JAXBElement<CreateTenantRequest>(_CreateTenantRequest_QNAME, CreateTenantRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTenantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTenantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createTenantResponse")
    public JAXBElement<CreateTenantResponse> createCreateTenantResponse(CreateTenantResponse value) {
        return new JAXBElement<CreateTenantResponse>(_CreateTenantResponse_QNAME, CreateTenantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListIdentitiesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListIdentitiesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listIdentitiesRequest")
    public JAXBElement<ListIdentitiesRequest> createListIdentitiesRequest(ListIdentitiesRequest value) {
        return new JAXBElement<ListIdentitiesRequest>(_ListIdentitiesRequest_QNAME, ListIdentitiesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListIdentitiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListIdentitiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listIdentitiesResponse")
    public JAXBElement<ListIdentitiesResponse> createListIdentitiesResponse(ListIdentitiesResponse value) {
        return new JAXBElement<ListIdentitiesResponse>(_ListIdentitiesResponse_QNAME, ListIdentitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPublishersRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListPublishersRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listPublishersRequest")
    public JAXBElement<ListPublishersRequest> createListPublishersRequest(ListPublishersRequest value) {
        return new JAXBElement<ListPublishersRequest>(_ListPublishersRequest_QNAME, ListPublishersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPublishersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListPublishersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listPublishersResponse")
    public JAXBElement<ListPublishersResponse> createListPublishersResponse(ListPublishersResponse value) {
        return new JAXBElement<ListPublishersResponse>(_ListPublishersResponse_QNAME, ListPublishersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePublisherRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreatePublisherRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createPublisherRequest")
    public JAXBElement<CreatePublisherRequest> createCreatePublisherRequest(CreatePublisherRequest value) {
        return new JAXBElement<CreatePublisherRequest>(_CreatePublisherRequest_QNAME, CreatePublisherRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePublisherResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreatePublisherResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createPublisherResponse")
    public JAXBElement<CreatePublisherResponse> createCreatePublisherResponse(CreatePublisherResponse value) {
        return new JAXBElement<CreatePublisherResponse>(_CreatePublisherResponse_QNAME, CreatePublisherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDeviceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDeviceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createDeviceRequest")
    public JAXBElement<CreateDeviceRequest> createCreateDeviceRequest(CreateDeviceRequest value) {
        return new JAXBElement<CreateDeviceRequest>(_CreateDeviceRequest_QNAME, CreateDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDeviceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDeviceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createDeviceResponse")
    public JAXBElement<CreateDeviceResponse> createCreateDeviceResponse(CreateDeviceResponse value) {
        return new JAXBElement<CreateDeviceResponse>(_CreateDeviceResponse_QNAME, CreateDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDeviceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchDeviceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchDeviceRequest")
    public JAXBElement<SearchDeviceRequest> createSearchDeviceRequest(SearchDeviceRequest value) {
        return new JAXBElement<SearchDeviceRequest>(_SearchDeviceRequest_QNAME, SearchDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDeviceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchDeviceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchDeviceResponse")
    public JAXBElement<SearchDeviceResponse> createSearchDeviceResponse(SearchDeviceResponse value) {
        return new JAXBElement<SearchDeviceResponse>(_SearchDeviceResponse_QNAME, SearchDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditDeviceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditDeviceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "editDeviceRequest")
    public JAXBElement<EditDeviceRequest> createEditDeviceRequest(EditDeviceRequest value) {
        return new JAXBElement<EditDeviceRequest>(_EditDeviceRequest_QNAME, EditDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditDeviceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditDeviceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "editDeviceResponse")
    public JAXBElement<EditDeviceResponse> createEditDeviceResponse(EditDeviceResponse value) {
        return new JAXBElement<EditDeviceResponse>(_EditDeviceResponse_QNAME, EditDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnDeviceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnDeviceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "returnDeviceRequest")
    public JAXBElement<ReturnDeviceRequest> createReturnDeviceRequest(ReturnDeviceRequest value) {
        return new JAXBElement<ReturnDeviceRequest>(_ReturnDeviceRequest_QNAME, ReturnDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnDeviceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnDeviceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "returnDeviceResponse")
    public JAXBElement<ReturnDeviceResponse> createReturnDeviceResponse(ReturnDeviceResponse value) {
        return new JAXBElement<ReturnDeviceResponse>(_ReturnDeviceResponse_QNAME, ReturnDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnHostRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnHostRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "returnHostRequest")
    public JAXBElement<ReturnHostRequest> createReturnHostRequest(ReturnHostRequest value) {
        return new JAXBElement<ReturnHostRequest>(_ReturnHostRequest_QNAME, ReturnHostRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnHostResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnHostResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "returnHostResponse")
    public JAXBElement<ReturnHostResponse> createReturnHostResponse(ReturnHostResponse value) {
        return new JAXBElement<ReturnHostResponse>(_ReturnHostResponse_QNAME, ReturnHostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimDeviceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimDeviceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "claimDeviceRequest")
    public JAXBElement<ClaimDeviceRequest> createClaimDeviceRequest(ClaimDeviceRequest value) {
        return new JAXBElement<ClaimDeviceRequest>(_ClaimDeviceRequest_QNAME, ClaimDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimDeviceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimDeviceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "claimDeviceResponse")
    public JAXBElement<ClaimDeviceResponse> createClaimDeviceResponse(ClaimDeviceResponse value) {
        return new JAXBElement<ClaimDeviceResponse>(_ClaimDeviceResponse_QNAME, ClaimDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAddOnsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveAddOnsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "removeAddOnsRequest")
    public JAXBElement<RemoveAddOnsRequest> createRemoveAddOnsRequest(RemoveAddOnsRequest value) {
        return new JAXBElement<RemoveAddOnsRequest>(_RemoveAddOnsRequest_QNAME, RemoveAddOnsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAddOnsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveAddOnsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "removeAddOnsResponse")
    public JAXBElement<RemoveAddOnsResponse> createRemoveAddOnsResponse(RemoveAddOnsResponse value) {
        return new JAXBElement<RemoveAddOnsResponse>(_RemoveAddOnsResponse_QNAME, RemoveAddOnsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAddOnsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAddOnsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "addAddOnsRequest")
    public JAXBElement<AddAddOnsRequest> createAddAddOnsRequest(AddAddOnsRequest value) {
        return new JAXBElement<AddAddOnsRequest>(_AddAddOnsRequest_QNAME, AddAddOnsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAddOnsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAddOnsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "addAddOnsResponse")
    public JAXBElement<AddAddOnsResponse> createAddAddOnsResponse(AddAddOnsResponse value) {
        return new JAXBElement<AddAddOnsResponse>(_AddAddOnsResponse_QNAME, AddAddOnsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeviceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getDeviceRequest")
    public JAXBElement<GetDeviceRequest> createGetDeviceRequest(GetDeviceRequest value) {
        return new JAXBElement<GetDeviceRequest>(_GetDeviceRequest_QNAME, GetDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeviceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getDeviceResponse")
    public JAXBElement<GetDeviceResponse> createGetDeviceResponse(GetDeviceResponse value) {
        return new JAXBElement<GetDeviceResponse>(_GetDeviceResponse_QNAME, GetDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessBinaryRequestInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessBinaryRequestInput }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "processBinaryRequestInput")
    public JAXBElement<ProcessBinaryRequestInput> createProcessBinaryRequestInput(ProcessBinaryRequestInput value) {
        return new JAXBElement<ProcessBinaryRequestInput>(_ProcessBinaryRequestInput_QNAME, ProcessBinaryRequestInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessBinaryRequestOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessBinaryRequestOutput }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "processBinaryRequestOutput")
    public JAXBElement<ProcessBinaryRequestOutput> createProcessBinaryRequestOutput(ProcessBinaryRequestOutput value) {
        return new JAXBElement<ProcessBinaryRequestOutput>(_ProcessBinaryRequestOutput_QNAME, ProcessBinaryRequestOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityResponseOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CapabilityResponseOutput }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "capabilityResponseOutput")
    public JAXBElement<CapabilityResponseOutput> createCapabilityResponseOutput(CapabilityResponseOutput value) {
        return new JAXBElement<CapabilityResponseOutput>(_CapabilityResponseOutput_QNAME, CapabilityResponseOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityResponseInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CapabilityResponseInput }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getCapabilityResponseInput")
    public JAXBElement<CapabilityResponseInput> createGetCapabilityResponseInput(CapabilityResponseInput value) {
        return new JAXBElement<CapabilityResponseInput>(_GetCapabilityResponseInput_QNAME, CapabilityResponseInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateCapabilityResponseInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateCapabilityResponseInput }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "generateCapabilityResponseInput")
    public JAXBElement<GenerateCapabilityResponseInput> createGenerateCapabilityResponseInput(GenerateCapabilityResponseInput value) {
        return new JAXBElement<GenerateCapabilityResponseInput>(_GenerateCapabilityResponseInput_QNAME, GenerateCapabilityResponseInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupportedHostIdTypesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSupportedHostIdTypesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getSupportedHostIdTypesRequest")
    public JAXBElement<GetSupportedHostIdTypesRequest> createGetSupportedHostIdTypesRequest(GetSupportedHostIdTypesRequest value) {
        return new JAXBElement<GetSupportedHostIdTypesRequest>(_GetSupportedHostIdTypesRequest_QNAME, GetSupportedHostIdTypesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupportedHostIdTypesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSupportedHostIdTypesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getSupportedHostIdTypesResponse")
    public JAXBElement<GetSupportedHostIdTypesResponse> createGetSupportedHostIdTypesResponse(GetSupportedHostIdTypesResponse value) {
        return new JAXBElement<GetSupportedHostIdTypesResponse>(_GetSupportedHostIdTypesResponse_QNAME, GetSupportedHostIdTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchHostHistoryRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchHostHistoryRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchHostHistoryRequest")
    public JAXBElement<SearchHostHistoryRequest> createSearchHostHistoryRequest(SearchHostHistoryRequest value) {
        return new JAXBElement<SearchHostHistoryRequest>(_SearchHostHistoryRequest_QNAME, SearchHostHistoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchHostHistoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchHostHistoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchHostHistoryResponse")
    public JAXBElement<SearchHostHistoryResponse> createSearchHostHistoryResponse(SearchHostHistoryResponse value) {
        return new JAXBElement<SearchHostHistoryResponse>(_SearchHostHistoryResponse_QNAME, SearchHostHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequestHistoryInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchRequestHistoryInput }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchRequestHistoryInput")
    public JAXBElement<SearchRequestHistoryInput> createSearchRequestHistoryInput(SearchRequestHistoryInput value) {
        return new JAXBElement<SearchRequestHistoryInput>(_SearchRequestHistoryInput_QNAME, SearchRequestHistoryInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequestHistoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchRequestHistoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchRequestHistoryResponse")
    public JAXBElement<SearchRequestHistoryResponse> createSearchRequestHistoryResponse(SearchRequestHistoryResponse value) {
        return new JAXBElement<SearchRequestHistoryResponse>(_SearchRequestHistoryResponse_QNAME, SearchRequestHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHostOwnerRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateHostOwnerRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateHostOwnerRequest")
    public JAXBElement<UpdateHostOwnerRequest> createUpdateHostOwnerRequest(UpdateHostOwnerRequest value) {
        return new JAXBElement<UpdateHostOwnerRequest>(_UpdateHostOwnerRequest_QNAME, UpdateHostOwnerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHostOwnerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateHostOwnerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateHostOwnerResponse")
    public JAXBElement<UpdateHostOwnerResponse> createUpdateHostOwnerResponse(UpdateHostOwnerResponse value) {
        return new JAXBElement<UpdateHostOwnerResponse>(_UpdateHostOwnerResponse_QNAME, UpdateHostOwnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSyncHistoryRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSyncHistoryRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchSyncHistoryRequest")
    public JAXBElement<SearchSyncHistoryRequest> createSearchSyncHistoryRequest(SearchSyncHistoryRequest value) {
        return new JAXBElement<SearchSyncHistoryRequest>(_SearchSyncHistoryRequest_QNAME, SearchSyncHistoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSyncHistoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSyncHistoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchSyncHistoryResponse")
    public JAXBElement<SearchSyncHistoryResponse> createSearchSyncHistoryResponse(SearchSyncHistoryResponse value) {
        return new JAXBElement<SearchSyncHistoryResponse>(_SearchSyncHistoryResponse_QNAME, SearchSyncHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDeviceSeriesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDeviceSeriesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createDeviceSeriesRequest")
    public JAXBElement<CreateDeviceSeriesRequest> createCreateDeviceSeriesRequest(CreateDeviceSeriesRequest value) {
        return new JAXBElement<CreateDeviceSeriesRequest>(_CreateDeviceSeriesRequest_QNAME, CreateDeviceSeriesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDeviceSeriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDeviceSeriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createDeviceSeriesResponse")
    public JAXBElement<CreateDeviceSeriesResponse> createCreateDeviceSeriesResponse(CreateDeviceSeriesResponse value) {
        return new JAXBElement<CreateDeviceSeriesResponse>(_CreateDeviceSeriesResponse_QNAME, CreateDeviceSeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateHostTypeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateHostTypeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createHostTypeRequest")
    public JAXBElement<CreateHostTypeRequest> createCreateHostTypeRequest(CreateHostTypeRequest value) {
        return new JAXBElement<CreateHostTypeRequest>(_CreateHostTypeRequest_QNAME, CreateHostTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateHostTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateHostTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createHostTypeResponse")
    public JAXBElement<CreateHostTypeResponse> createCreateHostTypeResponse(CreateHostTypeResponse value) {
        return new JAXBElement<CreateHostTypeResponse>(_CreateHostTypeResponse_QNAME, CreateHostTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDeviceModelRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDeviceModelRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createDeviceModelRequest")
    public JAXBElement<CreateDeviceModelRequest> createCreateDeviceModelRequest(CreateDeviceModelRequest value) {
        return new JAXBElement<CreateDeviceModelRequest>(_CreateDeviceModelRequest_QNAME, CreateDeviceModelRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDeviceModelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDeviceModelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createDeviceModelResponse")
    public JAXBElement<CreateDeviceModelResponse> createCreateDeviceModelResponse(CreateDeviceModelResponse value) {
        return new JAXBElement<CreateDeviceModelResponse>(_CreateDeviceModelResponse_QNAME, CreateDeviceModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeviceModelRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDeviceModelRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateDeviceModelRequest")
    public JAXBElement<UpdateDeviceModelRequest> createUpdateDeviceModelRequest(UpdateDeviceModelRequest value) {
        return new JAXBElement<UpdateDeviceModelRequest>(_UpdateDeviceModelRequest_QNAME, UpdateDeviceModelRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeviceModelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDeviceModelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateDeviceModelResponse")
    public JAXBElement<UpdateDeviceModelResponse> createUpdateDeviceModelResponse(UpdateDeviceModelResponse value) {
        return new JAXBElement<UpdateDeviceModelResponse>(_UpdateDeviceModelResponse_QNAME, UpdateDeviceModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeviceSeriesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDeviceSeriesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateDeviceSeriesRequest")
    public JAXBElement<UpdateDeviceSeriesRequest> createUpdateDeviceSeriesRequest(UpdateDeviceSeriesRequest value) {
        return new JAXBElement<UpdateDeviceSeriesRequest>(_UpdateDeviceSeriesRequest_QNAME, UpdateDeviceSeriesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeviceSeriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDeviceSeriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateDeviceSeriesResponse")
    public JAXBElement<UpdateDeviceSeriesResponse> createUpdateDeviceSeriesResponse(UpdateDeviceSeriesResponse value) {
        return new JAXBElement<UpdateDeviceSeriesResponse>(_UpdateDeviceSeriesResponse_QNAME, UpdateDeviceSeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDeviceSeriesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListDeviceSeriesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listDeviceSeriesRequest")
    public JAXBElement<ListDeviceSeriesRequest> createListDeviceSeriesRequest(ListDeviceSeriesRequest value) {
        return new JAXBElement<ListDeviceSeriesRequest>(_ListDeviceSeriesRequest_QNAME, ListDeviceSeriesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDeviceSeriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListDeviceSeriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listDeviceSeriesResponse")
    public JAXBElement<ListDeviceSeriesResponse> createListDeviceSeriesResponse(ListDeviceSeriesResponse value) {
        return new JAXBElement<ListDeviceSeriesResponse>(_ListDeviceSeriesResponse_QNAME, ListDeviceSeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceSeriesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeviceSeriesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getDeviceSeriesRequest")
    public JAXBElement<GetDeviceSeriesRequest> createGetDeviceSeriesRequest(GetDeviceSeriesRequest value) {
        return new JAXBElement<GetDeviceSeriesRequest>(_GetDeviceSeriesRequest_QNAME, GetDeviceSeriesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceSeriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeviceSeriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getDeviceSeriesResponse")
    public JAXBElement<GetDeviceSeriesResponse> createGetDeviceSeriesResponse(GetDeviceSeriesResponse value) {
        return new JAXBElement<GetDeviceSeriesResponse>(_GetDeviceSeriesResponse_QNAME, GetDeviceSeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceModelRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeviceModelRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getDeviceModelRequest")
    public JAXBElement<GetDeviceModelRequest> createGetDeviceModelRequest(GetDeviceModelRequest value) {
        return new JAXBElement<GetDeviceModelRequest>(_GetDeviceModelRequest_QNAME, GetDeviceModelRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceModelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeviceModelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getDeviceModelResponse")
    public JAXBElement<GetDeviceModelResponse> createGetDeviceModelResponse(GetDeviceModelResponse value) {
        return new JAXBElement<GetDeviceModelResponse>(_GetDeviceModelResponse_QNAME, GetDeviceModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDeviceModelsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListDeviceModelsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listDeviceModelsRequest")
    public JAXBElement<ListDeviceModelsRequest> createListDeviceModelsRequest(ListDeviceModelsRequest value) {
        return new JAXBElement<ListDeviceModelsRequest>(_ListDeviceModelsRequest_QNAME, ListDeviceModelsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDeviceModelsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListDeviceModelsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listDeviceModelsResponse")
    public JAXBElement<ListDeviceModelsResponse> createListDeviceModelsResponse(ListDeviceModelsResponse value) {
        return new JAXBElement<ListDeviceModelsResponse>(_ListDeviceModelsResponse_QNAME, ListDeviceModelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListHostTypesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListHostTypesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listHostTypesRequest")
    public JAXBElement<ListHostTypesRequest> createListHostTypesRequest(ListHostTypesRequest value) {
        return new JAXBElement<ListHostTypesRequest>(_ListHostTypesRequest_QNAME, ListHostTypesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListHostTypesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListHostTypesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listHostTypesResponse")
    public JAXBElement<ListHostTypesResponse> createListHostTypesResponse(ListHostTypesResponse value) {
        return new JAXBElement<ListHostTypesResponse>(_ListHostTypesResponse_QNAME, ListHostTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServerHostTypeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateServerHostTypeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createServerHostTypeRequest")
    public JAXBElement<CreateServerHostTypeRequest> createCreateServerHostTypeRequest(CreateServerHostTypeRequest value) {
        return new JAXBElement<CreateServerHostTypeRequest>(_CreateServerHostTypeRequest_QNAME, CreateServerHostTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServerHostTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateServerHostTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "createServerHostTypeResponse")
    public JAXBElement<CreateServerHostTypeResponse> createCreateServerHostTypeResponse(CreateServerHostTypeResponse value) {
        return new JAXBElement<CreateServerHostTypeResponse>(_CreateServerHostTypeResponse_QNAME, CreateServerHostTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateLicenseFileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateLicenseFileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "generateLicenseFileRequest")
    public JAXBElement<GenerateLicenseFileRequest> createGenerateLicenseFileRequest(GenerateLicenseFileRequest value) {
        return new JAXBElement<GenerateLicenseFileRequest>(_GenerateLicenseFileRequest_QNAME, GenerateLicenseFileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateLicenseFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateLicenseFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "generateLicenseFileResponse")
    public JAXBElement<GenerateLicenseFileResponse> createGenerateLicenseFileResponse(GenerateLicenseFileResponse value) {
        return new JAXBElement<GenerateLicenseFileResponse>(_GenerateLicenseFileResponse_QNAME, GenerateLicenseFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObsoleteHostRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObsoleteHostRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "obsoleteHostRequest")
    public JAXBElement<ObsoleteHostRequest> createObsoleteHostRequest(ObsoleteHostRequest value) {
        return new JAXBElement<ObsoleteHostRequest>(_ObsoleteHostRequest_QNAME, ObsoleteHostRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObsoleteHostResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObsoleteHostResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "obsoleteHostResponse")
    public JAXBElement<ObsoleteHostResponse> createObsoleteHostResponse(ObsoleteHostResponse value) {
        return new JAXBElement<ObsoleteHostResponse>(_ObsoleteHostResponse_QNAME, ObsoleteHostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHostRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteHostRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "deleteHostRequest")
    public JAXBElement<DeleteHostRequest> createDeleteHostRequest(DeleteHostRequest value) {
        return new JAXBElement<DeleteHostRequest>(_DeleteHostRequest_QNAME, DeleteHostRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHostResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteHostResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "deleteHostResponse")
    public JAXBElement<DeleteHostResponse> createDeleteHostResponse(DeleteHostResponse value) {
        return new JAXBElement<DeleteHostResponse>(_DeleteHostResponse_QNAME, DeleteHostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListServerHostTypesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListServerHostTypesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listServerHostTypesRequest")
    public JAXBElement<ListServerHostTypesRequest> createListServerHostTypesRequest(ListServerHostTypesRequest value) {
        return new JAXBElement<ListServerHostTypesRequest>(_ListServerHostTypesRequest_QNAME, ListServerHostTypesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListServerHostTypesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListServerHostTypesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "listServerHostTypesResponse")
    public JAXBElement<ListServerHostTypesResponse> createListServerHostTypesResponse(ListServerHostTypesResponse value) {
        return new JAXBElement<ListServerHostTypesResponse>(_ListServerHostTypesResponse_QNAME, ListServerHostTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceLicenseFileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeviceLicenseFileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getDeviceLicenseFileRequest")
    public JAXBElement<GetDeviceLicenseFileRequest> createGetDeviceLicenseFileRequest(GetDeviceLicenseFileRequest value) {
        return new JAXBElement<GetDeviceLicenseFileRequest>(_GetDeviceLicenseFileRequest_QNAME, GetDeviceLicenseFileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceLicenseFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeviceLicenseFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getDeviceLicenseFileResponse")
    public JAXBElement<GetDeviceLicenseFileResponse> createGetDeviceLicenseFileResponse(GetDeviceLicenseFileResponse value) {
        return new JAXBElement<GetDeviceLicenseFileResponse>(_GetDeviceLicenseFileResponse_QNAME, GetDeviceLicenseFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDeviceModelsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchDeviceModelsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchDeviceModelsRequest")
    public JAXBElement<SearchDeviceModelsRequest> createSearchDeviceModelsRequest(SearchDeviceModelsRequest value) {
        return new JAXBElement<SearchDeviceModelsRequest>(_SearchDeviceModelsRequest_QNAME, SearchDeviceModelsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDeviceModelsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchDeviceModelsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchDeviceModelsResponse")
    public JAXBElement<SearchDeviceModelsResponse> createSearchDeviceModelsResponse(SearchDeviceModelsResponse value) {
        return new JAXBElement<SearchDeviceModelsResponse>(_SearchDeviceModelsResponse_QNAME, SearchDeviceModelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfigurationMetadataRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfigurationMetadataRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getConfigurationMetadataRequest")
    public JAXBElement<GetConfigurationMetadataRequest> createGetConfigurationMetadataRequest(GetConfigurationMetadataRequest value) {
        return new JAXBElement<GetConfigurationMetadataRequest>(_GetConfigurationMetadataRequest_QNAME, GetConfigurationMetadataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfigurationMetadataResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfigurationMetadataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getConfigurationMetadataResponse")
    public JAXBElement<GetConfigurationMetadataResponse> createGetConfigurationMetadataResponse(GetConfigurationMetadataResponse value) {
        return new JAXBElement<GetConfigurationMetadataResponse>(_GetConfigurationMetadataResponse_QNAME, GetConfigurationMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfigurationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfigurationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getConfigurationRequest")
    public JAXBElement<GetConfigurationRequest> createGetConfigurationRequest(GetConfigurationRequest value) {
        return new JAXBElement<GetConfigurationRequest>(_GetConfigurationRequest_QNAME, GetConfigurationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfigurationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getConfigurationResponse")
    public JAXBElement<GetConfigurationResponse> createGetConfigurationResponse(GetConfigurationResponse value) {
        return new JAXBElement<GetConfigurationResponse>(_GetConfigurationResponse_QNAME, GetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "setConfigurationRequest")
    public JAXBElement<SetConfigurationRequest> createSetConfigurationRequest(SetConfigurationRequest value) {
        return new JAXBElement<SetConfigurationRequest>(_SetConfigurationRequest_QNAME, SetConfigurationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "setConfigurationResponse")
    public JAXBElement<SetConfigurationResponse> createSetConfigurationResponse(SetConfigurationResponse value) {
        return new JAXBElement<SetConfigurationResponse>(_SetConfigurationResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditServerRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditServerRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "editServerRequest")
    public JAXBElement<EditServerRequest> createEditServerRequest(EditServerRequest value) {
        return new JAXBElement<EditServerRequest>(_EditServerRequest_QNAME, EditServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "editServerResponse")
    public JAXBElement<EditServerResponse> createEditServerResponse(EditServerResponse value) {
        return new JAXBElement<EditServerResponse>(_EditServerResponse_QNAME, EditServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetachUserRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetachUserRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "detachUserRequest")
    public JAXBElement<DetachUserRequest> createDetachUserRequest(DetachUserRequest value) {
        return new JAXBElement<DetachUserRequest>(_DetachUserRequest_QNAME, DetachUserRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetachUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetachUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "detachUserResponse")
    public JAXBElement<DetachUserResponse> createDetachUserResponse(DetachUserResponse value) {
        return new JAXBElement<DetachUserResponse>(_DetachUserResponse_QNAME, DetachUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerHostTypeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServerHostTypeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getServerHostTypeRequest")
    public JAXBElement<GetServerHostTypeRequest> createGetServerHostTypeRequest(GetServerHostTypeRequest value) {
        return new JAXBElement<GetServerHostTypeRequest>(_GetServerHostTypeRequest_QNAME, GetServerHostTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerHostTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServerHostTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getServerHostTypeResponse")
    public JAXBElement<GetServerHostTypeResponse> createGetServerHostTypeResponse(GetServerHostTypeResponse value) {
        return new JAXBElement<GetServerHostTypeResponse>(_GetServerHostTypeResponse_QNAME, GetServerHostTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateServerHostTypeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateServerHostTypeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateServerHostTypeRequest")
    public JAXBElement<UpdateServerHostTypeRequest> createUpdateServerHostTypeRequest(UpdateServerHostTypeRequest value) {
        return new JAXBElement<UpdateServerHostTypeRequest>(_UpdateServerHostTypeRequest_QNAME, UpdateServerHostTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateServerHostTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateServerHostTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateServerHostTypeResponse")
    public JAXBElement<UpdateServerHostTypeResponse> createUpdateServerHostTypeResponse(UpdateServerHostTypeResponse value) {
        return new JAXBElement<UpdateServerHostTypeResponse>(_UpdateServerHostTypeResponse_QNAME, UpdateServerHostTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditServedClientRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditServedClientRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "editServedClientRequest")
    public JAXBElement<EditServedClientRequest> createEditServedClientRequest(EditServedClientRequest value) {
        return new JAXBElement<EditServedClientRequest>(_EditServedClientRequest_QNAME, EditServedClientRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditServedClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditServedClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "editServedClientResponse")
    public JAXBElement<EditServedClientResponse> createEditServedClientResponse(EditServedClientResponse value) {
        return new JAXBElement<EditServedClientResponse>(_EditServedClientResponse_QNAME, EditServedClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveDeviceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveDeviceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "moveDeviceRequest")
    public JAXBElement<MoveDeviceRequest> createMoveDeviceRequest(MoveDeviceRequest value) {
        return new JAXBElement<MoveDeviceRequest>(_MoveDeviceRequest_QNAME, MoveDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveDeviceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveDeviceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "moveDeviceResponse")
    public JAXBElement<MoveDeviceResponse> createMoveDeviceResponse(MoveDeviceResponse value) {
        return new JAXBElement<MoveDeviceResponse>(_MoveDeviceResponse_QNAME, MoveDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveDevicesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveDevicesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "moveDevicesRequest")
    public JAXBElement<MoveDevicesRequest> createMoveDevicesRequest(MoveDevicesRequest value) {
        return new JAXBElement<MoveDevicesRequest>(_MoveDevicesRequest_QNAME, MoveDevicesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveDevicesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveDevicesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "moveDevicesResponse")
    public JAXBElement<MoveDevicesResponse> createMoveDevicesResponse(MoveDevicesResponse value) {
        return new JAXBElement<MoveDevicesResponse>(_MoveDevicesResponse_QNAME, MoveDevicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveServerRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveServerRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "moveServerRequest")
    public JAXBElement<MoveServerRequest> createMoveServerRequest(MoveServerRequest value) {
        return new JAXBElement<MoveServerRequest>(_MoveServerRequest_QNAME, MoveServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "moveServerResponse")
    public JAXBElement<MoveServerResponse> createMoveServerResponse(MoveServerResponse value) {
        return new JAXBElement<MoveServerResponse>(_MoveServerResponse_QNAME, MoveServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsageSummaryRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsageSummaryRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getUsageSummaryRequest")
    public JAXBElement<GetUsageSummaryRequest> createGetUsageSummaryRequest(GetUsageSummaryRequest value) {
        return new JAXBElement<GetUsageSummaryRequest>(_GetUsageSummaryRequest_QNAME, GetUsageSummaryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsageSummaryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsageSummaryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getUsageSummaryResponse")
    public JAXBElement<GetUsageSummaryResponse> createGetUsageSummaryResponse(GetUsageSummaryResponse value) {
        return new JAXBElement<GetUsageSummaryResponse>(_GetUsageSummaryResponse_QNAME, GetUsageSummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLicenseGeneratedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsLicenseGeneratedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isLicenseGeneratedResponse")
    public JAXBElement<IsLicenseGeneratedResponse> createIsLicenseGeneratedResponse(IsLicenseGeneratedResponse value) {
        return new JAXBElement<IsLicenseGeneratedResponse>(_IsLicenseGeneratedResponse_QNAME, IsLicenseGeneratedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLicenseGeneratedRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsLicenseGeneratedRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isLicenseGeneratedRequest")
    public JAXBElement<IsLicenseGeneratedRequest> createIsLicenseGeneratedRequest(IsLicenseGeneratedRequest value) {
        return new JAXBElement<IsLicenseGeneratedRequest>(_IsLicenseGeneratedRequest_QNAME, IsLicenseGeneratedRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendingFulfillCountRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPendingFulfillCountRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getPendingFulfillCountRequest")
    public JAXBElement<GetPendingFulfillCountRequest> createGetPendingFulfillCountRequest(GetPendingFulfillCountRequest value) {
        return new JAXBElement<GetPendingFulfillCountRequest>(_GetPendingFulfillCountRequest_QNAME, GetPendingFulfillCountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendingFulfillCountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPendingFulfillCountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getPendingFulfillCountResponse")
    public JAXBElement<GetPendingFulfillCountResponse> createGetPendingFulfillCountResponse(GetPendingFulfillCountResponse value) {
        return new JAXBElement<GetPendingFulfillCountResponse>(_GetPendingFulfillCountResponse_QNAME, GetPendingFulfillCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCatalogItemMappedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsCatalogItemMappedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isCatalogItemMappedResponse")
    public JAXBElement<IsCatalogItemMappedResponse> createIsCatalogItemMappedResponse(IsCatalogItemMappedResponse value) {
        return new JAXBElement<IsCatalogItemMappedResponse>(_IsCatalogItemMappedResponse_QNAME, IsCatalogItemMappedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCatalogItemMappedRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsCatalogItemMappedRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isCatalogItemMappedRequest")
    public JAXBElement<IsCatalogItemMappedRequest> createIsCatalogItemMappedRequest(IsCatalogItemMappedRequest value) {
        return new JAXBElement<IsCatalogItemMappedRequest>(_IsCatalogItemMappedRequest_QNAME, IsCatalogItemMappedRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsBaseProductUsedInLimitedSeriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsBaseProductUsedInLimitedSeriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isBaseProductUsedInLimitedSeriesResponse")
    public JAXBElement<IsBaseProductUsedInLimitedSeriesResponse> createIsBaseProductUsedInLimitedSeriesResponse(IsBaseProductUsedInLimitedSeriesResponse value) {
        return new JAXBElement<IsBaseProductUsedInLimitedSeriesResponse>(_IsBaseProductUsedInLimitedSeriesResponse_QNAME, IsBaseProductUsedInLimitedSeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsBaseProductUsedInLimitedSeriesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsBaseProductUsedInLimitedSeriesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isBaseProductUsedInLimitedSeriesRequest")
    public JAXBElement<IsBaseProductUsedInLimitedSeriesRequest> createIsBaseProductUsedInLimitedSeriesRequest(IsBaseProductUsedInLimitedSeriesRequest value) {
        return new JAXBElement<IsBaseProductUsedInLimitedSeriesRequest>(_IsBaseProductUsedInLimitedSeriesRequest_QNAME, IsBaseProductUsedInLimitedSeriesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredIDTypesForClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFilteredIDTypesForClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getFilteredIDTypesForClientResponse")
    public JAXBElement<GetFilteredIDTypesForClientResponse> createGetFilteredIDTypesForClientResponse(GetFilteredIDTypesForClientResponse value) {
        return new JAXBElement<GetFilteredIDTypesForClientResponse>(_GetFilteredIDTypesForClientResponse_QNAME, GetFilteredIDTypesForClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredIDTypesForClientRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFilteredIDTypesForClientRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getFilteredIDTypesForClientRequest")
    public JAXBElement<GetFilteredIDTypesForClientRequest> createGetFilteredIDTypesForClientRequest(GetFilteredIDTypesForClientRequest value) {
        return new JAXBElement<GetFilteredIDTypesForClientRequest>(_GetFilteredIDTypesForClientRequest_QNAME, GetFilteredIDTypesForClientRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredIDTypesForServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFilteredIDTypesForServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getFilteredIDTypesForServerResponse")
    public JAXBElement<GetFilteredIDTypesForServerResponse> createGetFilteredIDTypesForServerResponse(GetFilteredIDTypesForServerResponse value) {
        return new JAXBElement<GetFilteredIDTypesForServerResponse>(_GetFilteredIDTypesForServerResponse_QNAME, GetFilteredIDTypesForServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredIDTypesForServerRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFilteredIDTypesForServerRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getFilteredIDTypesForServerRequest")
    public JAXBElement<GetFilteredIDTypesForServerRequest> createGetFilteredIDTypesForServerRequest(GetFilteredIDTypesForServerRequest value) {
        return new JAXBElement<GetFilteredIDTypesForServerRequest>(_GetFilteredIDTypesForServerRequest_QNAME, GetFilteredIDTypesForServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllowedIDTypesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllowedIDTypesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getAllowedIDTypesResponse")
    public JAXBElement<GetAllowedIDTypesResponse> createGetAllowedIDTypesResponse(GetAllowedIDTypesResponse value) {
        return new JAXBElement<GetAllowedIDTypesResponse>(_GetAllowedIDTypesResponse_QNAME, GetAllowedIDTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllowedIDTypesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllowedIDTypesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getAllowedIDTypesRequest")
    public JAXBElement<GetAllowedIDTypesRequest> createGetAllowedIDTypesRequest(GetAllowedIDTypesRequest value) {
        return new JAXBElement<GetAllowedIDTypesRequest>(_GetAllowedIDTypesRequest_QNAME, GetAllowedIDTypesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsRightsIdMappedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsRightsIdMappedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isRightsIdMappedResponse")
    public JAXBElement<IsRightsIdMappedResponse> createIsRightsIdMappedResponse(IsRightsIdMappedResponse value) {
        return new JAXBElement<IsRightsIdMappedResponse>(_IsRightsIdMappedResponse_QNAME, IsRightsIdMappedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsRightsIdMappedRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsRightsIdMappedRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isRightsIdMappedRequest")
    public JAXBElement<IsRightsIdMappedRequest> createIsRightsIdMappedRequest(IsRightsIdMappedRequest value) {
        return new JAXBElement<IsRightsIdMappedRequest>(_IsRightsIdMappedRequest_QNAME, IsRightsIdMappedRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCatalogItemMappedToLimitedSeriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsCatalogItemMappedToLimitedSeriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isCatalogItemMappedToLimitedSeriesResponse")
    public JAXBElement<IsCatalogItemMappedToLimitedSeriesResponse> createIsCatalogItemMappedToLimitedSeriesResponse(IsCatalogItemMappedToLimitedSeriesResponse value) {
        return new JAXBElement<IsCatalogItemMappedToLimitedSeriesResponse>(_IsCatalogItemMappedToLimitedSeriesResponse_QNAME, IsCatalogItemMappedToLimitedSeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCatalogItemMappedToLimitedSeriesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsCatalogItemMappedToLimitedSeriesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isCatalogItemMappedToLimitedSeriesRequest")
    public JAXBElement<IsCatalogItemMappedToLimitedSeriesRequest> createIsCatalogItemMappedToLimitedSeriesRequest(IsCatalogItemMappedToLimitedSeriesRequest value) {
        return new JAXBElement<IsCatalogItemMappedToLimitedSeriesRequest>(_IsCatalogItemMappedToLimitedSeriesRequest_QNAME, IsCatalogItemMappedToLimitedSeriesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultServerForEnterpriseRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDefaultServerForEnterpriseRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getDefaultServerForEnterpriseRequest")
    public JAXBElement<GetDefaultServerForEnterpriseRequest> createGetDefaultServerForEnterpriseRequest(GetDefaultServerForEnterpriseRequest value) {
        return new JAXBElement<GetDefaultServerForEnterpriseRequest>(_GetDefaultServerForEnterpriseRequest_QNAME, GetDefaultServerForEnterpriseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHostsForEntitlementTransferRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHostsForEntitlementTransferRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getHostsForEntitlementTransferRequest")
    public JAXBElement<GetHostsForEntitlementTransferRequest> createGetHostsForEntitlementTransferRequest(GetHostsForEntitlementTransferRequest value) {
        return new JAXBElement<GetHostsForEntitlementTransferRequest>(_GetHostsForEntitlementTransferRequest_QNAME, GetHostsForEntitlementTransferRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHostsForEntitlementTransferResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHostsForEntitlementTransferResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "getHostsForEntitlementTransferResponse")
    public JAXBElement<GetHostsForEntitlementTransferResponse> createGetHostsForEntitlementTransferResponse(GetHostsForEntitlementTransferResponse value) {
        return new JAXBElement<GetHostsForEntitlementTransferResponse>(_GetHostsForEntitlementTransferResponse_QNAME, GetHostsForEntitlementTransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsOwnerReferencedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsOwnerReferencedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isOwnerReferencedResponse")
    public JAXBElement<IsOwnerReferencedResponse> createIsOwnerReferencedResponse(IsOwnerReferencedResponse value) {
        return new JAXBElement<IsOwnerReferencedResponse>(_IsOwnerReferencedResponse_QNAME, IsOwnerReferencedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsOwnerReferencedRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsOwnerReferencedRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isOwnerReferencedRequest")
    public JAXBElement<IsOwnerReferencedRequest> createIsOwnerReferencedRequest(IsOwnerReferencedRequest value) {
        return new JAXBElement<IsOwnerReferencedRequest>(_IsOwnerReferencedRequest_QNAME, IsOwnerReferencedRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAddOnsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchAddOnsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchAddOnsResponse")
    public JAXBElement<SearchAddOnsResponse> createSearchAddOnsResponse(SearchAddOnsResponse value) {
        return new JAXBElement<SearchAddOnsResponse>(_SearchAddOnsResponse_QNAME, SearchAddOnsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAddOnsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchAddOnsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "searchAddOnsRequest")
    public JAXBElement<SearchAddOnsRequest> createSearchAddOnsRequest(SearchAddOnsRequest value) {
        return new JAXBElement<SearchAddOnsRequest>(_SearchAddOnsRequest_QNAME, SearchAddOnsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAddOnsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnAddOnsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "returnAddOnsRequest")
    public JAXBElement<ReturnAddOnsRequest> createReturnAddOnsRequest(ReturnAddOnsRequest value) {
        return new JAXBElement<ReturnAddOnsRequest>(_ReturnAddOnsRequest_QNAME, ReturnAddOnsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAddOnsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnAddOnsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "returnAddOnsResponse")
    public JAXBElement<ReturnAddOnsResponse> createReturnAddOnsResponse(ReturnAddOnsResponse value) {
        return new JAXBElement<ReturnAddOnsResponse>(_ReturnAddOnsResponse_QNAME, ReturnAddOnsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMatchingHostOwnersRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateMatchingHostOwnersRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateMatchingHostOwnersRequest")
    public JAXBElement<UpdateMatchingHostOwnersRequest> createUpdateMatchingHostOwnersRequest(UpdateMatchingHostOwnersRequest value) {
        return new JAXBElement<UpdateMatchingHostOwnersRequest>(_UpdateMatchingHostOwnersRequest_QNAME, UpdateMatchingHostOwnersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMatchingHostOwnersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateMatchingHostOwnersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "updateMatchingHostOwnersResponse")
    public JAXBElement<UpdateMatchingHostOwnersResponse> createUpdateMatchingHostOwnersResponse(UpdateMatchingHostOwnersResponse value) {
        return new JAXBElement<UpdateMatchingHostOwnersResponse>(_UpdateMatchingHostOwnersResponse_QNAME, UpdateMatchingHostOwnersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateCloneDetectionReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateCloneDetectionReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "generateCloneDetectionReportRequest")
    public JAXBElement<GenerateCloneDetectionReportRequest> createGenerateCloneDetectionReportRequest(GenerateCloneDetectionReportRequest value) {
        return new JAXBElement<GenerateCloneDetectionReportRequest>(_GenerateCloneDetectionReportRequest_QNAME, GenerateCloneDetectionReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateCloneDetectionReportResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateCloneDetectionReportResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "generateCloneDetectionReportResponse")
    public JAXBElement<GenerateCloneDetectionReportResponse> createGenerateCloneDetectionReportResponse(GenerateCloneDetectionReportResponse value) {
        return new JAXBElement<GenerateCloneDetectionReportResponse>(_GenerateCloneDetectionReportResponse_QNAME, GenerateCloneDetectionReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsedByDeviceSeriesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsedByDeviceSeriesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "usedByDeviceSeriesRequest")
    public JAXBElement<UsedByDeviceSeriesRequest> createUsedByDeviceSeriesRequest(UsedByDeviceSeriesRequest value) {
        return new JAXBElement<UsedByDeviceSeriesRequest>(_UsedByDeviceSeriesRequest_QNAME, UsedByDeviceSeriesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsedByDeviceSeriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsedByDeviceSeriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "usedByDeviceSeriesResponse")
    public JAXBElement<UsedByDeviceSeriesResponse> createUsedByDeviceSeriesResponse(UsedByDeviceSeriesResponse value) {
        return new JAXBElement<UsedByDeviceSeriesResponse>(_UsedByDeviceSeriesResponse_QNAME, UsedByDeviceSeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHostedServerAdminPasswordRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetHostedServerAdminPasswordRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "setHostedServerAdminPasswordRequest")
    public JAXBElement<SetHostedServerAdminPasswordRequest> createSetHostedServerAdminPasswordRequest(SetHostedServerAdminPasswordRequest value) {
        return new JAXBElement<SetHostedServerAdminPasswordRequest>(_SetHostedServerAdminPasswordRequest_QNAME, SetHostedServerAdminPasswordRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHostedServerAdminPasswordResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetHostedServerAdminPasswordResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "setHostedServerAdminPasswordResponse")
    public JAXBElement<SetHostedServerAdminPasswordResponse> createSetHostedServerAdminPasswordResponse(SetHostedServerAdminPasswordResponse value) {
        return new JAXBElement<SetHostedServerAdminPasswordResponse>(_SetHostedServerAdminPasswordResponse_QNAME, SetHostedServerAdminPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HostIdentifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HostIdentifier }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "serverHostId", scope = FeatureData.class)
    public JAXBElement<HostIdentifier> createFeatureDataServerHostId(HostIdentifier value) {
        return new JAXBElement<HostIdentifier>(_FeatureDataServerHostId_QNAME, HostIdentifier.class, FeatureData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "lastSyncTime", scope = HostIdentifier.class)
    public JAXBElement<XMLGregorianCalendar> createHostIdentifierLastSyncTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_HostIdentifierLastSyncTime_QNAME, XMLGregorianCalendar.class, HostIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.lfs.webservice", name = "isCloud", scope = HostIdentifier.class)
    public JAXBElement<Boolean> createHostIdentifierIsCloud(Boolean value) {
        return new JAXBElement<Boolean>(_HostIdentifierIsCloud_QNAME, Boolean.class, HostIdentifier.class, value);
    }

}
