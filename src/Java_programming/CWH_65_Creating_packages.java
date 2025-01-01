package Java_programming;
import java.util.*;
import java.util.Scanner;

public class CWH_65_Creating_packages {
    public static void main(String[] args) {
        /*
        How to create a package in Java :
javac -d.Harry.java
The above code creates a packages folder.

java Harry.java
The above code creates Harry class.

We can also create inner packages by adding packages inner as the package name.
These packages once created can be used by other classes.

*/


        Scanner sc = new Scanner(System.in);
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
    }
}

