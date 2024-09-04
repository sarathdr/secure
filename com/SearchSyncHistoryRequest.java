
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchSyncHistoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchSyncHistoryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correlationIds" type="{urn:com.flexnet.lfs.webservice}correlationIds"/&gt;
 *         &lt;element name="pagination" type="{urn:com.flexnet.lfs.webservice}paginationInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSyncHistoryRequest", propOrder = {
    "correlationIds",
    "pagination"
})
public class SearchSyncHistoryRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected CorrelationIds correlationIds;
    protected PaginationInput pagination;

    /**
     * Gets the value of the correlationIds property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationIds }
     *     
     */
    public CorrelationIds getCorrelationIds() {
        return correlationIds;
    }

    /**
     * Sets the value of the correlationIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationIds }
     *     
     */
    public void setCorrelationIds(CorrelationIds value) {
        this.correlationIds = value;
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
