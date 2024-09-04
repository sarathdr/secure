
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceModelEditParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceModelEditParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}hostTypeEditParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="licenseFormat" type="{urn:com.flexnet.lfs.webservice}licenseFormat" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceModelEditParameters", propOrder = {
    "licenseFormat"
})
public class DeviceModelEditParameters
    extends HostTypeEditParameters
{

    @XmlSchemaType(name = "NMTOKEN")
    protected LicenseFormat licenseFormat;

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

}
