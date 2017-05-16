import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        
        Boolean isPalindrome = true;

        for (int i = 0; i < A.length() / 2; i++) {
            if ( A.charAt(i) != A.charAt(A.length() - i - 1) ) {
                isPalindrome = false; 
            }
        }
        
        if (isPalindrome) System.out.println("Yes");
        if (!isPalindrome) System.out.println("No");
        
    }
    
}
