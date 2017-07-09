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
            // sloppy if/else incoming...
            if (nextCommand.equals("AND")) {
                if (firstArg == 1) {
                    first.and(second);
                } 
                else {
                    second.and(first);
                }
            }
            else if (nextCommand.equals("OR")) {
                if (firstArg == 1) {
                    first.or(second);
                } 
                else {
                    second.or(first);
                }
            }
            else if (nextCommand.equals("XOR")) {
                if (firstArg == 1) {
                    first.xor(second);
                } 
                else {
                    second.xor(first);
                }
            }
            else if (nextCommand.equals("FLIP")) {
                if (firstArg == 1) {
                    first.flip(secondArg);
                } 
                else {
                    second.flip(secondArg);
                }
            }
            else if (nextCommand.equals("SET")) {
                if (firstArg == 1) {
                    first.set(secondArg);
                } 
                else {
                    second.set(secondArg);
                }
            }
            printBitSetCounts(first, second, setSize);
        }
        
        s.close();
    }

    
    private static void printBitSetCounts(BitSet a, BitSet b, int setSize) {
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < setSize; i++) {
            if (a.get(i)) aCount++;
            if (b.get(i)) bCount++;
        }
        System.out.println(String.valueOf(aCount) + " " + String.valueOf(bCount));
    }
}