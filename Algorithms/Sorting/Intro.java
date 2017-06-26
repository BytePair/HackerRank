import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Intro {

    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        
        int numberToFind = in.nextInt();
        int totalNumberOfNumbers = in.nextInt();
        int position = -1;
        
        for (int i = 0; i < totalNumberOfNumbers; i++) {
            if (numberToFind == in.nextInt()) {
                System.out.println(i);
                break;
            };
        };
        
        in.close();
    
    };
    
};