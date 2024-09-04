
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sortBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sortBy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sortKey" type="{urn:com.flexnet.lfs.webservice}querySortKey"/&gt;
 *         &lt;element name="ascending" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sortBy", propOrder = {
    "sortKey",
    "ascending"
})
public class SortBy {

    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected QuerySortKey sortKey;
    @XmlElement(defaultValue = "true")
    protected boolean ascending;

    /**
     * Gets the value of the sortKey property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySortKey }
     *     
     */
    public QuerySortKey getSortKey() {
        return sortKey;
    }

    /**
     * Sets the value of the sortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySortKey }
     *     
     */
    public void setSortKey(QuerySortKey value) {
        this.sortKey = value;
    }

    /**
     * Gets the value of the ascending property.
     * 
     */
    public boolean isAscending() {
        return ascending;
    }

    /**
     * Sets the value of the ascending property.
     * 
     */
    public void setAscending(boolean value) {
        this.ascending = value;
    }

}
