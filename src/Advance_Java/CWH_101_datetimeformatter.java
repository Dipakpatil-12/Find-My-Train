package Advance_Java;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // Actual date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/YYYY -- H:m a -- E"); //this is format

       String mydate = dt.format(df); //Actual date is convert into format
        System.out.println(mydate);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE; // it is method of datetimeformatter class
        String mydate2 = dt.format(df2);
        System.out.println(mydate2);
    }
}
