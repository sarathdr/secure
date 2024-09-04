
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenerateLicenseFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerateLicenseFileResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="licenseInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="licenseInfoBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateLicenseFileResponse", propOrder = {
    "licenseInfo",
    "licenseInfoBinary"
})
public class GenerateLicenseFileResponse
    extends BaseResponse
{

    protected String licenseInfo;
    protected byte[] licenseInfoBinary;

    /**
     * Gets the value of the licenseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseInfo() {
        return licenseInfo;
    }

    /**
     * Sets the value of the licenseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseInfo(String value) {
        this.licenseInfo = value;
    }

    /**
     * Gets the value of the licenseInfoBinary property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLicenseInfoBinary() {
        return licenseInfoBinary;
    }

    /**
     * Sets the value of the licenseInfoBinary property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLicenseInfoBinary(byte[] value) {
        this.licenseInfoBinary = value;
    }

}
