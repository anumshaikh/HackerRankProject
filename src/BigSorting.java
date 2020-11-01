import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class BigSorting {
    static String[] bigSorting(String[] stringarr) {
        int len = stringarr.length;

        BigInteger unsorted[] = new BigInteger[len];
        for (int i = 0; i < len; i++)
            unsorted[i] = new BigInteger(stringarr[i]);

            //Bubble sort
      /*   for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {

                if (unsorted[i].compareTo(unsorted[j]) == 1) {
                    BigInteger temp = unsorted[j];
                    unsorted[j] = unsorted[i];
                    unsorted[i] = temp;
                }
            }
        } */
        Arrays.sort(unsorted);
/* 
        for (int i = 0; i < len - 1; i++) {

		
			for (int j = i + 1; j > 0; j--) {
				if (unsorted[j].compareTo(unsorted[j-1]) == -1) {
					BigInteger temp = unsorted[j];
					unsorted[j] = unsorted[j - 1];
					unsorted[j - 1] = temp;
				}
            }
        } */

        /*
         * NumberFormat nf = DecimalFormat.getInstance();
         * nf.setMaximumFractionDigits(0); stringarr[i] =nf.format(unsorted[i]) +"";
         */

        for (int i = 0; i < len; i++) {

            stringarr[i] = unsorted[i].toString();
        }
        return stringarr;

    }

    public static void main(String args[]) {
        String[] unsorted = { "4", "1", "10", "2123456780123456" };
        unsorted = bigSorting(unsorted);
        System.out.println("sorted");
        for (int i = 0; i < unsorted.length; i++)
            System.out.println(unsorted[i]);

    }
}
