
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveDevicesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveDevicesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultSummary" type="{urn:com.flexnet.lfs.webservice}moveDeviceStatusResults"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveDevicesResponse", propOrder = {
    "resultSummary"
})
public class MoveDevicesResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected MoveDeviceStatusResults resultSummary;

    /**
     * Gets the value of the resultSummary property.
     * 
     * @return
     *     possible object is
     *     {@link MoveDeviceStatusResults }
     *     
     */
    public MoveDeviceStatusResults getResultSummary() {
        return resultSummary;
    }

    /**
     * Sets the value of the resultSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveDeviceStatusResults }
     *     
     */
    public void setResultSummary(MoveDeviceStatusResults value) {
        this.resultSummary = value;
    }

}
