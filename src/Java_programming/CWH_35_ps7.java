package Java_programming;

public class CWH_35_ps7 {
    //problem1.Write a Java method to print the multiplication table of a number n.
//    static void multilpication(int n){
//
//        for(int i=1; i<=10; i++){
//            System.out.format("%d X %d = %d\n",n,i,n*i);
//        }
//    }

    //problem2.Write a program using functions to print the following pattern:
    /*
          *

          **

          ***

          ****

     */
//    static void pattern1(int n){
//        for(int i=0; i<n; i++){
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }
//    }

    //problem3.Write a recursive function to calculate the sum of first n natural numbers.
    //sum(n)= 1+2+3+4+5....n;
    //sum(n)= 1+2+3+4+5....n-1+n;
    //sum(n)= sum(n-1)+n
    //sum(3)= 3+sum(2);
    //sum(3)=3+2+sum(1);
    //sum(3)=3+2+1;

//    static int sumRec(int n){
//        if(n==1){
//            return 1;
//        }else{
//            return n+sumRec(n-1);
//        }
//    }
//
    //problem4.Write a function to print the following pattern:
    /*
     ****

     ***

     **

     *

     */
//    static void pattern2(int n){
//        for(int i=0; i<n; i++){
//            for (int j = n; j > i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//    }

    //problem5.Write a function to print the nth term of the Fibonacci series using recursion.
//    static int fib(int n){
//        if(n==1){
//            return 0;
//        } else if (n==2) {
//            return 1;
//        }else{
//            return fib(n-1) + fib(n-2);
//        }
//    }

    //problem6.Write a function to find the average of a set of numbers passed as arguments.
//    static int Avg(int...arr) {
//        int result = 0;
//        for (int e : arr) {
//            result = result + e ;
//        }
//        return result/ arr.length;
//    }


    //problem7.Repeat problem 4 using Recursion.
//    static void pattern1_rec(int n){
//        if(n>0){
//            pattern1_rec(n-1);
////            pattern1_rec(n-1);
////            pattern1_rec(3-1);
////            pattern1_rec(2);
////             pattern1_rec(2-1);
////            pattern1_rec(1);
////            now  this condition is upto 1 there is no zero because the condition says if(n>0)
////            so first print for pattern1_rec(1) then above condtions
//
//            for (int i = 0; i < n; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }

    //problem8.Repeat problem 2 using Recursion.
    static void pattern4_rec(int n){
        if(n>0){
            for (int i = n; i >= 1; i--) {
                System.out.print("* ");
            }
            System.out.println();
            pattern4_rec(n-1);
        }
    }

    //problem9.Write a function to convert Celsius temperature into Fahrenheit.
    static void temperature(float Celcius){
//         formula for converting Celcius into Fahrenheit = (0°C × 9/5) + 32 = 32°F
         float Fahrenheit = (Celcius * 9/5) + 32;
        System.out.println(Fahrenheit);
    }

    public static void main(String[] args) {
//        multilpication(7);
//        pattern1(5);
//        int b = sumRec(5);
//        System.out.println(b);
//       pattern2(4);
//        int result = fib(5);
//        System.out.println(result);
//        int a = Avg(1,2,3,4,5);
//        System.out.println(a);
//         pattern1_rec(4);
//        pattern4_rec(4);

        temperature(38.8f);
    }
}
