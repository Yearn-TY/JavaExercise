
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
public class LetterCounterFile{
	private File file;
	private Scanner inputFile;
	public static void main(String[] args) throws IOException, FileNotFoundException{
		String filename = JOptionPane.showInputDialog("Enter the name of a file.");
		LetterCounterFile lc = new LetterCounterFile(filename, "hello world.");   //create a file and init it.
		// Input a character, and find the number of times that this character apppears in the file.
		char ch = JOptionPane.showInputDialog("Enter a letter contained in the string.").toUpperCase().charAt(0);
		lc.counts(ch);
	}
	public LetterCounterFile(String filename,String str) throws IOException, FileNotFoundException{ 
		this.file = new File(filename); 
		this.write(str);
		this.inputFile = new Scanner(file);
	}
	public void counts(char ch){
		int sum=0;
		while(inputFile.hasNext()){
			String str = inputFile.nextLine();
			str = str.toUpperCase();
			for (int i=0;i<str.length();i++){
				if(ch == str.charAt(i)) sum++;
			}
		}
		JOptionPane.showMessageDialog(null, String.format("The letter "+ch+" appears "+sum+
									                      " times in the file."));
	}
	public void write(String str) throws IOException{   //write String to file
		PrintWriter pw = new PrintWriter(new FileWriter(file,true));
		pw.println(str);
		pw.close();
	}
}