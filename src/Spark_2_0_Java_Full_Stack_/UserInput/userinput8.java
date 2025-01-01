package Spark_2_0_Java_Full_Stack_.UserInput;
import java.util.Scanner;

public class userinput8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        //array creation
        int[] arr = new int[10];
        //store the values in array that have input from user
        for(int i=0;i<arr.length;i++){
                System.out.println("Enter an integer: ");
                arr[i] = sc.nextInt();
            }
        //print even numbers
        System.out.println("Even numbers: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        //print odd numbers
        System.out.println("Odd numbers: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }

    }
}
