package Spark_2_0_Java_Full_Stack_.oops;

class ThreadTest extends Thread{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread());
            System.out.println("Child thread executing..");
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
      ThreadTest t1 = new ThreadTest();
      t1.start();
      t1.setName("Test");
      for(int i=0; i<5; i++){
          System.out.println(Thread.currentThread());
          System.out.println("main thread executing..");
      }
    }
}
