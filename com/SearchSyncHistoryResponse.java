
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchSyncHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchSyncHistoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="syncHistorySearchResults" type="{urn:com.flexnet.lfs.webservice}syncHistoryList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSyncHistoryResponse", propOrder = {
    "syncHistorySearchResults"
})
public class SearchSyncHistoryResponse
    extends BaseResponse
{

    protected SyncHistoryList syncHistorySearchResults;

    /**
     * Gets the value of the syncHistorySearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link SyncHistoryList }
     *     
     */
    public SyncHistoryList getSyncHistorySearchResults() {
        return syncHistorySearchResults;
    }

    /**
     * Sets the value of the syncHistorySearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncHistoryList }
     *     
     */
    public void setSyncHistorySearchResults(SyncHistoryList value) {
        this.syncHistorySearchResults = value;
    }

}
