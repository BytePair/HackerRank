//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class PhoneBook {
    
    public static void main(String []argh) {
        
        Map<String, Integer> phoneBook = new HashMap<>();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // add numbers to phone book
            phoneBook.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            // print number if they exist
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + String.valueOf(phoneBook.get(s)));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();

    }

}
