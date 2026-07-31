package strings;

import java.util.Scanner;

public class PallendromeString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input;
        System.out.println("Enter input:");
        input = scanner.nextLine();

        String reverse = "";
        input = input.trim();
        input = input.toLowerCase();
        int i = input.length()-1;

        if(input.isEmpty()){
            System.out.println("Enter a valid name");
            return;
        }
        else{
            while(i>=0) {
                reverse += input.charAt(i);
                i--;
            }
        }
        if(reverse.equals(input)){
            System.out.println("Pallendrome");
        }
        else {
            System.out.println("Not a Pallendrome");
        }
    }
}
