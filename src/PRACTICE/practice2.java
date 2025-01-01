package PRACTICE;

abstract class mobile{
    public mobile(){
        System.out.println("I am constructor of parent class");
    }
    public void sayhello(){
        System.out.println("Hello..");
    }
    abstract public void color();
    abstract public void price();
}

class Smartphone extends mobile{
    public void color(){
        System.out.println("Black");
    }
    public void price(){
        System.out.println("100000");
    }
}
public class practice2 {
    public static void main(String[] args){
        Smartphone obj = new Smartphone();
        obj.color();
        obj.price();
        obj.sayhello();
    }
}
