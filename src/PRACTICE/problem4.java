package PRACTICE;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        //Q-4) Write a java program to find factorial of given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find out the factorial: ");
        int a = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact = fact * i;
        }
        System.out.println("the factorial of "+a+" is "+fact);

    }
}
