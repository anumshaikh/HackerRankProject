package BasicTest;

public class CountRepeatinga {

    public static long count(String s, long n) {
        long count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                count++;
        }
        int len = s.length();
       
        long wholestring = n/len;
        count = count * (wholestring);

        long remainingstring = n% len;
        for (int i = 0; i < remainingstring; i++) {
            if (s.charAt(i) == 'a')
                count++;

        }
        return count;

    }

    public static void main(String[] args) {
        long n=count("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq",
                549382313570L);
        System.out.println(n);
    }
}
