import java.util.Scanner;
import java.io.*;
public class DistanceFile{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the vehicle's speed: ");
		double speed=keyboard.nextDouble();
		System.out.print("Enter the number of hours the vehicle was in motion: ");
		int hour = keyboard.nextInt();
		File file = new File("DistanceReport.txt");
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(file,true));
			pw.println("Hour\t\tDistance Traveled");
			pw.println("----------------------------------");
            for (int x = 1; x <= hour; x++) {
				pw.println((x+"\t\t"+x*speed));
            }
			pw.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
		System.out.println("Report written to DistanceReport.txt.");
	}
}