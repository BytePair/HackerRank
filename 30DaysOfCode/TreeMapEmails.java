import java.io.*;
import java.util.*;


public class TreeMapEmails {

    public static void main(String[] args) {
        
        // get number of lines to read
        Scanner s = new Scanner(System.in);
        int numberOfLines = s.nextInt();
        
        // holds all the names with gmails
        TreeMap<String, Integer> names = new TreeMap<String, Integer>(); 
        
        // for each line see if the email address contains a gmail address
        for (int i = 0; i < numberOfLines; i++) {
            String name = s.next();
            String email = s.next();
            if (email.contains("@gmail.com")) {
                if (names.containsKey(name)) {
                    names.put(name, names.get(name) + 1);
                }
                else {
                    names.put(name, 1);
                }
            }
        }
        
        // print out the filled out tree
        for (Map.Entry<String, Integer> entry : names.entrySet()) {
            String name = entry.getKey();
            Integer times = entry.getValue();
            for (int i = 0; i < times; i++) {
                System.out.println(name);
            }
        }
        
    }

}
