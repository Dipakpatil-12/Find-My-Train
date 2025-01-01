package Spark_2_0_Java_Full_Stack_.UserInput;
import java.util.Scanner;

public class userinput6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Spark_2_0_Java_Full_Stack_.string: ");
        String a = sc.nextLine();

        int vowelcount = 0;
        for(int i=0;i<a.length();i++){
            char c = Character.toLowerCase(a.charAt(i));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowelcount++;
            }
        }
        System.out.println("No. of Vowels: " + vowelcount);

    }
}
