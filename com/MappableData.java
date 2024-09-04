
package secure.com;

import java.math.BigInteger;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mappableData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mappableData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="allowedIncrease" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *           &lt;element name="undefinedMaxReason" type="{urn:com.flexnet.lfs.webservice}undefinedMaxReason"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mappableData", propOrder = {
    "activationId",
    "allowedIncrease",
    "undefinedMaxReason"
})
public class MappableData {

    @XmlElement(required = true)
    protected String activationId;
    protected BigInteger allowedIncrease;
    @XmlSchemaType(name = "string")
    protected UndefinedMaxReason undefinedMaxReason;

    /**
     * Gets the value of the activationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationId() {
        return activationId;
    }

    /**
     * Sets the value of the activationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationId(String value) {
        this.activationId = value;
    }

    /**
     * Gets the value of the allowedIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAllowedIncrease() {
        return allowedIncrease;
    }

    /**
     * Sets the value of the allowedIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAllowedIncrease(BigInteger value) {
        this.allowedIncrease = value;
    }

    /**
     * Gets the value of the undefinedMaxReason property.
     * 
     * @return
     *     possible object is
     *     {@link UndefinedMaxReason }
     *     
     */
    public UndefinedMaxReason getUndefinedMaxReason() {
        return undefinedMaxReason;
    }

    /**
     * Sets the value of the undefinedMaxReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndefinedMaxReason }
     *     
     */
    public void setUndefinedMaxReason(UndefinedMaxReason value) {
        this.undefinedMaxReason = value;
    }

}
