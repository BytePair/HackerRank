import java.util.*;


public class OneDArrayTwo {

    public static boolean canWin(int pos, int leap, int[] game) {

        // base case if we moved out of range or the pos is already visited
        if (pos < 0 || game[pos] == 1) {
            return false;
        } 
        // base case if we can win from the current position
        else if (pos + 1 >= game.length || pos + leap >= game.length) {
            return true;
        }

        // mark the position visited
        game[pos] = 1;
        // try neighboring positions (one behind, one forward, or make the leap)
        return canWin(pos - 1, leap, game) || canWin(pos + 1, leap, game) || canWin(pos + leap, leap, game);

    }


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        while (q-- > 0) {

            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(0, leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}