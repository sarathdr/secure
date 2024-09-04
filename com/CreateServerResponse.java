
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateServerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateServerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serverHost" type="{urn:com.flexnet.lfs.webservice}hostData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateServerResponse", propOrder = {
    "serverHost"
})
public class CreateServerResponse
    extends BaseResponse
{

    protected HostData serverHost;

    /**
     * Gets the value of the serverHost property.
     * 
     * @return
     *     possible object is
     *     {@link HostData }
     *     
     */
    public HostData getServerHost() {
        return serverHost;
    }

    /**
     * Sets the value of the serverHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostData }
     *     
     */
    public void setServerHost(HostData value) {
        this.serverHost = value;
    }

}
