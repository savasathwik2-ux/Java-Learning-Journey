package oops.abstraction;

public class Manager extends Employees implements BonusEligible{
    @Override
    public void calculateBonus() {
        System.out.println("Manager Salary");
    }

    @Override
    void work() {
        System.out.println("Manager work");
    }
}
