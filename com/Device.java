
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="device"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRecordInResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signatureName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier"/&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:com.flexnet.lfs.webservice}hostStatus" minOccurs="0"/&gt;
 *         &lt;element name="rma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceModel" type="{urn:com.flexnet.lfs.webservice}deviceModelData" minOccurs="0"/&gt;
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastSyncTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="machineType" type="{urn:com.flexnet.lfs.webservice}machineType" minOccurs="0"/&gt;
 *         &lt;element name="vendorDictionary" type="{urn:com.flexnet.lfs.webservice}dictionaryEntries" minOccurs="0"/&gt;
 *         &lt;element name="vmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vmInfo" type="{urn:com.flexnet.lfs.webservice}dictionaryEntries" minOccurs="0"/&gt;
 *         &lt;element name="prebuiltLicenseGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseInfo" type="{urn:com.flexnet.lfs.webservice}enterpriseData" minOccurs="0"/&gt;
 *         &lt;element name="addOnInfo" type="{urn:com.flexnet.lfs.webservice}addOnList" minOccurs="0"/&gt;
 *         &lt;element name="baseProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bufferLicense" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="capabilityResponseLicense" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
@XmlType(name = "device", propOrder = {
    "signatureName",
    "deviceIdentifier",
    "alias",
    "notes",
    "description",
    "enterpriseId",
    "status",
    "rma",
    "deviceModel",
    "siteName",
    "lastSyncTime",
    "cloud",
    "machineType",
    "vendorDictionary",
    "vmName",
    "vmInfo",
    "prebuiltLicenseGenerated",
    "enterpriseInfo",
    "addOnInfo",
    "baseProductId",
    "bufferLicense",
    "capabilityResponseLicense",
    "userInfo"
})
@XmlSeeAlso({
    ServedClientHostData.class
})
public class Device
    extends BaseRecordInResponse
{

    @XmlElement(required = true)
    protected String signatureName;
    @XmlElement(required = true)
    protected HostIdentifier deviceIdentifier;
    protected String alias;
    protected String notes;
    protected String description;
    protected String enterpriseId;
    @XmlSchemaType(name = "NMTOKEN")
    protected HostStatus status;
    protected String rma;
    protected DeviceModelData deviceModel;
    protected String siteName;
    protected Long lastSyncTime;
    @XmlElement(defaultValue = "false")
    protected boolean cloud;
    @XmlSchemaType(name = "NMTOKEN")
    protected MachineType machineType;
    protected DictionaryEntries vendorDictionary;
    protected String vmName;
    protected DictionaryEntries vmInfo;
    protected Boolean prebuiltLicenseGenerated;
    protected EnterpriseData enterpriseInfo;
    protected AddOnList addOnInfo;
    protected String baseProductId;
    protected byte[] bufferLicense;
    protected byte[] capabilityResponseLicense;
    protected UserParameter userInfo;

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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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
     * Gets the value of the rma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRma() {
        return rma;
    }

    /**
     * Sets the value of the rma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRma(String value) {
        this.rma = value;
    }

    /**
     * Gets the value of the deviceModel property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceModelData }
     *     
     */
    public DeviceModelData getDeviceModel() {
        return deviceModel;
    }

    /**
     * Sets the value of the deviceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceModelData }
     *     
     */
    public void setDeviceModel(DeviceModelData value) {
        this.deviceModel = value;
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
     * Gets the value of the lastSyncTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     * Sets the value of the lastSyncTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastSyncTime(Long value) {
        this.lastSyncTime = value;
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
     * Gets the value of the prebuiltLicenseGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrebuiltLicenseGenerated() {
        return prebuiltLicenseGenerated;
    }

    /**
     * Sets the value of the prebuiltLicenseGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrebuiltLicenseGenerated(Boolean value) {
        this.prebuiltLicenseGenerated = value;
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
     * Gets the value of the addOnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddOnList }
     *     
     */
    public AddOnList getAddOnInfo() {
        return addOnInfo;
    }

    /**
     * Sets the value of the addOnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnList }
     *     
     */
    public void setAddOnInfo(AddOnList value) {
        this.addOnInfo = value;
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

}
