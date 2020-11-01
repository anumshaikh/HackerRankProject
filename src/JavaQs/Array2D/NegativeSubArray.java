package JavaQs.Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        /*
         * Arrays.sort(arr);
         * 
         * for (int i = 0; i < n; i++) System.out.println(arr[i]);
         */
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0)
                    count++;

            }
        }
        System.out.println(count);

    }

}
