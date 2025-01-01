package Advance_Java;
import java.util.*;

public class CWH_93_ArrayDeque {
    public static void main(String[] args) {

        /* In Java, an ArrayDeque (double-ended queue) is part of the Java Collections Framework and provides a resizable array
        implementation of the Deque interface. It allows you to add and remove elements from both ends efficiently, making it a
         versatile data structure for various use cases.

*Key Features
Dynamic Resizing: Unlike arrays, ArrayDeque can grow and shrink in size dynamically.
Performance: It offers constant time complexity for adding and removing elements at both ends, making it more efficient than
LinkedList for most operations.
No Capacity Restrictions: It does not have a fixed size; it expands as needed.


         */
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1);


// Another example of arraydeque in Spark_2_0_Java_Full_Stack_.string

        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");

        // Accessing elements
        System.out.println("First: " + deque.peekFirst()); // Outputs: C
        System.out.println("Last: " + deque.peekLast());   // Outputs: B

        // Removing elements
        System.out.println("Removed: " + deque.removeFirst()); // Outputs: C
        System.out.println("Removed: " + deque.removeLast());  // Outputs: B

        // Remaining elements
        System.out.println("Remaining: " + deque); // Outputs: [A]

        /* When to Use ArrayDeque
When you need a queue or stack with fast insertions and deletions at both ends.
When you want to manage elements in a way that allows both FIFO and LIFO access patterns.

Limitations
ArrayDeque is not thread-safe. If you need a concurrent version, consider using ConcurrentLinkedDeque or synchronize your access.
It cannot be used as a fixed-size queue. If you require a bounded queue, consider using ArrayBlockingQueue.
Using ArrayDeque can significantly improve performance and code clarity when managing collections of data that require frequent
additions and removals!

         */
    }
}
