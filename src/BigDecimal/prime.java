package BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.nextLine());
     
        if(a.isProbablePrime(1)){
            System.out.println("prime");
        }
        else
        System.out.println("not prime");
    }
}
