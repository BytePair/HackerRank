import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArrayList {

    public static void main(String[] args) {
        
        /**
         *  Build the ArrayList
         */
        
        Scanner s = new Scanner(System.in);
        
        // get the initial size of the array list
        int size = Integer.valueOf(s.nextLine());
        
        // create new array list to hold the 2d array
        List<ArrayList<Integer>> array = new ArrayList<>();
        
        // for each sub array
        for (int i = 0; i < size; i++) {    
            
            // add the new sub array
            array.add(i, new ArrayList<Integer>());
            
            // get the sub array size
            int subSize = s.nextInt();
            
            // and add the interger to the subarrays
            for (int j = 0; j < subSize; j++) {
                int nextInt = s.nextInt();
                array.get(i).add(j, nextInt);
            }    
        }
        
        /**
         *  ArrayList Complete, Now Make Queries
         */
        
        // get number of queries
        int numQueries = s.nextInt();
        
        // for each query...
        for (int k = 0; k < numQueries; k++) {
            
            // get the coordinates...
            int x = s.nextInt();
            int y = s.nextInt();
            
            // try to find and print integer...
            try {
                System.out.println(array.get(x-1).get(y-1));
            }
            
            // otherwise throw error
            catch (IndexOutOfBoundsException e) {
                // System.out.println(e.toString());
                System.out.println("ERROR!");
            }
            
        }
        
    }
    
}
