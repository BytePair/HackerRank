import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Primality {

   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      
      /* tests if a BigInteger is probably a prime */
      Boolean isAPrime = n.isProbablePrime(20);
      System.out.println((isAPrime) ? "prime" : "not prime");
   
    }

}
