package Spark_2_0_Java_Full_Stack_.oops;

abstract class Vehicle1{
            public abstract void engine();
            public void horn(){
                System.out.println("Pee Pee");
            }
        }

        class BMW1 extends Vehicle{
            @Override
            public void engine() {
                System.out.println("4000c Engine");
            }
            public void display(){
                System.out.println("Color red");
            }
        }


        class Tata1 extends Vehicle{
            @Override
            public void engine() {
                System.out.println("2100c Engine");
            }
        }

        public class DatahidingDemo {

            public static void main(String[] args) {
                Vehicle vehicle1=new BMW1();
                vehicle1.engine();

                Vehicle vehicle2=new Tata1();
                vehicle2.engine();

            }
        }
