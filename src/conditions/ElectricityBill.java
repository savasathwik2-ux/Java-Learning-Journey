package conditions;

import java.util.Scanner;

public class ElectricityBill
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        int units;
        double bill=0.0;
        System.out.print("Enter the units :");
        units = scanner.nextInt();

        if(units <=0)
        {
            System.out.println("Invalid Input");
            return ;
        }

        else if(units <= 100)
        {
            bill=bill + (units * 2);
        } else if (units >= 200)
        {
            bill = 500 + ((units-200)*5);
        }
        else {
            bill=200 + ((units-100)*3);
        }

        System.out.println("Your Electricity bill is :" + bill);

        scanner.close();;
    }
}
