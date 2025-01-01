package Advance_Java;

class InvalidInputException extends Exception{
    public String toString(){
        return "Invalid input like 8 & 9";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}
class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "Can not divide by 0";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "inputs is greater than 100000";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}
class MaxMultiplierReachedException extends Exception{
    public String toString(){
        return "max multiplier like above 7000 is not allowed";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}

class CustomCalculator{
    double add(double a,double b) throws InvalidInputException,MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        else if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double sub(double a,double b)throws MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double mul(double a,double b)throws MaxInputException,MaxMultiplierReachedException{
        if(a>7000||b>7000){
            throw new MaxMultiplierReachedException();
        }
        else if(a>100000||b>100000){
            throw new MaxInputException();
        }
        return a*b;
    }
    double div(double a,double b)throws CannotDivideByZeroException,MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        else if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class CWH_103_SolutionOfCWH_87_CustomCalculator {
    public static void main(String[] args) throws InvalidInputException,MaxInputException,CannotDivideByZeroException,MaxMultiplierReachedException{

/*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
                */
        CustomCalculator c = new CustomCalculator();
        c.add(8,9); //Execute one method at a time because it will give exception for first method(add) rather than div/sub/mul it will not check downwards it will terminate
//        c.div(10,0);
//        c.sub(10000000,45);
//          c.mul(8099,89);

    }
}
