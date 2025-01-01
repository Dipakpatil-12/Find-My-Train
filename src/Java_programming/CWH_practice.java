package Java_programming;

public class CWH_practice {
    public static void main(String[] args) {
                int age = 18;
        if (age >= 18) {
            System.out.println("you are eligible");
        } else if (age == 10) {
            System.out.println("never!!");
        } else {
            System.out.println("no");
        }
        int b = 1;
        switch (b) {
            case 1:
                System.out.println("yes!!");
                break;
            case 2:
                System.out.println("No!!");
                break;
            case 3:
                System.out.println("Never!!");
                break;
        }
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        int c = 0;
        do {
            System.out.println(c);
            c++;
        }
        while (c<= 10);

        for (int a = 0; a <= 10; a++) {
            System.out.println(a);
        }
    }
}
