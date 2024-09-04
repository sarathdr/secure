
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateIdentityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateIdentityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="binaryIdentity" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element name="identityData" type="{urn:com.flexnet.lfs.webservice}identityData"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateIdentityRequest", propOrder = {
    "publisherId",
    "binaryIdentity",
    "identityData"
})
public class CreateIdentityRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    protected byte[] binaryIdentity;
    protected IdentityData identityData;

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
     * Gets the value of the binaryIdentity property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryIdentity() {
        return binaryIdentity;
    }

    /**
     * Sets the value of the binaryIdentity property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryIdentity(byte[] value) {
        this.binaryIdentity = value;
    }

    /**
     * Gets the value of the identityData property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityData }
     *     
     */
    public IdentityData getIdentityData() {
        return identityData;
    }

    /**
     * Sets the value of the identityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityData }
     *     
     */
    public void setIdentityData(IdentityData value) {
        this.identityData = value;
    }

}
