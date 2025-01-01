package Spark_2_0_Java_Full_Stack_.oops;

public class Mul_Wait_Notify_NotifyAll_ {
    public static void main(String[] args) throws InterruptedException {

      Threadb b = new Threadb();

      b.start();

      synchronized (b){ // ek baar me ek thread ko hi chance milega because of synchronize
          System.out.println("Main thread is waiting for calculation");
              b.wait();

          System.out.println("main thread got notification");
          System.out.println("Total is : "+ b.total);
          }
      }
    }

class Threadb extends Thread{
    int total = 0;

    @Override
    public void run() {
        synchronized (this){ // ek baar me ek thread ko hi chance milega because of synchronize
            System.out.println("Child thread calculation starts: ");

            for (int i=0; i<100; i++){
                total = total + i;
            }

            System.out.println("child thread giving notification call ");
            this.notify(); // or this.notifyAll()
        }
    }
}
