
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListIdentitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListIdentitiesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherIdentities" type="{urn:com.flexnet.lfs.webservice}publisherIdentityList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListIdentitiesResponse", propOrder = {
    "publisherIdentities"
})
public class ListIdentitiesResponse
    extends BaseResponse
{

    protected PublisherIdentityList publisherIdentities;

    /**
     * Gets the value of the publisherIdentities property.
     * 
     * @return
     *     possible object is
     *     {@link PublisherIdentityList }
     *     
     */
    public PublisherIdentityList getPublisherIdentities() {
        return publisherIdentities;
    }

    /**
     * Sets the value of the publisherIdentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublisherIdentityList }
     *     
     */
    public void setPublisherIdentities(PublisherIdentityList value) {
        this.publisherIdentities = value;
    }

}
