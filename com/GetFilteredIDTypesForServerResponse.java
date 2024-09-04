
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFilteredIDTypesForServerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFilteredIDTypesForServerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filteredHostIdTypes" type="{urn:com.flexnet.lfs.webservice}supportedHostIdTypes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFilteredIDTypesForServerResponse", propOrder = {
    "filteredHostIdTypes"
})
public class GetFilteredIDTypesForServerResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected SupportedHostIdTypes filteredHostIdTypes;

    /**
     * Gets the value of the filteredHostIdTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedHostIdTypes }
     *     
     */
    public SupportedHostIdTypes getFilteredHostIdTypes() {
        return filteredHostIdTypes;
    }

    /**
     * Sets the value of the filteredHostIdTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedHostIdTypes }
     *     
     */
    public void setFilteredHostIdTypes(SupportedHostIdTypes value) {
        this.filteredHostIdTypes = value;
    }

}
