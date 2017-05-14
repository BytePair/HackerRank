import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CalendarTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String month = in.next();
        String day = in.next();
        String year = in.next();

        // convert to ints (!! MONTH IS -1 BECAUSE JAN HAS 0 INDEX !!)
        int monthInt = Integer.valueOf(month) - 1;
        int dayInt   = Integer.valueOf(day);
        int yearInt  = Integer.valueOf(year);
        
        // create new calendar object and set the date
        Calendar calendar = Calendar.getInstance();
        calendar.set(yearInt, monthInt, dayInt);

        // find what day of the week that was using SimpleDateFormat
        Date date = calendar.getTime();
        SimpleDateFormat df = new SimpleDateFormat("EEEE");
        System.out.println(date.toString());
        System.out.println(df.format(date).toUpperCase());

    }
}