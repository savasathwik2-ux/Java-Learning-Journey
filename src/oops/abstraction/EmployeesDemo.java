package oops.abstraction;

public class EmployeesDemo {
    public static void main(String[] args) {

        Employees e1 = new Developers();
        Employees e2 = new Manager();
        BonusEligible b1 = new Developers();
        BonusEligible b2 = new Manager();

        b1.calculateBonus();
        e1.work();
        e1.display("Sathwik" , 1000.50);

        b2.calculateBonus();
        e2.work();
        e2.display("Revanth" , 6000.53);
    }
}
