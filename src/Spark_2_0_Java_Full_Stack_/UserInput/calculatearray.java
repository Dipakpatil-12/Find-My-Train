package Spark_2_0_Java_Full_Stack_.UserInput;

public class calculatearray {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
