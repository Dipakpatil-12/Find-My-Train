package Java_programming;

public class CWH_10_resulting_datatype {
    public static void main(String[] args) {
//        byte x = 5;
//        int y = 6;
//        short z = 8;
//        int a = y + z;
//        System.out.println(a);
//        float b = 6.54f + x;
//        System.out.println(b);

        // Increment and decrement operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is increment
        int j = 67;
        int c = ++j; // first j is increment then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);
        char ch ='a';
        System.out.println(++ch);
    }
}
