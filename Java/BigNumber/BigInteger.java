import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInteger {

    public static void main(String[] args) {
        
        /* Get two BigIntegers from user */
        Scanner s = new Scanner(System.in);
        BigInteger a = new BigInteger(s.next());
        BigInteger b = new BigInteger(s.next());
        s.close();
            
        /* Print sum */
        BigInteger sum = a.add(b);
        System.out.println(sum);
        
        /* Print product */
        BigInteger product = a.multiply(b);
        System.out.println(product);
        
    }
    
}