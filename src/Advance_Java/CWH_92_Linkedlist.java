package Advance_Java;

import java.util.*;
import java.util.LinkedList;

public class CWH_92_Linkedlist {
    public static void main(String[] args) {

        /*In Java, the LinkedList class is part of the Java Collections Framework and is implemented in the java.util package.
        It provides a doubly-linked list data structure, which means each element (or node) contains references to both the next
        and previous elements in the list. This allows for efficient insertions and deletions at both ends of the list.

Key Features of LinkedList
Dynamic Size: Unlike arrays, linked lists can grow and shrink in size dynamically.
Performance:
Insertion/Deletion: O(1) time complexity for adding/removing elements at the beginning or end, and O(n) for accessing elements by index.
Access: O(n) time complexity for accessing an element by index.
Null Elements: LinkedList allows null elements.
Implements Interfaces: Implements List, Deque, and Queue interfaces

         */
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);

        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(3);
        l1.add(0,1);
        l1.add(0,5);
        l1.addAll(0,l2);
        l1.addLast(767);
        l1.addFirst(465);

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.indexOf(127));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

//        System.out.println(l1.remove(1)); removes particular element at specified position or index
        l1.set(1,566);

        System.out.println(l1.subList(1,4)); //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

        // l1.clear();  Removes all the elements/data from linkedlist
        for(int i=0; i<l1.size();i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }



            // another example using Spark_2_0_Java_Full_Stack_.string

            LinkedList<String> list = new LinkedList<>();

            // Adding elements
            list.add("Apple");
            list.add("Banana");
            list.addFirst("Orange");
            list.addLast("Grape");

            // Displaying the LinkedList
            System.out.println("LinkedList: " + list);

            // Removing elements
            list.remove("Banana");
            list.removeFirst();

            // Displaying after removal
            System.out.println("After removal: " + list);

            // Iterating through the LinkedList
            for (String fruit : list) {
                System.out.println(fruit);
            }
            /*Conclusion
LinkedList is a versatile and powerful data structure in Java that is well-suited for applications requiring frequent
 insertions and deletions. However, for scenarios where random access is more common, an ArrayList may be more appropriate
  due to its O(1) access time.

             */
        }
    }

