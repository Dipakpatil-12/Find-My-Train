package CoreJava;

import java.util.Scanner;
import java.util.InputMismatchException;

         /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */


        class InvalidInputException extends InputMismatchException{
            @Override
            public String toString() {
                return "Not a valid operation";
            }

            @Override
            public String getMessage() {
                return "Pls enter a valid operation";
            }
        }

        class ZeroException extends ArithmeticException{
            @Override
            public String toString() {
                return "Cannot divide by 0";
            }
            @Override
            public String getMessage() {
                return "Enter a number other than 0";
            }
        }

        class MaxInputException extends InputMismatchException{
            @Override
            public String toString() {
                return "Number can't exceed 100000";
            }

            @Override
            public String getMessage() {
                return "Pls enter a number <= to 100000";
            }
        }

        class MaxMultiplierReachedException extends ArithmeticException{
            @Override
            public String toString() {
                return "Cannot multiply by a number > 7000";
            }

            @Override
            public String getMessage() {
                return "Pls enter a number <=7000";
            }
        }



        public class CWH_87_Exercise_6_Custom_Calculator {
            public static void main(String[] args) {

                System.out.println("************************* Welcome to our Custom calculator ********************");

                int a,b;
                long sol;
                char op;
                Scanner sc=new Scanner(System.in);

                System.out.println("Enter 2 numbers: ");
                a=sc.nextInt();
                b=sc.nextInt();

                if(a>100000 || b>100000)
                    throw new MaxInputException();


                System.out.println("Enter the operation sign: ");
                op=sc.next().charAt(0);


                switch(op)
                {
                    case '+':
                        sol=a+b;
                        break;

                    case '-':
                        sol=a-b;
                        break;

                    case '/':
                        if(b==0) {
                            throw new ZeroException();
                        }else {
                            sol = a / b;
                        }
                        break;

                    case '*':
                        if( a>7000 || b>7000 )
                            throw new MaxMultiplierReachedException();
                        else
                            sol=a*b;
                        break;

                    default:
                        throw new InvalidInputException();
                }

                System.out.println("The ans is: "+sol);


            }
        }
