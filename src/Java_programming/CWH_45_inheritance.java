package Java_programming;
// Java Program to illustrate Inheritance (concise)

// Base or Super Class or parent class
        class Employee1 {
            int salary = 60000;
        }

// Inherited or Sub Class
        class Engineer extends Employee1 {
            int benefits = 10000;
        }

// Driver Class
        class Gfg {
            public static void main(String args[])
            {
                Engineer E1 = new Engineer(); // object creation
                System.out.println("Salary : " + E1.salary + "\nBenefits : " + E1.benefits);
            }
        }


