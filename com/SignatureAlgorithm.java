
package secure.com;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signatureAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="signatureAlgorithm"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="LK_48"/&gt;
 *     &lt;enumeration value="TRL_113"/&gt;
 *     &lt;enumeration value="TRL_163"/&gt;
 *     &lt;enumeration value="TRL_239"/&gt;
 *     &lt;enumeration value="RSA_512_SHA1"/&gt;
 *     &lt;enumeration value="RSA_1024_SHA1"/&gt;
 *     &lt;enumeration value="RSA_2048_SHA1"/&gt;
 *     &lt;enumeration value="RSA_3072_SHA1"/&gt;
 *     &lt;enumeration value="RSA_4096_SHA1"/&gt;
 *     &lt;enumeration value="RSA_512_SHA2_256"/&gt;
 *     &lt;enumeration value="RSA_1024_SHA2_256"/&gt;
 *     &lt;enumeration value="RSA_2048_SHA2_256"/&gt;
 *     &lt;enumeration value="RSA_3072_SHA2_256"/&gt;
 *     &lt;enumeration value="RSA_4096_SHA2_256"/&gt;
 *     &lt;enumeration value="RSA_1024_SHA2_512"/&gt;
 *     &lt;enumeration value="RSA_2048_SHA2_512"/&gt;
 *     &lt;enumeration value="RSA_3072_SHA2_512"/&gt;
 *     &lt;enumeration value="RSA_4096_SHA2_512"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "signatureAlgorithm")
@XmlEnum
public enum SignatureAlgorithm {

    LK_48("LK_48"),
    TRL_113("TRL_113"),
    TRL_163("TRL_163"),
    TRL_239("TRL_239"),
    @XmlEnumValue("RSA_512_SHA1")
    RSA_512_SHA_1("RSA_512_SHA1"),
    @XmlEnumValue("RSA_1024_SHA1")
    RSA_1024_SHA_1("RSA_1024_SHA1"),
    @XmlEnumValue("RSA_2048_SHA1")
    RSA_2048_SHA_1("RSA_2048_SHA1"),
    @XmlEnumValue("RSA_3072_SHA1")
    RSA_3072_SHA_1("RSA_3072_SHA1"),
    @XmlEnumValue("RSA_4096_SHA1")
    RSA_4096_SHA_1("RSA_4096_SHA1"),
    @XmlEnumValue("RSA_512_SHA2_256")
    RSA_512_SHA_2_256("RSA_512_SHA2_256"),
    @XmlEnumValue("RSA_1024_SHA2_256")
    RSA_1024_SHA_2_256("RSA_1024_SHA2_256"),
    @XmlEnumValue("RSA_2048_SHA2_256")
    RSA_2048_SHA_2_256("RSA_2048_SHA2_256"),
    @XmlEnumValue("RSA_3072_SHA2_256")
    RSA_3072_SHA_2_256("RSA_3072_SHA2_256"),
    @XmlEnumValue("RSA_4096_SHA2_256")
    RSA_4096_SHA_2_256("RSA_4096_SHA2_256"),
    @XmlEnumValue("RSA_1024_SHA2_512")
    RSA_1024_SHA_2_512("RSA_1024_SHA2_512"),
    @XmlEnumValue("RSA_2048_SHA2_512")
    RSA_2048_SHA_2_512("RSA_2048_SHA2_512"),
    @XmlEnumValue("RSA_3072_SHA2_512")
    RSA_3072_SHA_2_512("RSA_3072_SHA2_512"),
    @XmlEnumValue("RSA_4096_SHA2_512")
    RSA_4096_SHA_2_512("RSA_4096_SHA2_512");
    private final String value;

    SignatureAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureAlgorithm fromValue(String v) {
        for (SignatureAlgorithm c: SignatureAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
