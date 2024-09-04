
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceModelData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceModelData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}hostTypeData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="licenseFormat" type="{urn:com.flexnet.lfs.webservice}licenseFormat" minOccurs="0"/&gt;
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
@XmlType(name = "deviceModelData", propOrder = {
    "licenseFormat",
    "deviceSeries"
})
public class DeviceModelData
    extends HostTypeData
{

    @XmlSchemaType(name = "NMTOKEN")
    protected LicenseFormat licenseFormat;
    protected DeviceSeriesData deviceSeries;

    /**
     * Gets the value of the licenseFormat property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseFormat }
     *     
     */
    public LicenseFormat getLicenseFormat() {
        return licenseFormat;
    }

    /**
     * Sets the value of the licenseFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseFormat }
     *     
     */
    public void setLicenseFormat(LicenseFormat value) {
        this.licenseFormat = value;
    }

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
