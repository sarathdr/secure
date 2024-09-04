
package secure.com;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOnData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOnData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRecordInResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="consumedCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="generatedCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="lastRequestedCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="expirationDateOverride" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="permanent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="zeroAllocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:com.flexnet.lfs.webservice}addOnStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOnData", propOrder = {
    "activationId",
    "consumedCount",
    "generatedCount",
    "lastRequestedCount",
    "startDate",
    "expirationDateOverride",
    "expirationDate",
    "permanent",
    "zeroAllocation",
    "status"
})
@XmlSeeAlso({
    AddOnSearchData.class
})
public class AddOnData
    extends BaseRecordInResponse
{

    @XmlElement(required = true)
    protected String activationId;
    @XmlElement(required = true)
    protected BigInteger consumedCount;
    protected BigInteger generatedCount;
    @XmlElement(required = true)
    protected BigInteger lastRequestedCount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDateOverride;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    protected Boolean permanent;
    protected Boolean zeroAllocation;
    @XmlSchemaType(name = "NMTOKEN")
    protected AddOnStatus status;

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
     * Gets the value of the consumedCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsumedCount() {
        return consumedCount;
    }

    /**
     * Sets the value of the consumedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsumedCount(BigInteger value) {
        this.consumedCount = value;
    }

    /**
     * Gets the value of the generatedCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGeneratedCount() {
        return generatedCount;
    }

    /**
     * Sets the value of the generatedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGeneratedCount(BigInteger value) {
        this.generatedCount = value;
    }

    /**
     * Gets the value of the lastRequestedCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastRequestedCount() {
        return lastRequestedCount;
    }

    /**
     * Sets the value of the lastRequestedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastRequestedCount(BigInteger value) {
        this.lastRequestedCount = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the expirationDateOverride property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateOverride() {
        return expirationDateOverride;
    }

    /**
     * Sets the value of the expirationDateOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateOverride(XMLGregorianCalendar value) {
        this.expirationDateOverride = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the permanent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermanent() {
        return permanent;
    }

    /**
     * Sets the value of the permanent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermanent(Boolean value) {
        this.permanent = value;
    }

    /**
     * Gets the value of the zeroAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroAllocation() {
        return zeroAllocation;
    }

    /**
     * Sets the value of the zeroAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroAllocation(Boolean value) {
        this.zeroAllocation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AddOnStatus }
     *     
     */
    public AddOnStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnStatus }
     *     
     */
    public void setStatus(AddOnStatus value) {
        this.status = value;
    }

}
