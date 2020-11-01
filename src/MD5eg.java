import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MD5eg {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern reg = Pattern.compile("[A-Za-z0-9]");
        Matcher match = reg.matcher(s);
        boolean b = match.matches();
        if (b) {
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(s.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            System.out.println(hashtext);
        }
        System.out.println("wrong regex");

    }
}
