
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListServerHostTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListServerHostTypesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serverHostTypes" type="{urn:com.flexnet.lfs.webservice}hostTypes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListServerHostTypesResponse", propOrder = {
    "serverHostTypes"
})
public class ListServerHostTypesResponse
    extends BaseResponse
{

    protected HostTypes serverHostTypes;

    /**
     * Gets the value of the serverHostTypes property.
     * 
     * @return
     *     possible object is
     *     {@link HostTypes }
     *     
     */
    public HostTypes getServerHostTypes() {
        return serverHostTypes;
    }

    /**
     * Sets the value of the serverHostTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTypes }
     *     
     */
    public void setServerHostTypes(HostTypes value) {
        this.serverHostTypes = value;
    }

}
