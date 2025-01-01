package Java_programming;
import java.util.Scanner;

public class CWH_05_takinginput {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in); //(system.in) means he wants (user input) keyboard input

        System.out.println("Enter number 1");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
       // int b = sc.nextInt();
        float b = sc.nextFloat();
        // int sum = a + b;
        float sum = a + b;
        System.out.println("the sum of these number is");
        System.out.println(sum);

        // what if I want to check The what type of data is input by user,then we will use hasNextInt() method to check the datatype
        // like suppose the b1 is data then we will check the datatype with boolean datatype whether it is true or false
        // if true then it is integer if false then it is other datatype like float/double/byte/short,etc.

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        // if I want a Spark_2_0_Java_Full_Stack_.string to check then it will be like
        // String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
        // if I want Spark_2_0_Java_Full_Stack_.string sentence then it will be like use method of sc.nextLine();

    }
}
