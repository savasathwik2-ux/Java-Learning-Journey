package projects;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("============= NUMBER GUESSING GAME =============\n");

        int userGuess ;
        int attempts = 5;
        int randomNumber;
        String choice = "yes";
        while(choice.equalsIgnoreCase("yes") )
        {
            int attemptsRemaining = attempts;
            randomNumber = random.nextInt(1 , 100);

            System.out.printf("Attempt 1 out of %d\n",attempts);
            System.out.println("Enter your Guess :");
            userGuess = scanner.nextInt();

            while(randomNumber != userGuess && attemptsRemaining != 1)
            {

                if(userGuess > randomNumber)
                {
                    System.out.println("Too high!!");
                }

                else
                {
                    System.out.println("Too Low!!");
                }

                attemptsRemaining--;
                System.out.print("Attempts remaining : ️" + attemptsRemaining);
                System.out.println("\n\n");

                System.out.printf("Attempt %d out of %d\n",(attempts-attemptsRemaining+1) , attempts);
                System.out.println("Enter your guess");
                userGuess = scanner.nextInt();;


            }
            if(userGuess == randomNumber)
            {
                System.out.println(" Congratulations! \n" +
                        "\n" +
                        "You guessed the number correctly.");

                System.out.println("Attempts taken " + (attempts - attemptsRemaining));
            }
            else
            {
                System.out.println("\nGame Over..!! ");
                System.out.println("Correct Number was " +randomNumber);
            }
            System.out.println("Do you want to Play again(yes/no)");
            scanner.nextLine();
            choice = scanner.nextLine();

        }

        System.out.println("Thanks for Playing ");
        System.out.println("Goodbye..!");

    }
}
