package strings;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input;
        int count=1;
        System.out.println("Enter the string");
        input = scanner.nextLine();
        input = input.trim();
        if(input.isEmpty()){
            System.out.println("Enter a Valid String!!");
            return;
        }
        else {
            for(int i=1; i<input.length(); i++){
                if(input.charAt(i) != ' ' && input.charAt(i-1) == ' '){
                    count++;
                }
            }
        }
        System.out.println("Number of words: " +(count));
    }
}
