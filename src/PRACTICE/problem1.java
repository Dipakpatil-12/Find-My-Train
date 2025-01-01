package PRACTICE;
import java.util.Scanner;


public class problem1 {
    public static void main(String[] args) {
//        Q-1) Write a java program to read shoes brand name from keyboard, based on brand
//        name print brand slogan like below Nike -> Just do it
//        Adidas -> Impossible is nothing Puma -> Forever Faster
//        Reebok -> I Am What I Am

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand name: ");
        String brandName = sc.nextLine();
            String slogan;
            switch (brandName.trim().toLowerCase()) {
                case "nike":
                    slogan = "Just do it";
                    break;
                case "adidas":
                    slogan = "Impossible is nothing";
                    break;
                case "puma":
                    slogan = "Forever Faster";
                    break;
                case "reebok":
                    slogan = "I Am What I Am";
                    break;
                default:
                    slogan = "Brand not recognized";
            }

            // Print the slogan
            System.out.println(brandName + " -> " + slogan);

            // Close the scanner
            sc.close();
        }
    }

