package PRACTICE;

public class problrm10 {
    public static void main(String[] args) {
        //Q-10) Write a java program to print first 100 prime numbers
       //  only divisors of a prime number are 1 and the number itself.
        // Define the number of primes to find
        final int NUM_PRIMES = 100;

        // Initialize variables
        int count = 0;  // Number of primes found
        int num = 2;    // Current number to check for primality(Starting point)

        // Loop to find and print the first 100 prime numbers
        while (count < NUM_PRIMES) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
                // Method to check if a number is prime
                public static boolean isPrime(int num) {
                    // Handle special cases
                    if (num <= 1) {
                        return false;
                    }
                    if (num == 2) {
                        return true; // 2 is the only even prime number
                    }
                    if (num % 2 == 0) {
                        return false; // Any other even number is not prime
                    }

                    // Check divisibility from 3 up to the square root of num
                    for (int i = 3; i * i <= num; i += 2) {
                        if (num % i == 0) {
                            return false;
                        }
                    }
                    return true;
                }
            }


