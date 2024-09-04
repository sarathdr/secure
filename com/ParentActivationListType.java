
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentActivationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentActivationListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupportAction" type="{urn:com.flexnet.lfs.webservice}SupportAction"/&gt;
 *         &lt;element name="ActivationId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentActivationListType", propOrder = {
    "supportAction",
    "activationId"
})
public class ParentActivationListType {

    @XmlElement(name = "SupportAction", required = true)
    @XmlSchemaType(name = "string")
    protected SupportAction supportAction;
    @XmlElement(name = "ActivationId", required = true)
    protected List<String> activationId;

    /**
     * Gets the value of the supportAction property.
     * 
     * @return
     *     possible object is
     *     {@link SupportAction }
     *     
     */
    public SupportAction getSupportAction() {
        return supportAction;
    }

    /**
     * Sets the value of the supportAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportAction }
     *     
     */
    public void setSupportAction(SupportAction value) {
        this.supportAction = value;
    }

    /**
     * Gets the value of the activationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the activationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActivationId() {
        if (activationId == null) {
            activationId = new ArrayList<String>();
        }
        return this.activationId;
    }

}
