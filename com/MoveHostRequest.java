
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moveHostRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moveHostRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hostIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier"/&gt;
 *         &lt;element name="targetEnterprise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addOnList" type="{urn:com.flexnet.lfs.webservice}addOnInputList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveHostRequest", propOrder = {
    "publisherId",
    "hostIdentifier",
    "targetEnterprise",
    "addOnList"
})
@XmlSeeAlso({
    MoveDeviceRequest.class,
    MoveServerRequest.class
})
public class MoveHostRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    protected HostIdentifier hostIdentifier;
    @XmlElement(required = true)
    protected String targetEnterprise;
    protected AddOnInputList addOnList;

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
     * Gets the value of the hostIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getHostIdentifier() {
        return hostIdentifier;
    }

    /**
     * Sets the value of the hostIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setHostIdentifier(HostIdentifier value) {
        this.hostIdentifier = value;
    }

    /**
     * Gets the value of the targetEnterprise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEnterprise() {
        return targetEnterprise;
    }

    /**
     * Sets the value of the targetEnterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEnterprise(String value) {
        this.targetEnterprise = value;
    }

    /**
     * Gets the value of the addOnList property.
     * 
     * @return
     *     possible object is
     *     {@link AddOnInputList }
     *     
     */
    public AddOnInputList getAddOnList() {
        return addOnList;
    }

    /**
     * Sets the value of the addOnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnInputList }
     *     
     */
    public void setAddOnList(AddOnInputList value) {
        this.addOnList = value;
    }

}
