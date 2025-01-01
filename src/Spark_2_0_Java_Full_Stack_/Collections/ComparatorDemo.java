package Spark_2_0_Java_Full_Stack_.Collections;

import java.util.Comparator;
import java.util.TreeSet;

class userComparator implements Comparator{
    // if two/both objects/elements are same then return 0,if next element is larger than first then +,and if smaller then -
    //comparator is a interface they have two methods like first equals and second is compare...ex..compare(obj1,obj2)
    @Override
    public int compare(Object o1, Object o2) {
        Integer data1 = (Integer) o1;
        Integer data2 = (Integer) o2;
        if(data1>data2){
            return -1;
        }else if(data1<data2){
            return +1;
        }else{
            return 0;
        }
    }
}


public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeset = new TreeSet<>(new userComparator());
        //ab jab object store hoga treeset mai to iss userComparator ka use karke hoga
        // Why we use wrapper classes in java collection instead of primitive datatype int?
        // = because wrapper class sare comparable interface ko implement karte hai to easily mai usko compare kar sakta hoon and sorting kar sakta hoon
        treeset.add(10);
        treeset.add(50);
        treeset.add(30);
        treeset.add(1);
        System.out.println(treeset);


    }
}
