
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateHostResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateHostResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="host" type="{urn:com.flexnet.lfs.webservice}hostDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateHostResponse", propOrder = {
    "host"
})
public class CreateHostResponse
    extends BaseResponse
{

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
