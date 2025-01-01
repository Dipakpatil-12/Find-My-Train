// what will be the result of the following expression
// float a = 7/4 * 9/2

package Java_programming;

import java.util.Scanner;

public class CWH_12_ps2_ {
    public static void main(String[] args) {
        float a1 = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a1);

        // write a program to encrypt a grade by adding 8 to it ,Decrypt it to show the correct grade
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char) (grade - 8);
        System.out.println(grade);

        // use comparison operator to find out whether a given number is greater then the user entered number o

        Scanner Sc = new Scanner(System.in);
        int a2 = Sc.nextInt();
        System.out.println(a2> 8);


        // write the following expression in java program
        // v^2-u^2/2as
        int v = 4;
        int u = 2;
        int a = 3;
        int s = 1;
        float x = v * v - u * u / 2 * a * s;
        System.out.println(x);
        

        // int a = 7*49/7 + 35/7
        // find the value of a ?
        System.out.println(7*49/7 + 35/7);

    }
}
