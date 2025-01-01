package Advance_Java;
import java.util.*;

public class CWH_91_Arraylist {
    public static void main(String[] args) {

        /* In Java, the ArrayList class is part of the Java Collections Framework and is implemented in the java.util package.
         It provides a resizable array that can grow and shrink as needed, allowing for dynamic storage of elements.

Key Features of ArrayList
Dynamic Size: Unlike standard arrays, ArrayLists can resize themselves as elements are added or removed.
Performance:
Access: O(1) time complexity for accessing elements by index, making it fast for random access.
Insertion/Deletion: O(n) for adding/removing elements in the middle, but O(1) for adding/removing elements at the end.
Generics: Supports generics, allowing you to specify the type of elements the list can hold.
Null Elements: ArrayList allows null values
         */
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l2.ensureCapacity(500); //Increases the capacity of arraylist after creating initialcapacity if we want to change minimum capacity

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(3);
        l1.add(0,1);
        l1.add(0,5);
        l1.addAll(0,l2);

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.indexOf(127));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

//        System.out.println(l1.remove(1)); removes particular element at specified position or index
        l1.set(1,566);
        l2.trimToSize(); //Trims the capacity of this ArrayList instance to be the list's current size.
        System.out.println(l1.subList(1,4)); //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

       // l1.clear();  Removes all the elements/data from Arraylist
        for(int i=0; i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

        //another example using Spark_2_0_Java_Full_Stack_.string

        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Displaying the ArrayList
        System.out.println("Fruits: " + fruits);

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // Accessing an element
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Iterating through the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        /* ArrayList is a flexible and commonly used data structure in Java, ideal for situations where frequent access to
        elements is required. However, for situations that involve a lot of insertions and deletions at arbitrary positions,
        a LinkedList might be a better choice due to its O(1) performance for those operations at the ends.

         */
    }
}
