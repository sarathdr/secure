
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostDataExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hostDataExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}hostData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bindRepairLimitEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bindRepairCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bindRepairMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostDataExtension", propOrder = {
    "bindRepairLimitEnabled",
    "bindRepairCount",
    "bindRepairMax"
})
public class HostDataExtension
    extends HostData
{

    protected Boolean bindRepairLimitEnabled;
    protected Integer bindRepairCount;
    protected Integer bindRepairMax;

    /**
     * Gets the value of the bindRepairLimitEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBindRepairLimitEnabled() {
        return bindRepairLimitEnabled;
    }

    /**
     * Sets the value of the bindRepairLimitEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBindRepairLimitEnabled(Boolean value) {
        this.bindRepairLimitEnabled = value;
    }

    /**
     * Gets the value of the bindRepairCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBindRepairCount() {
        return bindRepairCount;
    }

    /**
     * Sets the value of the bindRepairCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBindRepairCount(Integer value) {
        this.bindRepairCount = value;
    }

    /**
     * Gets the value of the bindRepairMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBindRepairMax() {
        return bindRepairMax;
    }

    /**
     * Sets the value of the bindRepairMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBindRepairMax(Integer value) {
        this.bindRepairMax = value;
    }

}
