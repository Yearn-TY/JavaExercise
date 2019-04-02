
public class VendingMachine {
	private int price=120;
	private int balance=0;
	private int total;
	void showPrompt(){
		System.out.println("Welcome!");
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
		}
	}
	public static void main(String[] args) {
		VendingMachine vm=new VendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
	}

}
