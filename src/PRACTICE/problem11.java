package PRACTICE;

public class problem11 {
    public static void main(String[] args) {
        //pattern problems
        //pattern1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //pattern2
        System.out.println("---------------------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //pattern3
        System.out.println("------------------------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //pattern4
        System.out.println("--------------------------------------------------------------------------");
        //outer loop to handle the rows
        for (int i = 5; i >= 1; i--) {
            //inner loop to print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //inner loop to print stars
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //pattern5
        System.out.println("------------------------------------------------------------------------------");
        // outer loop to handle rows
        for (int i = 0; i < 5; i++) {
            // inner loop to print spaces.
            for (int j = 5 - i; j > 1; j--) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // next line print
            System.out.println();
        }

        //pattern6
        System.out.println("------------------------------------------------------------------------------");
        // outer loop to handle rows
        for (int i = 0; i < 5; i++) {
            // inner loop to print spaces.
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (int j = 5 - i; j > 0; j--) {
                System.out.print("* ");
            }
            // next line print
            System.out.println();
        }

        //pattern7
        System.out.println("------------------------------------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {

                // for left spacing
                System.out.print(" ");
            }

            // used to represent x(i, k)
            int x = 1;
            for (int k = 1; k <= i; k++) {

                // The first value in a line is always 1
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
}

