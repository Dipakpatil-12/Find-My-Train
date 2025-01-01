package Spark_2_0_Java_Full_Stack_.UserInput;
import java.util.Scanner;

public class userinput3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers ");

        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter an integer: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
