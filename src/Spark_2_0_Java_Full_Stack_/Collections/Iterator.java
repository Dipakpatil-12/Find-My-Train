package Spark_2_0_Java_Full_Stack_.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(130);
        list.add(40);
        list.add(50);
        System.out.println(list);
        //For iteration we have cursors in java for all classes except vector and stack we used Iterator method for fetching
        // elements or iterate the elements it have two properties read and remove
        //iski limitation hai ki ye only forward direction mai move karta hai backward nahi

        java.util.Iterator<Integer> iterator = list.iterator(); //iterator method ko object mai hold kar liya kyu ki iterator method Arraylist class mai hai and iterator ka object return karta hai ye method(iterator())
        //hasNext() check karta hai elements/data hai kya nahi class mai  ...boolean value return karta hai
        while (iterator.hasNext()){
            Integer data = iterator.next();
            System.out.println(data);
            if(data==20){
                iterator.remove();
            }
        }
        System.out.println(list);

        //For iteration we have cursors in java for list classes we used ListIterator method for fetching
        // elements or iterate the elements it have three properties read and remove and update/replace

        ListIterator<Integer> integerListIterator = list.listIterator();

        int count = 0;
        while (integerListIterator.hasNext()){
            Integer next = integerListIterator.next();
//            System.out.println(next);
            count++;

            if (count==4){
                while (integerListIterator.hasPrevious()){
                    Integer previous = integerListIterator.previous();
                    System.out.println(previous);
                }
            }
        }
    }
}
