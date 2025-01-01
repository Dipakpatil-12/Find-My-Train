package Spark_2_0_Java_Full_Stack_.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
    public static void main(String[] args) {
        /*
        *Create list with elements
        *read index
        *if index is valid - remove the element from the list
        *if the index is not valid - display error msg
         */

        ArrayList<Integer> list = new ArrayList<>();

        //add method
        for(int i=0; i<5; i++){
            list.add(i);
        }
        System.out.println("List "+list);

        //remove method
        System.out.println("Enter the index to remove: ");
        Scanner sc = new Scanner(System.in);
        int index =sc.nextInt();

        if(index<=list.size()-1){
            list.remove(index);
            System.out.println("List "+ list);
        }else{
            System.out.println("Error: No such index found");
        }

        //contains method
        System.out.println("Enter the element to check: ");
        int ele = sc.nextInt();
        if(list.contains(ele)){
            System.out.println("Yes we have");
        }else{
            System.out.println("no we don't hava");
        }

        //to check index of element
        System.out.println(list.indexOf(ele));

    }
}
