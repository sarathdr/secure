
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHostsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHostsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enterpriseIds" type="{urn:com.flexnet.lfs.webservice}enterpriseIdList" minOccurs="0"/&gt;
 *         &lt;element name="hostIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" maxOccurs="unbounded"/&gt;
 *         &lt;element name="uniqueId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHostsRequest", propOrder = {
    "publisherId",
    "enterpriseIds",
    "hostIdentifier",
    "uniqueId"
})
public class GetHostsRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    protected EnterpriseIdList enterpriseIds;
    @XmlElement(required = true)
    protected List<HostIdentifier> hostIdentifier;
    @XmlElement(type = Long.class)
    protected List<Long> uniqueId;

    /**
     * Gets the value of the publisherId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherId() {
        return publisherId;
    }

    /**
     * Sets the value of the publisherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherId(String value) {
        this.publisherId = value;
    }

    /**
     * Gets the value of the enterpriseIds property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseIdList }
     *     
     */
    public EnterpriseIdList getEnterpriseIds() {
        return enterpriseIds;
    }

    /**
     * Sets the value of the enterpriseIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseIdList }
     *     
     */
    public void setEnterpriseIds(EnterpriseIdList value) {
        this.enterpriseIds = value;
    }

    /**
     * Gets the value of the hostIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hostIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostIdentifier }
     * 
     * 
     */
    public List<HostIdentifier> getHostIdentifier() {
        if (hostIdentifier == null) {
            hostIdentifier = new ArrayList<HostIdentifier>();
        }
        return this.hostIdentifier;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getUniqueId() {
        if (uniqueId == null) {
            uniqueId = new ArrayList<Long>();
        }
        return this.uniqueId;
    }

}
