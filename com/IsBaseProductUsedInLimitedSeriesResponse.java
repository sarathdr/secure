
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isBaseProductUsedInLimitedSeriesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isBaseProductUsedInLimitedSeriesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}baseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mapped" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isBaseProductUsedInLimitedSeriesResponse", propOrder = {
    "mapped"
})
public class IsBaseProductUsedInLimitedSeriesResponse
    extends BaseResponse
{

    protected boolean mapped;

    /**
     * Gets the value of the mapped property.
     * 
     */
    public boolean isMapped() {
        return mapped;
    }

    /**
     * Sets the value of the mapped property.
     * 
     */
    public void setMapped(boolean value) {
        this.mapped = value;
    }

}
