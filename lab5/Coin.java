import java.util.Random;

public class Coin {
	private String sideUp;
	
	public Coin() {
		//Call the toss method to set the 
		//initial state of sideUp.
		toss();
	}
	/**
    The toss method simulates the tossing of
    the coin. After the method executes, the
    sideUp field will be randomly set to either
    "heads" or "tails".
 */
	public void toss() {
		Random rand = new Random();
		// Get a random value, 0 or 1.
		int value = rand.nextInt(2);
		// Set the value of sideUp.
	    // 0 = "heads" or 1 = "tails"
		if (value == 0)
	       sideUp = "heads";
	    else
	       sideUp = "tails";
		
	}
	public String getSideUp() {
		return sideUp;
	}
}
