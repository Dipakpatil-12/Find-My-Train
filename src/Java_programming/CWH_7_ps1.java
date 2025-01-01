package Java_programming;
import java.util.Scanner;

public class CWH_7_ps1 {
    public static void main(String[] args) {
        //write your code here

        // Question-1: write a program to calculate sum of three numbers

        int a = 4;
        int b = 5;
        int c = 7;
        int sum = a+b+c;
        System.out.println(sum);

//        // Question-2: write a program to calculate CGPA using marks of subjects (out of 100)

        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float CGPA = (subject1 + subject2 + subject3)/30;
        System.out.println(CGPA);

//        // Question-3: write a java program which asks the user to write his name and greets them with
//        //"hello <name>,have a good day!!" text
//
        System.out.println("what is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("hello " + name + " have a good day!!");

        // Question-4: write a program to convert kilometers to miles
        // 1 kilometer = 0.621371 miles

        System.out.println("Enter a kilometer:");
        Scanner Sc = new Scanner(System.in);
        double kilometers = Sc.nextInt();
        double miles = kilometers*0.621371;
        System.out.println(miles);

        // Question-5: write a java program to detect whether a number by user is integer or not

        System.out.println("Enter the number:");
        Scanner sc_ = new Scanner(System.in);
        System.out.println(sc.hasNextInt());

    }
}
