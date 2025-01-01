package Spark_2_0_Java_Full_Stack_.oops;

class Mythre implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread());
        }
    }
}

public class Multithreading_priority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Mythre(),"Child");
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("t1 ki priority"+t1.getPriority());
        for (int i=0; i<10; i++){
            System.out.println(Thread.currentThread());
        }
    }
}
