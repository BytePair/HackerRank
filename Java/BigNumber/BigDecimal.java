import java.math.BigDecimal;
import java.util.*;


class BigDecimal {

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n+2];
        for(int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();


        // use TreeMap so values are sorted
        TreeMap<Double, List<String>> mappy = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            Double d = Double.valueOf(s[i]);
            // if key already exists
            if (mappy.containsKey(d)) {
                mappy.get(d).add(s[i]);
            } 
            // otherwise add new list
            else {
                mappy.put(d, new ArrayList<String>());
                mappy.get(d).add(s[i]);
            }       
        }


        // for each entry, add values back to original array
        int numsLeft = n - 1;
        for (Double d : mappy.navigableKeySet()) {            
            for (int j = mappy.get(d).size() - 1; j >= 0; j--) {
                s[numsLeft] = mappy.get(d).get(j);
                numsLeft--;
            }
        }


        // print original array
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

    }

}
