import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();    // original meal price
        int tipPercent = scan.nextInt();        // tip percentage
        int taxPercent = scan.nextInt();        // tax percentage
        scan.close();
      
        // calculate tip and tax
        double tip = mealCost * (tipPercent/100.0);
        double tax = mealCost * (taxPercent/100.0);
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        double exactCost = mealCost + tip + tax;
        int totalCost = (int) Math.round(exactCost);
      
        // Print the total cost
        System.out.println("The total meal cost is " + String.valueOf(totalCost) + " dollars.");
    }

}