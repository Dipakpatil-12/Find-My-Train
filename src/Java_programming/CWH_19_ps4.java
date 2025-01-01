package Java_programming;
import java.util.Scanner;

public class CWH_19_ps4 {
    public static void main(String[] args) {

        // Problem-1: what will be the output of this program

//        int a = 10;
//        if (a = 11) {
//            System.out.println("I am a 11");
//        }
//        else{
//            System.out.println("I am not 11");
//      }
// this program gives an error because '=' is for assign the value
// and in if statement there is '=' sign And we think that the sign is for checking the condition NO
// for checking the condition you need to write '==' sign


        // Problem-2: write a program to find out whether a student is pass or fail;if it requires total 40%
        // and atleast 33% in each subject to pass,assume 3 subjects and take marks as an input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 3 subjects: ");

        System.out.println("Subject_1: ");
        int subject_1 = sc.nextInt();
        System.out.println("Subject_2: ");
        int subject_2 = sc.nextInt();
        System.out.println("Subject_3: ");
        int subject_3 = sc.nextInt();

        int total_marks = subject_1 + subject_2 + subject_3;
        System.out.println(total_marks);
        double percentage = (double) total_marks / 300 * 100;
        System.out.println("Your overall percentage is " + percentage + " %");

        if (percentage >= 40 && subject_1 >= 33 && subject_2 >= 33 && subject_3 >= 33) {
            System.out.println("Congratulations,You are pass!!");
        } else {
            System.out.println("Bad-luck,You are fail!!,");
        }
        


        // Problem-3: Calculate income tax paid by an employee to the government as per the stats mentioned below
        // income stats     |      tax
        //  2.5L-5.0L       |      5%
        // 5.0L-10.0L       |      20%
        // Above 10.0L      |      30%
        // Note that there is no tax below 2.5L,take input amount as an input from the user

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = Sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        }
        else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income > 5f && income <= 10f) {
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income > 10f) {
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            tax = tax + 0.3f * (income - 10f);
        }
        System.out.println("The total tax paid by employee is: " + tax);

        // Problem-4: write a java program to find out the day of the week given the number
        //[1 for Monday,2 for Tuesday,3 for Wednesday and so on.....!]

        Scanner sc1 = new Scanner(System.in);
        int day = sc1.nextInt();
        System.out.println("Enter the number: ");
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        // Problem-5: write a java program to find whether a year entered by the user is leap year or not
        // A leap year comes in every 4 years And it has 366 days

        System.out.println("Enter a year: ");
        int year;
        Scanner sc2 = new Scanner(System.in);
        year = sc2.nextInt();
        // A leap year is a year thet exactly divisible by 4 except for century years(years ending with 00)
        // the century year is leap year only if it is perfectly divisible by 400
       if((year%4==0 && year%100!=0)|| year%400==0)
            System.out.println("It is leap year");
        else
            System.out.println("It is not a leap year");


        // Problem-6: Write a java program to find out the type of website from the url
            // .com-->Commercial website
            // .org-->organisational website
            // .in-->indian website

        Scanner sc3 = new Scanner(System.in);
        String website =sc3.next();
        if(website.endsWith(".org")){
            System.out.println("This is organisational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is indian website");
        }
    }
}