
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchHostHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchHostHistoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceDetails" type="{urn:com.flexnet.lfs.webservice}device" minOccurs="0"/&gt;
 *         &lt;element name="hostHistorySearchResults" type="{urn:com.flexnet.lfs.webservice}hostHistoryRecords" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchHostHistoryResponse", propOrder = {
    "deviceDetails",
    "hostHistorySearchResults"
})
public class SearchHostHistoryResponse
    extends BaseResponse
{

    protected Device deviceDetails;
    protected HostHistoryRecords hostHistorySearchResults;

    /**
     * Gets the value of the deviceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    public Device getDeviceDetails() {
        return deviceDetails;
    }

    /**
     * Sets the value of the deviceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    public void setDeviceDetails(Device value) {
        this.deviceDetails = value;
    }

    /**
     * Gets the value of the hostHistorySearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link HostHistoryRecords }
     *     
     */
    public HostHistoryRecords getHostHistorySearchResults() {
        return hostHistorySearchResults;
    }

    /**
     * Sets the value of the hostHistorySearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostHistoryRecords }
     *     
     */
    public void setHostHistorySearchResults(HostHistoryRecords value) {
        this.hostHistorySearchResults = value;
    }

}
