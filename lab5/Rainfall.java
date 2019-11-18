import java.math.BigDecimal;

public class Rainfall {
	private double[] rain;
	public Rainfall(double r[]){
		// Create a new array.
		rain = new double[r.length];
		
		// Copy the argument's elements to the
		// new array.
		for (int i = 0; i < r.length; i++)
			rain[i] = r[i];
	}
	public int getLowestMonth() {
		double lowest = rain[0];
		int lowestMonth=0;
		int i=0;
		for(i=0;i<12;i++) {
			if(lowest>rain[i]) {
				lowest = rain[i];
				lowestMonth=i;
			}
		}
		return lowestMonth;
	}
	public int getHighestMonth() {
		double highest = rain[0];
		int highestMonth=0;
		int i=0;
		for(i=0;i<12;i++) {
			if(highest<rain[i]) {
				highest = rain[i];
				highestMonth=i;
			}
		}
		return highestMonth;
	}
	public double getTotalRainFall() {
		double sum=0.0;
		for(double x: rain) {
			sum+=x;
		}
		return sum;
	}
	public double getAverageRainFall() {
		//return getTotalRainFall()/12.0;
		return (new BigDecimal(getTotalRainFall()/12.0)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	public double getRainAt(int e) {
		return rain[e];
	}
}
