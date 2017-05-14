import java.util.Scanner;

/**
    Alice has a binary string, , of length . She thinks a binary string is beautiful if and only if it doesn't contain the substring .

    In one step, Alice can change a to a (or vice-versa). Count and print the minimum number of steps needed to make Alice see the string as beautiful.

    Input Format

    The first line contains an integer, (the length of binary string ).
    The second line contains a single binary string, , of length .

    Constraints

    Each character in .

    Output Format

    Print the minimum number of steps needed to make the string beautiful.

    Sample Input 0

    7
    0101010

    Sample Output 0

    2

    Sample Input 1

    5
    01100

    Sample Output 1

    0

    Sample Input 2

    10
    0100101010

    Sample Output 2

    3

**/


public class BeautifulBinaryString {

    public static void main(String[] args) {

        // string we are replacing
        final String BAD_STRING = "010";

        Scanner scanner = new Scanner(System.in);

        // get length and string
        int stringLength = scanner.nextInt();
        String string = scanner.next();

        int numberOfChanges = 0;
        int indexOfSubstring = string.indexOf(BAD_STRING);
        // while we keep finding substrings
        while (indexOfSubstring != -1) {
            // fix the string 
            String fixed;
            // if the substring is at the end
            if ((indexOfSubstring+3) == stringLength) {
                fixed = string.substring(0, indexOfSubstring+2) + "1";
            }
            // otherwise we need to also grab the end 
            else {
                fixed = string.substring(0, indexOfSubstring+2) + "1" + string.substring(indexOfSubstring+3, stringLength);
            }
            string = fixed;
            numberOfChanges++;
            indexOfSubstring = string.indexOf(BAD_STRING);
        }

        // print the results
        System.out.print(numberOfChanges);
        return;
    }


}