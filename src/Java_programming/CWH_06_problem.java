// PROBLEM-1: Write a program to calculate percentage of a given student in CBSE board exam
// His marks from 5 subjects must be taken as input from the keyboard (marks are out of 100)



package Java_programming;
// so basically, first we have to import scanner class
import java.util.Scanner;

public class CWH_06_problem {
    public static void main(String[] args) {

        // then we have to create scanner object
        Scanner sc = new Scanner(System.in);

        // then input the marks for 5 subject as they mention in problem
        System.out.println("Enter marks for 5 subjects");
        // then we have to put methods for each subject
        System.out.println("subject 1:");
        int subject1 = sc.nextInt();
        System.out.println("subject 2:");
        int subject2 = sc.nextInt();
        System.out.println("subject 3:");
        int subject3 = sc.nextInt();
        System.out.println("subject 4:");
        int subject4 =sc.nextInt();
        System.out.println("subject 5:");
        int subject5 =sc.nextInt();

        // then calculate total marks and percentage
        int totalmarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage =  (double)totalmarks/500*100; // (double) means it is typecasting in double from int
        // display the result
        System.out.println("Total marks: " + totalmarks);
        System.out.println("percentage:" + percentage + "%");

        // Close the scanner class
        sc.close();
    }
}
