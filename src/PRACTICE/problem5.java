package PRACTICE;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
      //  Q-5) Write a java program to print mathematical table of given number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int table;
        for(int i=1;i<=10;i++){
            table = a * i;
            System.out.println(a+"x"+i+"="+table);
        }

    }
}
