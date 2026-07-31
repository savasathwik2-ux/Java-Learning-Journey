package strings;

import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input;
        System.out.println("Enter input:");
        input = scanner.nextLine();

        String reverse = "";
        int i = input.length()-1;

        if(input.isEmpty()){
            System.out.println("Enter a valid name");
        }
        else{
            while(i>=0) {
                reverse += input.charAt(i);
                i--;
            }
        }
        System.out.println(reverse);
    }
}
