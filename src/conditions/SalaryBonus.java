package conditions;

import java.util.Scanner;

public class SalaryBonus
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        int salary;
        int experience;
        double bonus = 0.0;
        double finalSalary = 0.0;

        System.out.println("Enter the salary");
        salary = scanner.nextInt();

        System.out.println("Enter the experience");
        experience = scanner.nextInt();

        if(experience >= 10)
        {
            bonus = salary*0.2;
            finalSalary = salary + bonus ;
        }
        else if (experience >=5 && experience <=9)
        {
            bonus = salary *0.1 ;
            finalSalary = salary + bonus ;
        }
        else if (experience < 5)
        {
            bonus = 0.05* salary ;
            finalSalary = salary + bonus ;
        }

        System.out.println("Bonus :" + bonus);
        System.out.println("Total salary :" + finalSalary);
    }
}
