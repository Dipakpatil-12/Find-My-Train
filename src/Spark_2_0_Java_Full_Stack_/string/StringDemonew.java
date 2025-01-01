package Spark_2_0_Java_Full_Stack_.string;

public class StringDemonew {
    public static void main(String[] args) {
        String s1=new String("hello");//Spark_2_0_Java_Full_Stack_.string object with new keyword
        String s2="hey";//Spark_2_0_Java_Full_Stack_.string literal
        System.out.println(s1==s2);
        String s3="hey";
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));


        char ch[]={'a','b','c'};
        String s7=new String(ch);
        System.out.println(s7);

        //== reference/memory address
        //equals==content
    }
}
