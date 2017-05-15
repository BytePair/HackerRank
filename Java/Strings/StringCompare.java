import java.io.*;
import java.util.*;

public class StringCompare {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<String> strings = new ArrayList<>();
        String source;
        String substring;
        String minString;
        String maxString;
        int substringLength;
        
        /* get source string and length of substrings */
        Scanner scanner = new Scanner(System.in);
        source = scanner.next();
        substringLength = scanner.nextInt();
        scanner.close();
        
        /* split source into substrings */
        for (int i = 0; i <= source.length() - substringLength; i++) {
            strings.add(source.substring(i, i + substringLength));
        }

        /* find lexicographically smallest and largest */
        minString = strings.get(0);
        maxString = strings.get(0);
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).compareTo(minString) < 0) {
                minString = strings.get(i);
            }
            if (strings.get(i).compareTo(maxString) > 0) {
                maxString = strings.get(i);
            }
        }

        /* print smallest and largest */
        System.out.println(minString);
        System.out.println(maxString);

    }

}