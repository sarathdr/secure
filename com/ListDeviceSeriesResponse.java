
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDeviceSeriesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListDeviceSeriesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceSeriesList" type="{urn:com.flexnet.lfs.webservice}deviceSeriesList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListDeviceSeriesResponse", propOrder = {
    "deviceSeriesList"
})
public class ListDeviceSeriesResponse
    extends BaseResponse
{

    protected DeviceSeriesList deviceSeriesList;

    /**
     * Gets the value of the deviceSeriesList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSeriesList }
     *     
     */
    public DeviceSeriesList getDeviceSeriesList() {
        return deviceSeriesList;
    }

    /**
     * Sets the value of the deviceSeriesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSeriesList }
     *     
     */
    public void setDeviceSeriesList(DeviceSeriesList value) {
        this.deviceSeriesList = value;
    }

}
