package Advance_Java;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CWH_100_javatimeAPI {
    public static void main(String[] args) {
                // Java.time API provides some classes like LocalDate and LocalTime but this are immutable wherever that gregorian calendar
                // class are mutable we can set the time,date,month using their gregorian calendar class methods

        /*java.time API - Classes & Methods
Date and time features in Java is primarily supported by two packages :

java.util
java.time
The package java.time was added with the release of Java 8 with the aim of solving problems faced by Java developers while handling date and time
 with java.util package such as representing a date without time, etc.

Classes of Java.time :
Clock class:
This class provides access to the current instant, date and time zone using a time-zone.
Clock class is an abstract class therefore it is not possible to create instance of the clock class.
Some methods of the clock class :
abstract ZoneId getZone() : This methods returns the time zone being used to create date and time objects.
abstract Instant instant() : This methods returns the current instant of the clocks.

         */

                LocalDate d = LocalDate.now();
                System.out.println(d);

                LocalTime t = LocalTime.now();
                System.out.println(t);

                LocalDateTime dt = LocalDateTime.now();
                System.out.println(dt);
            }
        }

