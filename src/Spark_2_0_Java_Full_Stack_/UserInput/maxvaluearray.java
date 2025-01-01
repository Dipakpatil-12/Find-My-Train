package Spark_2_0_Java_Full_Stack_.UserInput;

public class maxvaluearray {
    public static void main(String[] args) {
        // Creating a new array
        int[] arr = new int[5];
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
            System.out.println(i);
        }
        // max.value finding through foreach loop
        for(int i :arr){
            if(i>max){
                max=i;
            }
        }
        //printing that max. value
        System.out.println(max);
    }
}
