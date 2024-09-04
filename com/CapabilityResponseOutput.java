
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilityResponseOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityResponseOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capabilityResponse" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="capabilityResponseString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" minOccurs="0"/&gt;
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
@XmlType(name = "CapabilityResponseOutput", propOrder = {
    "capabilityResponse",
    "capabilityResponseString",
    "hostIdentifier",
    "statusInfo"
})
public class CapabilityResponseOutput
    extends BaseResponse
{

    protected byte[] capabilityResponse;
    protected String capabilityResponseString;
    protected HostIdentifier hostIdentifier;
    protected List<StatusInfo> statusInfo;

    /**
     * Gets the value of the capabilityResponse property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCapabilityResponse() {
        return capabilityResponse;
    }

    /**
     * Sets the value of the capabilityResponse property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCapabilityResponse(byte[] value) {
        this.capabilityResponse = value;
    }

    /**
     * Gets the value of the capabilityResponseString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityResponseString() {
        return capabilityResponseString;
    }

    /**
     * Sets the value of the capabilityResponseString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityResponseString(String value) {
        this.capabilityResponseString = value;
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
