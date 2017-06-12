import java.util.*;
import java.io.*;


class JavaMap {
    
    public static void main(String []argh) {
       
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
       
        Map<String, String> phone_nums = new HashMap<String, String>();
       
        for (int i=0; i<n; i++) {
            String name  = in.nextLine();
            String phone = in.nextLine();
            phone_nums.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phone_nums.containsKey(s)) {
                System.out.print(s + "=" + phone_nums.get(s) + "\n");
            }
            else {
                System.out.println("Not found");
            }
        }
       
    }
    
}
