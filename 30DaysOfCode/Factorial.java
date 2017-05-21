import java.io.*;
import java.util.*;

public class Factorial {

    public static void main( String[] args ) {

        /* takes integer we want to find factorial of */
        Scanner scanner = new Scanner( System.in );
        Integer input = scanner.nextInt();
        scanner.close();

        /* find factorial and print */
        Integer ans = factorial( input );
        System.out.println( ans );
    }
    
    /* returns the number, n, times n-1, until we reach 1 or 0 */
    private static Integer factorial( Integer n ) {
        if ( n == 1 || n == 0 ) return n;
        return n * factorial( n - 1 );
    };
}