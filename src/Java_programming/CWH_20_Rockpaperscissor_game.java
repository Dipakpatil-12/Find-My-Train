package Java_programming;
import java.util.Scanner;
import java.util.Random;

public class CWH_20_Rockpaperscissor_game {
    public static void main(String[] args) {
        System.out.println("ROCK PAPER SCISSOR GAME");
        System.out.println("*************************");
        System.out.println("\tSelect 0 for Rock\n\tSelect 1 for Paper\n\tSelect 2 for Scissor");
        Scanner sc = new Scanner(System.in);
        Random rc= new Random();
        System.out.println("It's your turn ");
        int human = sc.nextInt(3);
        if(human == 0){
            System.out.println("You have select Rock");
        }
        if(human == 1){
            System.out.println("You have select Paper");
        }
        if(human == 2){
            System.out.println("You have select Scissor");
        }
        System.out.println("Now it's computer's turn!");
        int computer = rc.nextInt(3);
        if(computer==0){
            System.out.println("Computer have select Rock");
        }
        if(computer==1){
            System.out.println("Computer have select Paper");
        }
        if(computer==2){
            System.out.println("Computer have select Scissor");
        }
        if(human==computer){
            System.out.println("Match is draw,Play Again!!");
        }
        else if(human == 0 && computer == 2 || human == 1 && computer == 0 || human == 2 && computer == 1){
            System.out.println("Congratulations you won!! \n Play Again!!");
        }
        else{
            System.out.println("you Lose!! \nbetter Luck next time \n Play again!!");
        }
        System.out.println("<<<<<<<<<<<<<!>>>>>>>>>>>>>");

    }
}
