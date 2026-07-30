package projects;

import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0.0;
        boolean isOperatorValid = true;

        System.out.println("Enter the num1 :");
        num1 = scanner.nextDouble();

        System.out.println("Enter the operator (+ , - , * , / , % ) ?");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the num2");
        num2 = scanner.nextDouble();

        switch (operator)
        {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Dividing with 0 is not possible");
                    isOperatorValid  = false;
                } else {
                    result = num1 / num2;
                }
            }

            case '%' -> {
                if (num2 == 0) {
                    System.out.println("Dividing with 0 is not possible");
                    isOperatorValid  = false;
                }
                else
                    {
                        result = num1 % num2;
                    }
                }
            default -> {
                System.out.println("Invalid operator");
                isOperatorValid  = false;
            }

        }
        if (isOperatorValid )
        {
            System.out.printf("%.2f %c %.2f = %.2f",num1 , operator , num2 , result);
        }
        scanner.close();
    }
}
