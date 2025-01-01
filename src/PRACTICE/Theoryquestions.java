package PRACTICE;

public class Theoryquestions {
    public static void main(String[] args) {
        /*1) What is Operator and why we need operators?
        = operators are symbols between operands,operators are used to perform operations on operands

        2) List down all the operators available in Java?
        ==> Arithmetic operators are used to perform mathematical calculations like (+,-,%,/,*),relational/ comparison operator are
         used to define boolean value like(<,>,<=,>=),logical operator like logical &,||,!,assignment operator like ==,!=,+=,-=,*=,/= ,
         bitwise operator perform operations bits

        3) What is the difference between Relational & Logical Operators?
        ==> relational operator are use to compare the relation gives boolean value like greater then, less than ,grater then equal to,
        etc and logical operators are used to check the both condition like && both has to be true and || one has to be true

        4) What is the purpose of 'new' operator?
        ==> new operator is used to create an object of class

        5) What is the purpose of 'dot(.)' operator?
        ==>dot operator is used to refer to current or parent class object so basically it is used for reference the properties
        and methods

       6) What is the purpose of instance of operator?
       ==> we have to create an instance of class/object without instance we can not access the methods and properties of object

        7) What is the difference between "=" and "==" operators?
        ==> = it means it assign the value means equals to , & == it means it checks the condition true or false ,it checks content

         8) What is the purpose of Control Statements & List down all the control statements available in java?
         ==> control statement usefull for controling the flow of program using conditions and loops we used for that like for loop for
          iterating the numbers in this the first have to declare and initiallize the value then it check the conditions and then increment the value
         ,while loop first check the condition then increment or decrement and declaration is outside the loop it is just same like for loop
         , do while loop runs atleat one time it first runs and then check condition after first iteration,nested loop is loop with in loop,
         foreach loop are used to print the array

        9) Write a java program on if - else, if - else ladder
        ==>control statement is usefull for check/assign the flow of program, we can give the conditionals like if,ifelse,elseif ladder,
        nested if to check the condition is true or false in loop
         // if else
         int a = 10;
         if(a>7){
         System.out.println("yes");
         }else{
         System.out.println("No");
         }
         //else if ladder
         int b = 20;
         if(b==10){
         System.out.println("Yes");
         }elseif(b<10){
         System.out.println("No");
         }elseif(b>10){
         System.out.println("Never");
         }else{
         System.out.println("yesss");
         }

        10) Write a java program on 'switch' case
        ==> String name = "Dipak";
        Switch(name){
        case Dipak:
        System.out.println("Yes");
        break;
        case Saurabh:
        System.out.println("No");
        break;
        case Anurag:
        System.out.println("Maybe");
        break;
        }

         11) What is the difference between while & do-while loops
       ==>  In while loop first it checks the condition if the condition is true then it will go inside loop and run and
       increment whereas in do-while loop first it execute once then it checks the condition do-while loop executes atleast once.

        12) Write a java program on 'while' loop
        ==> int i = 10;
          While(i<=100){
        System.out.println(i);
           i++;
           }


        13) What is the difference between 'while' loop & 'for' loop
        ==> In while loop and for loop there is no big difference, for loop executes in one line so it declaration,initiallization,
        condition & increment happens whereas in while loop first it checks the condition and if the condition is true then it will
        goes into loop & declaration and initillizaton takes place outside the loop and increment or decrement assign inside loop

        14) Write a java program on 'for' loop
        ==>int sum = 0;
         for(int i=0; i<=10; i++){
         sum = sum + i;
         }
         System.out.println(sum);

        15) Write a java program on 'nested for loop'
        ==> for printing basic star pattern we use nested for loop
         for(int i=0; i<5; i++){
          for(int j=0; j<=i; j++){
          System.out.print("* ");
          }
          System.out.println();
          }

        16) What is the difference between 'break' and 'continue' & 'return' keywords
        ==> break keyword we use if the satisfied condition meets we will break/exit from loop or switch case or from any functions
        it will not run/checks further conditions/tasks and continue keyword does not break the entire loop or any function it will
        only skip that particular condition it will continue to execute all the condition and return keyword we used when we want to return
        anything from methods,functions it will not print it will only return the output and we have to call the return value in main method

        17) Write a java program using 'break' keyword
        ==> for(int i=1; i<=10; i++){
        if(i==5){
        break;
        }
        System.out.println(i);
        }
        // it wil print 1 to 4 elements then it will not run onwards because it meets the if condition and break the loop

        18) Write a java program using 'continue' keyword
        for(int i=1; i<=10; i++){
        if(i==2){
        continue;
        }
        System.out.println(i);
        }
        // it will print 1 to 10 elements except 2 because it will skip that element because if condition meets the
         value it will continue/skip that element

         */
    }
}
