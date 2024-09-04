
package secure.com;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for featureData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="featureData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="featureId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="metered" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="serverHostId" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "featureData", propOrder = {
    "featureId",
    "name",
    "count",
    "version",
    "overage",
    "expiration",
    "metered",
    "serverHostId"
})
public class FeatureData {

    @XmlElement(required = true)
    protected String featureId;
    protected String name;
    protected Long count;
    protected String version;
    protected Long overage;
    protected Long expiration;
    @XmlElement(defaultValue = "false")
    protected boolean metered;
    @XmlElementRef(name = "serverHostId", namespace = "urn:com.flexnet.lfs.webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<HostIdentifier> serverHostId;

    /**
     * Gets the value of the featureId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureId() {
        return featureId;
    }

    /**
     * Sets the value of the featureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureId(String value) {
        this.featureId = value;
    }

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
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the overage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverage() {
        return overage;
    }

    /**
     * Sets the value of the overage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverage(Long value) {
        this.overage = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpiration(Long value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the metered property.
     * 
     */
    public boolean isMetered() {
        return metered;
    }

    /**
     * Sets the value of the metered property.
     * 
     */
    public void setMetered(boolean value) {
        this.metered = value;
    }

    /**
     * Gets the value of the serverHostId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HostIdentifier }{@code >}
     *     
     */
    public JAXBElement<HostIdentifier> getServerHostId() {
        return serverHostId;
    }

    /**
     * Sets the value of the serverHostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HostIdentifier }{@code >}
     *     
     */
    public void setServerHostId(JAXBElement<HostIdentifier> value) {
        this.serverHostId = value;
    }

}
