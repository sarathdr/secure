
package secure.com;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Feature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Feature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VersionFormat" type="{urn:com.flexnet.lfs.webservice}VersionFormatOpt" minOccurs="0"/&gt;
 *         &lt;element name="VersionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VersionDateOption" type="{urn:com.flexnet.lfs.webservice}VersionDateOpt" minOccurs="0"/&gt;
 *         &lt;element name="VersionDateDuration" type="{urn:com.flexnet.lfs.webservice}Duration" minOccurs="0"/&gt;
 *         &lt;element name="Count" type="{urn:com.flexnet.lfs.webservice}FeatureCountType"/&gt;
 *         &lt;element name="Expiration" type="{urn:com.flexnet.lfs.webservice}Expiration"/&gt;
 *         &lt;element name="FeatureId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartDate" type="{urn:com.flexnet.lfs.webservice}StartDate" minOccurs="0"/&gt;
 *         &lt;element name="VendorString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Metered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Overdraft" type="{urn:com.flexnet.lfs.webservice}OverdraftType" minOccurs="0"/&gt;
 *         &lt;element name="Returnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UndoInterval" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="BorrowInterval" type="{urn:com.flexnet.lfs.webservice}Duration" minOccurs="0"/&gt;
 *         &lt;element name="RenewInterval" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="GracePeriod" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="VirtualClientProhibited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Feature", propOrder = {
    "name",
    "version",
    "versionFormat",
    "versionDate",
    "versionDateOption",
    "versionDateDuration",
    "count",
    "expiration",
    "featureId",
    "startDate",
    "vendorString",
    "notice",
    "issuer",
    "serialNumber",
    "metered",
    "overdraft",
    "returnable",
    "undoInterval",
    "borrowInterval",
    "renewInterval",
    "gracePeriod",
    "virtualClientProhibited"
})
public class Feature {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "VersionFormat")
    @XmlSchemaType(name = "string")
    protected VersionFormatOpt versionFormat;
    @XmlElement(name = "VersionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionDate;
    @XmlElement(name = "VersionDateOption")
    @XmlSchemaType(name = "string")
    protected VersionDateOpt versionDateOption;
    @XmlElement(name = "VersionDateDuration")
    protected Duration versionDateDuration;
    @XmlElement(name = "Count", required = true)
    protected FeatureCountType count;
    @XmlElement(name = "Expiration", required = true)
    protected Expiration expiration;
    @XmlElement(name = "FeatureId", required = true)
    protected String featureId;
    @XmlElement(name = "StartDate")
    protected StartDate startDate;
    @XmlElement(name = "VendorString")
    protected String vendorString;
    @XmlElement(name = "Notice")
    protected String notice;
    @XmlElement(name = "Issuer")
    protected String issuer;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "Metered")
    protected Boolean metered;
    @XmlElement(name = "Overdraft")
    protected OverdraftType overdraft;
    @XmlElement(name = "Returnable")
    protected Boolean returnable;
    @XmlElement(name = "UndoInterval")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger undoInterval;
    @XmlElement(name = "BorrowInterval")
    protected Duration borrowInterval;
    @XmlElement(name = "RenewInterval")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger renewInterval;
    @XmlElement(name = "GracePeriod")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gracePeriod;
    @XmlElement(name = "VirtualClientProhibited")
    protected Boolean virtualClientProhibited;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the versionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link VersionFormatOpt }
     *     
     */
    public VersionFormatOpt getVersionFormat() {
        return versionFormat;
    }

    /**
     * Sets the value of the versionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionFormatOpt }
     *     
     */
    public void setVersionFormat(VersionFormatOpt value) {
        this.versionFormat = value;
    }

    /**
     * Gets the value of the versionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionDate() {
        return versionDate;
    }

    /**
     * Sets the value of the versionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionDate(XMLGregorianCalendar value) {
        this.versionDate = value;
    }

    /**
     * Gets the value of the versionDateOption property.
     * 
     * @return
     *     possible object is
     *     {@link VersionDateOpt }
     *     
     */
    public VersionDateOpt getVersionDateOption() {
        return versionDateOption;
    }

    /**
     * Sets the value of the versionDateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionDateOpt }
     *     
     */
    public void setVersionDateOption(VersionDateOpt value) {
        this.versionDateOption = value;
    }

    /**
     * Gets the value of the versionDateDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getVersionDateDuration() {
        return versionDateDuration;
    }

    /**
     * Sets the value of the versionDateDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setVersionDateDuration(Duration value) {
        this.versionDateDuration = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureCountType }
     *     
     */
    public FeatureCountType getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureCountType }
     *     
     */
    public void setCount(FeatureCountType value) {
        this.count = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link Expiration }
     *     
     */
    public Expiration getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expiration }
     *     
     */
    public void setExpiration(Expiration value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the featureId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureId() {
        return featureId;
    }

    /**
     * Sets the value of the featureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureId(String value) {
        this.featureId = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link StartDate }
     *     
     */
    public StartDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDate }
     *     
     */
    public void setStartDate(StartDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the vendorString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorString() {
        return vendorString;
    }

    /**
     * Sets the value of the vendorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorString(String value) {
        this.vendorString = value;
    }

    /**
     * Gets the value of the notice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotice() {
        return notice;
    }

    /**
     * Sets the value of the notice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotice(String value) {
        this.notice = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the metered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMetered() {
        return metered;
    }

    /**
     * Sets the value of the metered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMetered(Boolean value) {
        this.metered = value;
    }

    /**
     * Gets the value of the overdraft property.
     * 
     * @return
     *     possible object is
     *     {@link OverdraftType }
     *     
     */
    public OverdraftType getOverdraft() {
        return overdraft;
    }

    /**
     * Sets the value of the overdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverdraftType }
     *     
     */
    public void setOverdraft(OverdraftType value) {
        this.overdraft = value;
    }

    /**
     * Gets the value of the returnable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnable() {
        return returnable;
    }

    /**
     * Sets the value of the returnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnable(Boolean value) {
        this.returnable = value;
    }

    /**
     * Gets the value of the undoInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUndoInterval() {
        return undoInterval;
    }

    /**
     * Sets the value of the undoInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUndoInterval(BigInteger value) {
        this.undoInterval = value;
    }

    /**
     * Gets the value of the borrowInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBorrowInterval() {
        return borrowInterval;
    }

    /**
     * Sets the value of the borrowInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBorrowInterval(Duration value) {
        this.borrowInterval = value;
    }

    /**
     * Gets the value of the renewInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRenewInterval() {
        return renewInterval;
    }

    /**
     * Sets the value of the renewInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRenewInterval(BigInteger value) {
        this.renewInterval = value;
    }

    /**
     * Gets the value of the gracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGracePeriod() {
        return gracePeriod;
    }

    /**
     * Sets the value of the gracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGracePeriod(BigInteger value) {
        this.gracePeriod = value;
    }

    /**
     * Gets the value of the virtualClientProhibited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualClientProhibited() {
        return virtualClientProhibited;
    }

    /**
     * Sets the value of the virtualClientProhibited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualClientProhibited(Boolean value) {
        this.virtualClientProhibited = value;
    }

}
