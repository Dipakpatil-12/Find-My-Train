package Spark_2_0_Java_Full_Stack_.UserInput;

public class arrayloop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int a=0;
        for(int i=0;i<5;i++){
            arr[i]=a;
            a=a+1;
        }
        for (int data:arr) {
            System.out.println(data);

        }
    }
}
