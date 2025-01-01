package Spark_2_0_Java_Full_Stack_.UserInput;
import java.util.Scanner;

public class userinput5 {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
       int a = sc.nextInt();

       for(int i=1;i<=10;i++){
           System.out.println(a+"x"+i+"="+(a*i));
       }

    }
}
