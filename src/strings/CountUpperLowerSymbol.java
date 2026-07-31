package strings;

import java.util.Scanner;

public class CountUpperLowerSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        System.out.println("Enter the Input");
        input = scanner.nextLine();
        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;
        int specialChar = 0;
        for (int i = 0; i < input.length(); i++) {
            if ((int) input.charAt(i) >= 65 && (int) input.charAt(i) <= 90) {
                upperCase++;
            } else if ((int) input.charAt(i)>= 97 && (int) input.charAt(i) <= 122) {
                lowerCase++;
            } else if ((int) input.charAt(i) >= 48 &&(int) input.charAt(i) <= 57) {
                number++;
            } else {
                specialChar++;
            }
        }
        System.out.println("UpperCase: " +upperCase);
        System.out.println("LowerCase: " +lowerCase);
        System.out.println("Number/Numeric: " +number);
        System.out.println("Special Characters: " +specialChar);
    }
}
