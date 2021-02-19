package garageChallenge;

public class Lorry extends Vehicle {

	private String cargo;
	
	public Lorry(int id, int age, String colour, String cargo) {
		super(id, age, colour);
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
