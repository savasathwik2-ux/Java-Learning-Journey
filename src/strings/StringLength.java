package strings;

import java.util.Scanner;

public class StringLength{
    public static void main(String [] args){
        String name;

        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();

        name=name.trim();
        if(name.isEmpty()){
            System.out.println("Please enter a Valid name");
        }
        else {
            System.out.println("Length of your name is:" + name.length());
        }
    }
}
