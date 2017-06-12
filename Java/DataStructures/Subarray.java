import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Subarray {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < size; i++) {
            int total = 0;
            for (int j = i; j < size; j++) {
                total += numbers[j];
                if (total < 0) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
    }

}
