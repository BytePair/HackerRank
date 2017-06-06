import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        long[] numbers = new long[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = s.nextLong();
            if (isPrime(numbers[i])) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
    }
        
    public static boolean isPrime(long a) {
        if (a == 1 || a == 2) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}