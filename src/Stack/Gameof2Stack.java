package Stack;

import java.io.*;

import java.util.*;

public class Gameof2Stack {
    /*
     * Complete the twoStacks function below.
     */
    static int twoStacks(int x, int[] a, int[] b) {
        int moves = 0,sum=0;

        Stack<Integer> stackA = new Stack<Integer>();
        Stack<Integer> stackB = new Stack<Integer>();
        for (int i = a.length - 1; i >= 0; i--)
            stackA.push(a[i]);

        for (int i = b.length - 1; i >= 0; i--)
            stackA.push(b[i]);
       
            while(sum<=x){
                int no1 = sum+stackA.peek();
                int no2 = sum+stackB.peek();
                if(no1 <= x && no1 >=no2){
                    no1= stackA.pop();
                    sum +=no1;
                    moves++;
                }
                else if (no2 <= x && no2 >= no1) {
                    no2=stackB.pop();
                    sum += no2;
                    moves++;
                }
                else break;
                
            }

        

            return moves;
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
