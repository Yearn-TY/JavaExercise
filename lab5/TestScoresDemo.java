import java.util.Scanner;

public class TestScoresDemo {

	public static void main(String[] args) {
		double test1, test2, test3;   // Three test scores;
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		// Get the first test score.
		System.out.print("Enter test score #1: ");
		test1 = keyboard.nextDouble();
		System.out.print("Enter test score #2: ");
		test2 = keyboard.nextDouble();
		System.out.print("Enter test score #3: ");
		test3 = keyboard.nextDouble();
		// Create a TestScores object.
		TestScores scores = new TestScores(test1, test2, test3);
		// Display the average test score.
		System.out.printf("The average test score is %.2f\n",
							scores.getAverageScore());
	}

}