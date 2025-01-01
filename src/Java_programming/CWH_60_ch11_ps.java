package Java_programming;

abstract class pen{
     abstract void write();
     abstract void refil();
 }
 class fountainpen extends pen{
    public void changenib(){
        System.out.println("Changing..");
    }
    public void write(){
        System.out.println("Writing..");
    }
    public void refil(){
        System.out.println("Change refil..");
    }
 }

 interface Basicanimal{
    void eat();
    void sleep();
 }

  class monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Bite");
    }
  }
class human extends monkey implements Basicanimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}

abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartphone12 extends telephone{
    void model(){
        System.out.println("iphone 15");
    }
    public void ring(){
        System.out.println("Ringing");
    }
    public void lift(){
        System.out.println("lifting");
    }
    public void disconnect(){
        System.out.println("off");
    }
}
//Q6.Create an interface TVremote and use it to inherit another interface smart TVremote
interface TvRemote{
    void company();
    void buttons();
}
interface SmartTvRemote extends TvRemote{
    void color();
    void price();
}
//Q7.Create a class TV which implements TVremote interface from Q6
class Tv implements TvRemote{
    public void company(){
        System.out.println("TataSky");
    }
    public void buttons(){
        System.out.println("Rubberish");
    }
}
public class CWH_60_ch11_ps {
    public static void main(String[] args) {
        //Q1.Create an abstract class pen with methods write () and refill () as abstract methods  &
        // Q2.Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
//      fountainpen obj = new fountainpen();
//      obj.changenib();
//      obj.refil();
//      obj.write();

      // Q3.Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey
        // class and implements basicanimal interface with eat ( ) and sleep methods
//        human obj1 = new human();
//        obj1.eat();
//        obj1.bite();
//        obj1.sleep();
//        obj1.jump();

        //Q5.Demonstrate polymorphism using using monkey  class from Q3
//        monkey obj2 = new human(); // object human and which is used as a reference monkey so we only can access monkey methods
//        obj2.jump();
//        obj2.bite();

        //Q4.Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another
        // class smart telephone and demonstrate polymorphism
        telephone obj3 = new smartphone12();
        obj3.disconnect();
        obj3.ring();
        obj3.lift();

    }
}
