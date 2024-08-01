package secure;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.FileInputStream;
import java.security.PublicKey;
import java.security.Signature;
import java.security.Security;
import java.util.Map;

public class ReadAndVerifyBinaryFile {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static boolean verifySignature(byte[] jsonBytes, byte[] signature, PublicKey publicKey) throws Exception {
        Signature sig = Signature.getInstance("SHA256withRSA", "BC");
        sig.initVerify(publicKey);
        sig.update(jsonBytes);
        return sig.verify(signature);
    }

    private static int byteArrayToInt(byte[] b) {
        return (b[0] << 24) & 0xff000000 |
                (b[1] << 16) & 0x00ff0000 |
                (b[2] << 8) & 0x0000ff00 |
                (b[3]) & 0x000000ff;
    }

    public static void main(String[] args) throws Exception {
        KeyPair keyPair = KeyGeneratorUtil.generateRSAKeyPair();
        PublicKey publicKey = keyPair.getPublic();

        String binaryFilePath = "signed_json.bin";

        try (FileInputStream fis = new FileInputStream(binaryFilePath)) {
            byte[] lengthBytes = new byte[4];
            fis.read(lengthBytes);
            int sigLength = byteArrayToInt(lengthBytes);

            byte[] signature = new byte[sigLength];
            fis.read(signature);

            byte[] jsonBytes = fis.readAllBytes();

            boolean isSignatureValid = verifySignature(jsonBytes, signature, publicKey);

            if (isSignatureValid) {
                ObjectMapper objectMapper = new ObjectMapper();
                Map<String, Object> jsonContent = objectMapper.readValue(jsonBytes, Map.class);
                System.out.println("Signature is valid.");
                System.out.println("JSON content: " + jsonContent);
            } else {
                System.out.println("Signature verification failed.");
            }
        }
    }
}
