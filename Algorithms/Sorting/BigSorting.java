import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class BigSorting {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        };
        
        Arrays.sort(unsorted, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if ( s1.length() < s2.length() ) return -1;
                if ( s2.length() < s1.length() ) return 1;
                for (int i = 0; i < s1.length(); i++) {
                    if (Integer.valueOf(s1.charAt(i)) < Integer.valueOf(s2.charAt(i))) {
                        return -1;
                    };
                    if (Integer.valueOf(s2.charAt(i)) < Integer.valueOf(s1.charAt(i))) {
                        return 1;
                    };
                };
                return 0;
            };
        });
        
        for (String s : unsorted) {
            System.out.println(s);
        }
        
    };
    
};
