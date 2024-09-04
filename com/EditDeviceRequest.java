
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditDeviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditDeviceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceLookupParameters" type="{urn:com.flexnet.lfs.webservice}deviceLookupParameters"/&gt;
 *         &lt;element name="deviceEditParameters" type="{urn:com.flexnet.lfs.webservice}deviceEditParameters"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditDeviceRequest", propOrder = {
    "deviceLookupParameters",
    "deviceEditParameters"
})
public class EditDeviceRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected DeviceLookupParameters deviceLookupParameters;
    @XmlElement(required = true)
    protected DeviceEditParameters deviceEditParameters;

    /**
     * Gets the value of the deviceLookupParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceLookupParameters }
     *     
     */
    public DeviceLookupParameters getDeviceLookupParameters() {
        return deviceLookupParameters;
    }

    /**
     * Sets the value of the deviceLookupParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceLookupParameters }
     *     
     */
    public void setDeviceLookupParameters(DeviceLookupParameters value) {
        this.deviceLookupParameters = value;
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
