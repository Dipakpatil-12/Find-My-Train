package Spark_2_0_Java_Full_Stack_.UserInput;
import java.util.Scanner;

public class userinput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);


    }
}
