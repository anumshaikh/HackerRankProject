import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers, find the longest subarray where the absolute difference between any two elements //is less than or equal to 1 .

public class PickingNumber {

    public static int longestSubArray(int n, int arr[]) {
        /*
         * int arr[] = new int[a.size()]; for (int i = 0; i < a.size(); i++) arr[i] =
         * a.get(i);
         */
        Arrays.sort(arr);

        System.out.println("After sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int max[] = new int[n];

        // Arrays.sort(arr);

        int len = 1, min = 0, maxindex = 0;
        for (int i = 0; i < n;) {
            if (i + 1 == n)
                break;
            System.out.println(
                    "Elements under test " + arr[i] + "," + arr[i + 1] + " arr[min] " + arr[min] + " len " + len);
            if (Math.abs(arr[i] - arr[i + 1]) <= 1) {
                if (min == 0)
                    min = i;
                if (Math.abs(arr[i + 1] - arr[min]) <= 1) {
                    len++;
                    i = i + 1;
                } else {
                    max[maxindex] = len;
                    maxindex++;
                    min = 0;
                    len = 1;
                    i++;
                    continue;

                }
            } else {
                max[maxindex] = len;
                maxindex++;
                min = 0;
                i++;
                len = 1;
            }

        }
        int returnvalue = max[0];
        for (int i = 0; i < n; i++) {
            System.out.println(max[i]);
            if (returnvalue < max[i])
                returnvalue = max[i];
        }
        return returnvalue;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        String ip[] = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(ip[i]);
        System.out.println("\n Slen " + longestSubArray(n, arr));
        sc.close();

    }
}
