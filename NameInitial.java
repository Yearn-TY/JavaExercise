public class NameInitial{
	public static void main(String[] args){
		String first="Herbert";
		String middle="George";
		String last="Dorfmann";
		char firstInitial=first.charAt(0);
		char middleInitial=middle.charAt(0);
		char lastInitial=last.charAt(0);
		System.out.printf("Name: %s %s %s",first,middle,last);
		System.out.printf("\nInitial: %c%c%c",firstInitial,middleInitial,lastInitial);
	}
}