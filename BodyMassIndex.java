import java.util.Scanner;
public class BodyMassIndex{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		System.out.println("This program will calculate you body mass index, or BMI.");
		System.out.print("Enter you weight, in pounds: ");   // 1 lb = 0.454 kg
		int weight=in.nextInt();
		System.out.print("Enter you height, in inches: ");   // 1 in = 2.45 cm
		int height = in.nextInt();
		// BMI: weight(kg)/height/height(m)
		double bmi=weight*0.454/((height*2.45/100)*(height*2.45/100));
		System.out.println("Your body mass index (BMI) is "+bmi);
		if(bmi>25)  System.out.println("You are overweight.");
		else if(bmi>18.5) System.out.println("You are optimal weight.");
		else System.out.println("You are underweight.");
	}
}