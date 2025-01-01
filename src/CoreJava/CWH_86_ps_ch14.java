package CoreJava;

import java.util.Scanner;

class MyNewException extends Exception {

    @Override
    public String getMessage() {
        return "MAX retries";
    }
}

public class CWH_86_ps_ch14 {
    public static void main(String[] args) throws MyNewException {

      /*  //Q1.1) Write a java program to demonstrate syntax, logical , runtime errors.

        int a = 12;
        // System.out.println(a)
        // syntax error semicolon is missing

        //print prime numbers between 1-10
        System.out.println(2);
        for (int i = 0; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        // in this program logic is wrong still it will compile and also run, it will not give you satisfied result
        // because they print 9 also but 9 is not a prime number
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println(1000/k);
        // it will work.. until 0 comes because / by zero is Exception it will throw error

        //Q2.2) Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.

        try{
            int v =666/0;
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }/*

       */

        //Q3.3) Write a program that allows you to given. If max retries exceed 5.. print "errors".
//
//
//        int arr[] = new int[3];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//
//        int index;
//        int i =0;
//
//        Scanner sc1 = new Scanner(System.in);
//
//        boolean temp = true;
//        while(temp && i<5) {
//
//            try {
//                System.out.println("Enter the index to check the value in array");
//                index = sc1.nextInt();
//                System.out.println("the value of arr[index] is " + arr[index]);
//                break;
//            }
//            catch (Exception e) {
//                System.out.println("Invalid index..Try again!!");
//                i++;
//            }
//            }
//        if(i>=5){
//            System.out.println("Error");
//        }

        //Q4.4) Modify program in Q3 to throw a custom Exception if max retries are reached.

//
//        int arr[] = new int[3];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//
//        int index;
//        int i =0;
//
//        Scanner sc1 = new Scanner(System.in);
//
//        boolean temp = true;
//        while(temp && i<5) {
//
//            try {
//                System.out.println("Enter the index to check the value in array");
//                index = sc1.nextInt();
//                System.out.println("the value of arr[index] is " + arr[index]);
//                break;
//            }
//            catch (Exception e) {
//                System.out.println("Invalid index..Try again!!");
//                i++;
//            }
//        }
//        if(i>=5){
//            try {
//                throw new MyNewException();
//            }
//            catch(Exception e){
//                System.out.println(e.getMessage());
//            }
//        }

        //Q5.5) Wrap the program in Q3 inside a method which throws your custom Exception.

        int arr[] = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        int index;
        int i =0;

        Scanner sc1 = new Scanner(System.in);

        boolean temp = true;
        while(temp && i<5) {

            try {
                System.out.println("Enter the index to check the value in array");
                index = sc1.nextInt();
                System.out.println("the value of arr[index] is " + arr[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid index..Try again!!");
                i++;
            }
            }
        if(i>=5){
            throw new MyNewException();
        }
    }
}
