package Java_programming;
import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        // by user input
        int age;
        System.out.println("Enter your age: ");

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi experienced");
        } else if (age > 36) {
            System.out.println("You are semi-semi experienced");
        } else {
            System.out.println("You are not experienced");
        }

        // by declaring int and value
        System.out.println("by declaring int and value: ");
        int age2 = 56;
        if (age2 > 56) {
            System.out.println("You are experienced!");
        } else if (age2 > 46) {
            System.out.println("You are semi experienced");
        } else if (age2 > 36) {
            System.out.println("You are semi-semi experienced");
        } else {
            System.out.println("You are not experienced");
        }
    }
}

