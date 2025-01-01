package CoreJava;

import java.util.Scanner;

public class CWH_79_ErrorsDemo {
    public static void main(String[] args) {

        //SYNTAX ERROR
        //int a = 10 -------> so there is semicolon is missing, so it's syntax error
        int b = 20;
        // System.out.println(a+b);

        //LOGICAL ERROR
        // Write a program to print all prime number between a 1 to 10
        System.out.println(2);
        for (int i = 0; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        // in this program logic is wrong still it will compile and also run, it will not give you satisfied result
        // because they print 9 also but 9 is not a prime number


        //RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println(1000/k);
        // it will work until 0 comes because / by zero is Exception it will throw error
    }
}

