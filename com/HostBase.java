
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hostBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRecordInResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signatureName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier"/&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseInfo" type="{urn:com.flexnet.lfs.webservice}enterpriseData" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:com.flexnet.lfs.webservice}hostStatus" minOccurs="0"/&gt;
 *         &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="serverHostId" type="{urn:com.flexnet.lfs.webservice}hostIdentifier"/&gt;
 *         &lt;element name="parentServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userInfo" type="{urn:com.flexnet.lfs.webservice}userParameter" minOccurs="0"/&gt;
 *         &lt;element name="hasLicenses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="serverHostIds" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostBase", propOrder = {
    "signatureName",
    "deviceIdentifier",
    "alias",
    "enterpriseId",
    "enterpriseInfo",
    "status",
    "cloud",
    "serverHostId",
    "parentServerName",
    "userInfo",
    "hasLicenses",
    "serverHostIds"
})
public class HostBase
    extends BaseRecordInResponse
{

    @XmlElement(required = true)
    protected String signatureName;
    @XmlElement(required = true)
    protected HostIdentifier deviceIdentifier;
    protected String alias;
    protected String enterpriseId;
    protected EnterpriseData enterpriseInfo;
    @XmlSchemaType(name = "NMTOKEN")
    protected HostStatus status;
    @XmlElement(defaultValue = "false")
    protected boolean cloud;
    @XmlElement(required = true)
    protected HostIdentifier serverHostId;
    protected String parentServerName;
    protected UserParameter userInfo;
    protected Boolean hasLicenses;
    @XmlElement(nillable = true)
    protected List<HostIdentifier> serverHostIds;

    /**
     * Gets the value of the signatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * Sets the value of the signatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureName(String value) {
        this.signatureName = value;
    }

    /**
     * Gets the value of the deviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }

    /**
     * Sets the value of the deviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setDeviceIdentifier(HostIdentifier value) {
        this.deviceIdentifier = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the enterpriseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * Sets the value of the enterpriseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseId(String value) {
        this.enterpriseId = value;
    }

    /**
     * Gets the value of the enterpriseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseData }
     *     
     */
    public EnterpriseData getEnterpriseInfo() {
        return enterpriseInfo;
    }

    /**
     * Sets the value of the enterpriseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseData }
     *     
     */
    public void setEnterpriseInfo(EnterpriseData value) {
        this.enterpriseInfo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link HostStatus }
     *     
     */
    public HostStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostStatus }
     *     
     */
    public void setStatus(HostStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the cloud property.
     * 
     */
    public boolean isCloud() {
        return cloud;
    }

    /**
     * Sets the value of the cloud property.
     * 
     */
    public void setCloud(boolean value) {
        this.cloud = value;
    }

    /**
     * Gets the value of the serverHostId property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getServerHostId() {
        return serverHostId;
    }

    /**
     * Sets the value of the serverHostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setServerHostId(HostIdentifier value) {
        this.serverHostId = value;
    }

    /**
     * Gets the value of the parentServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentServerName() {
        return parentServerName;
    }

    /**
     * Sets the value of the parentServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentServerName(String value) {
        this.parentServerName = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserParameter }
     *     
     */
    public UserParameter getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserParameter }
     *     
     */
    public void setUserInfo(UserParameter value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the hasLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLicenses() {
        return hasLicenses;
    }

    /**
     * Sets the value of the hasLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLicenses(Boolean value) {
        this.hasLicenses = value;
    }

    /**
     * Gets the value of the serverHostIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serverHostIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerHostIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostIdentifier }
     * 
     * 
     */
    public List<HostIdentifier> getServerHostIds() {
        if (serverHostIds == null) {
            serverHostIds = new ArrayList<HostIdentifier>();
        }
        return this.serverHostIds;
    }

}
