import java.util.Scanner;
public class RomanNumerals{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number in the range of 1-10: ");
		int i=in.nextInt();
		String x="";
		switch(i){
			case 1:x="I";break;
			case 2:x="II";break;
			case 3:x="III";break;
			case 4:x="IV";break;
			case 5:x="V";break;
			case 6:x="VI";break;
			case 7:x="VII";break;
			case 8:x="VIII";break;
			case 9:x="IX";break;
			case 10:x="X";break;
		}
		System.out.println(x);
	}
}