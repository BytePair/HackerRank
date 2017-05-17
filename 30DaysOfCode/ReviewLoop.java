import java.io.*;
import java.util.*;

public class ReviewLoop {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        // check how many strings we will be given
        Integer numStrings = s.nextInt();
        
        // for each string 
        for (int i = 0; i < numStrings; i++) {
            
            String evens = "";
            String odds  = "";

            String currentWord = s.next();

            for (int j = 0; j < currentWord.length(); j++) {
                if (j % 2 == 0) {
                    evens += currentWord.charAt(j);
                } 
                else {
                    odds += currentWord.charAt(j); 
                }
            }

            // print the result
            System.out.println(evens + " " + odds);

        }
        
    }

}