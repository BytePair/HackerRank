import java.io.*;
import java.util.*;

import java.util.BitSet;


public class BitSetChallenge {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int setSize = s.nextInt();
        int numCommands = s.nextInt();

        BitSet first = new BitSet();
        BitSet second = new BitSet();

        for (int k = 0; k < numCommands; k++) {

            String nextCommand = s.next();
            int firstArg = s.nextInt();
            int secondArg = s.nextInt();
            
            // use switch instead of chained if/else statements
            switch (nextCommand) {

                case "AND":
                    if (firstArg == 1) first.and(second);
                    else second.and(first);
                    break;

                case "OR":
                    if (firstArg == 1) first.or(second);
                    else second.or(first);
                    break;

                case "XOR":
                    if (firstArg == 1) first.xor(second);
                    else second.xor(first);
                    break;
                    
                case "FLIP":
                    if (firstArg == 1) first.flip(secondArg);
                    else second.flip(secondArg);
                    break;

                case "SET":
                    if (firstArg == 1) first.set(secondArg);
                    else second.set(secondArg);
                    break;
                    
                default:
                    break;
            }

            // print count of all flipped bits instead of only given range
            System.out.println(first.cardinality() + " " + second.cardinality());
        }
        
        // close scanner
        s.close();
    }
}