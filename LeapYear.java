import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Please input a year: ");
        long year=scan.nextLong();
        String x;
        System.out.println(year+" year"+((year%4==0&&year%100!=0 || year%400==0)? " is":" is not") +" leapyear");
        
    }
}