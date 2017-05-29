import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        String source = s.next();
        
        // for each char in the string...
        for (int i = 0; i < source.length() - 1; i++) {
            // if two of same chars are next to each other...
            if (source.charAt(i) == source.charAt(i+1)) {
                // remove that section of the string...
                source = source.substring(0,i) + source.substring(i+2,source.length());
                // and reset i to 0 (i++ runs after each loop, so -1 + 1 = 0)
                i = -1;
            }
        }
        
        if (source.equals("")) source = "Empty String";
        System.out.println(source);
    }
}