package Java_programming;

 class Employee2 {
     int id;
     int Salary;
     String name;

     public void printingdetails(){
         System.out.println("My id is "+id+" and my name is "+name);
     }
     public int getSalary(){
         return Salary;
     }
 }

public class CWH_38_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is custom class ");
        Employee2 harry = new Employee2();//instantiating a new object
        Employee2 john = new Employee2();

        //Setting Attributes
        harry.id=12;
        harry.Salary=25000;
        harry.name="CodeWithHarry";
        john.id =17;
        john.Salary=35000;
        john.name="John khandelwal";

        //printing the properties or attributes

        harry.printingdetails();
        john.printingdetails();

        int a =john.getSalary();
        System.out.println(a);

        System.out.println(harry.id);
        System.out.println(harry.name);

    }
}
