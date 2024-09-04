
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessBinaryRequestOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessBinaryRequestOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="binaryResponse" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="binaryResponseString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="lastSyncTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="statusInfo" type="{urn:com.flexnet.lfs.webservice}statusInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessBinaryRequestOutput", propOrder = {
    "binaryResponse",
    "binaryResponseString",
    "hostIdentifier",
    "lastSyncTime",
    "statusInfo"
})
public class ProcessBinaryRequestOutput
    extends BaseResponse
{

    protected byte[] binaryResponse;
    protected String binaryResponseString;
    protected HostIdentifier hostIdentifier;
    protected Long lastSyncTime;
    protected List<StatusInfo> statusInfo;

    /**
     * Gets the value of the binaryResponse property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryResponse() {
        return binaryResponse;
    }

    /**
     * Sets the value of the binaryResponse property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryResponse(byte[] value) {
        this.binaryResponse = value;
    }

    /**
     * Gets the value of the binaryResponseString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryResponseString() {
        return binaryResponseString;
    }

    /**
     * Sets the value of the binaryResponseString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryResponseString(String value) {
        this.binaryResponseString = value;
    }

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
     * Gets the value of the statusInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the statusInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusInfo }
     * 
     * 
     */
    public List<StatusInfo> getStatusInfo() {
        if (statusInfo == null) {
            statusInfo = new ArrayList<StatusInfo>();
        }
        return this.statusInfo;
    }

}
