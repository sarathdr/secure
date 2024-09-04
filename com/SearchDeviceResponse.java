
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchDeviceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchDeviceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchResults" type="{urn:com.flexnet.lfs.webservice}deviceSearchResults"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDeviceResponse", propOrder = {
    "searchResults"
})
public class SearchDeviceResponse
    extends BaseResponse
{

    @XmlElement(required = true, nillable = true)
    protected DeviceSearchResults searchResults;

    /**
     * Gets the value of the searchResults property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSearchResults }
     *     
     */
    public DeviceSearchResults getSearchResults() {
        return searchResults;
    }

    /**
     * Sets the value of the searchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSearchResults }
     *     
     */
    public void setSearchResults(DeviceSearchResults value) {
        this.searchResults = value;
    }

}
