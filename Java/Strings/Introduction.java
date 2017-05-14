import java.io.*;
import java.util.*;

public class Introduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        // 1. Sum the lengths of A and B
        int totalLength = A.length() + B.length();
        System.out.println(String.valueOf(totalLength));

        // 2. Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?)
        // A.compareTo(B) will return > 0 if A is larger
        if (A.toUpperCase().compareTo(B.toUpperCase()) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // 3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
        StringBuilder result = new StringBuilder();
        result.append(Character.toUpperCase(A.charAt(0)));
        result.append(A.substring(1, A.length()));
        result.append(" ");
        result.append(Character.toUpperCase(B.charAt(0)));
        result.append(B.substring(1, B.length()));
        System.out.println(result.toString());
    }

}