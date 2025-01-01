package Spark_2_0_Java_Full_Stack_.UserInput;

public class Pattern {
    public static void main(String[] args) {
//        pattern1(4);
//    }
//
//    static void pattern1(int n) {
//        for (int row = 1; row <= n; row++) {
//            // for every row run the column
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    //pattern2(5);
//}
//    static void pattern2(int n){
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=n; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        pattern3(5);
//    }
//    static void pattern2(int n){
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=n+1-row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        pattern4(5);
//    }
//    static void pattern4(int n){
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }
//
//        pattern5(5);
//    }
//    static void pattern5(int n){
//        for(int row=1; row<=2*n; row++){
//            int totalColsInrow = row>n ? 2*n-row : row;
//            for(int col=1; col<=totalColsInrow; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        pattern31(4);
    }
    static void pattern31(int n){
        n = 2 * n;
        for(int row=0; row<=n; row++){
            for(int col=0; col<=n; col++){
                int atEveryIndex = 4547;
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
}
