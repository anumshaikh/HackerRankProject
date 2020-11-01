package BigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sortDesc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
           
        }
        Arrays.sort(arr, 0,n,Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String no1, String no2) {
               
                BigDecimal a = new BigDecimal(no1);
                BigDecimal b = new BigDecimal(no2);
                return a.compareTo(b);
            }
        }));
       // Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

    }
}
