package Advance_Java;

/*
*Java Anonymous Classes & Lambda Expressions:
-Anonymous class is nothing but a class without any name.
-They are used to override a class method or interface.
-Anonymous classes in Java help us to write more concise and readable code.
-With the help of the Anonymous class, we can declare and instantiate a class at the same time. Let's see how it is done :

-Ways to create an Anonymous Java class :

-The Anonymous class in Java can be created by two ways :
1.By extending a class
2.By implementing an interface
Let's take an example for both ways listed above
-By extending a class :
 */
abstract class vehicle{
    abstract void drive();
}

@FunctionalInterface
interface human{
    void walk();
}

@FunctionalInterface
interface LamdaExp{
    void meth1(int a,int b);
}

public class CWH_109_Java_AnonymousClass_LamdaExpression {
    public static void main(String[] args) {
        vehicle car = new vehicle() {
            @Override
            void drive() {
                System.out.println("Driving a car!!");
            }
        };
        car.drive();

        //By implementing an interface :
        human john = new human() {
            @Override
            public void walk() {
                System.out.println("Walking on roadside!!");
            }
        };
        john.walk();


        /*Lambda Expressions :
        -Lambda expressions were introduced in Java 8.
        -They are similar to methods, but they don't need a name

         */
        LamdaExp obj = (a,b)->{System.out.println("the value of a and b is : "+ a + "," +b);};
        obj.meth1(6,7);
    }
}
