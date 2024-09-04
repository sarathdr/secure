
package secure.com;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supportedHostIdTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supportedHostIdTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hostIdType" type="{urn:com.flexnet.lfs.webservice}hostIdentifierType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportedHostIdTypes", propOrder = {
    "hostIdType"
})
public class SupportedHostIdTypes {

    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<HostIdentifierType> hostIdType;

    /**
     * Gets the value of the hostIdType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hostIdType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostIdType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostIdentifierType }
     * 
     * 
     */
    public List<HostIdentifierType> getHostIdType() {
        if (hostIdType == null) {
            hostIdType = new ArrayList<HostIdentifierType>();
        }
        return this.hostIdType;
    }

}
