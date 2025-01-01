package Java_programming;

//problem1.Create a class circle and use inheritance to create another class cylinder from it
//Create a method for area and volume in problem1

/*class Circle1{
    public int radius;

    Circle1(){
        System.out.println("I am default constructor");
    }
    Circle1(int r){
        this.radius = r;
        System.out.println("I am parameterized constructor of Circle1");
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle1{
    public int height;

    Cylinder1(int r,int h){
      super(r);
        System.out.println("I am parameterized constructor of Cylinder1");
        this.height = h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}*/

//problem2.& problem4 mix   Create a class rectangle and use inheritance to create another class cuboid,
// try to keep it as close to the real-world scenario as possible
class Rectangle1{
    public int height;
    public int width;
    public int length;

   Rectangle1(){
       System.out.println("Default constructor");
   }
   Rectangle1(int w,int l){
       System.out.println("Parameterized constructor of Rectangle1");
       this.width = w;
       this.length = l;
   }
   public double area(){
       return this.length*this.width;
   }
   public double volume(){
       return this.width*this.height*this.length;
   }
}
class Cuboid extends Rectangle1{

    Cuboid(){
        System.out.println("Default constructor");
    }
    Cuboid(int w,int l,int h){
        super(w,l);
        System.out.println("Parameterized constructor of cuboid");
        this.height = h;
    }
    public double area(){
        return (2*this.length*this.width)+(2*this.length*this.height)+(2*this.height*this.width);
    }
    public double volume1(){
        return  this.width*this.height*this.length;
    }
}

public class CWH_52_ps10 {
    public static void main(String[] args) {
        //problem1.

        /*Circle1 obj = new Circle1(12);
        // Circle1 obj = new Circle1();
        double a = obj.area();
        System.out.println(a);

        Cylinder1 obj1 = new Cylinder1(12,15);
      double b = obj1.volume();
        System.out.println(b);

         *///problem2.&problem4 mix
        Cuboid obj = new Cuboid(12,14,16);
        double  a = obj.area();
        System.out.println(a);
        double a1 = obj.volume1();
        System.out.println(a1);

        Rectangle1 obj2 = new Rectangle1(12,14);
        double b = obj2.area();
        System.out.println(b);
        double b1 = obj2.volume();
        System.out.println(b1);
    }
}
