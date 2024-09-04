
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOnSortBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOnSortBy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sortKey" type="{urn:com.flexnet.lfs.webservice}addOnQuerySortKey"/&gt;
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
@XmlType(name = "addOnSortBy", propOrder = {
    "sortKey",
    "ascending"
})
public class AddOnSortBy {

    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected AddOnQuerySortKey sortKey;
    @XmlElement(defaultValue = "true")
    protected boolean ascending;

    /**
     * Gets the value of the sortKey property.
     * 
     * @return
     *     possible object is
     *     {@link AddOnQuerySortKey }
     *     
     */
    public AddOnQuerySortKey getSortKey() {
        return sortKey;
    }

    /**
     * Sets the value of the sortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnQuerySortKey }
     *     
     */
    public void setSortKey(AddOnQuerySortKey value) {
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
