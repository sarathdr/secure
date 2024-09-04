
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveDevicesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveDevicesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetEnterpriseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oldToNewAddOnMap" type="{urn:com.flexnet.lfs.webservice}oldToNewAddOnMap"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveDevicesRequest", propOrder = {
    "publisherId",
    "targetEnterpriseId",
    "oldToNewAddOnMap"
})
public class MoveDevicesRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    protected String targetEnterpriseId;
    @XmlElement(required = true)
    protected OldToNewAddOnMap oldToNewAddOnMap;

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
     * Gets the value of the targetEnterpriseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEnterpriseId() {
        return targetEnterpriseId;
    }

    /**
     * Sets the value of the targetEnterpriseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEnterpriseId(String value) {
        this.targetEnterpriseId = value;
    }

    /**
     * Gets the value of the oldToNewAddOnMap property.
     * 
     * @return
     *     possible object is
     *     {@link OldToNewAddOnMap }
     *     
     */
    public OldToNewAddOnMap getOldToNewAddOnMap() {
        return oldToNewAddOnMap;
    }

    /**
     * Sets the value of the oldToNewAddOnMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldToNewAddOnMap }
     *     
     */
    public void setOldToNewAddOnMap(OldToNewAddOnMap value) {
        this.oldToNewAddOnMap = value;
    }

}
