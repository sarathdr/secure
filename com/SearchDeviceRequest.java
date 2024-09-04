
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchDeviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchDeviceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enterpriseIds" type="{urn:com.flexnet.lfs.webservice}enterpriseIdList" minOccurs="0"/&gt;
 *         &lt;element name="signatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="publisherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="deviceIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="deviceModelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceSeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:com.flexnet.lfs.webservice}hostStatus" minOccurs="0"/&gt;
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pagination" type="{urn:com.flexnet.lfs.webservice}paginationInput" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseInfo" type="{urn:com.flexnet.lfs.webservice}enterpriseInfo" minOccurs="0"/&gt;
 *         &lt;element name="userInfo" type="{urn:com.flexnet.lfs.webservice}userParameter" minOccurs="0"/&gt;
 *         &lt;element name="addOnDetail" type="{urn:com.flexnet.lfs.webservice}addOnDetail" minOccurs="0"/&gt;
 *         &lt;element name="sortBy" type="{urn:com.flexnet.lfs.webservice}sortBy" minOccurs="0"/&gt;
 *         &lt;element name="activationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceIdentifierExactMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="responseConfig" type="{urn:com.flexnet.lfs.webservice}deviceResponseConfig" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDeviceRequest", propOrder = {
    "publisherId",
    "enterpriseIds",
    "signatureName",
    "publisherName",
    "deviceIdentifier",
    "deviceModelName",
    "deviceSeriesName",
    "alias",
    "notes",
    "description",
    "status",
    "siteName",
    "pagination",
    "enterpriseInfo",
    "userInfo",
    "addOnDetail",
    "sortBy",
    "activationCode",
    "deviceIdentifierExactMatch",
    "responseConfig"
})
public class SearchDeviceRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    protected EnterpriseIdList enterpriseIds;
    protected String signatureName;
    protected String publisherName;
    protected HostIdentifier deviceIdentifier;
    protected String deviceModelName;
    protected String deviceSeriesName;
    protected String alias;
    protected String notes;
    protected String description;
    @XmlSchemaType(name = "NMTOKEN")
    protected HostStatus status;
    protected String siteName;
    protected PaginationInput pagination;
    protected EnterpriseInfo enterpriseInfo;
    protected UserParameter userInfo;
    protected AddOnDetail addOnDetail;
    protected SortBy sortBy;
    protected String activationCode;
    protected Boolean deviceIdentifierExactMatch;
    protected DeviceResponseConfig responseConfig;

    /**
     * Gets the value of the publisherId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherId() {
        return publisherId;
    }

    /**
     * Sets the value of the publisherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherId(String value) {
        this.publisherId = value;
    }

    /**
     * Gets the value of the enterpriseIds property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseIdList }
     *     
     */
    public EnterpriseIdList getEnterpriseIds() {
        return enterpriseIds;
    }

    /**
     * Sets the value of the enterpriseIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseIdList }
     *     
     */
    public void setEnterpriseIds(EnterpriseIdList value) {
        this.enterpriseIds = value;
    }

    /**
     * Gets the value of the signatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * Sets the value of the signatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureName(String value) {
        this.signatureName = value;
    }

    /**
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    /**
     * Gets the value of the deviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }

    /**
     * Sets the value of the deviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setDeviceIdentifier(HostIdentifier value) {
        this.deviceIdentifier = value;
    }

    /**
     * Gets the value of the deviceModelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModelName() {
        return deviceModelName;
    }

    /**
     * Sets the value of the deviceModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModelName(String value) {
        this.deviceModelName = value;
    }

    /**
     * Gets the value of the deviceSeriesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSeriesName() {
        return deviceSeriesName;
    }

    /**
     * Sets the value of the deviceSeriesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSeriesName(String value) {
        this.deviceSeriesName = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link HostStatus }
     *     
     */
    public HostStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostStatus }
     *     
     */
    public void setStatus(HostStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationInput }
     *     
     */
    public PaginationInput getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationInput }
     *     
     */
    public void setPagination(PaginationInput value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the enterpriseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseInfo }
     *     
     */
    public EnterpriseInfo getEnterpriseInfo() {
        return enterpriseInfo;
    }

    /**
     * Sets the value of the enterpriseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseInfo }
     *     
     */
    public void setEnterpriseInfo(EnterpriseInfo value) {
        this.enterpriseInfo = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserParameter }
     *     
     */
    public UserParameter getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserParameter }
     *     
     */
    public void setUserInfo(UserParameter value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the addOnDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AddOnDetail }
     *     
     */
    public AddOnDetail getAddOnDetail() {
        return addOnDetail;
    }

    /**
     * Sets the value of the addOnDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnDetail }
     *     
     */
    public void setAddOnDetail(AddOnDetail value) {
        this.addOnDetail = value;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link SortBy }
     *     
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortBy }
     *     
     */
    public void setSortBy(SortBy value) {
        this.sortBy = value;
    }

    /**
     * Gets the value of the activationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * Sets the value of the activationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationCode(String value) {
        this.activationCode = value;
    }

    /**
     * Gets the value of the deviceIdentifierExactMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceIdentifierExactMatch() {
        return deviceIdentifierExactMatch;
    }

    /**
     * Sets the value of the deviceIdentifierExactMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceIdentifierExactMatch(Boolean value) {
        this.deviceIdentifierExactMatch = value;
    }

    /**
     * Gets the value of the responseConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceResponseConfig }
     *     
     */
    public DeviceResponseConfig getResponseConfig() {
        return responseConfig;
    }

    /**
     * Sets the value of the responseConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceResponseConfig }
     *     
     */
    public void setResponseConfig(DeviceResponseConfig value) {
        this.responseConfig = value;
    }

}
