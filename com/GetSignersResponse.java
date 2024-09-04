
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSignersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSignersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availableSigners" type="{urn:com.flexnet.lfs.webservice}availableSigners"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSignersResponse", propOrder = {
    "availableSigners"
})
public class GetSignersResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected AvailableSigners availableSigners;

    /**
     * Gets the value of the availableSigners property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSigners }
     *     
     */
    public AvailableSigners getAvailableSigners() {
        return availableSigners;
    }

    /**
     * Sets the value of the availableSigners property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSigners }
     *     
     */
    public void setAvailableSigners(AvailableSigners value) {
        this.availableSigners = value;
    }

}
