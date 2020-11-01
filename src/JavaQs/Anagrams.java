package JavaQs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {

        char arra[] = a.toCharArray();
        char arrb[] = b.toCharArray();

        for (int i = 0; i < arra.length; i++) {
            arra[i] = Character.toLowerCase(arra[i]);
            arrb[i] = Character.toLowerCase(arrb[i]);
        }
        Arrays.sort(arra);
        Arrays.sort(arrb);
        for (int i = 0; i < arra.length; i++) {
            if (Character.toLowerCase(arra[i]) != Character.toLowerCase(arrb[i]))
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
