
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchAddOnsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchAddOnsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enterpriseIds" type="{urn:com.flexnet.lfs.webservice}enterpriseIdList" minOccurs="0"/&gt;
 *         &lt;element name="catalogItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="catalogItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addOnStatus" type="{urn:com.flexnet.lfs.webservice}addOnStatus" minOccurs="0"/&gt;
 *         &lt;element name="pagination" type="{urn:com.flexnet.lfs.webservice}paginationInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchAddOnsRequest", propOrder = {
    "publisherId",
    "enterpriseIds",
    "catalogItemId",
    "catalogItemName",
    "activationId",
    "addOnStatus",
    "pagination"
})
public class SearchAddOnsRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    protected EnterpriseIdList enterpriseIds;
    protected String catalogItemId;
    protected String catalogItemName;
    protected String activationId;
    @XmlSchemaType(name = "NMTOKEN")
    protected AddOnStatus addOnStatus;
    protected PaginationInput pagination;

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
     * Gets the value of the catalogItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogItemId() {
        return catalogItemId;
    }

    /**
     * Sets the value of the catalogItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogItemId(String value) {
        this.catalogItemId = value;
    }

    /**
     * Gets the value of the catalogItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogItemName() {
        return catalogItemName;
    }

    /**
     * Sets the value of the catalogItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogItemName(String value) {
        this.catalogItemName = value;
    }

    /**
     * Gets the value of the activationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationId() {
        return activationId;
    }

    /**
     * Sets the value of the activationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationId(String value) {
        this.activationId = value;
    }

    /**
     * Gets the value of the addOnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AddOnStatus }
     *     
     */
    public AddOnStatus getAddOnStatus() {
        return addOnStatus;
    }

    /**
     * Sets the value of the addOnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnStatus }
     *     
     */
    public void setAddOnStatus(AddOnStatus value) {
        this.addOnStatus = value;
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

}
