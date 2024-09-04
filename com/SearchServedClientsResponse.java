
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchServedClientsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchServedClientsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servedClientsFound" type="{urn:com.flexnet.lfs.webservice}servedClientsFound" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchServedClientsResponse", propOrder = {
    "servedClientsFound"
})
public class SearchServedClientsResponse
    extends BaseResponse
{

    protected ServedClientsFound servedClientsFound;

    /**
     * Gets the value of the servedClientsFound property.
     * 
     * @return
     *     possible object is
     *     {@link ServedClientsFound }
     *     
     */
    public ServedClientsFound getServedClientsFound() {
        return servedClientsFound;
    }

    /**
     * Sets the value of the servedClientsFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServedClientsFound }
     *     
     */
    public void setServedClientsFound(ServedClientsFound value) {
        this.servedClientsFound = value;
    }

}
