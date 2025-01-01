package Java_programming;

public class CWH_27_forEachloop {
    public static void main(String[] args) {
        /*
        For each loop is an enhanced version of for loop.
It travels each element of the data structure one by one.
Note that you can not skip any element in for loop and it is also not possible to traverse elements in reverse order with the help of for each loop.
It increases the readability of the code.
If you just want to simply traverse an array from start to end then it is recommended to use for each loop.
         */
        //declaring an array
        int arr[]={1,2,3,3,4,5};
        //traversing the array with for-each loop
        for(int i:arr){
            System.out.println(i);
        }
    }
}
