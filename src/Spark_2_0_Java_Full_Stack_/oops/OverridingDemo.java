package Spark_2_0_Java_Full_Stack_.oops;

        class Shape{
            void draw()
            {
                System.out.println("Drawing shape....");
            }
        }

        class Circle extends Shape {
            @Override
            void draw() {
                System.out.println("Drawing Circleee....");
            }
        }

        class Rectangle extends Shape{
            @Override
            void draw() {
                System.out.println("Drawing Rectangle...");
            }
        }
        public class OverridingDemo {

            public static void main(String[] args) {
                Shape shape=new Shape();
                shape.draw();

                Circleee circle=new Circleee();
                circle.draw();

                Rectangle rectangle=new Rectangle();
                rectangle.draw();

                Shape shape1= new Shape();
                shape1.draw();

            }
        }

