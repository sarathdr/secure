
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LFSFaultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LFSFaultResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="args" type="{urn:com.flexnet.lfs.webservice}ErrorParameters" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LFSFaultResponse", propOrder = {
    "args"
})
public class LFSFaultResponse {

    protected ErrorParameters args;

    /**
     * Gets the value of the args property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorParameters }
     *     
     */
    public ErrorParameters getArgs() {
        return args;
    }

    /**
     * Sets the value of the args property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorParameters }
     *     
     */
    public void setArgs(ErrorParameters value) {
        this.args = value;
    }

}
