import java.util.*;
import java.io.*;

public class JavaLoopsTwo {

    public static void main(String []arg){

        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for (int i=0; i<t; i++) {
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            Double doubly = 0.0;
            Integer intly = 1;
            
            ArrayList<Integer> ans = new ArrayList<>(n);
            
            for (int j = 0; j < n; j++) {
                
                if (j == 0) {
                    doubly = (a + (Math.pow(2, j) * b));
                    intly = doubly.intValue();
                    ans.add(j, intly);
                }
                
                else {
                    doubly = ans.get(j-1) + ((Math.pow(2, j) * b));
                    intly = doubly.intValue();
                    ans.add(j, intly);
                }

                System.out.print(String.valueOf(ans.get(j)) + " ");
            }
            
            // newline for each set
            System.out.print("\n");
        }
        in.close();
    }
}
