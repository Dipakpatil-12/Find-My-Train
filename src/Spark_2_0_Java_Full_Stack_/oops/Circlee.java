package Spark_2_0_Java_Full_Stack_.oops;

 class Circleee {
    private int radius;
    private float pi;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int n){
        this.radius = n;
    }
    public float getpi(){
       return pi;
    }
    public void setpi(float m){
        this.pi= m;
    }
    public float getArea(){
        return pi * (radius * radius);
    }
    public float getPerimeter(){
        return 2*pi*radius;
    }

     public void draw() {
     }
 }
public class Circlee {
    public static void main(String[] args) {

        Circleee obj = new Circleee();

        obj.setRadius(10);
        System.out.println(obj.getRadius());

        obj.setpi(3.14f);
//        System.out.println(obj.getpi());

        System.out.println(obj.getArea());

        System.out.println(obj.getPerimeter());

    }
}
