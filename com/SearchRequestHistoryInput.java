
package secure.com;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRequestHistoryInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRequestHistoryInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hostIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="maxRequestHistoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="maxRequestTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="resultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *           &lt;element name="pagination" type="{urn:com.flexnet.lfs.webservice}paginationInput" minOccurs="0"/&gt;
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
@XmlType(name = "SearchRequestHistoryInput", propOrder = {
    "publisherId",
    "hostIdentifier",
    "maxRequestHistoryId",
    "maxRequestTime",
    "resultCount",
    "pagination"
})
public class SearchRequestHistoryInput
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    protected HostIdentifier hostIdentifier;
    protected Long maxRequestHistoryId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxRequestTime;
    protected Integer resultCount;
    protected PaginationInput pagination;

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
     * Gets the value of the hostIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getHostIdentifier() {
        return hostIdentifier;
    }

    /**
     * Sets the value of the hostIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setHostIdentifier(HostIdentifier value) {
        this.hostIdentifier = value;
    }

    /**
     * Gets the value of the maxRequestHistoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRequestHistoryId() {
        return maxRequestHistoryId;
    }

    /**
     * Sets the value of the maxRequestHistoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRequestHistoryId(Long value) {
        this.maxRequestHistoryId = value;
    }

    /**
     * Gets the value of the maxRequestTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxRequestTime() {
        return maxRequestTime;
    }

    /**
     * Sets the value of the maxRequestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxRequestTime(XMLGregorianCalendar value) {
        this.maxRequestTime = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultCount(Integer value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationInput }
     *     
     */
    public PaginationInput getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationInput }
     *     
     */
    public void setPagination(PaginationInput value) {
        this.pagination = value;
    }

}
