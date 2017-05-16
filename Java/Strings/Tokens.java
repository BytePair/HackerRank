import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
public class Tokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        /* if scanner cannot find next line, return early */
        if (!scan.hasNext()) {
            System.out.println("0");
            return;
        }
        
        /* get next line before closing scanner */
        String s = scan.nextLine();
        scan.close();

        /* delim should catch 1 or more of the non-alpha characters */
        String delims = "[ !,?._'@]+";
        String[] tokens = s.trim().split(delims);
        
        /* print number of tokens and then each token on a new line */
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

    }

}
