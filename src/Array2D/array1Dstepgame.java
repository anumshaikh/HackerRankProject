package Array2D;
import java.util.*;

public class array1Dstepgame {

    public static boolean canWinanum(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int n = game.length;
        for (int i = 0; i < n;) {
            if (i + leap < n && game[i + leap] == 0) {
                i = i + leap;
                continue;
            } else if (i + 1 < n && game[i + 1] == 0) {
                i = i + 1;
                continue;

            } else if (i == n - 1 || i + leap >= n - 1)
                return true;
            else if (i - 1 >= 0 && game[i - 1] == 0) {
                i = i - 1;
                while (i + leap < n && game[i + leap] != 0) {
                    if (i - 1 >= 0 && game[i - 1] == 0) {
                        i--;
                    } else
                        return false;
                }
                if (i + leap < n && game[i + leap] == 0)
                    i = i + leap;
                else
                    continue;
            } else
                return false;
        }
        return true;
    }
    
    public static boolean canWin(int leap, int[] game){
        return showResults(leap,game,0);
    }
   static boolean showResults(int leap,int[] game, int i){
        if(i< 0 || game[i] ==1)
        return false;
        if(i >= game.length) return true;
        game[i]=1;

        return (showResults(leap,game,i+1) ||
        showResults(leap, game, i+leap) ||
        showResults(leap, game, i-1));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
