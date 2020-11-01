import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneDiary {
    public static void main(String[] args) {

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            // Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(bf.readLine());
            HashMap<String, String> diary = new HashMap<String, String>();
            for (int i = 0; i < n; i++) {
                diary.put(bf.readLine(), bf.readLine());
            }
            String searchUser = "";
            while ((searchUser = bf.readLine().toString()) != null) {
                /* final String user = searchUser; */
                String number = "";
                if (diary.containsKey(searchUser))
                    System.out.println(searchUser + "=" + diary.get(searchUser));
                else
                    System.out.println("Not found");
                /*
                 * List<String> number = diary.entrySet().stream().filter(map ->
                 * user.equals(map.getKey()))
                 * .map(Map.Entry::getValue).collect(Collectors.toList());
                 */
                /*
                 * for (Map<String, String> map : listNames) { if (map.containsKey(searchUser))
                 * { number = map.get(searchUser); break; } }
                 */

                /*
                 * if (number == null || number.size() == 0) System.out.println("Not found");
                 * else System.out.println(searchUser + "=" + number.get(0));
                 */
            }
        } catch (Exception e) {
        }

        // System.out.println("Diary " + listNames.toString());
    }
}