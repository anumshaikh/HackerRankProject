package BasicTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ListOfTraders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Set<String,Integer> map = new HashSet<String,Integer>();
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            Boolean exist = map.containsKey(name);
        }
    }
    
}
