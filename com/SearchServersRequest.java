
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchServersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchServersRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchParameters" type="{urn:com.flexnet.lfs.webservice}hostSearchParameters"/&gt;
 *         &lt;element name="enterpriseInfo" type="{urn:com.flexnet.lfs.webservice}enterpriseInfo" minOccurs="0"/&gt;
 *         &lt;element name="addOnDetail" type="{urn:com.flexnet.lfs.webservice}addOnDetail" minOccurs="0"/&gt;
 *         &lt;element name="activationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostStatus" type="{urn:com.flexnet.lfs.webservice}hostStatus" minOccurs="0"/&gt;
 *         &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "SearchServersRequest", propOrder = {
    "searchParameters",
    "enterpriseInfo",
    "addOnDetail",
    "activationCode",
    "hostStatus",
    "cloud",
    "responseConfig"
})
public class SearchServersRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected HostSearchParameters searchParameters;
    protected EnterpriseInfo enterpriseInfo;
    protected AddOnDetail addOnDetail;
    protected String activationCode;
    @XmlSchemaType(name = "NMTOKEN")
    protected HostStatus hostStatus;
    protected Boolean cloud;
    protected DeviceResponseConfig responseConfig;

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
     * Gets the value of the addOnDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AddOnDetail }
     *     
     */
    public AddOnDetail getAddOnDetail() {
        return addOnDetail;
    }

    /**
     * Sets the value of the addOnDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnDetail }
     *     
     */
    public void setAddOnDetail(AddOnDetail value) {
        this.addOnDetail = value;
    }

    /**
     * Gets the value of the activationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * Sets the value of the activationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationCode(String value) {
        this.activationCode = value;
    }

    /**
     * Gets the value of the hostStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HostStatus }
     *     
     */
    public HostStatus getHostStatus() {
        return hostStatus;
    }

    /**
     * Sets the value of the hostStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostStatus }
     *     
     */
    public void setHostStatus(HostStatus value) {
        this.hostStatus = value;
    }

    /**
     * Gets the value of the cloud property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCloud() {
        return cloud;
    }

    /**
     * Sets the value of the cloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCloud(Boolean value) {
        this.cloud = value;
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
