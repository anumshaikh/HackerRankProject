package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    static boolean isBalancedParenthesis(String str) {
        String s;
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < str.length(); i++) {
           
            switch (str.charAt(i)) {
                case '{':
                case '[':
                case '(':
                    stack.push("" + str.charAt(i));
                    break;
                case ')':
                    if (stack.isEmpty())
                        return false;
                    s = stack.pop();
                    if (s.equals("("))
                        continue;
                    else
                        return false;

                case ']':
                    if (stack.isEmpty())
                        return false;
                    s = stack.pop();
                    if (s.equals("["))
                        continue;
                    else
                        return false;
                case '}':
                    if (stack.isEmpty())
                        return false;
                    s = stack.pop();
                    if (s.equals("{"))
                        continue;
                    else
                        return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(isBalancedParenthesis(string));

    }
}
