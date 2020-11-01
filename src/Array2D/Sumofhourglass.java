package Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Sumofhourglass {
    /*
     * public static int subarraysum(int arr[][]) { int sum = 0;
     * System.out.println("Array Received "); for (int i = 0; i < 3; i++) { for (int
     * j = 0; j < 3; j++) System.out.print(arr[i][j]); System.out.println(); } for
     * (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) { if (i == 1) { if (j
     * == 1) sum = sum + arr[i][j];
     * 
     * } else sum = sum + arr[i][j]; } } return sum;
     * 
     * }
     * 
     * public static int hourglassSum(int arr[][]) { int sumarray[] = new int[16];
     * int row = 6, col = 6, i = 0, startj = 0, starti = 0; for (int k = 0; k < 16;
     * k++) { // break down into 3*3 metrics for hour glass int subarr[][] = new
     * int[3][3]; if (k >= 0 && k <= 3) starti = 0; if (k >= 4 && k <= 7) starti =
     * 1; if (k >= 8 && k <= 11) starti = 2; if (k >= 12 && k <= 15) starti = 3;
     * System.out.println("Start i " + starti); for (i = starti; i <= starti + 2;
     * i++) { startj = k % 4; int temp = 0; for (int j = startj; j <= startj + 2;
     * j++) { System.out.println( "k = " + k + " ,start j= " + startj + " , j= " + j
     * + " ,i= " + i + " temp= " + temp); subarr[i % 3][temp++] = arr[i][j]; } }
     * sumarray[k] = subarraysum(subarr); System.out.println("k= " + k + " sum " +
     * sumarray[k]);
     * 
     * }
     * 
     * Arrays.sort(sumarray); return sumarray[15]; }
     */

    public static int hourglassSum(int mat[][]) {
        int max = -99999999;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2]) + (mat[i + 1][j + 1])
                        + (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]);
                if (sum > max)
                    max = sum;

            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int result = hourglassSum(arr);
        System.out.println("Largest sum = " + result);

    }
}
