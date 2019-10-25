import javax.swing.JOptionPane;
import java.util.Scanner;
public class ShippingCharges{
	
	public static void main(String []args){
		Scanner keyboard = new Scanner(System.in);
		//JOptionPane jp = new JOptionPane();
		//int mile = (int)JOptionPane.showInputDialog("Mile you want to ship: ");
		//int pound = (int)JOptionPane.showInputDialog("Weight of your package: ");
		System.out.print("Mile you want to ship: ");
		int mile=keyboard.nextInt();
		System.out.print("Weight of your package: ");
		int pound=keyboard.nextInt();
		double price;
		if(pound<=2)  price=1.10;
		else if(pound<=6) price=2.20;
		else if(pound<=10) price=3.70;
		else price=3.80;
		int n;
		if(mile%500!=0) n=mile/500+1;
		else n=mile/500;
		JOptionPane.showMessageDialog(null,String.format("The shipping charges are $%,.2f\n",n*price));
	}
}