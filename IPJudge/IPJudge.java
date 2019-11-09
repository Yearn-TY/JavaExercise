import java.util.Scanner;

public class IPJudge{
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		IPJudge ipJudge = new IPJudge();
		System.out.println("Please enter a IP address,\nI can judge if it is valid.");
		String ip = keyboard.nextLine();
		System.out.println(ipJudge.matches(ip));
	}
	public String matches(String text){
		if(text!=null&&!text.isEmpty()){
			String regex="^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9])\\."
						+"(1\\d{2}|2[0-4]|\\d|25[0-5]|[1-9]\\d|\\d)\\."
						+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
						+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
			if(text.matches(regex)){
				return text+" is a valid IP address.";
			}else{
				return text+" is not a valid IP address.";
			}
		}
		return "Please enter the IP address: ";
	}
}