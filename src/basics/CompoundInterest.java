package basics;

import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double intrest;
        int number;
        double time;
        double annual;

        System.out.println("Enter the principal Amount :");
        principal = scanner.nextDouble();

        System.out.println("Enter intrest");
        intrest = scanner.nextDouble();;

        System.out.println("Enter No.of times should be compounded");
        number = scanner.nextInt();

        System.out.println("Enter the tenure in years");
        time = scanner.nextDouble();;

        annual = principal * Math.pow((1+(intrest/100)/number) , (number  * time));

        System.out.printf("Final amount after %.2f is %.3f" , time , annual);
    }

}
