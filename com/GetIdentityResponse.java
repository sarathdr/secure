
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIdentityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIdentityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherIdentity" type="{urn:com.flexnet.lfs.webservice}publisherIdentity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIdentityResponse", propOrder = {
    "publisherIdentity"
})
public class GetIdentityResponse
    extends BaseResponse
{

    protected PublisherIdentity publisherIdentity;

    /**
     * Gets the value of the publisherIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link PublisherIdentity }
     *     
     */
    public PublisherIdentity getPublisherIdentity() {
        return publisherIdentity;
    }

    /**
     * Sets the value of the publisherIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublisherIdentity }
     *     
     */
    public void setPublisherIdentity(PublisherIdentity value) {
        this.publisherIdentity = value;
    }

}
