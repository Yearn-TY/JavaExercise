
import java.util.Random;

public class DiceGame{
	public static void main(String[] args){
		int userWin=0, comWin=0,ties=0;   
		for(int i=0;i<10;i++){
			int computer = (int) (Math.random()*10%7);
			int user = (int) (Math.random()*10%7);
			if(computer>user) comWin++;
			else if (user >computer) userWin++;
			else ties++;
		}
		System.out.println("Computer...."+comWin+
		                   "\nUser........"+userWin+
						   "\nTies........"+ties);
		if(comWin>userWin) System.out.println("The computer is the grand winner!");
		else if(userWin>comWin) System.out.println("The user is the grand winner!");
		else System.out.println("There is no winner!");
	}
}