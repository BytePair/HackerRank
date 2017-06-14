import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class HashMap {

 public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Map<String, ArrayDeque<String>> names = new HashMap<>();

        // create map of first names with possible last names
        for (int i = 0; i < t; i++) {
            
            if (!names.containsKey(pair_left[i])) {
                names.put(pair_left[i], new ArrayDeque());
                names.get(pair_left[i]).push(pair_right[i]);
            }
            else {
                if (!names.get(pair_left[i]).contains(pair_right[i])) {
                    names.get(pair_left[i]).push(pair_right[i]);
                }
            }

            // for each name, get count of possible last names
            int full_names = 0;
            for (Map.Entry<String, ArrayDeque<String>> entry : names.entrySet()) {
                full_names += entry.getValue().size();
            }
            System.out.println(full_names);
            
        }

    }

}
