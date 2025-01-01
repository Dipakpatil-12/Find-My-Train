package Spark_2_0_Java_Full_Stack_.string;

public class StringDemo {
    public static void main(String[] args) {
        //how to create object
        //1 using Spark_2_0_Java_Full_Stack_.string literals
        //2 using new keyword
        String s=new String("hello");
        System.out.println(s.hashCode());

        String s1="hello";
        System.out.println(s1.hashCode());

        String s2="hello";
        String s3="hello";
        System.out.println(s2==s1);//memory address checks object dose not

        String s4 = new String("hey");
        String s5 = new String("hey");
        System.out.println(s4==s5);//because in case of new keyword two objects are created one in heap and second is in scp(Spark_2_0_Java_Full_Stack_.string constant pool)
        String s6="hey";
        System.out.println(s4==s6);//already present in memory it does not allocate same object two times in memory
        System.out.println(s4.hashCode());
        System.out.println(s6.hashCode());

        //== memory address / reference
        //equals content
        System.out.println(s4.equals(s6));
    }
}
