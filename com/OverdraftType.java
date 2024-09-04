
package secure.com;

import java.math.BigDecimal;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverdraftType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverdraftType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Infinite" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverdraftType", propOrder = {
    "infinite",
    "percentage",
    "amount"
})
public class OverdraftType {

    @XmlElement(name = "Infinite")
    protected boolean infinite;
    @XmlElement(name = "Percentage")
    protected boolean percentage;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;

    /**
     * Gets the value of the infinite property.
     * 
     */
    public boolean isInfinite() {
        return infinite;
    }

    /**
     * Sets the value of the infinite property.
     * 
     */
    public void setInfinite(boolean value) {
        this.infinite = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     */
    public boolean isPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     */
    public void setPercentage(boolean value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
