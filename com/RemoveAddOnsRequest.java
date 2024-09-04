
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveAddOnsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveAddOnsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}addOnMappingData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isRequestFromEnterprisePortal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="containsDurationBasedAddOns" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveAddOnsRequest", propOrder = {
    "isRequestFromEnterprisePortal",
    "containsDurationBasedAddOns"
})
public class RemoveAddOnsRequest
    extends AddOnMappingData
{

    @XmlElement(defaultValue = "true")
    protected boolean isRequestFromEnterprisePortal;
    @XmlElement(defaultValue = "true")
    protected boolean containsDurationBasedAddOns;

    /**
     * Gets the value of the isRequestFromEnterprisePortal property.
     * 
     */
    public boolean isIsRequestFromEnterprisePortal() {
        return isRequestFromEnterprisePortal;
    }

    /**
     * Sets the value of the isRequestFromEnterprisePortal property.
     * 
     */
    public void setIsRequestFromEnterprisePortal(boolean value) {
        this.isRequestFromEnterprisePortal = value;
    }

    /**
     * Gets the value of the containsDurationBasedAddOns property.
     * 
     */
    public boolean isContainsDurationBasedAddOns() {
        return containsDurationBasedAddOns;
    }

    /**
     * Sets the value of the containsDurationBasedAddOns property.
     * 
     */
    public void setContainsDurationBasedAddOns(boolean value) {
        this.containsDurationBasedAddOns = value;
    }

}
