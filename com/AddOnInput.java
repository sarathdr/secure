
package secure.com;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOnInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOnInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="zeroAllocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="expirationDateOverride" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOnInput", propOrder = {
    "activationId",
    "count",
    "zeroAllocation",
    "expirationDateOverride"
})
public class AddOnInput {

    @XmlElement(required = true)
    protected String activationId;
    @XmlElement(required = true)
    protected BigInteger count;
    protected Boolean zeroAllocation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateOverride;

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
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the zeroAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroAllocation() {
        return zeroAllocation;
    }

    /**
     * Sets the value of the zeroAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroAllocation(Boolean value) {
        this.zeroAllocation = value;
    }

    /**
     * Gets the value of the expirationDateOverride property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateOverride() {
        return expirationDateOverride;
    }

    /**
     * Sets the value of the expirationDateOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateOverride(XMLGregorianCalendar value) {
        this.expirationDateOverride = value;
    }

}
