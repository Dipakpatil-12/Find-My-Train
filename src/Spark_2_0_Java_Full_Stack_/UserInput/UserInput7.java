package Spark_2_0_Java_Full_Stack_.UserInput;
import java.util.Scanner;

public class UserInput7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
       int input=sc.nextInt();
       int[] arr=new int[5];
       int a=0;
       for(int i=10;i<=50;i++) {
           a = a + i;
       }
           if(input%10==0 && input<=50){
               System.out.println("The number you have input is present in array!!");
           }else{
               System.out.println("The number you have input is not present in array!!");
           }

    }
}
