package JavaQs.Strings;

import java.util.Scanner;

public class Validusername {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regularExpression = "^<A-Za-z](\\w){7,29}$";
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        scan.close();

    }
}
