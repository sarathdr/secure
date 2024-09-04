
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetServerHostTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServerHostTypeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serverHostType" type="{urn:com.flexnet.lfs.webservice}hostTypeData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServerHostTypeResponse", propOrder = {
    "serverHostType"
})
public class GetServerHostTypeResponse
    extends BaseResponse
{

    protected HostTypeData serverHostType;

    /**
     * Gets the value of the serverHostType property.
     * 
     * @return
     *     possible object is
     *     {@link HostTypeData }
     *     
     */
    public HostTypeData getServerHostType() {
        return serverHostType;
    }

    /**
     * Sets the value of the serverHostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTypeData }
     *     
     */
    public void setServerHostType(HostTypeData value) {
        this.serverHostType = value;
    }

}
