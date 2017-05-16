import java.io.*;
import java.util.*;

public class Anagrams {
    
    
    static boolean isAnagram(String a, String b) {

        // if strings are different lengths, return early
        if (a.length() != b.length()) return false;
        
        a = a.toUpperCase();
        b = b.toUpperCase();
        Map<Character, Integer> aMap = new HashMap<Character, Integer>();
        Map<Character, Integer> bMap = new HashMap<Character, Integer>();

        // add chars in a to aMap
        for (int i = 0; i < a.length(); i++) {
            if (aMap.containsKey(a.charAt(i))) {
                aMap.put(a.charAt(i), aMap.get(a.charAt(i)) + 1);
            }
            else {
                aMap.put(a.charAt(i), 1);
            }
        }

        // add chars in b to bMap
        for (int i = 0; i < b.length(); i++) {
            if (bMap.containsKey(b.charAt(i))) {
                bMap.put(b.charAt(i), bMap.get(b.charAt(i)) + 1);
            }
            else {
                bMap.put(b.charAt(i), 1);
            }
        }

        // return if the 2 maps are equal
        return aMap.equals(bMap);
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
    }
    
}