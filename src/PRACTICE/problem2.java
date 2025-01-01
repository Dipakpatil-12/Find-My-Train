package PRACTICE;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
//        Q-2) Write a java program to read person basic salary and calculate Provident Fund
       // amount from the basic salary Formula: Provident Fund is 12 % of Basic Salary
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary: ");
        int salary = sc.nextInt();
        int pf;
        pf = salary*12/100;
        System.out.println("Your basic salary pf is: ");
        System.out.println(pf);

    }
}
