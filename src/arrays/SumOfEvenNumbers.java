package arrays;

import java.util.Scanner;

public class SumOfEvenNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int [] array = Input();
        System.out.println("Sum:" + Sum_of_even(array));
    }
    static int[] Input()
    {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        int i;

        for (i=0 ; i<5 ; i++)
        {
            array[i] = scanner.nextInt();
        }
        return array;
    }
       static int Sum_of_even(int [] array)
       {
           int i , sum=0;

           for(i=0; i<5; i++)
           {
               if(array[i] % 2 == 0)
               {
                   sum+=array[i];
               }
           }
           return sum;
       }
}
