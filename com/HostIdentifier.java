
package secure.com;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hostIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uniqueId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idType" type="{urn:com.flexnet.lfs.webservice}hostIdentifierType"/&gt;
 *         &lt;element name="publisherName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hostClass" type="{urn:com.flexnet.lfs.webservice}hostIdentifierClass"/&gt;
 *         &lt;element name="lastSyncTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isCloud" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostIdentifier", propOrder = {
    "uniqueId",
    "id",
    "idType",
    "publisherName",
    "hostClass",
    "lastSyncTime",
    "isCloud"
})
public class HostIdentifier {

    protected long uniqueId;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true, defaultValue = "STRING")
    @XmlSchemaType(name = "NMTOKEN")
    protected HostIdentifierType idType;
    @XmlElement(required = true)
    protected String publisherName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected HostIdentifierClass hostClass;
    @XmlElementRef(name = "lastSyncTime", namespace = "urn:com.flexnet.lfs.webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastSyncTime;
    @XmlElementRef(name = "isCloud", namespace = "urn:com.flexnet.lfs.webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCloud;

    /**
     * Gets the value of the uniqueId property.
     * 
     */
    public long getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     */
    public void setUniqueId(long value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifierType }
     *     
     */
    public HostIdentifierType getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifierType }
     *     
     */
    public void setIdType(HostIdentifierType value) {
        this.idType = value;
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
     * Gets the value of the hostClass property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifierClass }
     *     
     */
    public HostIdentifierClass getHostClass() {
        return hostClass;
    }

    /**
     * Sets the value of the hostClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifierClass }
     *     
     */
    public void setHostClass(HostIdentifierClass value) {
        this.hostClass = value;
    }

    /**
     * Gets the value of the lastSyncTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     * Sets the value of the lastSyncTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastSyncTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastSyncTime = value;
    }

    /**
     * Gets the value of the isCloud property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCloud() {
        return isCloud;
    }

    /**
     * Sets the value of the isCloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCloud(JAXBElement<Boolean> value) {
        this.isCloud = value;
    }

}
