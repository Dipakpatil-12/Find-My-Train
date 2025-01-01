package Java_programming;
import java.util.Scanner;

public class CWH_18_Switchcase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
      // with integer value
        switch(age){
            case 18:
                System.out.println("you are going to became an adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 68:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!!");
        }
        System.out.println("Thanks for using my Java code!");

    // with character value
        String var = "Dipak";

        switch (var) {
            case "Saurabh":
                System.out.println("you are going to became an adult!");
                break;
            case "Dipak":
                System.out.println("You are going to join a job!");
                break;
            case "Anurag":
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!!");
                break;
        }
        System.out.println("Thanks for using my Java code!");
    }
    }

