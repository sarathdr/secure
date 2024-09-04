
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRequestHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRequestHistoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestHistorySearchResults" type="{urn:com.flexnet.lfs.webservice}requestHistoryRecords" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequestHistoryResponse", propOrder = {
    "requestHistorySearchResults"
})
public class SearchRequestHistoryResponse
    extends BaseResponse
{

    protected RequestHistoryRecords requestHistorySearchResults;

    /**
     * Gets the value of the requestHistorySearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHistoryRecords }
     *     
     */
    public RequestHistoryRecords getRequestHistorySearchResults() {
        return requestHistorySearchResults;
    }

    /**
     * Sets the value of the requestHistorySearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHistoryRecords }
     *     
     */
    public void setRequestHistorySearchResults(RequestHistoryRecords value) {
        this.requestHistorySearchResults = value;
    }

}
