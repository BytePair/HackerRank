import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class SeparateTheNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            System.out.println(findBeautifulString(s));
        }
    }
    
    private static String findBeautifulString(String s) {
        // if length is <= 1, there cannot be a split
        if (s.length() == 0 || s.length() == 1) return "NO";
        // if starts with 0, violates the second condition
        if (s.charAt(0) == '0') return "NO";
        // for each possible length of starting number
        for (int i = 1; i <= s.length()/2; i++) {
            int numberLength = i;
            int currentPosition = 0;
            boolean outOfOrderNumberFound = false;
            Long currentNumber = Long.parseLong(s.substring(0, 0 + numberLength));
            // increase current position since we now have the first number
            currentPosition += numberLength;
            // now 
            while (currentPosition + numberLength <= s.length() && !outOfOrderNumberFound) {
                if (String.valueOf(currentNumber).length() != String.valueOf(currentNumber + 1).length()) {
                    numberLength++;
                    if (currentPosition + numberLength > s.length()) {
                        break;
                    }
                }
                Long nextNumber = Long.parseLong(s.substring(currentPosition, currentPosition + numberLength));

                // check if next number starts with 0
                if (String.valueOf(nextNumber).charAt(0) == '0') {
                    outOfOrderNumberFound = true;
                    break;
                }

                // if the next number is not 1 more, we found one out of order
                if (nextNumber != currentNumber + 1) {
                    outOfOrderNumberFound = true;
                    break;
                }
                // increment everything for next loop
                currentNumber = nextNumber;
                currentPosition += numberLength;
            }

            // do a final check for remaining numbers
            if (currentPosition < s.length()) {
                outOfOrderNumberFound = true;
            }

            // if we never found a bad number, return ans
            if (!outOfOrderNumberFound) {
                return "YES " + s.substring(0, i);
            }
        }
        // after going through all possibilities, return "NO"
        return "NO";
    }

}