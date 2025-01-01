package Java_programming;

interface Bicyclee{
    int a = 45;
    void Applybrake(int decrement);
    void Speedup(int increment);
}
interface Hornbicyclee{
    void blowhornk3g();
    void blowhornmhn();
}
class Avoncyclee implements Bicyclee,Hornbicyclee{
    void blowhorn(){ // its own property
        System.out.println("paa paa apaa");
    }
    // implemented properties
    public void Applybrake(int decrement){
        System.out.println("Applying brake");
    }
    public void Speedup(int increment){
        System.out.println("Applying speed");
    }
    public void blowhornk3g(){
        System.out.println("Kabhi khushi kabhi gum pepepe");
    }
    public void blowhornmhn(){
        System.out.println("Main hoon naah popopop");
    }

}

public class CWH_55_Interfaces_Abstractclass {
    public static void main(String[] args) {
        Avoncyclee cycle = new Avoncyclee();
        cycle.Applybrake(7);
        cycle.Speedup(6);
        System.out.println(cycle.a);
        cycle.blowhorn();
        cycle.blowhornk3g();
        cycle.blowhornmhn();
    }
}
