
public class CarDemo {
	public static void main(String[] args) {
		Car sportsCar = new Car(2004,"Prosche");
		sportsCar.setSpeed(0);
		System.out.printf("Current status of the car: ");
		System.out.println("\nYear model: "+sportsCar.getYearModel());
		System.out.println("Make: "+sportsCar.getMake());
		System.out.println("Speed: "+sportsCar.getSpeed());
		System.out.println("\nAcceleratint...");
		for(int i=1;i<6;i++) {
			sportsCar.accelerate();
		}
		System.out.println("Now the speed is: "+sportsCar.getSpeed());
		System.out.println("\nBraking...");
		for(int i=1;i<6;i++) {
			sportsCar.brake();
		}
		System.out.println("Now the speed is: "+sportsCar.getSpeed());
		
	}
}