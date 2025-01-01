package Spark_2_0_Java_Full_Stack_.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Class {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(50);
        System.out.println(v);

        //For iteration we have cursors in java for only vector class we used enumeration class for fetching
        // elements or iterate the elements
        //iski limitation hai ki ye only read karta hai remove nahi

        //emumeration ek iterator hai jo ki legacy classes (old class which is only vector and stack class) ke liye use hota hai
        //Vector class mai ek method hai (elements()) jo enumeration ka object throw karta hai

        Enumeration elements = v.elements();

        //hasMoreElements() check karta hai elements/data hai kya nahi class mai (Vector) ...boolean value return karta hai
        while (elements.hasMoreElements()) {
            //nextElement() ye method next element ko fetch karta (print) hai vector mai se
            Integer data = (Integer) elements.nextElement();
            System.out.println(data);
        }
    }
}
