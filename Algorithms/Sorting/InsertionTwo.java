import java.io.*;
import java.util.*;


public class InsertionTwo {

    
    public static void insertionSortPart2(int[] ar) { 
        
        if (ar.length == 1) {
            printArray(ar);
            return;
        };
        
        int newPosition = -1;
        
        for (int i = 1; i < ar.length; i++) {
            newPosition = i;
            // look to the left for values
            while (newPosition > 0 && ar[newPosition] < ar[newPosition-1]) {
                swap(ar, newPosition, newPosition-1);
                newPosition--;
            };
            // print array after each pass
            printArray(ar);
        };
        return;
    };
    
    
    public static void swap(int[] ar, int pos1, int pos2) {
        int holder = ar[pos1];
        ar[pos1] = ar[pos2];
        ar[pos2] = holder;
        return;
    };
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertionSortPart2(ar);                
    }; 
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
   };
    
    
};
