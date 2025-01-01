package CoreJava;

//Throw vs Throws in Java
//The Throw Keyword:
//The throw keyword is used to throw an exception explicitly by the programmer

//In a similar manner, we can throw user defined exceptions:
// throw new MyException ( "Exception throw" );

//The throws Keyword
// java throws keyword is used to declare an exception.
//This gives an information to the programmer that there might be an exception so its better to be prepared with a try catch block!

//    public void calculate (int a, int b) throws IOException {
//
//            // code
//
//    }

class NegativeradiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "Radius can't be negative";
    }
}

public class CWH_84_Throw_Throws_Difference {

    public static double area(int r) throws NegativeradiusException{
        if(r<0){
            throw new NegativeradiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
      try {
          int c = divide(2, 0);
          System.out.println(c);
          double ar = area(-1);
          System.out.println(ar);
      }
      catch(Exception e){
          System.out.println("Exception");
      }
    }
}
