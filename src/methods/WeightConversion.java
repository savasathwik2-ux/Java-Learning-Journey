package methods;

import java.util.Scanner;

public class WeightConversion
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        double weight_kg;
        double weight_lbs;
        double converted_weight;
        int choice;

        System.out.println("1.Convert lbs to kgs ");
        System.out.println("2. convert kgs to lbs");
        System.out.println("Enter the choice");

        choice = scanner.nextInt();

        if(choice == 1)
        {
            System.out.println("Enter the weight in lbs");
            weight_lbs = scanner.nextDouble();

            converted_weight = weight_lbs * 0.45359 ;

            System.out.println("Weight in kgs is :" + converted_weight);
        }
        else if (choice == 2)
        {
            System.out.println("Enter the weight in lbs");
            weight_kg = scanner.nextDouble();

            converted_weight = weight_kg * 2.20462 ;

            System.out.println("Weight in kgs is :" + converted_weight);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
