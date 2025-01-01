package Advance_Java;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH_99_Gregorian_Calendar_class {
    public static void main(String[] args){

        /*
        GregorianCalendar class & TimeZone in java
GregorianCalendar class is the concrete sub-class of the Calendar class.
This class supports both the Julian and Gregorian calendar systems.

Difference between Calendar and GregorianCalendar class :
The calendar class is an abstract class. So, the instance of this class can not be instantiated. Therefore, we need to use
the static method Calendar.getInstance() to initialize the object of the Calendar class
         */
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //instance of gregorian calendar class
        //Since the GregorianCalendar class is a concrete subclass, it can be initialized as :
        GregorianCalendar gc = new GregorianCalendar();

        //methods
        //1. isLeapYear();
        System.out.println(gc.isLeapYear(2024));

        //2.roll(int field, boolean up) :
        //This method adds/subtracts a single unit of time from the specified time field.
        //true = rolls up the value by 1.
        //false = rolls down the value by 1.
        //Example :

                GregorianCalendar c6 = new GregorianCalendar();
                System.out.println("Date before rolling : " + c6.getTime());

                c6.roll(Calendar.MONTH, true);
                c6.roll(Calendar.DATE, false);
                c6.roll(Calendar.YEAR, true);

                System.out.println("Date after rolling : " + c6.getTime());

                /*3.hashcode():
This method returns the hashcode of the calendar object.
Example :


                 */
        GregorianCalendar c7 = new GregorianCalendar();
        System.out.println("Calendar : " + c7.getTime());
        System.out.println("The hashcode for this calendar is : "+ c7.hashCode());



        //Timezone class
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getDefault());


    }
}
