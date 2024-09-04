
package secure.com;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostHistoryRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hostHistoryRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRecordInResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hostClass" type="{urn:com.flexnet.lfs.webservice}hostIdentifierClass" minOccurs="0"/&gt;
 *         &lt;element name="eventType" type="{urn:com.flexnet.lfs.webservice}hostHistoryEventType" minOccurs="0"/&gt;
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="eventDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="messageTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="activationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostHistoryRecord", propOrder = {
    "hostClass",
    "eventType",
    "eventTime",
    "eventDetails",
    "message",
    "messageTime",
    "activationId"
})
@XmlSeeAlso({
    RequestHistoryRecord.class
})
public class HostHistoryRecord
    extends BaseRecordInResponse
{

    @XmlSchemaType(name = "NMTOKEN")
    protected HostIdentifierClass hostClass;
    @XmlSchemaType(name = "NMTOKEN")
    protected HostHistoryEventType eventType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected String eventDetails;
    protected String message;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageTime;
    protected String activationId;

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
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link HostHistoryEventType }
     *     
     */
    public HostHistoryEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostHistoryEventType }
     *     
     */
    public void setEventType(HostHistoryEventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the eventDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDetails() {
        return eventDetails;
    }

    /**
     * Sets the value of the eventDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDetails(String value) {
        this.eventDetails = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageTime() {
        return messageTime;
    }

    /**
     * Sets the value of the messageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageTime(XMLGregorianCalendar value) {
        this.messageTime = value;
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

}
