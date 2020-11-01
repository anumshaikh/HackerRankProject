import java.util.Scanner;



/**
 * Problem Statement Sum of any row , col ,diagnol should be same the sum is
 * calculated by formula => M = n * (n**2 +1) /2 , where n is side of square
 * i.e. 3*3 , 4*4. no 1 is stored at position (n/2,n-1) (row , col). let i = >
 * n/2 and j= n-1 next numbers are present at location (i-1,j+1) if row is
 * reached to -1, bring it back to n-1 Similarly if colum is reached to n, it
 * will wrap to 0. if number is present at that location , then row will be
 * incremented by 1 , column will be decremented by 2 If the calculated row
 * position is -1 & calculated column position is n, the new position would be:
 * (0, n-2)
 * 
 */

public class MagicSquare {
    public int calcSum(int n) {
        return n * ((int) Math.pow(n, 2) + 1) / 2;
    }

    public Boolean isMagicSquare(int n, int metric[][]) {

        // Check all rows to be equal to sum
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += metric[i][j];
            }
            if (sum != calcSum(n))
                return false;

        }

        // check for all columns
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += metric[j][i];
            }
            if (sum != calcSum(n))
                return false;

        }
        // Check for diagnol
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += metric[i][i];

        if (sum != calcSum(n))
            return false;

        // Check for diaganol 2

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += metric[2 - i][i];
        }
        if (sum != calcSum(n))
            return false;

        return true;
    }

    public int generateMagicSquare(int n, int metric[][]) {

        //Possible square metrics
        int[][] msqr1 = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
        int[][] msqr2 = { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };
        int[][] msqr3 = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
        int[][] msqr4 = { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } };
        int[][] msqr5 = { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };
        int[][] msqr6 = { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } };
        int[][] msqr7 = { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } };
        int[][] msqr8 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
        int sum[] = new int[8];

        //compare cost 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[0] += Math.abs(msqr1[i][j] - metric[i][j]);
                sum[1] += Math.abs(msqr2[i][j] - metric[i][j]);
                sum[2] += Math.abs(msqr3[i][j] - metric[i][j]);
                sum[3] += Math.abs(msqr4[i][j] - metric[i][j]);
                sum[4] += Math.abs(msqr5[i][j] - metric[i][j]);
                sum[5] += Math.abs(msqr6[i][j] - metric[i][j]);
                sum[6] += Math.abs(msqr7[i][j] - metric[i][j]);
                sum[7] += Math.abs(msqr8[i][j] - metric[i][j]);

            }
        }

        //get Minimum
        int min = sum[0];
        for(int i=1;i<8;i++){
            if(sum[i]<min)
                min=sum[i];
        }

        return min;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int metric[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                metric[i][j] = Integer.parseInt(s[j]);
            }

        }

        sc.close();

    }

}