package strings;

import java.util.Scanner;

public class FirstAndLastCharacter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input;
        System.out.println("Enter the String");
        input = scanner.nextLine();

        input = input.trim();
        if(input.isEmpty()){
            System.out.println("Enter valid input");
        }
        else{
            System.out.println("First character is :" + input.charAt(0));
            System.out.println("Last character is :" + input.charAt(input.length() - 1));
        }
    }
}
