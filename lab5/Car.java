
public class Car {
	private int yearModel;
	private String make;
	private int speed;
	public Car(int yearModel,String make) {
		this.yearModel = yearModel;
		this.make = make;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public int getYearModel() {
		return yearModel;
	}
	public int getSpeed() {
		return speed;
	}
	public void accelerate() {
		this.speed += 5;
	}
	public void brake() {
		this.speed -= 5;
	}
}
