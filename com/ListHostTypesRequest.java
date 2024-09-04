
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListHostTypesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListHostTypesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hostClass" type="{urn:com.flexnet.lfs.webservice}hostIdentifierClass"/&gt;
 *         &lt;element name="isEnterprisePortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListHostTypesRequest", propOrder = {
    "publisherId",
    "hostClass",
    "isEnterprisePortal"
})
public class ListHostTypesRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected HostIdentifierClass hostClass;
    @XmlElement(defaultValue = "false")
    protected Boolean isEnterprisePortal;

    /**
     * Gets the value of the publisherId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherId() {
        return publisherId;
    }

    /**
     * Sets the value of the publisherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherId(String value) {
        this.publisherId = value;
    }

    /**
     * Gets the value of the hostClass property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifierClass }
     *     
     */
    public HostIdentifierClass getHostClass() {
        return hostClass;
    }

    /**
     * Sets the value of the hostClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifierClass }
     *     
     */
    public void setHostClass(HostIdentifierClass value) {
        this.hostClass = value;
    }

    /**
     * Gets the value of the isEnterprisePortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnterprisePortal() {
        return isEnterprisePortal;
    }

    /**
     * Sets the value of the isEnterprisePortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnterprisePortal(Boolean value) {
        this.isEnterprisePortal = value;
    }

}
