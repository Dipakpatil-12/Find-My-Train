package Java_programming;


class msg1 extends Thread{
    public void run () {
        while (true) {
            System.out.println("Good morning!!");
        }
    }
}
class msg2 extends Thread{
        public void run () {
//            while (true) {
//                try {
//                    Thread.sleep(200);
//                }catch (Exception e) {
//                    System.out.println(e);
//                }
//                System.out.println("Welcome!!");
//            }
        }
}
public class CWH_76_Ps11CH13_ {
    public static void main(String[] args) {
        msg1 t1 = new msg1();
        msg2 t2 = new msg2();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println((t2.getState()));
//        t1.start();
        t2.start();
        System.out.println(t2.getState());// state of given thread 
        System.out.println(Thread.currentThread().getState()); // returns a reference /stage of thread lifecycle to the currently executing thread object



    }
}
