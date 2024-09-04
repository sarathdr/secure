
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostSearchParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hostSearchParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enterpriseIds" type="{urn:com.flexnet.lfs.webservice}enterpriseIdList" minOccurs="0"/&gt;
 *         &lt;element name="userInfo" type="{urn:com.flexnet.lfs.webservice}userParameter" minOccurs="0"/&gt;
 *         &lt;element name="hostId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostIdType" type="{urn:com.flexnet.lfs.webservice}hostIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="hostTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publisherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pagination" type="{urn:com.flexnet.lfs.webservice}paginationInput" minOccurs="0"/&gt;
 *         &lt;element name="sortBy" type="{urn:com.flexnet.lfs.webservice}sortBy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostSearchParameters", propOrder = {
    "publisherId",
    "enterpriseIds",
    "userInfo",
    "hostId",
    "hostIdType",
    "hostTypeName",
    "siteName",
    "signatureName",
    "publisherName",
    "alias",
    "description",
    "pagination",
    "sortBy"
})
@XmlSeeAlso({
    ServedClientsSearchParameters.class
})
public class HostSearchParameters {

    @XmlElement(required = true)
    protected String publisherId;
    protected EnterpriseIdList enterpriseIds;
    protected UserParameter userInfo;
    protected String hostId;
    @XmlSchemaType(name = "NMTOKEN")
    protected HostIdentifierType hostIdType;
    protected String hostTypeName;
    protected String siteName;
    protected String signatureName;
    protected String publisherName;
    protected String alias;
    protected String description;
    protected PaginationInput pagination;
    protected SortBy sortBy;

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
     * Gets the value of the hostId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostId() {
        return hostId;
    }

    /**
     * Sets the value of the hostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostId(String value) {
        this.hostId = value;
    }

    /**
     * Gets the value of the hostIdType property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifierType }
     *     
     */
    public HostIdentifierType getHostIdType() {
        return hostIdType;
    }

    /**
     * Sets the value of the hostIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifierType }
     *     
     */
    public void setHostIdType(HostIdentifierType value) {
        this.hostIdType = value;
    }

    /**
     * Gets the value of the hostTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTypeName() {
        return hostTypeName;
    }

    /**
     * Sets the value of the hostTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTypeName(String value) {
        this.hostTypeName = value;
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

}
