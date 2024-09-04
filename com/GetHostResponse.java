
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHostResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHostResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="host" type="{urn:com.flexnet.lfs.webservice}hostDetail"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHostResponse", propOrder = {
    "host"
})
public class GetHostResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected HostDetail host;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link HostDetail }
     *     
     */
    public HostDetail getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDetail }
     *     
     */
    public void setHost(HostDetail value) {
        this.host = value;
    }

}
