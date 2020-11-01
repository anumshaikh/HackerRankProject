import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sha256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        

        // Static getInstance method is called with hashing MD5
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // digest() method is called to calculate message digest
        // of an input digest() return array of byte
        byte[] messageDigestbyte = md.digest(s.getBytes(StandardCharsets.UTF_8));

        // Convert byte array into signum representation
        BigInteger no = new BigInteger(1, messageDigestbyte);

        // Convert message digest into hex value
        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {

            hashtext = "0" + hashtext;
        }
        System.out.println(hashtext);
            // Different
         Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        in.close();

        try {
            MessageDigest messageDigest  = MessageDigest.getInstance("SHA-256");
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {}
    }

    
}
