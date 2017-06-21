import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        // if one starts ahead and has better hops
        if ((x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1)) return "NO";

        // if they have same hops but start in different positions
        if ((v1 == v2) && (x1 != x2)) return "NO";

        // if kangaroo 1 is playing catch up
        if (x1 < x2) {
            while (x1 < x2) {
                x1 += v1;
                x2 += v2;
            }
            return (x1 == x2) ? "YES" : "NO";
        }

        // if kangaroo 2 is playing catch up
        if (x2 < x1) {
            while (x2 < x1) {
                x1 += v1;
                x2 += v2;
            }
            return (x1 == x2) ? "YES" : "NO";
        }

        return "ERROR";

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

    }

}
