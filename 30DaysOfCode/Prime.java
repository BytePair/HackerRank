import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = s.nextInt();
            if (isPrime(numbers[i])) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
    }
        
    public static boolean isPrime(int a) {
        if (a == 1) {
            return false;
        }
        if (a == 2) {
            return true;
        }
        int sqRoot = (int) Math.sqrt(a);
        for (int i = 2; i <= sqRoot; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}