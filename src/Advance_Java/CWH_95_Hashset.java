package Advance_Java;
import java.util.*;

public class CWH_95_Hashset {
    public static void main(String[] args) {
       /* HashSet in Java
        =HashSet class uses a hash table for storing the elements.
        - It implements the set interface.
        - Duplicate values are not allowed.
          -Before storing any object, the hashset uses the hashCode() and equals() method to check any duplicate entry in the hash table.
        - Allows null value.
         -Best suited for search operations.

       * Constructors Of HashSet :

       1. HashSet(): This constructor is used to create a new empty HashSet that can store 16 elements and have a load factor of 0.75.

       2. HashSet(int initialCapacity): This constructor is used to create a new empty HashSet which has the capacity to store the specified number of elements and having a load factor of 0.75.

       3. HashSet(int initialCapacity, float loadFactor): This constructor is used to create a new empty HashSet with the capacity & load factor equal to specified integer and float value.

       4. HashSet(Collection<? extends E> c): This constructor is used to create a HashSet using the elements of collection c.

        *Performing Various Operations On HashSet :
       1)Inserting elements :
        -add() method is used to add elements in HashSet.
        -The insertion order of the elements does not remains preserved in HashSet.
         -All the duplicate elements are ignored because the set contains only unique values

        */

        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println(myHashSet);

                /* 2)Removing elements from the HashSet :
remove() method is used to delete the specified element from the HashSet.
This method does not throws any exception if the specified element is not present in the HashSet.
Example :

                 */
        HashSet<Integer> myHashSet1 = new HashSet<>(6, 0.5f);
        myHashSet1.add(6);
        myHashSet1.add(8);
        myHashSet1.add(3);
        myHashSet1.add(11);
        myHashSet1.add(11); // This element will be ignored

        System.out.println("myHashSet1 before removing any element : " + myHashSet1);
        myHashSet1.remove(3); //deletes 3 from the hashset
        System.out.println("myHashSet1 after removing a element : " + myHashSet1);

/* 3)Checking if the HashSet is empty or not :
isEmpty() method is used to check if there is any object in the HashSet or not.
This method returns a boolean value.
Example :

 */

        HashSet<Integer> myHashSet2 = new HashSet<>(6, 0.5f);
        myHashSet2.add(6);
        myHashSet2.add(8);
        myHashSet2.add(3);
        myHashSet2.add(11);

        HashSet<Integer> myHashSet_ = new HashSet<>();

        System.out.println(myHashSet2.isEmpty());
        System.out.println(myHashSet_.isEmpty());


 /*
 4)Removing all the elements from the HashSet :
clear() method is used to remove all the elements from the HashSet at once.
Example :
  */
        HashSet<Integer> myHashSet3 = new HashSet<>(6, 0.5f);
        myHashSet3.add(16);
        myHashSet3.add(33);
        myHashSet3.add(78);
        myHashSet3.add(19);
        myHashSet3.add(29);
        myHashSet3.add(10);

        System.out.println("myHashSet3 before : " + myHashSet3);
        myHashSet3.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet3 after  : " + myHashSet3);

        /* 5)Printing the size of the HashSet :
size() method is used to get the size of the HashSet.
Example :

         */
        HashSet<Integer> myHashSet4 = new HashSet<>(6, 0.5f);
        myHashSet4.add(16);
        myHashSet4.add(33);
        myHashSet4.add(78);
        myHashSet4.add(19);
        myHashSet4.add(29);
        myHashSet4.add(10);

        System.out.println("The size of myHashSet4 is : " + myHashSet4.size());




    }
}
