package PRACTICE;

interface phone{
    void color();
    void price();
}
interface Smartphone1 extends phone{
    void processor();
    void camera();
}
class iphone implements Smartphone1{
    public void color(){
        System.out.println("black");
    }
    public void price(){
        System.out.println("1 lakhs");
    }
    public void processor(){
        System.out.println("Apple A16 Bionic chip");
    }
    public void camera(){
        System.out.println("12 MP");
    }
}

public class practice1{
    public static void main(String[] args){
       iphone obj = new iphone();
       obj.color();
       obj.price();
       obj.processor();
       obj.camera();

    }
}
