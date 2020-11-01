package JavaQs;

import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String delims = "[ '.,?!]+";
        String Tokens[] = s.split(delims);
        System.out.println(Tokens.length);

        for(String token : Tokens)
        System.out.println(token);
        // Write your code here.
        scan.close();
    }
}
