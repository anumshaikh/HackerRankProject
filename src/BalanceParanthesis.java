import java.util.Scanner;
import java.util.Stack;

public class BalanceParanthesis {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine())

        {
            String input = sc.nextLine().trim();
            Stack<String> stack = new Stack<String>();
            for (int i = 0; i < input.length(); i++) {
                if (stack.empty()) {
                    stack.push(input.charAt(i) + "");
                } else {
                    String topelement = stack.lastElement();
                    String inputchar = input.charAt(i) + "";

                    switch (inputchar) {
                        case "}":
                            if (topelement.equals("{"))
                                stack.pop();
                            break;
                        case ")":
                            if (topelement.equals("("))
                                stack.pop();
                            break;
                        case "]":
                            if (topelement.equals("["))
                                stack.pop();
                            break;
                        default:
                            if (inputchar.equals("{") || inputchar.equals("(") || inputchar.equals("[")) {
                                stack.push(inputchar);
                            }
                            break;
                    }

                }
            }
            if (stack.empty())
                System.out.println("true");
            else
                System.out.println("false");
        }
        sc.close();
    }
}
