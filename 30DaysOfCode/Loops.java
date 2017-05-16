import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        /* Print first 10 multiples */
        for (int i = 1; i <= 10; i++) {

            System.out.println(String.valueOf(n) + " x " + String.valueOf(i) + " = " + String.valueOf(n * i));

        }

    }
    
}
