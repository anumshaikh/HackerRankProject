package BigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class addmult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
        
    }
}
