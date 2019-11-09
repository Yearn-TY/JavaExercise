
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class LargestAndSmallest{
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer, or -99 to quit: ");
		List<Integer> list = new ArrayList<Integer>();
		int i=0, x=keyboard.nextInt();
		while(x!=-99){
			list.add(x);
			i++;
			System.out.print("Enter an integer, or -99 to quit: ");
			x=keyboard.nextInt();
		}
		if(i==0) System.out.println("You did not enter any numbers.");
		else{
			for(int j=0; j< i-1; j++){ //sort.
				int position = j;
				for(int k=j+1; k<i; k++){
					if(list.get(k)<list.get(position)){
						position = k;
					}
				}
				int num=list.get(position);
				list.set(position,list.get(j));
				list.set(j,num);
			}
			System.out.println("Largest: "+list.get(i-1));
			System.out.println("Smallest: "+list.get(0));
		}
	}
}