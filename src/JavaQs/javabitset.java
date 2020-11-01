package JavaQs;

import java.util.BitSet;
import java.util.Scanner;

public class javabitset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nm[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        BitSet a = new BitSet(n);
        BitSet b = new BitSet(n);
        for (int i = 0; i < m; i++) {
            String cmds[] = sc.nextLine().split(" ");
            if (cmds[0].equalsIgnoreCase("AND")) {
                if (cmds[1].equals("1")) {
                    a.and(b);

                } else
                    b.and(a);
                System.out.println(a.cardinality() + " " + b.cardinality());

            } else if (cmds[0].equalsIgnoreCase("OR")) {
                if (cmds[1].equals("1")) {
                    a.or(b);

                } else
                    b.or(a);
                System.out.println(a.cardinality() + " " + b.cardinality());

            } else if (cmds[0].equalsIgnoreCase("XOR")) {
                if (cmds[1].equals("1")) {
                    a.xor(b);

                } else
                    b.xor(a);
                System.out.println(a.cardinality() + " " + b.cardinality());

            } else if (cmds[0].equalsIgnoreCase("FLIP")) {
                if (cmds[1].equals("1")) {
                    a.flip(Integer.parseInt(cmds[2]));

                } else
                    b.flip(Integer.parseInt(cmds[2]));
                System.out.println(a.cardinality() + " " + b.cardinality());

            } else if (cmds[0].equalsIgnoreCase("SET")) {
                if (cmds[1].equals("1")) {
                    a.set(Integer.parseInt(cmds[2]));

                } else
                    b.set(Integer.parseInt(cmds[2]));
                System.out.println(a.cardinality() + " " + b.cardinality());

            }
        }

    }
}
