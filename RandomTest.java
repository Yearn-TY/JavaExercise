
import java.util.Random;
public class RandomTest{
	
	public static void main(String[] args){
		//------------------------First---------------------
		// This is a static sequence,  and not change. Can't attend the random.
		/*Random rand = new Random(1);
		for(int i=0;i<10;i++){
			System.out.println(i+": "+ rand.nextInt(6));
		}*/
		//--------------------------------------------------
		
		//-----------------------Second---------------------
		//This can change.
		/*for(int j=0;j<10;j++){
			System.out.println(j+": "+(int)(Math.random()*100%7));
		}*/
		
		//--------------------------------------------------
		
		//-----------------------Third----------------------
		//This can get system current time. 
		//For each running, random is static.
		/*for(int k=0;k<10;k++){
			long randomNum = System.currentTimeMillis();
			System.out.println(k+": "+(int)(randomNum%7));
		}*/
		//--------------------------------------------------
	}
}