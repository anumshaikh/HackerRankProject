import java.util.Scanner;

public class LexicalAnalysis {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        if(s.length() == k){
            return s+"\n"+s;
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        char stringarr[] = s.toCharArray();
        char largestchar = stringarr[0], smallestChar = stringarr[0];
        for (int i = 0; i < stringarr.length; i++) {
            if (stringarr[i] < smallestChar)
                smallestChar = stringarr[i];
            if (stringarr[i] > largestchar)
                largestchar = stringarr[i];
        }
        int sindex = s.indexOf(smallestChar);
        if ((sindex + k) < s.length())
            smallest = s.substring(sindex, sindex + k);
        else
            smallest = s.substring(sindex);
        int index = sindex;
        while (index != -1) {
            index = s.indexOf(smallestChar, index + 1);
            if (index == -1 || (index + k) >= s.length())
                break;
            String sub = s.substring(index, index + k);
            if (sub.compareTo(smallest) < 0)
                smallest = sub;
        }
        int lindex = s.indexOf(largestchar);
        if ((lindex + k) < s.length())
            largest = s.substring(lindex, lindex + k);
        else
            largest = s.substring(lindex);
        index = lindex;
        while (index != -1) {
            index = s.indexOf(largestchar, index + 1);
            if (index == -1 || (index + k) >= s.length())
                break;
            String sub = s.substring(index, index + k);
            if (sub.compareTo(largest) > 0)
                largest = sub;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
