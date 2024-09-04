
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDeviceModelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeviceModelResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceModel" type="{urn:com.flexnet.lfs.webservice}deviceModelData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDeviceModelResponse", propOrder = {
    "deviceModel"
})
public class GetDeviceModelResponse
    extends BaseResponse
{

    protected DeviceModelData deviceModel;

    /**
     * Gets the value of the deviceModel property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceModelData }
     *     
     */
    public DeviceModelData getDeviceModel() {
        return deviceModel;
    }

    /**
     * Sets the value of the deviceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceModelData }
     *     
     */
    public void setDeviceModel(DeviceModelData value) {
        this.deviceModel = value;
    }

}
