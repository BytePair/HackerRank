import java.io.*;
import java.util.*;


public class NestedLogic {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        final int dailyFee = 15;
        final int monthlyFee = 500;
        
        int totalFee = 0;
        
        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();
        
        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();
        
        scanner.close();
        
        // count years
        if (dueYear < actualYear) {
            totalFee = 10000;
        }
        
        // count months
        else if (dueYear == actualYear && dueMonth < actualMonth) {
            totalFee = (actualMonth - dueMonth) * monthlyFee;
        }
        
        // count days
        else if (dueMonth == actualMonth && dueDay < actualDay) {
            totalFee = (actualDay - dueDay) * dailyFee;
        }
        
        // else no fee
        else {
            totalFee = 0;
        }
        
        // print fee
        System.out.println(totalFee);
        
    }

}
