
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateHostRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateHostRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hostClass" type="{urn:com.flexnet.lfs.webservice}hostIdentifierClass"/&gt;
 *         &lt;element name="identity" type="{urn:com.flexnet.lfs.webservice}identity" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userInfo" type="{urn:com.flexnet.lfs.webservice}userParameter" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="baseProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostId" type="{urn:com.flexnet.lfs.webservice}hostIdAndType" minOccurs="0"/&gt;
 *         &lt;element name="backupHostId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serverDeployment" type="{urn:com.flexnet.lfs.webservice}deployment" minOccurs="0"/&gt;
 *         &lt;element name="isDefaultHostedServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateHostRequest", propOrder = {
    "publisherId",
    "hostClass",
    "identity",
    "enterpriseId",
    "userInfo",
    "name",
    "description",
    "siteName",
    "baseProductId",
    "hostType",
    "hostId",
    "backupHostId",
    "serverDeployment",
    "isDefaultHostedServer"
})
public class CreateHostRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected HostIdentifierClass hostClass;
    protected Identity identity;
    protected String enterpriseId;
    protected UserParameter userInfo;
    protected String name;
    protected String description;
    protected String siteName;
    protected String baseProductId;
    protected String hostType;
    protected HostIdAndType hostId;
    protected String backupHostId;
    @XmlSchemaType(name = "NMTOKEN")
    protected Deployment serverDeployment;
    @XmlElement(defaultValue = "false")
    protected Boolean isDefaultHostedServer;

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
     * Gets the value of the hostClass property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifierClass }
     *     
     */
    public HostIdentifierClass getHostClass() {
        return hostClass;
    }

    /**
     * Sets the value of the hostClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifierClass }
     *     
     */
    public void setHostClass(HostIdentifierClass value) {
        this.hostClass = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link Identity }
     *     
     */
    public Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identity }
     *     
     */
    public void setIdentity(Identity value) {
        this.identity = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the baseProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseProductId() {
        return baseProductId;
    }

    /**
     * Sets the value of the baseProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseProductId(String value) {
        this.baseProductId = value;
    }

    /**
     * Gets the value of the hostType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Sets the value of the hostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostType(String value) {
        this.hostType = value;
    }

    /**
     * Gets the value of the hostId property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdAndType }
     *     
     */
    public HostIdAndType getHostId() {
        return hostId;
    }

    /**
     * Sets the value of the hostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdAndType }
     *     
     */
    public void setHostId(HostIdAndType value) {
        this.hostId = value;
    }

    /**
     * Gets the value of the backupHostId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupHostId() {
        return backupHostId;
    }

    /**
     * Sets the value of the backupHostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupHostId(String value) {
        this.backupHostId = value;
    }

    /**
     * Gets the value of the serverDeployment property.
     * 
     * @return
     *     possible object is
     *     {@link Deployment }
     *     
     */
    public Deployment getServerDeployment() {
        return serverDeployment;
    }

    /**
     * Sets the value of the serverDeployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deployment }
     *     
     */
    public void setServerDeployment(Deployment value) {
        this.serverDeployment = value;
    }

    /**
     * Gets the value of the isDefaultHostedServer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefaultHostedServer() {
        return isDefaultHostedServer;
    }

    /**
     * Sets the value of the isDefaultHostedServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefaultHostedServer(Boolean value) {
        this.isDefaultHostedServer = value;
    }

}
