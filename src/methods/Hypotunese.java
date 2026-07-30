package methods;

import java.util.Scanner;

public class Hypotunese
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int side1;
        int side2;

        System.out.println("Enter the two sides of the Triangle");

        side1 = scanner.nextInt();
        side2 = scanner.nextInt();

        double hyp = Math.sqrt((Math.pow(side1,2) + Math.pow(side2 ,2)));

        System.out.println("Methods.Hypotunese side of the triangle is :" + hyp);

        scanner.close();
    }
}
