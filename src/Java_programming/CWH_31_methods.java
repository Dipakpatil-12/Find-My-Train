package Java_programming;

public class CWH_31_methods {
    /*
Static keyword :
The static keyword is used to associate a method of a given class with the class rather than the object.
You can call a static method without creating an instance of the class.
In Java, the main() method is static, so that JVM can call the main() method directly without allocating any extra memory for object creation.
All the objects share the static method in a class.
 */
    static int logic(int x, int y){
         int z;
         if(x>y){
              z = x+y;
         }else {
              z = (x +y) * 5;
         }
         x = 566; // there is no need for this,because we need to copy the values from main method
         return z;
            }

     public static void main(String[] args) {
                int a = 5;
                int b = 7;
                int c;
                // Method invocation using Object creation
                //CWH_31_methods obj = new CWH_31_methods();
                //c = obj.logic(a, b);
                c = logic(a, b);
                System.out.println(a + " "+ b);
                System.out.println(c);
                int a1 = 2;
                int b1 = 1;
                int c1;
                c1 = logic(a1, b1);
                System.out.println(a1 + " "+ b1);
                System.out.println(c1);
            }
        }


