package PRACTICE;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        //Q-9) Write a java program to check given number is Armstrong number or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalnum = num;

        // Calculate the number of digits
        int digits = 0;
        while (num > 0) {
            num = num / 10;
            digits++;
        }
        // Reset the number
        num = originalnum;

        // Calculate the sum of each digit raised to the power of the number of digits
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalnum) {
            System.out.println(originalnum + " is an Armstrong number.");
        } else {
            System.out.println(originalnum + " is not an Armstrong number.");
        }

        // Close the scanner
        sc.close();
    }
}