import java.io.*;
import java.util.*;


public class Solution {
    
    LinkedList<Character> char_stack;
    LinkedList<Character> char_queue;
    
    // constructor
    Solution () {
        char_stack = new LinkedList<Character>();
        char_queue = new LinkedList<Character>();
    }
    
    // add char to the stack
    public void pushCharacter(char c) {
        char_stack.addLast(c);
    }
    
    // add char to the queue
    public void enqueueCharacter(char c) {
        char_queue.addFirst(c);
    }
    
    // remove char from the stack
    public char popCharacter() {
        return char_stack.removeLast();
    }
    
    // remove char from the queue
    public char dequeueCharacter() {
        return char_queue.removeLast();
    }
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );

    }

}
