
package secure.com;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cloneSuspect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cloneSuspect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hostClass" type="{urn:com.flexnet.lfs.webservice}hostIdentifierClass" minOccurs="0"/&gt;
 *         &lt;element name="hostAlias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activationIds" type="{urn:com.flexnet.lfs.webservice}addOnInput" maxOccurs="unbounded"/&gt;
 *         &lt;element name="featureIds" type="{urn:com.flexnet.lfs.webservice}featureIds" maxOccurs="unbounded"/&gt;
 *         &lt;element name="acctId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acctName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cloneSuspect", propOrder = {
    "timeStamp",
    "hostClass",
    "hostAlias",
    "deviceId",
    "serverId",
    "activationIds",
    "featureIds",
    "acctId",
    "acctName",
    "enterpriseId"
})
public class CloneSuspect {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlSchemaType(name = "NMTOKEN")
    protected HostIdentifierClass hostClass;
    @XmlElement(required = true)
    protected String hostAlias;
    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    protected String serverId;
    @XmlElement(required = true)
    protected List<AddOnInput> activationIds;
    @XmlElement(required = true)
    protected List<FeatureIds> featureIds;
    @XmlElement(required = true)
    protected String acctId;
    @XmlElement(required = true)
    protected String acctName;
    @XmlElement(required = true)
    protected String enterpriseId;

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
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
     * Gets the value of the hostAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostAlias() {
        return hostAlias;
    }

    /**
     * Sets the value of the hostAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostAlias(String value) {
        this.hostAlias = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the serverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerId(String value) {
        this.serverId = value;
    }

    /**
     * Gets the value of the activationIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the activationIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivationIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddOnInput }
     * 
     * 
     */
    public List<AddOnInput> getActivationIds() {
        if (activationIds == null) {
            activationIds = new ArrayList<AddOnInput>();
        }
        return this.activationIds;
    }

    /**
     * Gets the value of the featureIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the featureIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureIds }
     * 
     * 
     */
    public List<FeatureIds> getFeatureIds() {
        if (featureIds == null) {
            featureIds = new ArrayList<FeatureIds>();
        }
        return this.featureIds;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Sets the value of the acctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * Gets the value of the enterpriseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * Sets the value of the enterpriseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseId(String value) {
        this.enterpriseId = value;
    }

}
