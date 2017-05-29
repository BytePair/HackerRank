import java.io.*;
import java.util.*;

public class ArrayList {

    public static void main(String[] args) {
        
        // first get number of arraylists we should make
        Scanner s = new Scanner(System.in);
        int num_lines = s.nextInt();
        ArrayList<ArrayList<Integer>> als = new ArrayList<ArrayList<Integer>>();
        
        // then for each arraylist...
        for (int i = 0; i < num_lines; i++) {
            als.add(new ArrayList<Integer>());
            // add given numbers of ints to each
            int nums_in_al = s.nextInt();
            for (int j = 0; j < nums_in_al; j++) {
                als.get(i).add(s.nextInt());
            }
        }
        
        // for the given number of queries...
        int num_queries = s.nextInt();
        for (int i = 0; i < num_queries; i++) {
            int array_list = s.nextInt();
            int array_list_position = s.nextInt();
            // make the query and print the result
            try {
                Integer result = als.get(array_list - 1).get(array_list_position - 1);
                System.out.println(result);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

    }
    
}
