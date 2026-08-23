package oops.abstraction;

abstract class Employee {
    abstract void calculateSalary();
    void compayPolicy() {
        System.out.println("Employees follow company policies");
    }
}
class Developer extends Employee{
    void calculateSalary(){
        System.out.println("Employee Salary");
    }
}
class Managrer extends Employee{
    void calculateSalary(){
        System.out.println("Manager Salary");
    }
}
