package oops.abstraction;

public class Developers extends Employees implements BonusEligible{
    @Override
    public void calculateBonus() {
        System.out.println("Developer Salary");
    }

    @Override
    void work() {
        System.out.println("Developer work");
    }
}
