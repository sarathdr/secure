
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostTypeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hostTypeData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="defaultHostIdType" type="{urn:com.flexnet.lfs.webservice}hostIdentifierType"/&gt;
 *         &lt;element name="allowedHostIdTypes" type="{urn:com.flexnet.lfs.webservice}supportedHostIdTypes" minOccurs="0"/&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identity" type="{urn:com.flexnet.lfs.webservice}identity" minOccurs="0"/&gt;
 *         &lt;element name="baseProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isVisibleOnPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostTypeData", propOrder = {
    "name",
    "isDefault",
    "defaultHostIdType",
    "allowedHostIdTypes",
    "alias",
    "description",
    "identity",
    "baseProductId",
    "isVisibleOnPortal"
})
@XmlSeeAlso({
    CreateDeviceModelRequest.class,
    CreateServerHostTypeRequest.class,
    DeviceModelData.class
})
public class HostTypeData
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(defaultValue = "false")
    protected Boolean isDefault;
    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected HostIdentifierType defaultHostIdType;
    protected SupportedHostIdTypes allowedHostIdTypes;
    protected String alias;
    protected String description;
    protected Identity identity;
    protected String baseProductId;
    @XmlElement(defaultValue = "true")
    protected Boolean isVisibleOnPortal;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the defaultHostIdType property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifierType }
     *     
     */
    public HostIdentifierType getDefaultHostIdType() {
        return defaultHostIdType;
    }

    /**
     * Sets the value of the defaultHostIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifierType }
     *     
     */
    public void setDefaultHostIdType(HostIdentifierType value) {
        this.defaultHostIdType = value;
    }

    /**
     * Gets the value of the allowedHostIdTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedHostIdTypes }
     *     
     */
    public SupportedHostIdTypes getAllowedHostIdTypes() {
        return allowedHostIdTypes;
    }

    /**
     * Sets the value of the allowedHostIdTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedHostIdTypes }
     *     
     */
    public void setAllowedHostIdTypes(SupportedHostIdTypes value) {
        this.allowedHostIdTypes = value;
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
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link Identity }
     *     
     */
    public Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identity }
     *     
     */
    public void setIdentity(Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the baseProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseProductId() {
        return baseProductId;
    }

    /**
     * Sets the value of the baseProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseProductId(String value) {
        this.baseProductId = value;
    }

    /**
     * Gets the value of the isVisibleOnPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVisibleOnPortal() {
        return isVisibleOnPortal;
    }

    /**
     * Sets the value of the isVisibleOnPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVisibleOnPortal(Boolean value) {
        this.isVisibleOnPortal = value;
    }

}
