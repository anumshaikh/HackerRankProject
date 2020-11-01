package JavaQs.Array2D;

import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum[] = new int[16];
        int s=0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[s] = sum(i,j,arr);
                s++;
            }

        }
      //  System.out.println("Total sub array "+s);
        int max=-100000;
        for(int a : sum)
            max = a > max ? a : max;
        
        System.out.println(max);
    }

   static int sum(int i, int j, int arr[][]) {

           // System.out.println(" Sub Array i="+i+" j= "+j);
            int add = 0;
            add += arr[i][j]+arr[i][j+1]+arr[i][j+2];
            add +=arr[i+1][j+1];
            add += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
           // System.out.println("add "+add);
            return add;

    }

}
