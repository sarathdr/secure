
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverLookupParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverLookupParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serverIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverLookupParameters", propOrder = {
    "publisherId",
    "serverIdentifier"
})
public class ServerLookupParameters {

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    protected HostIdentifier serverIdentifier;

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
     * Gets the value of the serverIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getServerIdentifier() {
        return serverIdentifier;
    }

    /**
     * Sets the value of the serverIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setServerIdentifier(HostIdentifier value) {
        this.serverIdentifier = value;
    }

}
