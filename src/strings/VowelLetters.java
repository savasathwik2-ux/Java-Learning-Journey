package strings;

import java.util.Scanner;

public class VowelLetters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String input;
        System.out.println("Enter the input:");
        input = scanner.nextLine();
        input = input.trim();
        input = input.toLowerCase();

        if(input.isEmpty()){
            System.out.println("Enter a Valid input");
            return;
        }
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == 'a'  || input.charAt(i) == 'e' || input.charAt(i) == 'i'  || input.charAt(i) == 'o' || input.charAt(i) == 'u'){
                count ++;
            }
        }
        System.out.printf("There are %d vowels in %s" , count , input);
    }
}
