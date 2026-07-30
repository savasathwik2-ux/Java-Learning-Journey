package loops;

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main ( String[] args)
    {
        Scanner scanner = new Scanner ( System.in);
        int product;
        int end;
        System.out.println("Which table you need ?");
        int number = scanner.nextInt();
        System.out.println("Enter till where you need:");
        end = scanner.nextInt();;
        for(int i = 1 ; i<=end ; i++)
        {
            product = number * i;
            System.out.println(number + "x" + i + "=" + product);
        }
    }
}
