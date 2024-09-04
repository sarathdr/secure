
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isBaseProductUsedInLimitedSeriesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isBaseProductUsedInLimitedSeriesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="baseProductIdList" type="{urn:com.flexnet.lfs.webservice}baseProductIdList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isBaseProductUsedInLimitedSeriesRequest", propOrder = {
    "publisherId",
    "baseProductIdList"
})
public class IsBaseProductUsedInLimitedSeriesRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    protected BaseProductIdList baseProductIdList;

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
     * Gets the value of the baseProductIdList property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductIdList }
     *     
     */
    public BaseProductIdList getBaseProductIdList() {
        return baseProductIdList;
    }

    /**
     * Sets the value of the baseProductIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductIdList }
     *     
     */
    public void setBaseProductIdList(BaseProductIdList value) {
        this.baseProductIdList = value;
    }

}
