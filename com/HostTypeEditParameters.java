
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostTypeEditParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hostTypeEditParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultIdType" type="{urn:com.flexnet.lfs.webservice}hostIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="allowedHostIdTypes" type="{urn:com.flexnet.lfs.webservice}supportedHostIdTypes" minOccurs="0"/&gt;
 *         &lt;element name="identity" type="{urn:com.flexnet.lfs.webservice}identity" minOccurs="0"/&gt;
 *         &lt;element name="baseProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isVisibleOnPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostTypeEditParameters", propOrder = {
    "isDefault",
    "alias",
    "description",
    "defaultIdType",
    "allowedHostIdTypes",
    "identity",
    "baseProductId",
    "isVisibleOnPortal"
})
@XmlSeeAlso({
    DeviceModelEditParameters.class
})
public class HostTypeEditParameters {

    @XmlElement(defaultValue = "false")
    protected Boolean isDefault;
    protected String alias;
    protected String description;
    @XmlSchemaType(name = "NMTOKEN")
    protected HostIdentifierType defaultIdType;
    protected SupportedHostIdTypes allowedHostIdTypes;
    protected Identity identity;
    protected String baseProductId;
    @XmlElement(defaultValue = "true")
    protected Boolean isVisibleOnPortal;

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
     * Gets the value of the defaultIdType property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifierType }
     *     
     */
    public HostIdentifierType getDefaultIdType() {
        return defaultIdType;
    }

    /**
     * Sets the value of the defaultIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifierType }
     *     
     */
    public void setDefaultIdType(HostIdentifierType value) {
        this.defaultIdType = value;
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
