import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = s.nextInt();
        }
        for (int i = 0; i < count; i++) {
            int current_number = numbers[i];
            // is definitely prime
            if (current_number == 1 || current_number == 2) {
                System.out.println("Prime");
            } 
            // check for prime
            else {
                boolean is_prime = true;
                for(int j = 1; j < current_number; j++) {
                    if (j != 1 && j != current_number) {
                        if (current_number % j == 0) {
                            is_prime = false;
                            break;
                        }
                    }
                }
                if (is_prime) {
                    System.out.println("Prime");
                }
                else {
                    System.out.println("Not prime");
                }
            }
        }
    }
}