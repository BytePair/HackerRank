import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Binary {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        String binaryString = intToBinaryString(n);
        Integer numberOnes  = consecutiveInts(binaryString, 1);
        
        System.out.println(numberOnes);
    }
    
    private static String intToBinaryString(int n) {
        if (n < 0)  return "error, int < 0";
        if (n == 0) return "0";
        String ans = "";
        while (n > 0) {
            if (n % 2 == 1) {
                ans = "1" + ans;
            }
            else {
                ans = "0" + ans;
            }
            n /= 2;
        }
        return ans;
    }
    
    private static Integer consecutiveInts(String s, int i) {
        int ans = 0;
        int tempLargest = 0;
        char c = Character.forDigit(i, 10);
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == c) {
                tempLargest += 1;
                if (tempLargest > ans) {
                    ans = tempLargest;
                }
            }
            else {
                tempLargest = 0;
            }
        }
        return ans;
    }
    
}
