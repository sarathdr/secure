
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDeviceSeriesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeviceSeriesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceSeries" type="{urn:com.flexnet.lfs.webservice}deviceSeriesData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDeviceSeriesResponse", propOrder = {
    "deviceSeries"
})
public class GetDeviceSeriesResponse
    extends BaseResponse
{

    protected DeviceSeriesData deviceSeries;

    /**
     * Gets the value of the deviceSeries property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSeriesData }
     *     
     */
    public DeviceSeriesData getDeviceSeries() {
        return deviceSeries;
    }

    /**
     * Sets the value of the deviceSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSeriesData }
     *     
     */
    public void setDeviceSeries(DeviceSeriesData value) {
        this.deviceSeries = value;
    }

}
