package Java_programming;

/*
Interfaces in Java :
Just like a class in java is a collection of the related methods, an interface in java is a collection of abstract methods.
The interface is one more way to achieve abstraction in Java.
An interface may also contain constants, default methods, and static methods.
All the methods inside an interface must have empty bodies except default methods and static methods.
We use the interface keyword to declare an interface.
There is no need to write abstract keyword before declaring methods in an interface because an interface is implicitly abstract.
An interface cannot contain a constructor (as it cannot be used to create objects)
In order to implement an interface, java requires a class to use the implement keyword.
 */

        interface Bicycle1{
            int a = 45;
            void applyBrake(int decrement);
            void speedUp(int increment);
        }

        interface HornBicycle{
            int x = 4;
            void blowHornK3g();
            void blowHornmhn();
        }

        class Avoncycle7 implements Bicycle1, HornBicycle{
            //public int x = 5;
            void blowHorn(){
                System.out.println("Pee Pee Poo Poo");
            }
            public void applyBrake(int decrement){
                System.out.println("Applying Brake");
            }
            public void speedUp(int increment){
                System.out.println("Applying SpeedUP");
            }
            public void blowHornK3g(){
                System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
            }
            public void blowHornmhn(){
                System.out.println("Main hoon naa po po po po");
            }
        }
public class CWH_54_Interfaceexample {
    public static void main(String[] args) {
                Avoncycle7 cycleHarry = new Avoncycle7();
                cycleHarry.applyBrake(1);
                cycleHarry.speedUp(1);
                // You can create properties in Interfaces
                System.out.println(cycleHarry.a);
                System.out.println(cycleHarry.x);

                // You cannot modify the properties in Interfaces as they are final
                // cycleHarry.a = 454;
                //System.out.println(cycleHarry.a);

                cycleHarry.blowHornK3g();
                cycleHarry.blowHornmhn();
            }
        }


