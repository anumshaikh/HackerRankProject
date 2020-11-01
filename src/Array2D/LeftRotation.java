package Array2D;

import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int ele[] = new int[d];
        for (int i = 0; i < d; i++) {
            ele[i] = arr.get(i);
        }

        for (int j = d; j < n - 1 - d; j++) {
            arr.set(j - d, arr.get(j));
        }
        for (int j = n - d, i = 0; j < n - 1 && i < d; j++, i++) {
            arr.set(j, ele[i]);

        }

        return arr;

    }

}
