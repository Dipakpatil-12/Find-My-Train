package Spark_2_0_Java_Full_Stack_.UserInput;
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("hello my name is Jarvis!! How are you my friend, "+ name+ " I think your age is "+ age+ " so you are eligible ..glad to meet you!!..Thank you!!");

    }
}
