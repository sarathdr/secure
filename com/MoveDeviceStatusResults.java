
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moveDeviceStatusResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moveDeviceStatusResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device" type="{urn:com.flexnet.lfs.webservice}moveDeviceStatus" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveDeviceStatusResults", propOrder = {
    "device"
})
public class MoveDeviceStatusResults {

    @XmlElement(required = true)
    protected List<MoveDeviceStatus> device;

    /**
     * Gets the value of the device property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the device property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoveDeviceStatus }
     * 
     * 
     */
    public List<MoveDeviceStatus> getDevice() {
        if (device == null) {
            device = new ArrayList<MoveDeviceStatus>();
        }
        return this.device;
    }

}
