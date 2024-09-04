
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDeviceModelsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListDeviceModelsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceModels" type="{urn:com.flexnet.lfs.webservice}deviceModelList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListDeviceModelsResponse", propOrder = {
    "deviceModels"
})
public class ListDeviceModelsResponse
    extends BaseResponse
{

    protected DeviceModelList deviceModels;

    /**
     * Gets the value of the deviceModels property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceModelList }
     *     
     */
    public DeviceModelList getDeviceModels() {
        return deviceModels;
    }

    /**
     * Sets the value of the deviceModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceModelList }
     *     
     */
    public void setDeviceModels(DeviceModelList value) {
        this.deviceModels = value;
    }

}
