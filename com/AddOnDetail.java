
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOnDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOnDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entitlementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="catalogItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="catalogItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="catalogItemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOnDetail", propOrder = {
    "entitlementId",
    "catalogItemId",
    "catalogItemName",
    "catalogItemVersion"
})
public class AddOnDetail {

    protected String entitlementId;
    protected String catalogItemId;
    protected String catalogItemName;
    protected String catalogItemVersion;

    /**
     * Gets the value of the entitlementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementId() {
        return entitlementId;
    }

    /**
     * Sets the value of the entitlementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementId(String value) {
        this.entitlementId = value;
    }

    /**
     * Gets the value of the catalogItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogItemId() {
        return catalogItemId;
    }

    /**
     * Sets the value of the catalogItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogItemId(String value) {
        this.catalogItemId = value;
    }

    /**
     * Gets the value of the catalogItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogItemName() {
        return catalogItemName;
    }

    /**
     * Sets the value of the catalogItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogItemName(String value) {
        this.catalogItemName = value;
    }

    /**
     * Gets the value of the catalogItemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogItemVersion() {
        return catalogItemVersion;
    }

    /**
     * Sets the value of the catalogItemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogItemVersion(String value) {
        this.catalogItemVersion = value;
    }

}
