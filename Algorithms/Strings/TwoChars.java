import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoChars {
    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        in.close();

        // holds longest passable word
        String winningWord = "";
        int winningLength = winningWord.length();
        
        // get all the chars in the string
        HashSet<Character> allChars = new HashSet<>();
        for (int i = 0;  i < len; i++) allChars.add(s.charAt(i));

        Character[] allCharsArray = allChars.toArray(new Character[allChars.size()]);

        // remove dups from the start
        s = removeDuplicates(s);

        // try removing letters and see what it looks like
        for (int i = 0; i < allCharsArray.length; i++) {
            // remove the char
            String test = removeChar(s, allCharsArray[i]);
            // remove dups
            test = removeDuplicates(test);
            // print ans
            System.out.println(test);
        }

    }
    
    
    private static int getUniques(String s) {
        HashSet<Character> chars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) chars.add(s.charAt(i));
        return chars.size();
    }

    private static boolean hasDuplicates(String s) {
        Pattern dupPattern = Pattern.compile("([a-z])\\1");
        Matcher dupMatcher = dupPattern.matcher(s);
        return dupMatcher.matches();
    }

    private static String removeDuplicates(String s) {
        System.out.println("Before removing dups: " + s);
        Pattern dupPattern = Pattern.compile("([a-z])\\1");
        Matcher dupMatcher = dupPattern.matcher(s);
        String ans = dupMatcher.replaceAll("");
        System.out.println("After removing dups: " + ans);
        if (hasDuplicates(ans)) {
            ans = removeDuplicates(ans);
        }
        return ans;
    }

    private static String removeChar(String s, Character c) {
        Pattern dupPattern = Pattern.compile(c + "");
        Matcher dupMatcher = dupPattern.matcher(s);
        String after = dupMatcher.replaceAll("");
        return after;
    }
}