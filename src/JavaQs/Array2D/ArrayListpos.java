package JavaQs.Array2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
        for(int i=0;i<n;i++){
            String s[] = sc.nextLine().split(" ");
            ArrayList<String> temp = new ArrayList<String>();
            for(int j=1;j<s.length;j++)
                temp.add(s[j]);
            arr.add(temp);
        }
        

        while(sc.hasNextLine()){
            String s[] = sc.nextLine().split(" ");
            try{
            System.out.println(arr.get(Integer.parseInt(s[0])).get(Integer.parseInt(s[1])));
            }
            catch(Exception e){
                System.out.println("Error!"+e.getMessage());
            }

        }


    }
}
