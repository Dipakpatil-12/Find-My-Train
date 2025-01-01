package Advance_Java;

public class CWH_96_Date {
    public static void main(String[] args) {
        /*Date & Time in Java
   -java.time -> package for date & time classes in java from java 8 onwards

   -Before java 8, java util.package used to hold the date &  time class now these classes are deprecated

   *How java stores a Date?
  -Date in java is stored in the form of a long number. This long number holds the number of milliseconds passed since 1 jan 1970

  -Java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever We ask it for years passed

  -System current Time Millis () returns no of milliseconds passed Once no. of ms are calculated, we can calculate minutes, seconds & years passed

   *Quick quiz: Is it safe to store the no. of ms in a variable of type long?
   =Yes, it is safe to store the number of milliseconds in a variable of type long in Java. The long type in Java is a 64-bit signed
    integer, which means it can represent values from approximately -9.22 quintillion to 9.22 quintillion.
    Since there are about 31.5 million milliseconds in a year, a long can comfortably handle time measurements over very long
    durations, such as many years.
    Just keep in mind that if you're performing calculations that involve very large time spans, you should ensure your logic
    accounts for potential overflows or underflows if you are doing arithmetic with long values, although this is unlikely in
     practical scenarios. Overall, using long for milliseconds in Java is a common and safe practice.

//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

         */
        System.out.println("milliseconds count from 1 jan 1970:- "+System.currentTimeMillis());
        System.out.println("seconds count from 1 jan 1970:- "+System.currentTimeMillis()/1000);
        System.out.println("minutes count from 1 jan 1970:- "+System.currentTimeMillis()/1000/3600);
        System.out.println("days count from 1 jan 1970:- "+System.currentTimeMillis()/1000/3600/24);
        System.out.println("years count from 1 jan 1970:- "+System.currentTimeMillis()/1000/3600/24/365);
    }
}
