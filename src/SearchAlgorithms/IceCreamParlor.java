package SearchAlgorithms;

import java.util.Arrays;
import java.util.HashMap;

public class IceCreamParlor {
    static int[] icecreamParlor(int m, int[] arr) {
        int flavours[] = new int[2];
        int n = arr.length;
       // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //for (int i = 0; i < n; i++)
            //map.put(new Integer(arr[i]), new Integer(i));
       // Arrays.sort(arr);
        System.out.println("AFter sort");
        for (int a : arr)
            System.out.print(a + " ");

        int no1 = arr[0], no2 = arr[1];

        boolean found = false;
        for (int i = 0; i < n; i++) {
            no1 = arr[i];
            for (int j = i + 1; j < n; j++) {
                no2 = arr[j];
                if (no1 + no2 == m) {
                    System.out.println("no1 "+no1+" no2 "+no2);
                    found = true;
                    flavours[0] = i + 1;
                    flavours[1] =j + 1;
                    break;
                }

            }
            if(found == true) break;

        }
        return flavours;`

    }
    public static void main(String[] args) {
        int arr[]={2 ,2 ,4, 3};
        int flavours[] =icecreamParlor(4,arr);
        for(int a : flavours)
         System.out.print(a+" ");
    }
}
