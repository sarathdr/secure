
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnDeviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnDeviceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnDeviceIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier"/&gt;
 *         &lt;element name="rma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetDeviceIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnDeviceRequest", propOrder = {
    "publisherId",
    "returnDeviceIdentifier",
    "rma",
    "targetDeviceIdentifier"
})
public class ReturnDeviceRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    protected HostIdentifier returnDeviceIdentifier;
    protected String rma;
    protected HostIdentifier targetDeviceIdentifier;

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
     * Gets the value of the returnDeviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getReturnDeviceIdentifier() {
        return returnDeviceIdentifier;
    }

    /**
     * Sets the value of the returnDeviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setReturnDeviceIdentifier(HostIdentifier value) {
        this.returnDeviceIdentifier = value;
    }

    /**
     * Gets the value of the rma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRma() {
        return rma;
    }

    /**
     * Sets the value of the rma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRma(String value) {
        this.rma = value;
    }

    /**
     * Gets the value of the targetDeviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getTargetDeviceIdentifier() {
        return targetDeviceIdentifier;
    }

    /**
     * Sets the value of the targetDeviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setTargetDeviceIdentifier(HostIdentifier value) {
        this.targetDeviceIdentifier = value;
    }

}
