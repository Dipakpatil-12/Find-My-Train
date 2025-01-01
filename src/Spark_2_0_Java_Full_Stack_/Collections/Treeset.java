package Spark_2_0_Java_Full_Stack_.Collections;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args){
        //if we want no duplicate values,sorted values,no null values we use tree set
        TreeSet<Integer> treeset = new TreeSet<>();
//        treeset.add(null); before java 1.7 it is allowed a of now it's not
        treeset.add(10);
        treeset.add(50);
        treeset.add(30);
        treeset.add(1);
        System.out.println(treeset);


        //for sorting there are two techniques comparable (for default sorting by jvm) and comparator (for customizable/user based sorting)
        //internally..in comparable there is one method for sorting "compareTo()" ex...obj1.compareTo(object obj2)
        // if two/both objects/elements are same then return 0,if next element is larger than first then +,and if smaller then -
        //comparator is a interface they have two methods like first equals and second is compare...ex..compare(obj1,obj2)
    }
}
