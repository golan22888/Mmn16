import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.security.SecureRandom;
import java.util.Base64;

public class MsgServer {
    public static void main(String[] args) {
        initialize();
    }

    private static boolean initialize(){
        try {
            InetAddress ip = InetAddress.getLocalHost();
            int port = 1995;
            String serverName = "message_server";
            String uniqueID = generateUniqueID();
            byte[] symmetricKey = generateSymmetricKey();
            String symmetricKeyBase64 = Base64.getEncoder().encodeToString(symmetricKey);

            writeToFile(ip, port, serverName, uniqueID, symmetricKeyBase64);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private static String generateUniqueID() {
        // Generate a unique identification
        StringBuilder uniqueId = new StringBuilder();
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 16; i++) { // 16 characters, 8 bits each
            int randomInt = random.nextInt(256); // Generate random integer (0-255)
            uniqueId.append(String.format("%02X", randomInt)); // Convert to hexadecimal and append
        }
        return uniqueId.toString();
    }

    private static byte[] generateSymmetricKey() {
        // Generate a symmetric key (example implementation)
        SecureRandom random = new SecureRandom();
        byte[] key = new byte[32]; // 256-bit key
        random.nextBytes(key); // Fill key with random bytes
        return key;
    }
    private static void writeToFile(InetAddress ipAddress, int port, String serverName, String uniqueID, String symmetricKeyBase64) throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("msg.info.txt"))) {
            // Write server information to file
            writer.write(ipAddress.getHostAddress());
            writer.write(":" + port + "\n");
            writer.write(serverName + "\n");
            writer.write(uniqueID + "\n");
            writer.write(symmetricKeyBase64 + "\n");
        }
    }
}
