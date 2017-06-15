import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MarcCakewalk {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] calories = new Integer[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        
        // save total amount of miles as a long
        Long total_miles = 0L;

        // sort array in reverse order
        Arrays.sort(calories, Collections.reverseOrder());

        // round the double value in order to add to Long
        for (int i = 0; i < n; i++) {
            total_miles += Math.round(calories[i] * Math.pow(2, i));
        }

        // print result
        System.out.println(total_miles);

    }
    
}
