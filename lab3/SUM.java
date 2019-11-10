import java.util.Scanner;
public class SUM{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int n=1,sum=0;
		while(true){
			System.out.print("Enter a positive nonzero number: ");
			n=keyboard.nextInt();
			if(n==0) System.out.print("Invalid.");
			else break;
		}
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.printf("The sum of all the integers from %d through %d is %d.",1,n,sum);
	}
}