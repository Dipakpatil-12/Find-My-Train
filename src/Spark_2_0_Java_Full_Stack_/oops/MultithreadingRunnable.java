package Spark_2_0_Java_Full_Stack_.oops;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<100000; i++){
        System.out.println("Runnable");
    }
}
}

public class MultithreadingRunnable {
    public static void main(String[] args) {
       // MyRunnable r = new MyRunnable();
       // Thread t = new Thread(r);
        Thread t = new Thread(new MyRunnable());

        t.start();
        for(int i=0; i<100000; i++) {
            System.out.println("Main..");
        }

    }
}
