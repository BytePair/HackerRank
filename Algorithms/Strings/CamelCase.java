import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int number_of_words = 1;
        
        // for each upper case char, we have a new word
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                number_of_words += 1;
            }
        }
        
        // print the total number of words
        System.out.println(number_of_words);
    }
    
}
