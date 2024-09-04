
package secure.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverEditParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverEditParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:com.flexnet.lfs.webservice}hostEditParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="backupServerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverEditParameters", propOrder = {
    "backupServerId"
})
public class ServerEditParameters
    extends HostEditParameters
{

    protected String backupServerId;

    /**
     * Gets the value of the backupServerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupServerId() {
        return backupServerId;
    }

    /**
     * Sets the value of the backupServerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupServerId(String value) {
        this.backupServerId = value;
    }

}
