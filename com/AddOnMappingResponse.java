
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOnMappingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOnMappingResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="successfulActivationId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="statusInfo" type="{urn:com.flexnet.lfs.webservice}statusInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOnMappingResponse", propOrder = {
    "successfulActivationId",
    "statusInfo"
})
@XmlSeeAlso({
    MapAddOnsResponse.class,
    RemoveAddOnsResponse.class,
    AddAddOnsResponse.class,
    ReturnAddOnsResponse.class
})
public class AddOnMappingResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected List<String> successfulActivationId;
    protected List<StatusInfo> statusInfo;

    /**
     * Gets the value of the successfulActivationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the successfulActivationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessfulActivationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuccessfulActivationId() {
        if (successfulActivationId == null) {
            successfulActivationId = new ArrayList<String>();
        }
        return this.successfulActivationId;
    }

    /**
     * Gets the value of the statusInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the statusInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusInfo }
     * 
     * 
     */
    public List<StatusInfo> getStatusInfo() {
        if (statusInfo == null) {
            statusInfo = new ArrayList<StatusInfo>();
        }
        return this.statusInfo;
    }

}
