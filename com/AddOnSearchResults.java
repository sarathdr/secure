
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOnSearchResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOnSearchResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addOnSearchData" type="{urn:com.flexnet.lfs.webservice}addOnSearchData" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOnSearchResults", propOrder = {
    "addOnSearchData"
})
public class AddOnSearchResults {

    @XmlElement(required = true)
    protected List<AddOnSearchData> addOnSearchData;

    /**
     * Gets the value of the addOnSearchData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addOnSearchData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddOnSearchData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddOnSearchData }
     * 
     * 
     */
    public List<AddOnSearchData> getAddOnSearchData() {
        if (addOnSearchData == null) {
            addOnSearchData = new ArrayList<AddOnSearchData>();
        }
        return this.addOnSearchData;
    }

}
