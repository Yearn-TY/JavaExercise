import java.util.Scanner;
public class Distance{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the vehicle's speed: ");
		double speed=keyboard.nextDouble();
		System.out.print("Enter the number of hours the vehicle was in motion: ");
		int hour = keyboard.nextInt();
		System.out.println("Hour\t\tDistance Traveled");
		System.out.println("----------------------------------");
		for (int i=1;i<=hour;i++){
			System.out.printf("%d\t\t%.2f\n",i,i*speed);
		}
		
	}
}