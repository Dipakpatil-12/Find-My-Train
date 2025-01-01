package PRACTICE;
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        //Q-8) Write a java program to find sum of digits of given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for sum of digits: ");
        int number = sc.nextInt();
        int sum = 0;

        // Make sure to work with positive numbers
        number = Math.abs(number);

        // Process each digit of the number
        while (number > 0) {

            // Get the last digit of the number int digit = number%10
            int digit = number % 10;

            // Add the digit to the sum
            sum = sum+digit;

            // Remove the last digit from the number
           number = number/10;
        }

        // Display the result
        System.out.println("Sum of digits: " + sum);

        // Close the scanner
        sc.close();
    }
}

