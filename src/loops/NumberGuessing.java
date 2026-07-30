package loops;

import java.util.Scanner;
import java.util.Random;
public class NumberGuessing
{
    public static void main(String args[])
    {
        Random random = new Random() ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range (min - max)");
        int min,max;
        min = scanner.nextInt();
        max = scanner.nextInt();
        int RandomNumber = random.nextInt(min , max+1);

        System.out.println("Enter the guess number");
        int GuessNumber = scanner.nextInt();
        while(RandomNumber != GuessNumber)
        {
            if(RandomNumber < GuessNumber)
            {
                System.out.println("Too High");
                System.out.println("Enter the guess :");
                GuessNumber = scanner . nextInt();

            }
            else
            {
                System.out.println("Too Low!!");
                System.out.println("Enter the guess :");
                GuessNumber = scanner . nextInt();
            }
        }
        System.out.println("Your guess is correct");

    }
}
