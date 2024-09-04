
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsOwnerReferencedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsOwnerReferencedResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenced" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsOwnerReferencedResponse", propOrder = {
    "referenced"
})
public class IsOwnerReferencedResponse
    extends BaseResponse
{

    protected boolean referenced;

    /**
     * Gets the value of the referenced property.
     * 
     */
    public boolean isReferenced() {
        return referenced;
    }

    /**
     * Sets the value of the referenced property.
     * 
     */
    public void setReferenced(boolean value) {
        this.referenced = value;
    }

}
