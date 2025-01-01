package Spark_2_0_Java_Full_Stack_.oops;
class Car // parent class/base class/superclass
{
    int a=10;// this value is just for transfer , there is no logic
    public void horn() //base class method
    {
        System.out.println("pepe pepe");
    }
}

class Creta extends Car{ //child class/derived class/subclass  // we need to use extends keyword with child class for accessing the method of parent class to derived class

    public void horn() // derived class method (1st method)
    {
        System.out.println("pooo pooo");
    }
    public void engine() // derived class method (2nd method)
    {
        System.out.println("1450");
    }

}
public class InheritanceDemo {

    public static void main(String[] args) {

        Creta creta=new Creta(); // for accessing the method of child class first of all we need to create a object of child class
        creta.horn(); // then Accessing method of its own(means child class)
        System.out.println(creta.a);//Accesses the variable a from the Car class (inherited by Creta), printing 10.

        Car car=new Car();// for accessing the method of parent class first of all we need to create a object of parent class
        car.horn();// then Accessing method of its own(means parent class)

        // from next line of code i don't understand ,do check it out with yourself
        Car car1=new Creta(); //Here, car1 is declared as type Car but instantiated (represented by instance) as Creta
        car1.horn();// Since car1 is actually pointing to a Creta object (due to polymorphism), it calls the horn() method overridden in Creta, printing "pooo pooo"

        //Creata creata1 = new Car(); // simply it is not possible because derived class can not hold the parent class // parent class will inherit their properties into child class , simply derived is not capable

        /*Key Points:
       1.Inheritance: Creta inherits the horn() method from Car and overrides it.
       2.Polymorphism: Car car1 = new Creta(); demonstrates polymorphic behavior where the reference variable of the parent class (Car) can refer to an object of the child class (Creta).
       3.Method Overriding: Creta overrides the horn() method of Car with its own implementation.*/
    }
}

