
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimDeviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimDeviceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceModelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier"/&gt;
 *         &lt;element name="deviceEditParameters" type="{urn:com.flexnet.lfs.webservice}deviceEditParameters" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimDeviceRequest", propOrder = {
    "publisherId",
    "enterpriseId",
    "deviceModelName",
    "deviceIdentifier",
    "deviceEditParameters"
})
public class ClaimDeviceRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    protected String enterpriseId;
    @XmlElement(required = true)
    protected String deviceModelName;
    @XmlElement(required = true)
    protected HostIdentifier deviceIdentifier;
    protected DeviceEditParameters deviceEditParameters;

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

    /**
     * Gets the value of the deviceModelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModelName() {
        return deviceModelName;
    }

    /**
     * Sets the value of the deviceModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModelName(String value) {
        this.deviceModelName = value;
    }

    /**
     * Gets the value of the deviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }

    /**
     * Sets the value of the deviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setDeviceIdentifier(HostIdentifier value) {
        this.deviceIdentifier = value;
    }

    /**
     * Gets the value of the deviceEditParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceEditParameters }
     *     
     */
    public DeviceEditParameters getDeviceEditParameters() {
        return deviceEditParameters;
    }

    /**
     * Sets the value of the deviceEditParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceEditParameters }
     *     
     */
    public void setDeviceEditParameters(DeviceEditParameters value) {
        this.deviceEditParameters = value;
    }

}
