package Java_programming;

public class CWH_21_loops {
    public static void main(String[] args) {
        System.out.println("print using while loop");
        int i = 1;
        while (i <= 3) {
            //this keeps executing as long as condition is true if condition becomes false it exit from while loop
            System.out.println(i);
            i++;
            // we need to increment each time by one up to given condition
        }
        System.out.println("while loop is executed");

        while (true) {
            System.out.println("I am an infinite loop!!");
            // sometimes it goes into infinite loop because the condition never become false to stop the loop
            int a = 100;
            System.out.println("This is natural numbers!!");
            while (a <= 200) {
                System.out.println(a);
                a++;
            }
        }
    }
}

