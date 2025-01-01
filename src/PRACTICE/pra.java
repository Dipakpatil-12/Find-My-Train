package PRACTICE;


import java.util.Scanner;

public class pra{
    static void fibonacci(int n){
        int first = 0 , second = 1;
        System.out.println("fibonacci series is upto "+ n);
        System.out.print(first+" "+second+" ");
        for(int i=3; i<=n; i++){
            int next = first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
    }
    public static void main(String[] args){
       int n = 5;
       fibonacci(n);

    }
}
