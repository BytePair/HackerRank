import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class AppleAndOrange {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int houseStart   = in.nextInt();
        int houseEnd     = in.nextInt();
        int appleTree    = in.nextInt();
        int orangeTree   = in.nextInt();
        int numOfApples  = in.nextInt();
        int numOfOranges = in.nextInt();
        int aOnHouse     = 0;
        int oOnHouse     = 0;

        int[] apples = new int[numOfApples];
        for(int apple_i = 0; apple_i < numOfApples; apple_i++){
            apples[apple_i] = in.nextInt();
            int dropSpot = appleTree + apples[apple_i];
            if (houseStart <= dropSpot && dropSpot <= houseEnd) {
                aOnHouse++;
            }
        }

        int[] oranges = new int[numOfOranges];
        for(int orange_i = 0; orange_i < numOfOranges; orange_i++){
            oranges[orange_i] = in.nextInt();
            int dropSpot = orangeTree + oranges[orange_i];
            if (houseStart <= dropSpot && dropSpot <= houseEnd) {
                oOnHouse++;
            }
        }

        System.out.println(aOnHouse);
        System.out.println(oOnHouse);

    }

}
