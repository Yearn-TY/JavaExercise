import java.util.Scanner;
public class BookClubPoints{
	public static void main(String []args){
		Scanner keyload = new Scanner(System.in);
		System.out.print("How many books have you purchased this month? ");
		int amount=keyload.nextInt();
		if(amount<=0) System.out.println("You've earned 0 points.");
		else if(amount==1) System.out.println("You've earned 5 points.");
		else if(amount==2) System.out.println("You've earned 15 points.");
		else if(amount==3) System.out.println("You've earned 30 points.");
		else               System.out.println("You've earned 60 points.");
	}
}