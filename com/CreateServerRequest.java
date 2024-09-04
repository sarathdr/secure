
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateServerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateServerRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}serverAttributes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deployment" type="{urn:com.flexnet.lfs.webservice}deployment"/&gt;
 *         &lt;element name="isDefaultCLS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="identity" type="{urn:com.flexnet.lfs.webservice}identity" minOccurs="0"/&gt;
 *         &lt;element name="backupHostId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serverId" type="{urn:com.flexnet.lfs.webservice}hostIdAndType" minOccurs="0"/&gt;
 *         &lt;element name="serverHostType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="baseProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userInfo" type="{urn:com.flexnet.lfs.webservice}userParameter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateServerRequest", propOrder = {
    "deployment",
    "isDefaultCLS",
    "identity",
    "backupHostId",
    "serverId",
    "serverHostType",
    "siteName",
    "baseProductId",
    "userInfo"
})
public class CreateServerRequest
    extends ServerAttributes
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected Deployment deployment;
    @XmlElement(defaultValue = "false")
    protected Boolean isDefaultCLS;
    protected Identity identity;
    protected String backupHostId;
    protected HostIdAndType serverId;
    protected String serverHostType;
    protected String siteName;
    protected String baseProductId;
    protected UserParameter userInfo;

    /**
     * Gets the value of the deployment property.
     * 
     * @return
     *     possible object is
     *     {@link Deployment }
     *     
     */
    public Deployment getDeployment() {
        return deployment;
    }

    /**
     * Sets the value of the deployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deployment }
     *     
     */
    public void setDeployment(Deployment value) {
        this.deployment = value;
    }

    /**
     * Gets the value of the isDefaultCLS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefaultCLS() {
        return isDefaultCLS;
    }

    /**
     * Sets the value of the isDefaultCLS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefaultCLS(Boolean value) {
        this.isDefaultCLS = value;
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
     * Gets the value of the serverId property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdAndType }
     *     
     */
    public HostIdAndType getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdAndType }
     *     
     */
    public void setServerId(HostIdAndType value) {
        this.serverId = value;
    }

    /**
     * Gets the value of the serverHostType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerHostType() {
        return serverHostType;
    }

    /**
     * Sets the value of the serverHostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerHostType(String value) {
        this.serverHostType = value;
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

}
