package CoreJava;
//Java finally block
//Finally block contains the code which is always executed whether the exception is handled or not.
//
//It is used to exception is handled or not.
//
//It is used to execute code containing instructions to release the system resources, close a connection etc

public class CWH_85_FinallyBlock {
    public static int greet(){
        try{
            int a=50;
            int b=0;
            int c=a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Cleaning up the resources..this is end of block");
        }
        return -1;
    }
    public static void main(String[] args) {
         int k = greet();
        System.out.println(k);

        int a = 7;
        int b = 9;

        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally block for value b "+ b);
            }
            b--;
        }
    }
}
