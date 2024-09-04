
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchAddOnsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchAddOnsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addOnSearchResults" type="{urn:com.flexnet.lfs.webservice}addOnSearchResults"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchAddOnsResponse", propOrder = {
    "addOnSearchResults"
})
public class SearchAddOnsResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected AddOnSearchResults addOnSearchResults;

    /**
     * Gets the value of the addOnSearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link AddOnSearchResults }
     *     
     */
    public AddOnSearchResults getAddOnSearchResults() {
        return addOnSearchResults;
    }

    /**
     * Sets the value of the addOnSearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnSearchResults }
     *     
     */
    public void setAddOnSearchResults(AddOnSearchResults value) {
        this.addOnSearchResults = value;
    }

}
