package CoreJava;

public class CWH_78_ExceptionHandling_Basic {
    public static void main(String[] args) {
        //Syntax error
        //int a = 10 -------> so there is semicolon is missing, so it's syntactical error
        int b = 20;
       // System.out.println(a+b);


        /*
        Errors & Exception in Java
No matter how smart we are, errors are our constant comparisons.
With practice, we keep getting better at finding 2 correcting them.

There are three types of errors in java.
1) Syntax errors
2) Logical errors
3) Runtime errors- also called Exceptions

Syntax Errors
When complex finds something wrong with our program,
it throws a syntax error

int   a = 9  // No semicolon, syntax errors!
a =   a + 3;
d = 4; // Variable not declared, syntax errors


Logical errors
A logical error or a bug occurs when a program
compiles and round but does the wrong thing.
- Message delivered wrongly
- Wrong time of chats being displayed
Incorrect redirects!


Runtime errors
Java may sometimes encounter an error while the program is running.
These are also called Exceptions!
These are encountered due to circumstances like bad input and (or) resource constraints.
Ex: User supplies 'S' + 8 to a program that adds 2 numbers.
Syntax errors and logical errors are encountered by the programmers, whereas Run-time errors are encountered by the users.

         */
    }
}
