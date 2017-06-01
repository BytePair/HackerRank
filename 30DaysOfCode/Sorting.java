import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int totalNumberOfSwaps = 0;
        
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, j, j+1);
                    numberOfSwaps++;
                    totalNumberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        
        /**
         * Sample Output
         *
         * Array is sorted in 0 swaps.
         * First Element: 1
         * Last Element: 3
         */
        
        System.out.println("Array is sorted in " + String.valueOf(totalNumberOfSwaps) + " swaps.");
        System.out.println("First Element: " + String.valueOf(a[0]));
        System.out.println("Last Element: " + String.valueOf(a[n-1]));
    }
    
    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return;

    }
    
}
