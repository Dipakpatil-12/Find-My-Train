package Spark_2_0_Java_Full_Stack_.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("one",10);
        System.out.println(map);

        TreeMap<String,Integer> treemap = new TreeMap<>();
        treemap.put("a",1);
        treemap.put("c",3);
        treemap.put("b",2);
        System.out.println(treemap);
        // order will be in lexical order(albhabetical order)

    }
}
