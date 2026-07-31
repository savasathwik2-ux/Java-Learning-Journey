package strings;

import java.util.Scanner;

public class RemovingDuplicate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input;
        String newString="";
        System.out.println("Enter the Input: ");
        input = scanner.nextLine();
        input = input.trim();
        if(input.isEmpty()){
            System.out.println("Invalid!!");
            return;
        }
        else {
            for(int i=0; i<=input.length()-1; i++){
                char ch = input.charAt(i);
                if(newString.contains(String.valueOf(ch))){
                }
                else {
                    newString+=input.charAt(i);
                }
            }
        }
        System.out.println(newString);
    }
}
