import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
       
            while(testCases > 0) {
          
                String pattern = in.nextLine();

                try {

                    Pattern p = Pattern.compile(pattern);
                    // if it compiles successfully let user know it is valid
                    System.out.println("Valid");

                } catch (PatternSyntaxException e) {

                    // if not, catch the exception and let user know it is invalid
                    // System.out.println(e.getMessage());
                    System.out.println("Invalid");
                    
                }
          
            }
       
        in.close();
       
    }
    
}
