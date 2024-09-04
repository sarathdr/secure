
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="signerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strengths" type="{urn:com.flexnet.lfs.webservice}signerStrengthList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signer", propOrder = {
    "className",
    "signerId",
    "strengths"
})
public class Signer {

    @XmlElement(required = true)
    protected String className;
    protected int signerId;
    @XmlElement(required = true)
    protected SignerStrengthList strengths;

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the signerId property.
     * 
     */
    public int getSignerId() {
        return signerId;
    }

    /**
     * Sets the value of the signerId property.
     * 
     */
    public void setSignerId(int value) {
        this.signerId = value;
    }

    /**
     * Gets the value of the strengths property.
     * 
     * @return
     *     possible object is
     *     {@link SignerStrengthList }
     *     
     */
    public SignerStrengthList getStrengths() {
        return strengths;
    }

    /**
     * Sets the value of the strengths property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerStrengthList }
     *     
     */
    public void setStrengths(SignerStrengthList value) {
        this.strengths = value;
    }

}
