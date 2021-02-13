package Stack;


import java.util.Scanner;
import java.util.Stack;

class customdata {
    int data;
    int max;

    customdata(int data, int max) {
        this.data = data;
        this.max = max;
    }
}

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<customdata> stack = new Stack<customdata>();
        int lines = Integer.parseInt(sc.nextLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lines; i++) {
            String current[] = sc.nextLine().split(" ");
            if (current[0].equals("1")) {
                max = (max <= (Integer.parseInt(current[1]))) ? Integer.parseInt(current[1]) : max;
                stack.add(new customdata(Integer.parseInt(current[1]), max));

            }
            if (current[0].equals("2")) {
                if (!stack.isEmpty())
                    stack.pop();
                if (stack.isEmpty())
                    max = Integer.MIN_VALUE;
                else
                    max = stack.peek().max;

            }
            if (current[0].equals("3")) {
                System.out.println(stack.peek().max);
            }

        }
    }
}
