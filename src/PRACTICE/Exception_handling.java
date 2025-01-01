package PRACTICE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Excep {


    Excep() throws FileNotFoundException {
    }

    void display()throws FileNotFoundException {
        int a=10;
        int b=0;
        int c = a/b;
        System.out.println(c);
    }

           BufferedReader obj = new BufferedReader(new FileReader(":D/spark2.0/Java?Exception_handling"));


}

public class Exception_handling {
    public static void main(String[] args) throws FileNotFoundException  {
       Excep obj = new Excep();
       try {
           obj.display();
       }
       catch(ArithmeticException e){
           System.out.println(e);
           e.printStackTrace();
           System.out.println(e.getMessage());
           System.out.println(e.toString());
       }
       catch (FileNotFoundException e){
           System.out.println(e);
       }
       finally{
           System.out.println("Backup code / Cleanup code is executed by Garbage collector");
       }
    }
}
