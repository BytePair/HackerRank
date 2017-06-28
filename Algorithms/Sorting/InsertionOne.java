import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class InsertionOne {


    public static void insertIntoSorted(int[] ar) {

        int valueToInsert = ar[ar.length - 1];
        int lastChanged = -1;
        for (int i = ar.length - 2; i >= 0; i--) {
            if (ar[i] > valueToInsert) {
                // shift element over one spot
                ar[i+1] = ar[i];
                // note the last element we moved
                lastChanged = i;
                // print array if element was shifted
                printArray(ar);
            }
        }
        // if we made any shifts, put the new value there
        if (lastChanged != -1) ar[lastChanged] = valueToInsert;
        // print the resulting array
        printArray(ar);

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
            for(int i=0;i<s;i++){
                ar[i]=in.nextInt();
            }
            insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
            System.out.println("");
    }


}
