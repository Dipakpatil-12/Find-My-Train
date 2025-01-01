package Spark_2_0_Java_Full_Stack_.UserInput;
import java.util.Scanner;

public class userinput4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=1;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
