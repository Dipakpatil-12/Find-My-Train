package Java_programming;

//problem1.Create a class Employee with the following properties and methods:
//Salary (property) (int)
//getSalary (method returning int)
//name (property) (String)
//getName (method returning String)
//setName (method changing name)
/*
class Employee4{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
         name = n;
    }
}

//problem2.Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
class Cellphone{
    public void ring() {
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Anurag..");
    }
    }

//problem3.Create a class Square with a method to initialize its side, calculating area, perimeter etc.
class square{
    int side;

    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
}

problem4.Create a class Rectangle & problem 3.

class rectangle{
    int length;
    int breadth;

    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

 //problem5.Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
 class TommyVecetti{
     public void hit(){
         System.out.println("Hitting..");
     }
     public void run(){
         System.out.println("Running..");
     }
     public void fire(){
         System.out.println("Firing..");
     }
}
*/
//problem6.Repeat problem 4 for a circle.
class circle{
    float pi;
    int radius;

    public float area(){
        return pi * (radius * radius);
    }
    public float perimeter(){
        return 2*pi*radius;
    }
}


public class CWH_39_Ps8 {
    public static void main(String[] args) {
      /*  problem1.
     Employee4 obj = new Employee4();
        obj.salary = 1200000;
        System.out.println(obj.getSalary());
        obj.setname("Dipak patil");
        System.out.println(obj.getname());

        // problem2.
 Cellphone asus = new Cellphone();
 asus.callFriend();
 asus.ring();
 asus.vibrate();

        //problem3.
        square sq = new square();

        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


      //problem4.
        rectangle rc = new rectangle();

        rc.length = 10;
        rc.breadth= 5;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());


        //problem5.
       TommyVecetti gta = new TommyVecetti();
       gta.fire();
       gta.hit();
       gta.run();
*/
        //problem6.
        circle cr = new circle();
        cr.pi = 3.14f;
        cr.radius = 5;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
    }
}
