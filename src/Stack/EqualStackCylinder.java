package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER_ARRAY h1 2. INTEGER_ARRAY h2 3. INTEGER_ARRAY h3
     */
    static int findlargest(int add[]) {
        if (add[0] >= add[1] && add[0] >= add[2])
            return 0;
        if (add[1] >= add[0] && add[1] >= add[2])
            return 1;
        if (add[2] >= add[0] && add[2] >= add[1])
            return 2;

        return -1;
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
       
        int arr[] = new int[3];
        arr[0] = h1.stream().mapToInt(a->a).sum();
          arr[1] = h2.stream().mapToInt(a->a).sum();
          arr[2] = h3.stream().mapToInt(a -> a).sum();

          int top[] =new int[3];

          while(arr[0]!=arr[1] && arr[1]!=arr[2]){
              int index = findlargest(arr);
              int element;
          if(index == 0){
              element=  h1.get(top[0]++);
              arr[0]-=element;
          }else if(index ==1 ){
             element= h2.get(top[1]++);
             arr[1] -= element;
          }else if(index == 2){
              element=h3.get(top[2]++);
              arr[2] -= element;
          }

          }
          return arr[0];


    }

}

public class EqualStackCylinder {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}



/*
public class EqualStackCylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];

        String s[] = sc.nextLine().split(" ");
        arr[0] = Integer.parseInt(s[0]);
        arr[1] = Integer.parseInt(s[1]);
        arr[2] = Integer.parseInt(s[2]);

        int add[] = new int[3];

        int max = (arr[0] >= arr[1]) ? arr[0] : arr[1];
        max = (arr[2] >= max) ? arr[2] : max;
        int stack[][] = new int[3][max];

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < arr[j]; i++) {
                int element = sc.nextInt();
                add[j] += element;
                stack[j][i] = element;
            }

        }
        int top[] = new int[3];

        while (add[0] != add[1] && add[1] != add[2]) {
            int index = findlargest(add);
            int element = stack[index][top[index]++];
            add[index] = add[index] - element;

        }
        System.out.println(add[0]);

    }

    static int findlargest(int add[]) {
        if (add[0] >= add[1] && add[0] >= add[2])
            return 0;
        if (add[1] >= add[0] && add[1] >= add[2])
            return 1;
        if (add[2] >= add[0] && add[2] >= add[1])
            return 2;

        return -1;
    }

}
*/