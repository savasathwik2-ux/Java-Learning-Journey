package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args){
        int[] nums ={12,53,6,2,33,55};
        Scanner scanner = new Scanner(System.in);
        int index;
        try{
            System.out.println("Enter the index:");
            index = scanner.nextInt();
            System.out.println(nums[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
        System.out.println("Program finished..");
    }
}
