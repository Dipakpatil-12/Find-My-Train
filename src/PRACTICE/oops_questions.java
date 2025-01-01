package PRACTICE;

public class oops_questions {
    public static void main(String[] args) {
       /* OPPS Knowledge Check H.W
                -------------------------------------------------
                1) What is Class ?
                ==> class is template or blueprint from which objects are created, basically class dosen't consume any space it is collection of objects
                there are two types of class predefined userdefined class, class consists like methods,properties,functions and all & it is logical entity

                2) What is Object ?
                ==> it is an instance(running state) of class or it's real world entity it consumes space it is physical entity, we need to create an object if we want to access
                the methods or properties of class

                3) Why we need to Create Object ?
                ==>we need to create an object if we want to access the methods or properties of class without object we just normally can't access the methods and properties
                except using static keyword.

               4) What is instance variable and why we need
               them ?
               ==> In object-oriented programming, an instance variable is a variable that is  declare inside the class but outside the method & associated with a specific instance of a class. Each object (or instance) of the class
                has its own copy of the instance variables. These variables are used to store the state of the object.
                #Here's why instance variables are important:
               * Encapsulation: Instance variables help encapsulate the state of an object. They allow you to keep the internal state of an object private and protected from outside interference,
                while still providing controlled access through methods (getters and setters).

                5) When memory will be allocated for instance
        variables ?
        ==> after creating an object of class at the time of running program (runtime) memory will be allocated to instance variable

                6) How many times memory will be allocated for instance variables ?
                ==> Memory allocation for instance variables occurs separately for each instance of a class. This means that memory is
                allocated for instance variables each time a new object is created. Here’s how it works: Per Object: Every time you create a new object of a class,
                 a new block of memory is allocated for the instance variables of that object. Each object will have its own set of instance variables, and each set
                 will be stored in a different memory location.


        7) What is static variable and why we need them ?
        ==> static variables are those variables which have a static keyword & if we change that particular variable in specific object and same variable is present in another 2 objects in that 2 objects
         this variable is also change at the same time & we need static variables for memory management and efficiency, for global access , object interdependence, & code organization


        8) When memory will be allocated for static variables ?
        ==> Static Variables Allocation
            *Single Allocation: Static variables are allocated memory once for the entire class, not per instance. This means that regardless of how many objects of the class are created, there is only one memory allocation for each static variable.
            *Shared Across Instances: Since static variables are shared among all instances of the class, they hold the same value across all instances. Changes to a static variable are reflected across all objects of that class.
          -->the allocation of memory for static variables (or class variables) occurs at runtime, through the class & so basically at the time class loading

        9) How many times memory will be allocated for static variables ?
        ==> Memory for static variables is allocated once per class, because of Single Allocation. Static variables are allocated a single block of memory when the class is first loaded into the runtime environment.
        This allocation happens only once, regardless of how many instances of the class are created.

        10) What is Local Variable & Why we need Local Variable ?
        ==> local variables are those variables that are declare inside method we can not access those variable outside method, there scope is defined in only inside method
       * Local variables are essential in Java for:
        -Limiting variable scope to prevent unintended access.
        -Storing temporary data during method execution.
        -Encapsulating method logic and improving code organization.
        -Preventing side effects by isolating variable usage to specific contexts.
        -Controlling the flow of data within methods.
        -Their proper use contributes to writing clean, efficient, and maintainable code.

       11) When Memory will be allocated for local variable ?
       ==> Memory for local variables in Java is allocated at runtime,specifically when the method or block in which they are declared is executed/called/invoked.

        12) What is com.company.Constructor why we need com.company.Constructor ?
        ==> a constructor is a special method used to initialize objects of a class.
        -It is a Special Method, A constructor is a special method that has the same name as the class and does not have a return type, not even void.
        -Initialization: Its primary purpose is to initialize the newly created objects. It sets initial values for the object’s attributes and performs any setup needed before the object is used.
        * We need constructor for:
        # Object Initialization: -Setup State: Constructors allow you to set initial values for the object’s fields. This ensures that an object starts in a valid state and can be used immediately after creation.
        # Overloading Flexibility: Multiple Constructors: You can define multiple constructors with different parameters to provide various ways of initializing an object, allowing for more flexible and intuitive object creation.

        13) What are the rules to write com.company.Constructor ?
        ==> -name of constructor is same as class name
            -there is no return type for constructor
            -Default com.company.Constructor is also there if any constructor parameters is not called
            -Constructors are not static and can have various access modifiers.

       14) What is com.company.Constructor Overloading & Why we need it ?
       ==> constructor overloading means we can create multiple constructor with same name but different parameters,This allows you to initialize objects in various ways.

        15) What is Method and Why we need methods ?
        ==> method is specific block of code/function
        # Methods are essential in Java for:
          -Encapsulating behavior and implementing the logic of a class.
          -Reusing code and promoting modularity.
          -Improving readability and maintainability.
          -Parameterizing operations to handle various inputs.
          -Defining object behavior and providing utility functions.
          - so basically By using methods effectively, you can write cleaner, more organized, and maintainable code.

        16) When to take method parameter and method return type ?
        ==> * Method Parameters: Use them when a method requires specific input data to perform its task, to enhance flexibility and reusability,
         and to pass complex data structures.
            * Method Return Type: Use it when a method needs to provide a result or status to the caller. Use void for methods that perform actions
             but don’t need to return a value, and consider returning complex data structures or objects when necessary

                17) When to use primitive type for method parameters & return types ?
                ==> * Use Primitive Types for:

                     -Performance-sensitive operations.
                     -Simple operations where additional functionality is not required.
                     -Avoiding null values.
                     -Memory efficiency.

                    * Use Wrapper Classes for:

                   -Leveraging additional utility methods and functionality.
                   -Working with Java collections and generics.
                   -Handling nullable values.
                   -Interacting with APIs that require objects.
                   -Choosing between primitives and wrapper classes should be guided by the specific requirements of your method, including considerations of performance, memory usage, and functionality needs.

                18) When to use Object as method parameter & return type?
                ==> -Use Object as a method parameter when you need to accept a wide range of object types, especially for flexible
                 or generic methods, event handling, or dynamic scenarios.
                    -Use Object as a return type when the method needs to return various types of data or when implementing generic containers, but be aware of the need for type checking and casting.

                19) What is Object Oriented Language ?
                ==> object oriented langauge is computer programming model that organizes software design around data or objects
                rather than functions and logic, all the code or datatypes are also like objects in java

                20) What are OOPS principles?
                ==> *Encapsulation: Encapsulation helps in bundling the data and methods that operate on the data into a single unit or class,
                 which protects the integrity of the data.

                    *Inheritance: Supports the creation of new classes based on existing classes, facilitating code reuse and establishing relationships between classes.

                    *Polymorphism: Allows methods to be implemented in multiple ways, depending on the object type or class. It enhances flexibility and integration.

                    *Abstraction: Provides a way to create abstract models that define the structure and behavior of objects while hiding the complex implementation details
                     so basically hiding the internal details and showing only essential information or properties

        */
    }
}
