//import java.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
public class Files{
    public static void main(String []args) throws IOException{
        String fileName;
        String friendName;
        int numFriends;
        //create a Scanner object for keyboard input
        Scanner keyboard=new Scanner(System.in);
        //get the numbers of the friends
        System.out.print("How many friends do you have? ");
        numFriends=keyboard.nextInt();
        //Consume the remaing newline character
        keyboard.nextLine();
        //get the file name
        System.out.print("Enter the filename: ");
        fileName=keyboard.nextLine();
        //open the file
        //PrintWriter outputFile = new PrintWriter(fileName);
        //To avoid erasing a file that already exists, create a fileWriter object in this manner:
        FileWriter fw=new FileWriter(fileName,true);   //Tension: true permit you can write the end of file 
        //get data and write it to the file
        for(int i=1;i<=numFriends;i++){
            //get the name of a friend
            System.out.print("Enter the name of friend "+"number "+i+": ");
            friendName=keyboard.nextLine();
            //Write the name to file.
            //outputFile.println(friendName);
            fw.write(friendName);
            //fw.append(friendName);
        }
        //close the file.
        //outputFile.close();
        fw.close();
        System.out.println("Data written to the file.");
    }
}