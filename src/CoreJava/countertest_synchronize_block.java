package CoreJava;

class Counter{
    private int count = 0;
    public void incre(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
class Threadstest extends Thread{
    private Counter counter;

    public Threadstest(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(Thread.currentThread());
            counter.incre();
        }
    }
}

public class countertest_synchronize_block {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Threadstest(counter);
        Thread t2 = new Threadstest(counter);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count = "+ counter.getCount());
    }
}
