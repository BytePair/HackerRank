import java.util.*;


public class JavaDequeue {
    
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        
        // deque of all values
        Deque<Integer> deque = new ArrayDeque<>();
        // hashmap of value counts
        Map<Integer, Integer> map = new HashMap<>();
        
        
        // number of ints
        int n = in.nextInt();
        // size of sub-sequence
        int m = in.nextInt();
        // number of unique numbers in sub-sequence
        int uniques = 0;
        // current working integer
        Integer current = 0;
        // integer from last subarray
        Integer fromLastSubArray = 0;
        
        // loop through all values and add to hashmap
        for (int i = 0; i < n; i++) {
            
            current = in.nextInt();
            
            // build the initial map
            if (i < m) {
                deque.add(current);
                addIntToHashMap(current, map);
            }
            
            // otherwise add new int and remove old int
            else {
                deque.add(current);
                addIntToHashMap(current, map);
                fromLastSubArray = deque.remove();
                removeIntFromHashMap(fromLastSubArray, map);
            }
            
            // check for new value of uniques
            if (map.size() > uniques) {
                uniques = map.size();
            }
            
            // if we hit the max possible uniques, we are done
            if (uniques == m) {
                break;
            }
            
        }
        
        System.out.println(uniques);
        
    }
    

    public static void addIntToHashMap(Integer i, Map<Integer, Integer> map) {
        // System.out.println("add " + i);
        if (map.containsKey(i)) {
            int val = map.get(i) + 1;
            map.put(i, val);
        }
        else {
            map.put(i, 1);
        }
    }
    

    public static void removeIntFromHashMap(Integer i, Map<Integer, Integer> map) {
        // System.out.println("remove " + i);
        if (map.containsKey(i)) {
            int val = map.get(i) - 1;
            if (val == 0) {
                map.remove(i);
            }
            else {
                map.put(i, val);
            }
        }
    }
        
}
