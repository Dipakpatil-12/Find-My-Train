package Spark_2_0_Java_Full_Stack_.string;

public class StringAndStringbuffer {
    public static void main(String[] args) {
        // Spark_2_0_Java_Full_Stack_.string
        String s1="hello";
        String s2=s1.concat("world");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);//object is changed in Spark_2_0_Java_Full_Stack_.string because strings are immutable in nature

        //stringbuffer
        StringBuffer sb1 = new StringBuffer("raj");
        StringBuffer sb2 = sb1.append("yadav");
        System.out.println(sb2);
        System.out.println(sb1);
        System.out.println(sb2==sb1);//object is not changed it is mutable

        //Spark_2_0_Java_Full_Stack_.string
        String s ="dip";
        String p = s.concat("ak");
        System.out.println(p);
    }
}



