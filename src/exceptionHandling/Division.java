package exceptionHandling;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try{
            int result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program Finished");
    }
}
