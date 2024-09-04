
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPendingFulfillCountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPendingFulfillCountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activationIds" type="{urn:com.flexnet.lfs.webservice}activationIds"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPendingFulfillCountRequest", propOrder = {
    "publisherId",
    "activationIds"
})
public class GetPendingFulfillCountRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    protected ActivationIds activationIds;

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
     * Gets the value of the activationIds property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationIds }
     *     
     */
    public ActivationIds getActivationIds() {
        return activationIds;
    }

    /**
     * Sets the value of the activationIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationIds }
     *     
     */
    public void setActivationIds(ActivationIds value) {
        this.activationIds = value;
    }

}
