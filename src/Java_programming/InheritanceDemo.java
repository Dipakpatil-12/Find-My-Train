package Java_programming;

class Animal{
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Dog extends Animal{
    String sound;
    String name;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
       Animal ani = new Animal();
       ani.setColor("Brown");
        System.out.println(ani.getColor());

        Dog d = new Dog();
        d.setName("Sheru");
        System.out.println(d.getName());
        d.setSound("Bhoo-bhoo");
        System.out.println(d.getSound());
        d.setColor("White");
        System.out.println(d.getColor());
    }
}
