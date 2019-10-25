import java.util.Scanner;


public class StringManipulator{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		StringManipulator sm=new StringManipulator();
		System.out.print("Enter the name of you favorite city: ");
		String s=keyboard.nextLine();
		System.out.println("Number of character: "+s.length());
		System.out.println(sm.upper(s));
		System.out.println(sm.lower(s));
		System.out.println(sm.firstChar(s));
		
	}
	public String upper(String s){
		return s.toUpperCase();
	}
	public String lower(String s){
		return s.toLowerCase();
	}
	public char firstChar(String s){
		return s.charAt(0);
	}
}