package Spark_2_0_Java_Full_Stack_.UserInput;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer for factorial: ");
        int a = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=a;i++){
           fact *= i;
        }
        System.out.println(fact);
    }
}
