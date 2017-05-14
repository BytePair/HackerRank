/**
        You are given a string containing characters and only, your task is to change it into a string such that every two consecutive characters are different. To do this, you are allowed to delete the one or more characters in the string.

        Your task is to find the minimum number of required deletions.

        For example, string should be changed to by deleting one character .

        Input Format

        The first line contains an integer , i.e. the number of test cases.
        The next lines contain a string each.

        Constraints

        length of string

        Output Format

        For each test case, print the minimum number of deletions required.

        Sample Input

        5
        AAAA
        BBBBB
        ABABABAB
        BABABA
        AAABBB

        Sample Output

        3
        4
        0
        0
        4

**/

import java.io.*;
import java.util.*;

public class AlternatingCharacters {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */       

        // for the given number of strings
        Scanner scanner = new Scanner(System.in);
        int numberOfStrings = scanner.nextInt();

        for (int i = 0; i < numberOfStrings; i++) {

            // get string from user
            String inputString = scanner.next();

            // keep track of number of letters to be deleted
            int numbersToBeDeleted = 0;
            char currentLetter;
            
            for (int j = 0; j < inputString.length() - 1; j++) {
                currentLetter = inputString.charAt(j);
                if(currentLetter == inputString.charAt(j+1)) {
                    numbersToBeDeleted++;
                }
            }

            System.out.println(String.valueOf(numbersToBeDeleted));

        }

    }

}