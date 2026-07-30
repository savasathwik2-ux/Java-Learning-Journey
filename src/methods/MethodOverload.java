package methods;

import java.util.Scanner;

public class MethodOverload
{
    public static void main(String[] args)
    {
        Scanner sath = new Scanner(System.in);

        System.out.println(Area(10.0 ));

    }
    static double Area(double length , double breadth)
    {
        double area = length * breadth;
        return area;
    }
    static double Area(double radius)
    {
        double area = Math.PI * (Math.pow(radius ,2));
        return area;
    }
}
