package arrays;

import java.util.Scanner;

public class ArrayLargestSmallestElement
{
    public static void main(String [] args)
    {

        int[] array=Input();
        Display(array);
        Largest(array);
        Smallest(array);
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
    static void Display(int[] array)
    {
        int i;
        for(i=0 ; i<5; i++)
        {
            System.out.println(array[i]);
        }
    }
    static void Largest(int [] array)
    {
        int largest = 0;
        int i;

        for(i=0 ; i<5 ; i++)
        {
            if(array[i] > largest)
            {
                largest = array[i];
            }
        }
        System.out.println("Largest number:" + largest);
    }
    static void Smallest(int [] array) {
        int smallest = array[0];
        int i;

        for (i = 0; i < 5; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Smallest number:" + smallest);
    }
}
