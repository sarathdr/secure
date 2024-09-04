
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syncHistoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syncHistoryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usageMessageStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acquisitionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncHistoryData", propOrder = {
    "correlationId",
    "usageMessageStatus",
    "acquisitionId",
    "updateTime",
    "enterpriseId",
    "hostIdentifier"
})
public class SyncHistoryData {

    @XmlElement(required = true)
    protected String correlationId;
    protected String usageMessageStatus;
    protected String acquisitionId;
    protected long updateTime;
    protected String enterpriseId;
    protected String hostIdentifier;

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the usageMessageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageMessageStatus() {
        return usageMessageStatus;
    }

    /**
     * Sets the value of the usageMessageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageMessageStatus(String value) {
        this.usageMessageStatus = value;
    }

    /**
     * Gets the value of the acquisitionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquisitionId() {
        return acquisitionId;
    }

    /**
     * Sets the value of the acquisitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquisitionId(String value) {
        this.acquisitionId = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     */
    public long getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     */
    public void setUpdateTime(long value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the enterpriseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * Sets the value of the enterpriseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseId(String value) {
        this.enterpriseId = value;
    }

    /**
     * Gets the value of the hostIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostIdentifier() {
        return hostIdentifier;
    }

    /**
     * Sets the value of the hostIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostIdentifier(String value) {
        this.hostIdentifier = value;
    }

}
