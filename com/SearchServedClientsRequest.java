
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchServedClientsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchServedClientsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchParameters" type="{urn:com.flexnet.lfs.webservice}servedClientsSearchParameters"/&gt;
 *         &lt;element name="enterpriseInfo" type="{urn:com.flexnet.lfs.webservice}enterpriseInfo" minOccurs="0"/&gt;
 *         &lt;element name="responseConfig" type="{urn:com.flexnet.lfs.webservice}deviceResponseConfig" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchServedClientsRequest", propOrder = {
    "searchParameters",
    "enterpriseInfo",
    "responseConfig"
})
public class SearchServedClientsRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected ServedClientsSearchParameters searchParameters;
    protected EnterpriseInfo enterpriseInfo;
    protected DeviceResponseConfig responseConfig;

    /**
     * Gets the value of the searchParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ServedClientsSearchParameters }
     *     
     */
    public ServedClientsSearchParameters getSearchParameters() {
        return searchParameters;
    }

    /**
     * Sets the value of the searchParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServedClientsSearchParameters }
     *     
     */
    public void setSearchParameters(ServedClientsSearchParameters value) {
        this.searchParameters = value;
    }

    /**
     * Gets the value of the enterpriseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseInfo }
     *     
     */
    public EnterpriseInfo getEnterpriseInfo() {
        return enterpriseInfo;
    }

    /**
     * Sets the value of the enterpriseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseInfo }
     *     
     */
    public void setEnterpriseInfo(EnterpriseInfo value) {
        this.enterpriseInfo = value;
    }

    /**
     * Gets the value of the responseConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceResponseConfig }
     *     
     */
    public DeviceResponseConfig getResponseConfig() {
        return responseConfig;
    }

    /**
     * Sets the value of the responseConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceResponseConfig }
     *     
     */
    public void setResponseConfig(DeviceResponseConfig value) {
        this.responseConfig = value;
    }

}
