public class StarPattern{
	public static void main(String []args){
		StarPattern sp=new StarPattern();
		sp.drawsRhombus(9);
	}
	public void drawsRhombus(int m){
		int i=1,j,k; 
		int n;      //divide the Rhombus into two parts
		if(m%2!=0) n=(m+1)/2;
		else n=m/2;
		for (i=1;i<=n;i++){  //the first part
			for(j=1;j<=n-i;j++){
				System.out.print(" ");   //space of each lines
			}
			for(k=1;k<=2*i-1;k++){
				System.out.print("*");   //star of each lines
			}
			System.out.println();
		}
		for (i=m-n;i>=1;i--){  //the second part
			for(j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}