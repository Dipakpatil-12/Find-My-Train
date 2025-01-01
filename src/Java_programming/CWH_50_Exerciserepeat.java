package Java_programming;
import java.util.Random;
import java.util.Scanner;

        /*Create a class Game, which allows a user to play "Guess the Number" game once.

        Game should have the following methods:
        com.company.Constructor to generate the random number
        takeUserInput() to take a user input of number
        isCorrectNumber() to detect whether the number entered by the user is true
        getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done!
        */

        class Game1{
            public int number;
            public int inputNumber;
            public int noOfGuesses = 0;

            public int getNoOfGuesses() {
                return noOfGuesses;
            }

            public void setNoOfGuesses(int noOfGuesses) {
                this.noOfGuesses = noOfGuesses;
            }

            Game1(){
                Random rand = new Random();
                this.number = rand.nextInt(100);
            }
            void takeUserInput(){
                System.out.println("Guess the number");
                Scanner sc = new Scanner(System.in);
                inputNumber = sc.nextInt();
            }
            boolean isCorrectNumber(){
                noOfGuesses++;
                if (inputNumber==number){
                    System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
                    return true;
                }
                else if(inputNumber<number){
                    System.out.println("Too low...");
                }
                else if(inputNumber>number){
                    System.out.println("Too high...");
                }
                return false;
            }

        }
public class CWH_50_Exerciserepeat {
    public static void main(String[] args) {

                Game1 g = new Game1();
                boolean b= false;
                while(!b){
                    g.takeUserInput();
                    b = g.isCorrectNumber();
                }

            }
        }


