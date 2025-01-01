package Advance_Java;

import java.util.Date;

public class CWH_97_dateClass {
    public static void main(String[] args) {
        /*
        Date Class In Java :
Date class in java is available in java.util package.
This class provides the instant in time with precision of millisecond.

Constructors of the date class :
Date(): This constructor is used when we need an object of current date and time.
Date(long milliseconds): This constructor creates a date object from the number of milliseconds passed since January 1, 1970.
         */

        //how to create date class instance for finding the current date
        Date d = new Date();
        System.out.println(d);

        //methods of date class

        System.out.println(d.getTime());
        System.out.println(d.getDate()); //deprecated method
        System.out.println(d.getSeconds());//deprecated method
        System.out.println(d.getYear());//deprecated method

        // Another constructor
        Date d1 = new Date(124,10,9,18,5);
        System.out.println(d1);

        /*Methods of date class :
compareTo() :
Checks for the equality of the two dates.
Returns 0 if the dates are equal; else, returns 1.
Example :

         */
        Date d2= new Date();

        Date d3= new Date(2021,12, 24);  //both dates are different
        System.out.println(d3.compareTo(d2));
    }
}
