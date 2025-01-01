package Java_programming;

public class CWH_34_Recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1); //n*factorial(n-1); ratta maar isko for recursion
        }
    }


    public static void main(String[] args) {
        int x=5;
        System.out.println("factorial of "+x+" is "+factorial(x));
    }
}
