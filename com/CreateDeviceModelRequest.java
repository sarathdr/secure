
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateDeviceModelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDeviceModelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}hostTypeData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="licenseFormat" type="{urn:com.flexnet.lfs.webservice}licenseFormat"/&gt;
 *         &lt;element name="deviceSeriesName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDeviceModelRequest", propOrder = {
    "publisherId",
    "licenseFormat",
    "deviceSeriesName"
})
public class CreateDeviceModelRequest
    extends HostTypeData
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true, defaultValue = "MIXED")
    @XmlSchemaType(name = "NMTOKEN")
    protected LicenseFormat licenseFormat;
    @XmlElement(required = true)
    protected String deviceSeriesName;

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
     * Gets the value of the deviceSeriesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSeriesName() {
        return deviceSeriesName;
    }

    /**
     * Sets the value of the deviceSeriesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSeriesName(String value) {
        this.deviceSeriesName = value;
    }

}
