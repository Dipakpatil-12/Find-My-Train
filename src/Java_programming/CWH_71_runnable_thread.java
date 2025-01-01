package Java_programming;
/*
Creating a Java Thread Using Runnable Interface
In the previous tutorial, I told you that there are two ways to create a thread in java :

By Extending Thread Class
By implementing Runnable interface
We've already seen how to create a thread by extending the thread class. In this tutorial, we'll see how to create a Java thread by using a runnable interface.

Steps To Create A Java Thread Using Runnable Interface:

Create a class and implement the Runnable interface by using the implements keyword.
Override the run() method inside the implementer class.
Create an object of the implementer class in the main() method.
Instantiate the Thread class and pass the object to the Thread constructor.
Call start() on the thread. start()will call the run()method.
 */

class MyRunnableThread1 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 1000000) {
            System.out.println("I am thread1 not thread1");
            i++;
        }
    }
}
class MyRnnableThread2 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 1000000) {
            System.out.println("I am thread2 not thread2");
            i++;
        }
    }
}

public class CWH_71_runnable_thread {
    public static void main(String[] args) {

//first of all we need to create an object of MyRunnableThread1 class then pass the object in the thread class constructor
        //because .start() method is in thread class and start method is responsible for achieving the multithreading environment
        // so we need to pass the object in thread class constructor

        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);

        MyRnnableThread2 bullet2 = new MyRnnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

/*
class MyRunnableThread1 is implementing the Runnable interface.
Overriding of the run() method is done inside the MyRunnableThread1 class.
In the main() method, bullet1, an object of the MyRunnableThread1 class, is created.
The constructor of the Thread class accepts the Runnable instance as an argument, so bullet1 is passed to the constructor of the Thread class.
Finally, the start()method is called on the thread that will call the run() method internally, and the thread's execution will begin.
 */


/*
Runnable Interface Vs Extending Thread Class :

Since we've discussed both the ways to create a thread in Java. There might be a question in your mind that should we use the
 Runnable interface or Thread class to implement a thread in Java. Let me answer this question for you. The Runnable interface is
  preferred over extending the Thread class because of the following reasons :

As multiple inheritance is not supported in Java, it is impossible to extend the Thread class if your class had already extended
 some other class.
While implementing Runnable, we do not modify or change the thread's behavior.
More memory is required while extending the Thread class because each thread creates a unique object.
Less memory is required while implementing Runnable because multiple threads share the same object.
 */
