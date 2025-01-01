package Spark_2_0_Java_Full_Stack_.UserInput;

public class reversearrayprint {
    public static void main(String[] args) {
        //Create a new array
       int[] arr = {1 ,2, 3, 4, 5};
        System.out.println("Original array: ");
        for(int num1:arr){
            System.out.print(num1);
        }
        System.out.println();

        //Create a new array to hold the reversed elements
        int[] reversedNumbers = new int[arr.length];

        //reverse the array using for loop
        for(int i=0;i<arr.length;i++){
            reversedNumbers[i] = arr[arr.length-1-i];
        }
        System.out.println("'Reversed arry");
        for(int num2 : reversedNumbers){
            System.out.println(num2);
        }
    }
}
