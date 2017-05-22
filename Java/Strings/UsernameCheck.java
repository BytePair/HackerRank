import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UsernameCheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {

            String username = in.nextLine();
            /**
             * String Pattern
             *
             * ^           beginning of pattern
             * [a-zA-Z]    first character must be alphabetic
             * \\w         rest of chars can include underscore
             * {7,29}      combined length between 8 and 30
             * $           end of pattern
             */
            String pattern = "^[a-zA-Z]\\w{7,29}$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);
            
            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

            testCases--;
        
        }

    }

}
