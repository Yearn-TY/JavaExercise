
import java.util.Scanner;
public class DriverTest
{
   public static void main(String[] args){
      String input;                             // To hold keyboard input
      final int NUM_ANSWERS = 20;               // Number of answers
      char[] answers = new char[NUM_ANSWERS];   // Array to hold answers
      int[] missedQuestions;                    // Array to hold missed questions

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the user's answers to the questions.
      System.out.println("Enter your answers to the " +
                         "exam questions. (Make sure " +
                         "Caps Lock is ON!)");
      for (int i = 0; i < answers.length; i++)
      {
         System.out.print("Question " + (i + 1) + ": ");
         input = keyboard.nextLine();
         answers[i] = input.charAt(0);
         
         // Validate the answer.
         while (!valid(answers[i]))
         {
            System.out.println("ERROR: Valid answers are " +
                               "A, B, C, or D.");
            System.out.print("Question " + (i + 1) + ": ");
            input = keyboard.nextLine();
            answers[i] = input.charAt(0);
         }
      }
      
      // Create a DriverExam object.
      DriverExam exam = new DriverExam(answers);
      
      // Get an array of the missed question numbers.
      missedQuestions = exam.questionsMissed();
      
      // Display a report.
      System.out.println("Correct answers: " + exam.totalCorrect());
      System.out.println("Incorrect answers: " + exam.totalIncorrect());
   }
	public static boolean valid(char c)
	   {
	      boolean status;
	      
	      if (c == 'A' || c == 'B' || c == 'C' || c == 'D')
	         status = true;
	      else
	         status = false;
	      return status;
	   }
 }