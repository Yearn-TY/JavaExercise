
public class TestScores {
	private double score1,score2,score3;
	public TestScores(double s1, double s2, double s3){
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}
	public void setScore1(double score) {
		score1 = score;
	}
	public void setScore2(double score) {
		score2 = score;
	}
	public void setScore3(double score) {
		score3 = score;
	}
	public double getScore1() {
		return score1;
	}
	public double getScore2() {
		return score2;
	}
	public double getScore3() {
		return score3;
	}
	public double getAverageScore() {
		return (score1+score2+score3)/3.0;
	}
	
}
