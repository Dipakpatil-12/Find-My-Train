package Java_programming;

public class CWH_09_ch2_op_precendence {
    public static void main(String[] args) {
        // Precedence and associativity
        int a = 6*5-34/2;
        /*
        Highest precedence  goes to * and /. they are then evaluated on the basis of a
        left to right associativity
        =30-34/2
        =30-17
        =13
         */
        int b = 60/5-34*2;
        /*
         =12-34*2
         =12-68
         =-56
         */
        //System.out.println(a);
        //System.out.println(b);

        /*
         a=b=45;
         '=' means right to left associativity
         means first b=45 then a=b
         */
        // Quick quiz
        //quiz1
        int x = 6;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);

        //quiz2
        int l = 1;
        int m = 4;
        int n = 5;
        int o = (m*m)- 4*l*n/2*m;
        System.out.println(o);
    }
}
