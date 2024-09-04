
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListHostTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListHostTypesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultHostType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="supportedHostTypes" type="{urn:com.flexnet.lfs.webservice}hostTypeList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListHostTypesResponse", propOrder = {
    "defaultHostType",
    "supportedHostTypes"
})
public class ListHostTypesResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected String defaultHostType;
    @XmlElement(required = true)
    protected HostTypeList supportedHostTypes;

    /**
     * Gets the value of the defaultHostType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultHostType() {
        return defaultHostType;
    }

    /**
     * Sets the value of the defaultHostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultHostType(String value) {
        this.defaultHostType = value;
    }

    /**
     * Gets the value of the supportedHostTypes property.
     * 
     * @return
     *     possible object is
     *     {@link HostTypeList }
     *     
     */
    public HostTypeList getSupportedHostTypes() {
        return supportedHostTypes;
    }

    /**
     * Sets the value of the supportedHostTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTypeList }
     *     
     */
    public void setSupportedHostTypes(HostTypeList value) {
        this.supportedHostTypes = value;
    }

}
