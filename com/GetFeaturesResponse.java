
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFeaturesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeaturesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hostIdentifier" type="{urn:com.flexnet.lfs.webservice}hostIdentifier"/&gt;
 *         &lt;element name="featureList" type="{urn:com.flexnet.lfs.webservice}featureList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeaturesResponse", propOrder = {
    "hostIdentifier",
    "featureList"
})
public class GetFeaturesResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected HostIdentifier hostIdentifier;
    protected FeatureList featureList;

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
     * Gets the value of the featureList property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureList }
     *     
     */
    public FeatureList getFeatureList() {
        return featureList;
    }

    /**
     * Sets the value of the featureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureList }
     *     
     */
    public void setFeatureList(FeatureList value) {
        this.featureList = value;
    }

}
