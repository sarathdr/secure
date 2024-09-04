
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindServersForEnterpriseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindServersForEnterpriseRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchParameters" type="{urn:com.flexnet.lfs.webservice}hostSearchParameters"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindServersForEnterpriseRequest", propOrder = {
    "searchParameters"
})
public class FindServersForEnterpriseRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected HostSearchParameters searchParameters;

    /**
     * Gets the value of the searchParameters property.
     * 
     * @return
     *     possible object is
     *     {@link HostSearchParameters }
     *     
     */
    public HostSearchParameters getSearchParameters() {
        return searchParameters;
    }

    /**
     * Sets the value of the searchParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSearchParameters }
     *     
     */
    public void setSearchParameters(HostSearchParameters value) {
        this.searchParameters = value;
    }

}
