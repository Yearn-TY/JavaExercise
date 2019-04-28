import java.util.Scanner;

public class VendingMachine {
	private int price=120;
	private int balance=0;
	private int total;
	void showPrompt(){
		System.out.println("Welcome!");
		System.out.println("You can chose 1,2,3,4 to insert monry,show balance,choose food and exit.");
	}
	public void insertMoney(int amount){
		balance=balance+amount;
	}
	public void showBalance(){
		System.out.println("You have "+balance+" yuan");
	}
	public void getFood(){
		if(balance>=price){
			System.out.println("Here you are!!!");
			balance=balance-price;
			total=total+price;
		}else{
			System.out.println("Your balance is "+balance+" !");
			System.out.println("You can choose 1 to insert money or 4 to exit.");
		}
	}
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		VendingMachine vm=new VendingMachine();
		vm.showPrompt();
		int b=1,c;
		while(b==1){
			b=1;
			c=i.nextInt();
			switch(c){
			case 1:
				System.out.print("please input money:");
				vm.insertMoney(i.nextInt());
				break;
			case 2:
				vm.showBalance();
				break;
			case 3:
				vm.getFood();
				break;
			case 4:
				b=0;
				break;
			}
		}
		System.out.println("Bye!");
	}

}
