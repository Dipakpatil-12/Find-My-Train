package Spark_2_0_Java_Full_Stack_.oops;

class Thread_Test implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            Thread.yield();
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}

public class MultithtreadingMethods {
    public static void main(String[] args) // throws InterruptedException
    { Thread t1 = new Thread(new Thread_Test(),"Thread_Test");
        t1.start();
//        t1.join();
        for (int i=0; i<5; i++) {
            System.out.println("main thread");
        }
    }
}
