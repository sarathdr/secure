
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for publisherIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publisherIdentity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="signatureName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="signatureAlgorithm" type="{urn:com.flexnet.lfs.webservice}signatureAlgorithm" minOccurs="0"/&gt;
 *         &lt;element name="binaryIdentity" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="c_HeaderIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="java_HeaderIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cSharp_HeaderIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customSigner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publisherIdentity", propOrder = {
    "publisherName",
    "signatureName",
    "signatureAlgorithm",
    "binaryIdentity",
    "cHeaderIdentity",
    "javaHeaderIdentity",
    "cSharpHeaderIdentity",
    "description",
    "customSigner"
})
public class PublisherIdentity {

    @XmlElement(required = true)
    protected String publisherName;
    @XmlElement(required = true)
    protected String signatureName;
    @XmlSchemaType(name = "NMTOKEN")
    protected SignatureAlgorithm signatureAlgorithm;
    protected byte[] binaryIdentity;
    @XmlElement(name = "c_HeaderIdentity")
    protected String cHeaderIdentity;
    @XmlElement(name = "java_HeaderIdentity")
    protected String javaHeaderIdentity;
    @XmlElement(name = "cSharp_HeaderIdentity")
    protected String cSharpHeaderIdentity;
    protected String description;
    protected String customSigner;

    /**
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    /**
     * Gets the value of the signatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * Sets the value of the signatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureName(String value) {
        this.signatureName = value;
    }

    /**
     * Gets the value of the signatureAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureAlgorithm }
     *     
     */
    public SignatureAlgorithm getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Sets the value of the signatureAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureAlgorithm }
     *     
     */
    public void setSignatureAlgorithm(SignatureAlgorithm value) {
        this.signatureAlgorithm = value;
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
     * Gets the value of the cHeaderIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHeaderIdentity() {
        return cHeaderIdentity;
    }

    /**
     * Sets the value of the cHeaderIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHeaderIdentity(String value) {
        this.cHeaderIdentity = value;
    }

    /**
     * Gets the value of the javaHeaderIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaHeaderIdentity() {
        return javaHeaderIdentity;
    }

    /**
     * Sets the value of the javaHeaderIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaHeaderIdentity(String value) {
        this.javaHeaderIdentity = value;
    }

    /**
     * Gets the value of the cSharpHeaderIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSharpHeaderIdentity() {
        return cSharpHeaderIdentity;
    }

    /**
     * Sets the value of the cSharpHeaderIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSharpHeaderIdentity(String value) {
        this.cSharpHeaderIdentity = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the customSigner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomSigner() {
        return customSigner;
    }

    /**
     * Sets the value of the customSigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomSigner(String value) {
        this.customSigner = value;
    }

}
