import java.io.*;
import java.util.*;


public class JavaList {

    public static void main(String[] args) {
        
        // create new list
        List<Integer> list = new LinkedList<Integer>();
        
        // fill original list
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(s.nextInt());
        }
        
        // get operations 
        int operations = s.nextInt();
        for (int i = 0; i < operations; i++) {
            String command = s.next();
            if (command.equals("Insert")) {
                list.add(s.nextInt(), s.nextInt());
            }
            else if (command.equals("Delete")) {
                list.remove(s.nextInt());
            }
        }
        
        // print results
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        
    }
    
}
