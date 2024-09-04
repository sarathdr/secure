
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestHistoryRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestHistoryRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}hostHistoryRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metaData" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="capResponse" type="{urn:com.flexnet.lfs.webservice}hostHistoryRecord" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestHistoryRecord", propOrder = {
    "metaData",
    "capResponse"
})
public class RequestHistoryRecord
    extends HostHistoryRecord
{

    @XmlElement(required = true)
    protected List<String> metaData;
    protected HostHistoryRecord capResponse;

    /**
     * Gets the value of the metaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the metaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetaData() {
        if (metaData == null) {
            metaData = new ArrayList<String>();
        }
        return this.metaData;
    }

    /**
     * Gets the value of the capResponse property.
     * 
     * @return
     *     possible object is
     *     {@link HostHistoryRecord }
     *     
     */
    public HostHistoryRecord getCapResponse() {
        return capResponse;
    }

    /**
     * Sets the value of the capResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostHistoryRecord }
     *     
     */
    public void setCapResponse(HostHistoryRecord value) {
        this.capResponse = value;
    }

}
