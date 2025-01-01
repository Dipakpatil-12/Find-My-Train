package Java_programming;

public class CWH_CH2_Operators {
    public static void main(String[] args) {
        // Arithmatic operator
        int a = 5;
        int b = a + 2;
        System.out.println(b);

        // modulo operator(it takes remainder)
        // 4.8%1.1--->Returns decimal remainder
        int a1 = 8;
        int b1 = 10 % a1;
        System.out.println(b1);

        // Assignment operator
        int a2 = 9;
        a2 *= 3;
        System.out.println(a2);
        System.out.println("So it is what it is !!!!!!!!");

        //comparison operator
        System.out.println(6==7);
        System.out.println(64>7);

        //logical operator(it checks the two expression/codition and give t/f)

        // && operator (and operator) T T = T
        System.out.println(63>4 && 76<98);
        // || operator (0r operator) T F = T / F T = T
        System.out.println(64>5 || 35>5);

        // It is not imp.for beginners you can ignore this operator because it is complicated
        //Bitwise operator (it checks bit 1=10bit)
        System.out.println(2&3);
        // 10 (1&0--->T&F---->F)
        // 11 (1&1--->T&T---->T)
        // --------
        // 10

    }
}
