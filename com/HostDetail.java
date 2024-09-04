
package secure.com;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hostDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRecordInResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hostIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signatureName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="backupHostId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastSyncTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastRequestTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hostStatus" type="{urn:com.flexnet.lfs.webservice}hostStatus"/&gt;
 *         &lt;element name="servedStatus" type="{urn:com.flexnet.lfs.webservice}servedStatus" minOccurs="0"/&gt;
 *         &lt;element name="addOnList" type="{urn:com.flexnet.lfs.webservice}addOnList" minOccurs="0"/&gt;
 *         &lt;element name="featureList" type="{urn:com.flexnet.lfs.webservice}featureList" minOccurs="0"/&gt;
 *         &lt;element name="hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="machineType" type="{urn:com.flexnet.lfs.webservice}machineType" minOccurs="0"/&gt;
 *         &lt;element name="vendorDictionary" type="{urn:com.flexnet.lfs.webservice}dictionaryEntries" minOccurs="0"/&gt;
 *         &lt;element name="vmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vmInfo" type="{urn:com.flexnet.lfs.webservice}dictionaryEntries" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseInfo" type="{urn:com.flexnet.lfs.webservice}enterpriseData" minOccurs="0"/&gt;
 *         &lt;element name="baseProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bufferLicense" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="capabilityResponseLicense" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="userInfo" type="{urn:com.flexnet.lfs.webservice}userParameter" minOccurs="0"/&gt;
 *         &lt;element name="parentHostId" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="parentHostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostDetail", propOrder = {
    "hostIdentifier",
    "uuid",
    "signatureName",
    "enterpriseId",
    "backupHostId",
    "hostName",
    "siteName",
    "description",
    "hostTypeName",
    "lastSyncTime",
    "lastRequestTime",
    "hostStatus",
    "servedStatus",
    "addOnList",
    "featureList",
    "hosted",
    "machineType",
    "vendorDictionary",
    "vmName",
    "vmInfo",
    "enterpriseInfo",
    "baseProductId",
    "bufferLicense",
    "capabilityResponseLicense",
    "userInfo",
    "parentHostId",
    "parentHostName"
})
public class HostDetail
    extends BaseRecordInResponse
{

    protected HostIdentifier hostIdentifier;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(required = true)
    protected String signatureName;
    protected String enterpriseId;
    protected String backupHostId;
    protected String hostName;
    protected String siteName;
    protected String description;
    protected String hostTypeName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSyncTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRequestTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected HostStatus hostStatus;
    @XmlSchemaType(name = "NMTOKEN")
    protected ServedStatus servedStatus;
    protected AddOnList addOnList;
    protected FeatureList featureList;
    protected Boolean hosted;
    @XmlSchemaType(name = "NMTOKEN")
    protected MachineType machineType;
    protected DictionaryEntries vendorDictionary;
    protected String vmName;
    protected DictionaryEntries vmInfo;
    protected EnterpriseData enterpriseInfo;
    protected String baseProductId;
    protected byte[] bufferLicense;
    protected byte[] capabilityResponseLicense;
    protected UserParameter userInfo;
    protected HostIdentifier parentHostId;
    protected String parentHostName;

    /**
     * Gets the value of the hostIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getHostIdentifier() {
        return hostIdentifier;
    }

    /**
     * Sets the value of the hostIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setHostIdentifier(HostIdentifier value) {
        this.hostIdentifier = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

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
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
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
     * Gets the value of the hostTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTypeName() {
        return hostTypeName;
    }

    /**
     * Sets the value of the hostTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTypeName(String value) {
        this.hostTypeName = value;
    }

    /**
     * Gets the value of the lastSyncTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     * Sets the value of the lastSyncTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSyncTime(XMLGregorianCalendar value) {
        this.lastSyncTime = value;
    }

    /**
     * Gets the value of the lastRequestTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRequestTime() {
        return lastRequestTime;
    }

    /**
     * Sets the value of the lastRequestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRequestTime(XMLGregorianCalendar value) {
        this.lastRequestTime = value;
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
     * Gets the value of the servedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServedStatus }
     *     
     */
    public ServedStatus getServedStatus() {
        return servedStatus;
    }

    /**
     * Sets the value of the servedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServedStatus }
     *     
     */
    public void setServedStatus(ServedStatus value) {
        this.servedStatus = value;
    }

    /**
     * Gets the value of the addOnList property.
     * 
     * @return
     *     possible object is
     *     {@link AddOnList }
     *     
     */
    public AddOnList getAddOnList() {
        return addOnList;
    }

    /**
     * Sets the value of the addOnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnList }
     *     
     */
    public void setAddOnList(AddOnList value) {
        this.addOnList = value;
    }

    /**
     * Gets the value of the featureList property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureList }
     *     
     */
    public FeatureList getFeatureList() {
        return featureList;
    }

    /**
     * Sets the value of the featureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureList }
     *     
     */
    public void setFeatureList(FeatureList value) {
        this.featureList = value;
    }

    /**
     * Gets the value of the hosted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosted() {
        return hosted;
    }

    /**
     * Sets the value of the hosted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosted(Boolean value) {
        this.hosted = value;
    }

    /**
     * Gets the value of the machineType property.
     * 
     * @return
     *     possible object is
     *     {@link MachineType }
     *     
     */
    public MachineType getMachineType() {
        return machineType;
    }

    /**
     * Sets the value of the machineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineType }
     *     
     */
    public void setMachineType(MachineType value) {
        this.machineType = value;
    }

    /**
     * Gets the value of the vendorDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryEntries }
     *     
     */
    public DictionaryEntries getVendorDictionary() {
        return vendorDictionary;
    }

    /**
     * Sets the value of the vendorDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryEntries }
     *     
     */
    public void setVendorDictionary(DictionaryEntries value) {
        this.vendorDictionary = value;
    }

    /**
     * Gets the value of the vmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmName() {
        return vmName;
    }

    /**
     * Sets the value of the vmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmName(String value) {
        this.vmName = value;
    }

    /**
     * Gets the value of the vmInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryEntries }
     *     
     */
    public DictionaryEntries getVmInfo() {
        return vmInfo;
    }

    /**
     * Sets the value of the vmInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryEntries }
     *     
     */
    public void setVmInfo(DictionaryEntries value) {
        this.vmInfo = value;
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
     * Gets the value of the bufferLicense property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBufferLicense() {
        return bufferLicense;
    }

    /**
     * Sets the value of the bufferLicense property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBufferLicense(byte[] value) {
        this.bufferLicense = value;
    }

    /**
     * Gets the value of the capabilityResponseLicense property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCapabilityResponseLicense() {
        return capabilityResponseLicense;
    }

    /**
     * Sets the value of the capabilityResponseLicense property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCapabilityResponseLicense(byte[] value) {
        this.capabilityResponseLicense = value;
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
     * Gets the value of the parentHostId property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getParentHostId() {
        return parentHostId;
    }

    /**
     * Sets the value of the parentHostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setParentHostId(HostIdentifier value) {
        this.parentHostId = value;
    }

    /**
     * Gets the value of the parentHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentHostName() {
        return parentHostName;
    }

    /**
     * Sets the value of the parentHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentHostName(String value) {
        this.parentHostName = value;
    }

}
