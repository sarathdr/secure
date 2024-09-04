
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for catalogData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catalogData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="systemCatalogId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="licenseGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogData", propOrder = {
    "systemCatalogId",
    "licenseGenerated"
})
public class CatalogData {

    @XmlElement(required = true)
    protected String systemCatalogId;
    protected boolean licenseGenerated;

    /**
     * Gets the value of the systemCatalogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCatalogId() {
        return systemCatalogId;
    }

    /**
     * Sets the value of the systemCatalogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCatalogId(String value) {
        this.systemCatalogId = value;
    }

    /**
     * Gets the value of the licenseGenerated property.
     * 
     */
    public boolean isLicenseGenerated() {
        return licenseGenerated;
    }

    /**
     * Sets the value of the licenseGenerated property.
     * 
     */
    public void setLicenseGenerated(boolean value) {
        this.licenseGenerated = value;
    }

}
