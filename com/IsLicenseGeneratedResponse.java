
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsLicenseGeneratedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsLicenseGeneratedResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item" type="{urn:com.flexnet.lfs.webservice}catalogData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsLicenseGeneratedResponse", propOrder = {
    "item"
})
public class IsLicenseGeneratedResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected CatalogData item;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogData }
     *     
     */
    public CatalogData getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogData }
     *     
     */
    public void setItem(CatalogData value) {
        this.item = value;
    }

}
