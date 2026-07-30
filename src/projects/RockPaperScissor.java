package projects;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your choice (rock , paper , scissor) ");
        String userGuess = scanner.nextLine();

        Random random = new Random();
        int RandomNumber = random.nextInt(0, 3);
        if (!(userGuess.equalsIgnoreCase("rock")
                || userGuess.equalsIgnoreCase("paper")
                || userGuess.equalsIgnoreCase("scissor")))
        {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        switch (RandomNumber)
        {
            case 0 ->
            {
                System.out.println("Computer choice is rock");
                if(userGuess.equalsIgnoreCase("rock"))
                {
                    System.out.println("Its a draw");
                }
                else if(userGuess.equalsIgnoreCase("paper"))
                {
                    System.out.println("You Winn!!!");
                }
                else
                {
                    System.out.println("Computer wins");
                }
            }
            case 1 ->
            {
                System.out.println("Computer choice is paper");
                if(userGuess.equalsIgnoreCase("paper"))
                {
                    System.out.println("Its a draw");
                }
                else if(userGuess.equalsIgnoreCase( "scissor"))
                {
                    System.out.println("You Winn!!!");
                }
                else
                {
                    System.out.println("Computer wins");
                }
            }
            case 2 ->
            {
                System.out.println("Computer choice is scissor");
                if(userGuess.equalsIgnoreCase("scissor"))
                {
                    System.out.println("Its a draw");
                }
                else if(userGuess.equalsIgnoreCase("rock"))
                {
                    System.out.println("You Winn!!!");
                }
                else
                {
                    System.out.println("Computer wins");
                }
            }
        }
    }
}
