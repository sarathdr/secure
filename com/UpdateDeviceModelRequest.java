
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDeviceModelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDeviceModelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceSeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="editParameters" type="{urn:com.flexnet.lfs.webservice}deviceModelEditParameters"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDeviceModelRequest", propOrder = {
    "publisherId",
    "name",
    "deviceSeriesName",
    "editParameters"
})
public class UpdateDeviceModelRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    protected String name;
    protected String deviceSeriesName;
    @XmlElement(required = true)
    protected DeviceModelEditParameters editParameters;

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
     * Gets the value of the deviceSeriesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSeriesName() {
        return deviceSeriesName;
    }

    /**
     * Sets the value of the deviceSeriesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSeriesName(String value) {
        this.deviceSeriesName = value;
    }

    /**
     * Gets the value of the editParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceModelEditParameters }
     *     
     */
    public DeviceModelEditParameters getEditParameters() {
        return editParameters;
    }

    /**
     * Sets the value of the editParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceModelEditParameters }
     *     
     */
    public void setEditParameters(DeviceModelEditParameters value) {
        this.editParameters = value;
    }

}
