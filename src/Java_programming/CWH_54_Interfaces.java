package Java_programming;

interface Bicycle {
    void applybrakee ( int decrement );
    void  speedupp ( int increment );
}

class Avoncycle implements Bicycle {
    int speed = 7;

    public void applybrakee(int decrement) {
        speed = speed - decrement;
    }

    public void speedupp(int increment) {
        speed = speed + increment;
    }

    public class CWH_54_Interfaces {
        public static void main(String[] args) {
            Avoncycle cy = new Avoncycle();
            cy.applybrakee(3);
            cy.speedupp(7);
            System.out.println(cy.speed);
        }
    }
}
