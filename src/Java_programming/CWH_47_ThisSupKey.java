package Java_programming;

class EkClass{
            int a;
            public int getA() {
                return a;
            }
            EkClass(int a){
                this.a = a; // this keyword is used to assign reference of current class object
            }
            public int returnone(){
                return 1;
            }
        }
        class DoClass extends EkClass{
            DoClass(int c){
                super(c); // super keyword is used to assign reference of parent class object
            System.out.println("I am a constructor"); }
        }
public class CWH_47_ThisSupKey {
    public static void main(String[] args) {
                EkClass e = new EkClass(65);
                DoClass d = new DoClass(5);
                System.out.println(e.getA());
    }
}
    
