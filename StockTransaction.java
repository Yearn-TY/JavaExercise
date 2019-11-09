public class StockTransaction{
	public static void main(String []args){
		double price1=32.87,price2=33.92;
		int amount=1000;
		double percentage=0.02;
		double firstTotal=price1*amount;
		double secondTotal=price2*amount;
		double firstPer=firstTotal*percentage;
		double secondPer=secondTotal*percentage;
		double total1=firstTotal+firstPer;
		double total2=secondTotal-secondPer;
		System.out.println("Joe paid $"+firstTotal+" for the stock.");
		System.out.println("Joe paid his broker a commission of $"+firstPer+" on the purchase.");
		System.out.println("So, Joe paid a total of $"+total1);
		System.out.println();
		System.out.println("Joe sold the stock for $"+secondTotal);
		System.out.println("Joe paid his broker a commission of $"+secondPer+" on the sale.");
		System.out.println("So, Joe recieved a total of $"+total2);
		System.out.println();
		System.out.println("Joe's profit or loss: $"+(total2-total1));
	}
}