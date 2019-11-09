import java.util.Scanner;

public class TestScoresGrade{
	float []score = new float[3];
	Scanner keyload=new Scanner(System.in);
	public static void main(String[] args){
		TestScoresGrade ts = new TestScoresGrade();
		ts.readScore();
		float average = ts.getAverage();
		System.out.println("Average score: "+average);
		System.out.println("Letter grade: "+ts.letterGrade(average));
	}
	public void readScore(){
		for(int i=0;i<3;i++){
			System.out.printf("Enter test score #%d:",i+1);
			this.score[i] = keyload.nextFloat();
		}
	}
	public float getAverage(){
		return (score[0]+score[1]+score[2])/3;
	}
	public String letterGrade(float score){
		if(score>=90&&score<=100) return "A";
		else if (score>=80)       return "B";
		else if (score>=70)       return "C";
		else if (score>=60)       return "D";
		else                      return "F";
	}
	
}