package Java_programming;

/*
*Constructors in Java :
Constructors are similar to methods, but they are used to initialize an object.
Constructors do not have any return type(not even void).
Every time we create an object by using the new() keyword, a constructor is called.
If we do not create a constructor by ourself, then the default constructor(created by Java compiler) is called.

*Rules for creating a Constructor :
The class name and constructor name should be the same.
It must have no explicit return type.
It can not be abstract, static, final, and synchronized.

* Types of Constructors in Java :
There are two types of constructors in Java :


* Defaut constructor : A constructor with 0 parameters is known as default constructor
* Paramerterized constructor : A constructor with some specified number of parameters is known as a parameterized constructor.
 */

        class MyMainEmployee{
            private int id;
            private String name;

            //Constructor Overloading in Java :
            //Just like methods, constructors can also be overloaded in Java. We can overload the Employe constructor like below:

//            public Employee(String n){
//                name=n;
//            }

            //Note:
            //
            // Constructors can take parameters without being overloaded
            //There can be more than two overloaded constructors
            //Let's take an example to understand the concept of constructor overloading.

            public MyMainEmployee(){ // default constructor
                id = 0;
                name = "Your-Name-Here";
            }
            public MyMainEmployee(String myName, int myId){ //   parameterized constructor
                id = myId;
                name = myName;
            }
            public MyMainEmployee(String myName){  // custom constructor with one parameter
                id = 1;
                name = myName;
            }
            public String getName(){
                return name;
            }
            public void setName(String n){
                this.name = n;
            }
            public void setId(int i){
                this.id = i;
            }
            public int getId(){
                return id;
            }
        }

        public class CWH_41_ConstructorOverloading {
            public static void main(String[] args) {

//                MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12); // constructor called which accepts two parameter (Custom values constructor)
                MyMainEmployee harry = new MyMainEmployee();//(constructor called which does not accept any parameter (default constructor))
               // MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry"); //(constructor called which accept on Spark_2_0_Java_Full_Stack_.string argument parameter)

                harry.setName("CodeWithHarry");
                harry.setId(34);

                System.out.println(harry.getId());
                System.out.println(harry.getName());
            }
        }


