
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditServerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditServerRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serverLookupParameters" type="{urn:com.flexnet.lfs.webservice}serverLookupParameters"/&gt;
 *         &lt;element name="serverEditParameters" type="{urn:com.flexnet.lfs.webservice}serverEditParameters"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditServerRequest", propOrder = {
    "serverLookupParameters",
    "serverEditParameters"
})
public class EditServerRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected ServerLookupParameters serverLookupParameters;
    @XmlElement(required = true)
    protected ServerEditParameters serverEditParameters;

    /**
     * Gets the value of the serverLookupParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ServerLookupParameters }
     *     
     */
    public ServerLookupParameters getServerLookupParameters() {
        return serverLookupParameters;
    }

    /**
     * Sets the value of the serverLookupParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerLookupParameters }
     *     
     */
    public void setServerLookupParameters(ServerLookupParameters value) {
        this.serverLookupParameters = value;
    }

    /**
     * Gets the value of the serverEditParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ServerEditParameters }
     *     
     */
    public ServerEditParameters getServerEditParameters() {
        return serverEditParameters;
    }

    /**
     * Sets the value of the serverEditParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerEditParameters }
     *     
     */
    public void setServerEditParameters(ServerEditParameters value) {
        this.serverEditParameters = value;
    }

}
