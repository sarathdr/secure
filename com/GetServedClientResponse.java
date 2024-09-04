
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetServedClientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServedClientResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servedClient" type="{urn:com.flexnet.lfs.webservice}servedClientHostData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServedClientResponse", propOrder = {
    "servedClient"
})
public class GetServedClientResponse
    extends BaseResponse
{

    protected ServedClientHostData servedClient;

    /**
     * Gets the value of the servedClient property.
     * 
     * @return
     *     possible object is
     *     {@link ServedClientHostData }
     *     
     */
    public ServedClientHostData getServedClient() {
        return servedClient;
    }

    /**
     * Sets the value of the servedClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServedClientHostData }
     *     
     */
    public void setServedClient(ServedClientHostData value) {
        this.servedClient = value;
    }

}
