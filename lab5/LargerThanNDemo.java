
import java.util.Scanner;  // For Scanner class

/**
   This program demonstrates a solution to 
   the Larger Than n programming challenge.
 */
public class LargerThanNDemo
{
   public static void main(String[] args)
   {
      int number; // To hold a number.
      
      // Create an array of integers.
      int[] numbers = {1, 23, 43, 54, 4, 34, 2, 5, 7, 9};
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      // Get a number as input from the user.
      System.out.print("Enter a number: ");
      number = keyboard.nextInt();
      // Display all the numbers larger than number.
      displayGreaterThan(numbers, number);
   }
   
   /**
      The displayGreaterThan method that accepts two arguments: 
      an integer array and a number n, and displays all of the 
      numbers in the array that are greater than the number n.
      @param array The array.
      @param n The number.
    */
    
   private static void displayGreaterThan(int[] array, int n){
      // Step through the array.
	  for(int  x : array){
         // Determine if a number is greater than n.
         if(n<x){
            // If so, display the number.
            System.out.println(x);
         }
      }
   }
}