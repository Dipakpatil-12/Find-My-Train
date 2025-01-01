package Java_programming;

public class CWH_23_for_loop {
    public static void main(String[] args) {
//      for(int i=1; i<=10; i++){ 
//          System.out.println(i);
// }

        // 2i = Even numbers = 0,2,4,6,8 ('i' is natural number like 0,1,2,3,4,5,......)
        // 2i+1 = Odd numbers = 1,3,5,7,9 (if we add 1 in even numbers we will get odd numbers)
        int n = 5; // n is number of  first natural numbers that is given to print
        for (int i = 0; i < n; i++) {
            System.out.println(2*i+1);
        }
        // Decrementing for loop
        for (int i=5; i>=0; i--){
            System.out.println(i);
        }
        // print first n natural numbers in reverse order

        for(int i=10; i>=0; i--){
            System.out.println(i);
        }

    }
}

