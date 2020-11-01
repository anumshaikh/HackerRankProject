package JavaQs.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDelete {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<Integer>();
        String arr[] = sc.nextLine().split(" ");
        for(int i=0;i<N;i++)
            list.add(Integer.parseInt(arr[i]));
        int nq= Integer.parseInt(sc.nextLine());
        for(int i=0;i<nq;i++){
            String query = sc.nextLine();
            if(query.equals("Insert")){
                String input[] = sc.nextLine().split(" ");
                
                list.add(new Integer(input[0]), new Integer(input[1]));
            }
            else if(query.equals("Delete"))
            list.remove(Integer.parseInt(sc.nextLine()));
        }
        for(Integer x : list)
        System.out.print(x+" ");
    }
}
