package Java_programming;
import java.util.Scanner;

public class CWH_13_ch3_strings {
    public static void main(String[] args) {
        String name = new String("harry");
        // we can also use like
        // String name = "harry";
        System.out.println("the name is:");
        System.out.println(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("the value of a is %d and value of b is %f", a, b);
        // OR because it is same
        System.out.format("the value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
        // for only one word print in sentence you can use sc.next();
        //String st = sc.next();
        // but for full sentence you can use sc.nextline();
        String st = sc.nextLine();
        System.out.println(st);
    }
}

