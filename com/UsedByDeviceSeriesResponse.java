
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usedByDeviceSeriesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usedByDeviceSeriesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="featureInUseStatus" type="{urn:com.flexnet.lfs.webservice}featureInUseStatus" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usedByDeviceSeriesResponse", propOrder = {
    "featureInUseStatus"
})
public class UsedByDeviceSeriesResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected List<FeatureInUseStatus> featureInUseStatus;

    /**
     * Gets the value of the featureInUseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the featureInUseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureInUseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureInUseStatus }
     * 
     * 
     */
    public List<FeatureInUseStatus> getFeatureInUseStatus() {
        if (featureInUseStatus == null) {
            featureInUseStatus = new ArrayList<FeatureInUseStatus>();
        }
        return this.featureInUseStatus;
    }

}
