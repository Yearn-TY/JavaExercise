
import java.util.Scanner;
public class SalesTax{
	public static void main(String []args){
		double purchase;
		
		double statesPercent=0.04,countyPercent=0.02;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter the purchase amount: ");
		purchase=keyboard.nextDouble();
		double states=purchase*statesPercent;
		double county=purchase*countyPercent;
		System.out.println("Purchase amount: $"+purchase);
		System.out.println("State tax: $"+states);
		System.out.println("County tax: $"+county);
		System.out.println("Total tax: $"+(states+county));
		System.out.println("Total cost: $"+(purchase+states+county));
	}
}