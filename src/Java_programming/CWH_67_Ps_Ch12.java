package Java_programming;
import java.util.Scanner;

//import mypackage.folder.folderL1.folderL2.ClassA;
//import mypackage.folder.folderL1.folderL2.ClassB;

public class CWH_67_Ps_Ch12 {
    public static void main(String[] args) {

      //  Q1. Create three classes calculator , Sc calculator and Hybridcalculator and group them into a package


//public class Calculator {
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public int subtract(int a, int b) {
//        return a - b;


//        public class ScCalculator extends Calculator {
//            public double sin(double angle) {
//                return Math.sin(Math.toRadians(angle));
//            }
//
//            public double cos(double angle) {
//                return Math.cos(Math.toRadians(angle));
//            }
//
//            public double tan(double angle) {
//                return Math.tan(Math.toRadians(angle));


//        public class HybridCalculator extends ScCalculator {
//            public double sqrt(double value) {
//                return Math.sqrt(value);
//            }
//
//            public double power(double base, double exponent) {
//                return Math.pow(base, exponent);
//            }
//        }

      // Q2.Use a build-in package in java to write a class which displays a message ( by using sout ) after taking input from the user
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a message: ");

        // Read the input message
        String message = scanner.nextLine();

        // Display the message
        System.out.println("You entered: " + message);

        // Close the scanner
        scanner.close();


       // Q3.Create a package in class with three package levels folder , folderL1 , folderL2
//        public class ClassA {
//            public void display() {
//                System.out.println("Hello from ClassA!");

//        public class ClassB {
//            public void display() {
//                System.out.println("Hello from ClassB!");

//        public class Main {
//            public static void main(String[] args) {
//                ClassA classA = new ClassA();
//                classA.display();
//
//                ClassB classB = new ClassB();
//                classB.display();

       // Q4.prove that you cannot access default property but can access protected properly from the subclass.
       // You cannot access default properties from a subclass in a different package.
        //You can access protected properties from a subclass, even if it's in a different package.

//        package mypackage;
//
//        public class SuperClass {
//            // Default access modifier (package-private)
//            String defaultProperty = "Default Property";
//
//            // Protected access modifier
//            protected String protectedProperty = "Protected Property";
//        }



//        package anotherpackage;
//
//import mypackage.SuperClass;
//
//        public class SubClass extends SuperClass {
//            public void displayProperties() {
//                // Trying to access default property (will cause a compilation error)
//                // System.out.println("Default Property: " + defaultProperty); // Uncommenting this line will cause an error
//
//                // Accessing protected property (this is allowed)
//                System.out.println("Protected Property: " + protectedProperty);
//            }
//        }

//        package anotherpackage;
//
//        public class Main {
//            public static void main(String[] args) {
//                SubClass subclass = new SubClass();
//                subclass.displayProperties();
//            }
//        }



    }
}
