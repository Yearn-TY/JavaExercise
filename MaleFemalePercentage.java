import java.util.Scanner;

public class MaleFemalePercentage{
	public static void main(String []args){
		Scanner keyboard=new Scanner(System.in);
		int male,female;
		System.out.print("Enter the number of male students: ");
		male=keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Enter the number of female students: ");
		female=keyboard.nextInt();
		int total=male+female;
		System.out.printf("Male: %.2f%%",((double)male*100/total));
		System.out.printf("\nFemale: %.2f%%",((double)female*100/total));
	}
}