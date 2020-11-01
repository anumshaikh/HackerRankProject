import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.security.*;

public class CanUAccess {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        DoNotTerminate.forbidExit();
        try {
            Class student = CanUAccess.class;
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for (Method methodObj : methods) {
                methodList.add(methodObj.getName());
            }
            Collections.sort(methodList);
            for (String name : methodList) {
                System.out.println(name);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class
                     // Solution.Inner.Private
            // Write your code here

            o = new Inner().new Private();
            System.out.println(num + " is " + ((CanUAccess.Inner.Private) o).powerof2(num));

            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        } // end of try

        catch (DoNotTerminate.ExitTrappedException e1) {
            System.out.println("Unsuccessful Termination!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }// end of main

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }// end of Inner

}// end of Solution

class DoNotTerminate { // This class prevents exit(0)

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
