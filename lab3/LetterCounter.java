
import javax.swing.JOptionPane;
public class LetterCounter{
	
	public static void main(String[] args){
		LetterCounter lc = new LetterCounter();
		String str = lc.getString();
		char ch = lc.getChar();
		lc.displayResult(str,ch);
	}
	public String getString(){
		return JOptionPane.showInputDialog("Enter a string.");
	}
	public char getChar(){
		return JOptionPane.showInputDialog("Enter a letter contained in the string.").toUpperCase().charAt(0);
	}
	public void displayResult(String str, char ch){
		int sum=0;
		//ch = ch.toUpperCase();
		str = str.toUpperCase();
		for(int i=0;i<str.length();i++){
			if(ch==str.charAt(i))
				sum++;
		}
		JOptionPane.showMessageDialog(null,String.format("The letter "+ch+" appears "+sum+
									                     " times in the string: "+str.toLowerCase()));
	}
}