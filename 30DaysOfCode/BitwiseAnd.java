import java.io.*;
import java.util.*;


public class BitwiseAnd {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int num_cases = s.nextInt();

        for (int i = 0; i < num_cases; i++) {

            int array_up_to = s.nextInt();
            int bitwise_and_less_than = s.nextInt();
            int current_max = 0;

            for (int j = 1; j < array_up_to; j++) {
                for (int k = j+1; k <= array_up_to; k++) {
                    int current_bitwise = j & k;
                    if (current_bitwise < bitwise_and_less_than && current_bitwise > current_max) {
                        current_max = current_bitwise;
                    }
                }
            }

            System.out.println(current_max);

        }

    }

}
