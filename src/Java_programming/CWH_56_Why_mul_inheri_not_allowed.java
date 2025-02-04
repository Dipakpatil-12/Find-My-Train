package Java_programming;

public class CWH_56_Why_mul_inheri_not_allowed {
    public static void main(String[] args) {
        /* # Why multiple inheritance is not supported in java?
           # Is multiple inheritance allowed in Java?
         ==>Multiple inheritance faces problems when there exists a method with the same signature in both the superclasses.
             Due to such a problem, java does not support multiple inheritance directly, but the similar concept can be achieved using interfaces.

         ==>A class can implement multiple interfaces and extend a class at the same time.

        !Some Important points :

        ==>Interfaces in java are a bit like the class but with a significantly different.
        ==>An Interface can only have method signatures field and a default method.
         ==>The class implementing an interface needs to declare the methods ( not field )
        ==>You can create a reference of an interface but not the object
         ==>Interface methods are public by default

         */
    }
}
