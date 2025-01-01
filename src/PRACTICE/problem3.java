package PRACTICE;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        //Q-3) Write a java program to read person age and person salary and print his eligibility for marriage
        //Condition: If person age less than 30 and salary greater than 1 lakh then eligible for marriage
//        int age;
//        int salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();
        if(age<30 && salary>100000){
            System.out.println("You are eligible for marriage!!");
        }else{
            System.out.println("You are not eligible for marriage!!");
        }
    }
}
