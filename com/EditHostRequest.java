
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditHostRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditHostRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hostLookupParameters" type="{urn:com.flexnet.lfs.webservice}hostLookupInput"/&gt;
 *         &lt;element name="hostEditParameters" type="{urn:com.flexnet.lfs.webservice}hostEditInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditHostRequest", propOrder = {
    "hostLookupParameters",
    "hostEditParameters"
})
public class EditHostRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected HostLookupInput hostLookupParameters;
    @XmlElement(required = true)
    protected HostEditInput hostEditParameters;

    /**
     * Gets the value of the hostLookupParameters property.
     * 
     * @return
     *     possible object is
     *     {@link HostLookupInput }
     *     
     */
    public HostLookupInput getHostLookupParameters() {
        return hostLookupParameters;
    }

    /**
     * Sets the value of the hostLookupParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostLookupInput }
     *     
     */
    public void setHostLookupParameters(HostLookupInput value) {
        this.hostLookupParameters = value;
    }

    /**
     * Gets the value of the hostEditParameters property.
     * 
     * @return
     *     possible object is
     *     {@link HostEditInput }
     *     
     */
    public HostEditInput getHostEditParameters() {
        return hostEditParameters;
    }

    /**
     * Sets the value of the hostEditParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEditInput }
     *     
     */
    public void setHostEditParameters(HostEditInput value) {
        this.hostEditParameters = value;
    }

}
