import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MarsExplore {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        int loops = S.length() / 3;
        int numOfErrors = 0;
        
        for (int i = 0; i < loops; i++) {
            
            if (S.charAt((i * 3)) != 'S') numOfErrors++;
            if (S.charAt((i * 3) + 1) != 'O') numOfErrors++;
            if (S.charAt((i * 3) + 2) != 'S') numOfErrors++;
            
        }
        
        System.out.println(numOfErrors);
        
    }
    
}
