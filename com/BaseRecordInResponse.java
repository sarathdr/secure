
package secure.com;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseRecordInResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseRecordInResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdSource" type="{urn:com.flexnet.lfs.webservice}updateSource" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedSource" type="{urn:com.flexnet.lfs.webservice}updateSource" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseRecordInResponse", propOrder = {
    "createdBy",
    "lastModifiedBy",
    "createdSource",
    "lastModifiedSource",
    "createdDate",
    "lastModifiedDate"
})
@XmlSeeAlso({
    AddOnData.class,
    HostDetail.class,
    HostData.class,
    HostBase.class,
    HostHistoryRecord.class,
    Device.class
})
public class BaseRecordInResponse {

    @XmlElement(defaultValue = "lisa")
    protected String createdBy;
    @XmlElement(defaultValue = "lisa")
    protected String lastModifiedBy;
    @XmlSchemaType(name = "NMTOKEN")
    protected UpdateSource createdSource;
    @XmlSchemaType(name = "NMTOKEN")
    protected UpdateSource lastModifiedSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedBy(String value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the createdSource property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSource }
     *     
     */
    public UpdateSource getCreatedSource() {
        return createdSource;
    }

    /**
     * Sets the value of the createdSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSource }
     *     
     */
    public void setCreatedSource(UpdateSource value) {
        this.createdSource = value;
    }

    /**
     * Gets the value of the lastModifiedSource property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSource }
     *     
     */
    public UpdateSource getLastModifiedSource() {
        return lastModifiedSource;
    }

    /**
     * Sets the value of the lastModifiedSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSource }
     *     
     */
    public void setLastModifiedSource(UpdateSource value) {
        this.lastModifiedSource = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

}
