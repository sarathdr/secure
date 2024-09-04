
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPendingFulfillCountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPendingFulfillCountResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pendingCounts" type="{urn:com.flexnet.lfs.webservice}pendingCounts"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPendingFulfillCountResponse", propOrder = {
    "pendingCounts"
})
public class GetPendingFulfillCountResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected PendingCounts pendingCounts;

    /**
     * Gets the value of the pendingCounts property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCounts }
     *     
     */
    public PendingCounts getPendingCounts() {
        return pendingCounts;
    }

    /**
     * Sets the value of the pendingCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCounts }
     *     
     */
    public void setPendingCounts(PendingCounts value) {
        this.pendingCounts = value;
    }

}
