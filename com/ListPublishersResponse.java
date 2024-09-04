
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListPublishersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListPublishersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publishers" type="{urn:com.flexnet.lfs.webservice}publisherList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListPublishersResponse", propOrder = {
    "publishers"
})
public class ListPublishersResponse
    extends BaseResponse
{

    @XmlElement(required = true, nillable = true)
    protected PublisherList publishers;

    /**
     * Gets the value of the publishers property.
     * 
     * @return
     *     possible object is
     *     {@link PublisherList }
     *     
     */
    public PublisherList getPublishers() {
        return publishers;
    }

    /**
     * Sets the value of the publishers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublisherList }
     *     
     */
    public void setPublishers(PublisherList value) {
        this.publishers = value;
    }

}
