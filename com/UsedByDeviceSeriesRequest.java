
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usedByDeviceSeriesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usedByDeviceSeriesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="featureNames" type="{urn:com.flexnet.lfs.webservice}featureNameList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usedByDeviceSeriesRequest", propOrder = {
    "publisherId",
    "featureNames"
})
public class UsedByDeviceSeriesRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String publisherId;
    @XmlElement(required = true)
    protected FeatureNameList featureNames;

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
     * Gets the value of the featureNames property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureNameList }
     *     
     */
    public FeatureNameList getFeatureNames() {
        return featureNames;
    }

    /**
     * Sets the value of the featureNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureNameList }
     *     
     */
    public void setFeatureNames(FeatureNameList value) {
        this.featureNames = value;
    }

}
