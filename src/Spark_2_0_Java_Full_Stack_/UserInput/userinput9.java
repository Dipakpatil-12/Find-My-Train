package Spark_2_0_Java_Full_Stack_.UserInput;
import java.util.Scanner;

public class userinput9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
        fact=fact*i;
        }
        System.out.println("factorial of "+a+" is "+fact);
        }

}
