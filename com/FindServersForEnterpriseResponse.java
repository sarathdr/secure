
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindServersForEnterpriseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindServersForEnterpriseResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serversFound" type="{urn:com.flexnet.lfs.webservice}serversFound" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindServersForEnterpriseResponse", propOrder = {
    "serversFound"
})
public class FindServersForEnterpriseResponse
    extends BaseResponse
{

    protected ServersFound serversFound;

    /**
     * Gets the value of the serversFound property.
     * 
     * @return
     *     possible object is
     *     {@link ServersFound }
     *     
     */
    public ServersFound getServersFound() {
        return serversFound;
    }

    /**
     * Sets the value of the serversFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServersFound }
     *     
     */
    public void setServersFound(ServersFound value) {
        this.serversFound = value;
    }

}
