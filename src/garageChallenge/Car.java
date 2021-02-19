package garageChallenge;

public class Car extends Vehicle {
	
	private String type;
	
	public Car(int id, int age, String colour, String type) {
		super(id, age, colour);
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
