package oops.inheritance;

public class Employee {
    String name;
    double salary;

    void display(){
        System.out.println("Name:" +name);
        System.out.println("Salary:" +salary);
    }
}
class Manager extends Employee{
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.name = "Sathwik";
        m1.salary = 50000;
        m1.display();
    }
}