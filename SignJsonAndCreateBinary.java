package secure;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.FileOutputStream;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.Security;
import java.util.HashMap;
import java.util.Map;

public class SignJsonAndCreateBinary {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static byte[] signJsonContent(byte[] jsonBytes, PrivateKey privateKey) throws Exception {
        Signature signature = Signature.getInstance("SHA256withRSA", "BC");
        signature.initSign(privateKey);
        signature.update(jsonBytes);
        return signature.sign();
    }

    public static void createBinaryFileWithSignature(String filePath, byte[] signature, byte[] jsonBytes) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(intToByteArray(signature.length));
            fos.write(signature);
            fos.write(jsonBytes);
        }
    }

    private static byte[] intToByteArray(int value) {
        return new byte[] {
                (byte)(value >>> 24),
                (byte)(value >>> 16),
                (byte)(value >>> 8),
                (byte)value
        };
    }

    public static void main(String[] args) throws Exception {
        KeyPair keyPair = KeyGeneratorUtil.generateRSAKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();

        // Create JSON content
        Map<String, Object> jsonContent = new HashMap<>();
        jsonContent.put("name", "Test");
        jsonContent.put("value", 123);

        ObjectMapper objectMapper = new ObjectMapper();
        byte[] jsonBytes = objectMapper.writeValueAsBytes(jsonContent);

        // Sign JSON content
        byte[] signature = signJsonContent(jsonBytes, privateKey);

        // Create binary file
        String binaryFilePath = "signed_json.bin";
        createBinaryFileWithSignature(binaryFilePath, signature, jsonBytes);
    }
}
