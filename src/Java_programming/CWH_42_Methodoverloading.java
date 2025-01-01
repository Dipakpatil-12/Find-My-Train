package Java_programming;

//Same name different parameters in same class

class EmployeeMain{
    private int Salary;

    //default constructor
    public  EmployeeMain() {
        Salary = 45000;
    }

    //parameterized constructor
        public EmployeeMain(int mySalary){
         this.Salary = mySalary;
        }


        public int getSalary(){
            return Salary;
        }
        public void setSalary(int i){
           this.Salary = i;

        }
    }

public class CWH_42_Methodoverloading {
    public static void main(String[] args) {
      EmployeeMain obj = new EmployeeMain( 10000);
        System.out.println(obj.getSalary());
    }
}
