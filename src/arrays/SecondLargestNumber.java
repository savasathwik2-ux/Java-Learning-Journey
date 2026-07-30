package arrays;

import java.util.Scanner;

public class SecondLargestNumber
{
    public static void main(String [] args)
    {
        int [] array = Input();
        System.out.println("Second Largest:" + Second_Largest(array));
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

      static int Second_Largest(int [] array)
      {
          int i,second_largest=0;
          int largest = array[0];

          for(i=0; i<5; i++)
          {
              if(array[i] > largest)
              {
                  largest = array[i];
              }
          }
          return second_largest;
      }
}
