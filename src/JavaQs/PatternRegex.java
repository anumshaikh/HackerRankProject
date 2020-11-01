package JavaQs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            // Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }

            testCases--;
        }

        // pattern matching for repeating words
       
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

      in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
