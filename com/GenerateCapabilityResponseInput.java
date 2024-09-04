
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenerateCapabilityResponseInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerateCapabilityResponseInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}capabilityResponseInput"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forceResponse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateCapabilityResponseInput", propOrder = {
    "forceResponse"
})
public class GenerateCapabilityResponseInput
    extends CapabilityResponseInput
{

    @XmlElement(defaultValue = "false")
    protected Boolean forceResponse;

    /**
     * Gets the value of the forceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceResponse() {
        return forceResponse;
    }

    /**
     * Sets the value of the forceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceResponse(Boolean value) {
        this.forceResponse = value;
    }

}
