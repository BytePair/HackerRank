import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OneDArray {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        
        /* Need to calculate largest hourglass sum */
        
        Integer largestSum = null;

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {
                
                Integer runningTotal = 0;

                // calculate top row
                runningTotal += arr[i][j];
                runningTotal += arr[i][j+1];
                runningTotal += arr[i][j+2];

                // calculate middle row
                runningTotal += arr[i+1][j+1];

                // calculate bottom row
                runningTotal += arr[i+2][j];
                runningTotal += arr[i+2][j+1];
                runningTotal += arr[i+2][j+2];
                
                // check if we have new largest sum
                if (largestSum == null || runningTotal > largestSum) {
                    largestSum = runningTotal;
                }

            }

        }

        // print answer
        System.out.println(largestSum);
        
    }
    
}
