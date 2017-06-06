import java.io.*;
import java.util.*;


public class Caesar {

    public static void main(String[] args) {
        
        // get all inputs 
        Scanner s = new Scanner(System.in);  
        int length = s.nextInt();    
        String str = s.next();
        char[] chars = str.toCharArray();     
        int key = s.nextInt();
        
        // for each character, convert and print
        for (int i = 0; i < length; i++) {
            System.out.print(convert(chars[i], key));
        }
    }
    
    public static char convert(char x, int key) {
        // if non alphabetic it stays as is
        if(!Character.isAlphabetic(x)) {
            return x;
        }
        // use first letter of upper/lower case as a starting point
        char base;
        if (Character.isUpperCase(x)) {
            base = 'A';
        }
        else {
            base = 'a';
        }
        // remove the base value to do calculation with a 0 baseline
        // then add the base back to corresponding answer
        return (char) (((x - base + key) % 26) + base);
    }

}