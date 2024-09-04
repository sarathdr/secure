
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pendingCounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pendingCounts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pendingCount" type="{urn:com.flexnet.lfs.webservice}pendingCountData" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pendingCounts", propOrder = {
    "pendingCount"
})
public class PendingCounts {

    @XmlElement(required = true)
    protected List<PendingCountData> pendingCount;

    /**
     * Gets the value of the pendingCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pendingCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingCountData }
     * 
     * 
     */
    public List<PendingCountData> getPendingCount() {
        if (pendingCount == null) {
            pendingCount = new ArrayList<PendingCountData>();
        }
        return this.pendingCount;
    }

}
