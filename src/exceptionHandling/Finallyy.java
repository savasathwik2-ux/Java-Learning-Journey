package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finallyy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();;
            int b = scanner.nextInt();

            int result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero is not possible");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
