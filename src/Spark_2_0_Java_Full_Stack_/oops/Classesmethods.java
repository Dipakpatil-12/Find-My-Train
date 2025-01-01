package Spark_2_0_Java_Full_Stack_.oops;

class Employee{
    int id;
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public void getDetails(){
        String name = "Dipak";
        System.out.println(name);
        int id = 1215;
        System.out.println(id);
    }
}

public class Classesmethods {
    public static void main(String[] args) {
      Employee obj = new Employee();

      obj.salary = 25000;

      int a = obj.getSalary();
        System.out.println(a);
        obj.getDetails();
    }
}
