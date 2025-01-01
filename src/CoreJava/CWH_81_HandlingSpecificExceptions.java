package CoreJava;

import java.util.Scanner;

public class CWH_81_HandlingSpecificExceptions {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 56;
        marks[1] = 72;
        marks[2] = 7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int index = sc.nextInt();

        System.out.println("Enter the number you want to divide");
        int number = sc.nextInt();

         try{
             System.out.println("the value of array index you entered is: "+ marks[index]);
             System.out.println("the value of array index/number is: "+marks[index]/number );
         }
         catch(ArithmeticException e){
             System.out.println("Arithmatic exception occured");
             System.out.println(e);
         }
         catch(IndexOutOfBoundsException e){
             System.out.println("Index out of bound exception");
             System.out.println(e);
         }
         catch(Exception e){
             System.out.println("other exception occured");
             System.out.println(e);
         }
    }
}
