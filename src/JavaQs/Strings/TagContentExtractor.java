package JavaQs.Strings;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            // Write your code here
            int last = 0, start = 0;
            String tagname;
            Queue<String> queue = new LinkedList<String>();
            int index = 0;

            while (index < line.length() && index != -1) {
                start = line.indexOf("<", last);
                last = line.indexOf(">", start);
                tagname = line.substring(start + 1, last);

                if (!tagname.startsWith("/")) {
                    queue.add(tagname);
                }
                index = line.indexOf("<", last);

            }

            while (!queue.isEmpty()) {

                String top = queue.remove();
                index = line.indexOf("</" + top + ">");
                System.out.println(index);
                if (index == -1) {
                    System.out.println("None");
                    break;
                }

                System.out.println(line.substring(line.indexOf("<" + top + ">") + 1 + top.length() + 1,
                        line.indexOf("</" + top + ">")));

            }


          

            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            } 

            testCases--;
        }
    }
}
