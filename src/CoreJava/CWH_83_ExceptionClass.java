package CoreJava;

import java.util.Scanner;

/*
The Exception class in Java
We can write our custom Exceptions using the Exception class in java.

public class MyException extends Exception {
       // Overridden methods
}
The Exception class has the following important methods:

1) Strings toString() executed when sout (e) is runs

2) Void printStackTrace() - prints Stack trace

3) String getMessage() - prints the exception message */

class MyException extends Exception{
    @Override
    public String toString(){
       return "I am toString() method";
    }

    @Override
    public String getMessage() {
        return "I am getMessage() method";
    }
}

public class CWH_83_ExceptionClass {
    public static void main(String[] args){
      int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9) {
            try {
                 // throw new MyException();
                throw new ArithmeticException("Exception Occured!!");
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished!!");
            }
            System.out.println("CLOSE");
        }

    }
}
