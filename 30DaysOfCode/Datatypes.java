import java.util.*;
import java.io.*;


class Datatypes {

    public static void main(String []arg) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                
                // byte is an 8-bit signed integer
                if ( x >= -128 && x <= 127) System.out.println("* byte");
                // short is a 16-bit signed integer
                if ( x >= -32768 && x <= 32767) System.out.println("* short");
                // int is a 32-bit signed integer
                if ( x >= -2147483648 && x <= 2147483647) System.out.println("* int");
                // long is a 64-bit signed integer
                if ( x >= -9223372036854775808L && x <= 9223372036854775807L) System.out.println("* long");
            }
            catch (Exception e) {
                // could not fit in a long
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}