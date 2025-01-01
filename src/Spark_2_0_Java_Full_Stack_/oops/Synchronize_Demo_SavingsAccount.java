package Spark_2_0_Java_Full_Stack_.oops;

class SavingAccount{

    public  synchronized void withdrawl (String name){

        for (int i=0; i<5; i++){
            System.out.println();
            System.out.print("paise nikal rhe hai = ");

           try{
               Thread.sleep(200);
           } catch(Exception e){
               System.out.println(e.getMessage());
           }
            System.out.println(name);
        }
        System.out.println("**************Transaction done!!****************");
    }
}
class MythreadAccount extends Thread{
    SavingAccount s;
    String name;

    MythreadAccount(SavingAccount s,String name){
        this.s=s;
        this.name=name;
    }

    @Override
    public void run() {
        s.withdrawl(name);
    }
}


public class Synchronize_Demo_SavingsAccount {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount();

        MythreadAccount t1 = new MythreadAccount(savingAccount,"pati");
        MythreadAccount t2 = new MythreadAccount(savingAccount,"biwi");

        t1.start();
        t2.start();

    }
}
