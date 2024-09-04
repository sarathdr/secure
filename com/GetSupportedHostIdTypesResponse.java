
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSupportedHostIdTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSupportedHostIdTypesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supportedHostIdTypes" type="{urn:com.flexnet.lfs.webservice}supportedHostIdTypes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupportedHostIdTypesResponse", propOrder = {
    "supportedHostIdTypes"
})
public class GetSupportedHostIdTypesResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected SupportedHostIdTypes supportedHostIdTypes;

    /**
     * Gets the value of the supportedHostIdTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedHostIdTypes }
     *     
     */
    public SupportedHostIdTypes getSupportedHostIdTypes() {
        return supportedHostIdTypes;
    }

    /**
     * Sets the value of the supportedHostIdTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedHostIdTypes }
     *     
     */
    public void setSupportedHostIdTypes(SupportedHostIdTypes value) {
        this.supportedHostIdTypes = value;
    }

}
