package oops.abstraction;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Developer();
        Employee e2 = new Managrer();

        e1.calculateSalary();
        e1.compayPolicy();

        e2.calculateSalary();
        e2.compayPolicy();
    }
}
