
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHostsForEntitlementTransferResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHostsForEntitlementTransferResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transferAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="serversFound" type="{urn:com.flexnet.lfs.webservice}serversFound" minOccurs="0"/&gt;
 *         &lt;element name="devicesFound" type="{urn:com.flexnet.lfs.webservice}deviceSearchResults" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHostsForEntitlementTransferResponse", propOrder = {
    "transferAllowed",
    "serversFound",
    "devicesFound"
})
public class GetHostsForEntitlementTransferResponse
    extends BaseResponse
{

    @XmlElement(defaultValue = "false")
    protected boolean transferAllowed;
    protected ServersFound serversFound;
    protected DeviceSearchResults devicesFound;

    /**
     * Gets the value of the transferAllowed property.
     * 
     */
    public boolean isTransferAllowed() {
        return transferAllowed;
    }

    /**
     * Sets the value of the transferAllowed property.
     * 
     */
    public void setTransferAllowed(boolean value) {
        this.transferAllowed = value;
    }

    /**
     * Gets the value of the serversFound property.
     * 
     * @return
     *     possible object is
     *     {@link ServersFound }
     *     
     */
    public ServersFound getServersFound() {
        return serversFound;
    }

    /**
     * Sets the value of the serversFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServersFound }
     *     
     */
    public void setServersFound(ServersFound value) {
        this.serversFound = value;
    }

    /**
     * Gets the value of the devicesFound property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSearchResults }
     *     
     */
    public DeviceSearchResults getDevicesFound() {
        return devicesFound;
    }

    /**
     * Sets the value of the devicesFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSearchResults }
     *     
     */
    public void setDevicesFound(DeviceSearchResults value) {
        this.devicesFound = value;
    }

}
