package HackerFest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import javax.lang.model.util.ElementScanner14;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maximumPower' function below.
     *
     * The function is expected to return an INTEGER. The function accepts STRING s
     * as parameter.
     */

    static String leftrotate(String s) {

        System.out.print(" left rotate " + s + " ");
        char arr[] = s.toCharArray();
        char newarr[]= new char[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            newarr[i + 1] = arr[i];
        }
        newarr[0]=s.charAt(s.length()-1);

        s = "";
        for (int i = 0; i < arr.length; i++)
            s += newarr[i];
        System.out.println("Return " + s);
        return s;

    }
    static int max(int x,int y)
    {
        if(x>=y) return x;
        else return y;
    }

    public static int maximumPower(String s) {
        // Write your code here
        int power = 1,maxpower=1;
        for (int i = 0; i < s.length()-1; i++) {
            System.out.println("i " + i);
            System.err.println(s + " " + Integer.parseInt(s, 2));
            int decimal = Integer.parseInt(s, 2);
            power = 1;
            System.out.println("result " + decimal / Math.pow(2, power));
            if (decimal % Math.pow(2, power) == 0)
               {
                    maxpower = max(maxpower,power);
                    while(decimal % Math.pow(2, ++power) == 0){}
                    maxpower = max(maxpower,power);

               } 
            else if (decimal % Math.pow(2, power) < 0) {
                System.out.println("inside " + decimal / Math.pow(2, power));
                s = leftrotate(s) + "";
                continue;
            } else {

                while (decimal >= Math.pow(2, ++power) / 2) {
                    System.out.println("inside while " + decimal / Math.pow(2, power));
                    if (decimal % Math.pow(2, power) == 0)
                        maxpower = max(maxpower, power);
                    else if (decimal % Math.pow(2, power) < 0)
                        break;
                }
            }
            System.out.println("End ");
            s = leftrotate(s) + "";

        }

        return maxpower;

    }

}

public class CyclicBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /*
         * BufferedWriter bufferedWriter = new BufferedWriter(new
         * FileWriter(System.getenv("OUTPUT_PATH")));
         */

        String s = bufferedReader.readLine();

        int result = Result.maximumPower(s);
        System.out.println("final " + result);

        /*
         * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
         * 
         * bufferedReader.close(); bufferedWriter.close();
         */
    }
}
