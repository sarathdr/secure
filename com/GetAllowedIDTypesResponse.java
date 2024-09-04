
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllowedIDTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllowedIDTypesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultHostIdType" type="{urn:com.flexnet.lfs.webservice}hostIdentifierType"/&gt;
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
@XmlType(name = "GetAllowedIDTypesResponse", propOrder = {
    "defaultHostIdType",
    "supportedHostIdTypes"
})
public class GetAllowedIDTypesResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected HostIdentifierType defaultHostIdType;
    @XmlElement(required = true)
    protected SupportedHostIdTypes supportedHostIdTypes;

    /**
     * Gets the value of the defaultHostIdType property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifierType }
     *     
     */
    public HostIdentifierType getDefaultHostIdType() {
        return defaultHostIdType;
    }

    /**
     * Sets the value of the defaultHostIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifierType }
     *     
     */
    public void setDefaultHostIdType(HostIdentifierType value) {
        this.defaultHostIdType = value;
    }

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
