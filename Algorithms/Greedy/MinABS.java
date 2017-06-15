import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinABS {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        // sort first so values are as close as possible to each other
        Arrays.sort(a);
        
        // set the minimum
        int mini = Math.abs(a[0] - a[1]);
        
        // check if any neighboring pairs are smaller than the first 2
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(a[i] - a[i+1]) < mini) {
                mini = Math.abs(a[i] - a[i+1]);
            }
        }
        
        // print result
        System.out.println(mini);
    }
    
}
