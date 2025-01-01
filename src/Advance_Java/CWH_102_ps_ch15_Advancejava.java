package Advance_Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashSet;

public class CWH_102_ps_ch15_Advancejava {
    public static void main(String[] args) {
        // Q1. Create an arraylist and store names of 10 students inside it ,print it using for-each loop

        ArrayList arr = new ArrayList();
        arr.add("Student-1");
        arr.add("Student-2");
        arr.add("Student-3");
        arr.add("Student-4");
        arr.add("Student-5");
        arr.add("Student-6");
        arr.add("Student-7");
        arr.add("Student-8");
        arr.add("Student-9");
        arr.add("Student-10");

        for(Object o: arr){
            System.out.println(o);
        }

        //Q2. Use the date class in java to print time in the following format  21:47:02

        // Create a Date object for the current time
        Date d1 = new Date();
        System.out.println(d1.getHours()+":"+d1.getMinutes()+":"+d1.getSeconds());

        // Q3. try Q2 using calendar class

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+ c.get(Calendar.SECOND));

        //Q4. try Q2 using java.time API

        LocalTime lt = LocalTime.now();
//        System.out.println(lt);

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("H:m:s");
        String myTime1 = lt.format(df1);
        System.out.println(myTime1);

        //Q5. Create a set in java ,try to store duplicate elements inside this set and verify that the only one instance
        //is stored

        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(69);
        s.add(5);
        s.add(7);
        System.out.println(s);



    }
}
