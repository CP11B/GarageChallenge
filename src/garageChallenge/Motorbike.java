package garageChallenge;

public class Motorbike extends Vehicle {
	
	private String usage;
	
	public Motorbike(int id, int age, String colour, String usage) {
		super(id, age, colour);
	}
	
	public String getUsage() {
		return usage;
	}
	
	public void setUsage(String usage) {
		this.usage = usage;
	}
}
