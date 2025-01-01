package Advance_Java;

import java.util.Calendar;
import java.util.TimeZone;

public class CWH_98_Calender_Class {
    public static void main(String[] args) {
        // We can create an instance of static method provided by calendar class which is getInstance() method by the way calendar class is abstraqct class but
        // it have some concreate method like static method which will give you an instance

        /*Calendar Class in Java
The calendar class in java provides the methods that helps in converting date between a specific instant in time.
It is an abstract class.
Since it is an abstract class, we can not create an instance of this class with the help of a constructor.
We use the static method Calender.getInstance() in order to implement a sub-class.
Example to demonstrate the getInstance() method

         */

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());


        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());

        /*
        Constructors of the Calendar class :
Calendar(): This constructor is used to construct a calendar with the default time zone & locale.
Calendar(Time zone, Locale locale): This constructor is used to construct a calendar with the specified time zone & locale.
Methods of the Calendar class :
get(int field) :
This method returns the value of the specified calendar field.
Example :
         */
        Calendar c1= Calendar.getInstance();
        System.out.println("Current year is :"+ c1.get(Calendar.YEAR));
        System.out.println("Current month is :"+ c1.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
        System.out.println("Current day is :"+ c1.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is :"+ c1.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :"+ c1.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ c1.get(Calendar.SECOND));


/*
        add(int field, int amount) :
        This method is useful for calculating the time after or before of a specified calendar field.
                Example :

 */

                Calendar c3 = Calendar.getInstance();
                System.out.println("Current date is : " + c3.getTime());
                c3.add(Calendar.YEAR, 4);
                System.out.println("After 4 years  : "+ c3.getTime());
                c3.add(Calendar.YEAR, -12);
                System.out.println("Before 12 years  : "+ c3.getTime());
                c3.add(Calendar.MONTH,2);
                System.out.println("After 2 months  : "+ c3.getTime());

   /*
   getWeeksInWeekYear() :
Returns the number of weeks
Example :
    */
                Calendar c4 = Calendar.getInstance();
                System.out.println(c4.getWeeksInWeekYear());

        /*
        getMaximum(int field) :
        Returns the maximum value for the specified calendar field.
        Example :

         */

                Calendar c5 = Calendar.getInstance();
                System.out.println(" The maximum no. of weeks in a year : " + c5.getMaximum(Calendar.WEEK_OF_YEAR));
    }
}
