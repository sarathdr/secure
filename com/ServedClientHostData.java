
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servedClientHostData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servedClientHostData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}device"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serverHostId" type="{urn:com.flexnet.lfs.webservice}hostIdentifier"/&gt;
 *         &lt;element name="featureList" type="{urn:com.flexnet.lfs.webservice}featureList" minOccurs="0"/&gt;
 *         &lt;element name="servedClientStatus" type="{urn:com.flexnet.lfs.webservice}servedStatus" minOccurs="0"/&gt;
 *         &lt;element name="serverHostIds" type="{urn:com.flexnet.lfs.webservice}hostIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servedClientHostData", propOrder = {
    "serverHostId",
    "featureList",
    "servedClientStatus",
    "serverHostIds"
})
public class ServedClientHostData
    extends Device
{

    @XmlElement(required = true)
    protected HostIdentifier serverHostId;
    protected FeatureList featureList;
    @XmlSchemaType(name = "NMTOKEN")
    protected ServedStatus servedClientStatus;
    @XmlElement(nillable = true)
    protected List<HostIdentifier> serverHostIds;

    /**
     * Gets the value of the serverHostId property.
     * 
     * @return
     *     possible object is
     *     {@link HostIdentifier }
     *     
     */
    public HostIdentifier getServerHostId() {
        return serverHostId;
    }

    /**
     * Sets the value of the serverHostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIdentifier }
     *     
     */
    public void setServerHostId(HostIdentifier value) {
        this.serverHostId = value;
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

    /**
     * Gets the value of the servedClientStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServedStatus }
     *     
     */
    public ServedStatus getServedClientStatus() {
        return servedClientStatus;
    }

    /**
     * Sets the value of the servedClientStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServedStatus }
     *     
     */
    public void setServedClientStatus(ServedStatus value) {
        this.servedClientStatus = value;
    }

    /**
     * Gets the value of the serverHostIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serverHostIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerHostIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostIdentifier }
     * 
     * 
     */
    public List<HostIdentifier> getServerHostIds() {
        if (serverHostIds == null) {
            serverHostIds = new ArrayList<HostIdentifier>();
        }
        return this.serverHostIds;
    }

}
