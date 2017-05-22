import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tags {

    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {

            String line = in.nextLine();

            // regex pattern is <tag> anything except < or > </tag>
            // \\1 to repeat first group in order to match the tags
            // second group in the middle is the content we are looking for
            Pattern p = Pattern.compile("<(.+)>([^<>]+)</\\1>");
            Matcher m = p.matcher(line);
            
            boolean found = false;
            
            // while we keep finding matches in a given line, print the results
            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }
            
            // if no matches found, print "None"
            if (!found) {
                System.out.println("None");
            }

            testCases--;
        }
    
        in.close();
        
    }
    
}
