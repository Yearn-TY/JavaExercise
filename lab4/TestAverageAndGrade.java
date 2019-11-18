 
import java.util.Scanner;
public class TestAverageAndGrade {
    public enum number {first,second,third,fourth,fifth};
    private Scanner keyboard = new Scanner(System.in);
    private double[] score = new double[5];
    public static void main(String[] args){
        TestAverageAndGrade test = new TestAverageAndGrade();
        test.readScore();
        System.out.println("Here are the grades and the average:");
        for(int i=0;i<5;i++){
            System.out.printf("Test %d: %c\n",(i+1),test.judgeGrade(test.getScore(i)));
        }
        System.out.println("Average score: "+test.getAverage());
        System.out.println("Average Letter Grade: "+test.judgeGrade(test.getAverage()));
    }
    public void readScore(){
        for(int i=0;i<5;i++){
            System.out.print("Enter the "+number.values()[i]+" test score: ");
            score[i] = keyboard.nextDouble();
        }
    }
    public double getScore(int index){
        return score[index];
    }
    public char judgeGrade(double scores){
        if(scores >= 90.0) return 'A';
        else if (scores >= 80) return 'B';
        else if(scores >= 70) return 'C';
        else if(scores >= 60) return 'D';
        else return 'F';
    }
    public double getAverage(){
        double sum = 0.0;
        for(int i=0;i<5;i++){
            sum+=score[i];
        }
        return sum/5;
    }
}
