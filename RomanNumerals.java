import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class RomanNumerals{
	public static void main(String []args){
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"I");
		map.put(2,"II");
		map.put(3,"III");
		map.put(4,"IV");
		map.put(5,"V");
		map.put(6,"VI");
		map.put(7,"VII");
		map.put(8,"VIII");
		map.put(9,"IX");
		map.put(10,"X");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number in the range of 1-10: ");
		int i=in.nextInt();
		System.out.println(map.get(i));
	}
}