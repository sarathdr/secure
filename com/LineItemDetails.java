
package secure.com;

import java.math.BigInteger;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Owner" type="{urn:com.flexnet.lfs.webservice}OwnerData" minOccurs="0"/&gt;
 *         &lt;element name="AvailableCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="EntitledCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Features" type="{urn:com.flexnet.lfs.webservice}Features" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{urn:com.flexnet.lfs.webservice}EntityState" minOccurs="0"/&gt;
 *         &lt;element name="VirtualClientProhibited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SubstitutionVariablePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentActivationList" type="{urn:com.flexnet.lfs.webservice}ParentActivationListType" minOccurs="0"/&gt;
 *         &lt;element name="LicenseModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemDetails", propOrder = {
    "activationId",
    "owner",
    "availableCount",
    "entitledCount",
    "features",
    "state",
    "virtualClientProhibited",
    "substitutionVariablePattern",
    "parentActivationList",
    "licenseModel"
})
public class LineItemDetails {

    @XmlElement(name = "ActivationId", required = true)
    protected String activationId;
    @XmlElement(name = "Owner")
    protected OwnerData owner;
    @XmlElement(name = "AvailableCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger availableCount;
    @XmlElement(name = "EntitledCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger entitledCount;
    @XmlElement(name = "Features")
    protected Features features;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "string")
    protected EntityState state;
    @XmlElement(name = "VirtualClientProhibited")
    protected Boolean virtualClientProhibited;
    @XmlElement(name = "SubstitutionVariablePattern")
    protected String substitutionVariablePattern;
    @XmlElement(name = "ParentActivationList")
    protected ParentActivationListType parentActivationList;
    @XmlElement(name = "LicenseModel")
    protected String licenseModel;

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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerData }
     *     
     */
    public OwnerData getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerData }
     *     
     */
    public void setOwner(OwnerData value) {
        this.owner = value;
    }

    /**
     * Gets the value of the availableCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableCount() {
        return availableCount;
    }

    /**
     * Sets the value of the availableCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableCount(BigInteger value) {
        this.availableCount = value;
    }

    /**
     * Gets the value of the entitledCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntitledCount() {
        return entitledCount;
    }

    /**
     * Sets the value of the entitledCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntitledCount(BigInteger value) {
        this.entitledCount = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link Features }
     *     
     */
    public Features getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link Features }
     *     
     */
    public void setFeatures(Features value) {
        this.features = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link EntityState }
     *     
     */
    public EntityState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityState }
     *     
     */
    public void setState(EntityState value) {
        this.state = value;
    }

    /**
     * Gets the value of the virtualClientProhibited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualClientProhibited() {
        return virtualClientProhibited;
    }

    /**
     * Sets the value of the virtualClientProhibited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualClientProhibited(Boolean value) {
        this.virtualClientProhibited = value;
    }

    /**
     * Gets the value of the substitutionVariablePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstitutionVariablePattern() {
        return substitutionVariablePattern;
    }

    /**
     * Sets the value of the substitutionVariablePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstitutionVariablePattern(String value) {
        this.substitutionVariablePattern = value;
    }

    /**
     * Gets the value of the parentActivationList property.
     * 
     * @return
     *     possible object is
     *     {@link ParentActivationListType }
     *     
     */
    public ParentActivationListType getParentActivationList() {
        return parentActivationList;
    }

    /**
     * Sets the value of the parentActivationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentActivationListType }
     *     
     */
    public void setParentActivationList(ParentActivationListType value) {
        this.parentActivationList = value;
    }

    /**
     * Gets the value of the licenseModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * Sets the value of the licenseModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseModel(String value) {
        this.licenseModel = value;
    }

}
