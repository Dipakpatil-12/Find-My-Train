package Spark_2_0_Java_Full_Stack_.UserInput;

public class sumdigits {
    public static void main(String[] args) {
           int number = 123456; // Replace with your number
           int sum = 0;
           int originalNumber = number; // Store the original number

            // Handle negative numbers by taking absolute value
            if (number < 0) {
                number = Math.abs(number);
            }

            // Sum up the digits
            while (number > 0) {
                int digit = number % 10; // Extract the last digit
                sum += digit; // Add the digit to the sum
                number /= 10; // Remove the last digit
            }

            System.out.println("Original number: " + originalNumber);
            System.out.println("Sum of digits: " + sum);
        }
    }


