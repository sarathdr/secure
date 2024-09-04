
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetConfigurationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConfigurationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="set" type="{urn:com.flexnet.lfs.webservice}configSetId" minOccurs="0"/&gt;
 *         &lt;element name="includeParent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{urn:com.flexnet.lfs.webservice}getConfigItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConfigurationRequest", propOrder = {
    "set",
    "includeParent",
    "item"
})
public class GetConfigurationRequest
    extends BaseRequest
{

    protected ConfigSetId set;
    protected Boolean includeParent;
    @XmlElement(required = true)
    protected List<GetConfigItem> item;

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigSetId }
     *     
     */
    public ConfigSetId getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigSetId }
     *     
     */
    public void setSet(ConfigSetId value) {
        this.set = value;
    }

    /**
     * Gets the value of the includeParent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeParent() {
        return includeParent;
    }

    /**
     * Sets the value of the includeParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeParent(Boolean value) {
        this.includeParent = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetConfigItem }
     * 
     * 
     */
    public List<GetConfigItem> getItem() {
        if (item == null) {
            item = new ArrayList<GetConfigItem>();
        }
        return this.item;
    }

}
