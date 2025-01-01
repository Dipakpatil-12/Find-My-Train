package Advance_Java;

///**
// * This class is to demonstrate what javaDoc is and how it is used in the java industry
// * This is <i>italic</i> word<p>this is new paragraph</p>
// * @author Dipak patil
// * @version 7.00
// * @since 2003
// @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
// */


//Q2//Q1: Create a class and a method with deprecated annotation. What is its effect on program execution?
//class MyDeprecated{
//    @Deprecated
//    public void meth1(){
//        System.out.println("this is my method 1");
//    }
//}
//There is no as such special effect on the program of deprecated annotation. The only thing is that compiler generated a
// warning if we use deprecated method or class in our program.



//Q4: Create an interface and generate an instance from it.
// interface MyInterface{
//    public void display();
//}

import java.io.FileWriter;
import java.io.IOException;

public class CWH_112_Ps_ch_16 {
     //Q1
//    /**
//     *
//     * @param args These are argument supplied to the command line
//     */

    //Q3: Suppress the warning generated in question number 2.
//@SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Q1 Create javadoc from a java program using and without using intellij idea
//
//        /**
//         *
//         * @param i This is first number to add
//         * @param j This is second number to add
//         * @return Sum of two number as an integer
//         * @throws Exception if i is 0
//         * @deprecated This method is deprecated please use + operator
//         */
//        System.out.println("This is my main method");


        //Q2 Create a class & add a method with deprecated annotation. what is its effect on program execution
//        MyDeprecated myDeprecated = new MyDeprecated();
//        myDeprecated.meth1();

        //Q3 suppress the warning in Q2
    //@SuppressWarnings("deprecation") inside class and outside main method

    //Q4 create an interface and generate an instance from it
//    MyInterface i = new MyInterface() {
//        @Override
//        public void display() {
//            System.out.println("Display method");
//        }
//    };

        //Q5 create a file an insert multiplication table in it

        int i = 7;
        String table = "";
        for(int j = 1; j<=10; j++){
            table = table + i + "X" + (j) + "=" + i*(j);
            table = table + "\n";
        }

        try {
            FileWriter fileWriter = new FileWriter("Multiplication_table");
            fileWriter.write(table);
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        //Q6. Repeat Q5 for 2-9 tables

        int a = 2;
        String Multable = "";
        for(int j = 1; j<=10; j++) {
            Multable = Multable + a + "X" + (j) + "=" + a * (a);
            Multable = Multable + "\n";
        }

        try {
            FileWriter fileWriter = new FileWriter("Multiplication_table");
            fileWriter.write(Multable);
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
