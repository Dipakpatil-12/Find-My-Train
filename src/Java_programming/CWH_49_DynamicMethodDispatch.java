package Java_programming;
/*
Dynamic Method Dispatch in Java
Dynamic method dispatch is also known as run time polymorphism.
It is the process through which a call to an overridden method is resolved at runtime.
This technique is used to resolve a call to an overridden method at runtime rather than compile time.
To properly understand Dynamic method dispatch in Java, it is important to understand the concept of upcasting because dynamic method dispatch is based on upcasting.
Upcasting :
It is a technique in which a superclass reference variable refers to the object of the subclass.

 */

        class Phone{
            public void showTime(){
                System.out.println("Time is 8 am");
            }
            public void on(){
                System.out.println("Turning on Phone...");
            }
        }

        class SmartPhone extends Phone{
            public void music(){
                System.out.println("Playing music...");
            }
            @Override
            public void on(){
                System.out.println("Turning on SmartPhone...");
            }
        }
public class CWH_49_DynamicMethodDispatch {
    public static void main(String[] args) {
                // Phone obj = new Phone(); // Allowed
                // SmartPhone smobj = new SmartPhone(); // Allowed
                // obj.name();

                Phone obj = new SmartPhone(); // Yes it is allowed
                // SmartPhone obj2 = new Phone(); // Not allowed

                obj.showTime();
                obj.on();
//                 obj.music(); Not Allowed for this you need to create a object of smartphone with reference of smartphone


            }
        }

    
