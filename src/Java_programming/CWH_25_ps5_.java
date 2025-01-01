package Java_programming;

public class CWH_25_ps5_ {
    public static void main(String[] args) {
        // problem1: Write a program to print the following pattern

//             * * * *
//             * * *
//             * *
//             *

//        int n = 4; //(n is rows)
//        for (int i=n; i>0; i--) {
//            for (int j=0; j<i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("\n");
//        }


        // using while loop
//        int n = 4;
//        int i = n;
//        while(i>0){
//            int j = i;
//            while (j>0) {
//                System.out.print("*");
//                j--;
//            }
//            System.out.println();
//            i--;
//        }

        // problem2: Write a program to sum of first x even numbers using while loop
//       int sum = 0;
//       int x = 4;
//       for(int i=0; i<x; i++){
//           sum = sum + (2*i);
//        }
//        System.out.println("Sum of  first x even numbers is: ");
//        System.out.println(sum);
        // first x even numbers are 0 2 4 6 so there add is 12

//        int sum = 0;
//        int x = 4;
//        int i = 0;
//        while(i<x){
//            sum = sum + 2*i;
//            i++;
//        }
//        System.out.println(sum);


        // problem3: Write a program to print multiplication table of a given number n
//        int n = 5;
//        System.out.println("Table of 5: \n");
//        for(int i=1; i<=10; i++){
//           int x=n*i;
//            System.out.println(x);
//        }


        // problem4: write a program to print  multiplication table of 10 in reverse order
//        int n1 = 10;
//        System.out.println("Table of 10 in reverse order: ");
//        for(int i=10; i>=1; i--){
//            int X = n1 * i;
//            System.out.println(X);
//        }


        // problem5: Write a program to find factorial of a given number using for loop
        // what is factorial suppose n = n * n-1 * n-2 .......1
        // suppose 5! = 5*4*3*2*1
//        int a = 5;
//        int factorial = 1;
//        for(int i=1; i<=a; i++){
//            factorial *= i;
//        }
//        System.out.println(factorial);


        // problem6: Using while loop
//        int n = 3;
//        int i = 1;
//        int Factorial = 1;
//        while (i<n) {
//            Factorial *= i; // factorial = factorial * i;
//            i++;
//        }
//        System.out.println(Factorial);

        // problem: Write a program to calculate the sum of the numbers occuring in the multiplication table of 8
       int sum = 0;
       int n1 = 8;
       for(int i=1; i<=10; i++){
           sum = sum + n1*i;
       }
        System.out.println(sum);
    }

}