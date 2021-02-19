package garageChallenge;

public class Vehicle {
	
	private int id;
	private int age;
	private String colour;

    public Vehicle() {
    	super();
    }
    
    public Vehicle(int id, int age, String colour) {
    	this.id = id;
    	this.age = age;
    	this.colour = colour;
    }
    
    public int getId() {
    	return id;
    }
    
    public void setID(int id) {
    	this.id = id;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public String getColour() {
    	return colour;
    }
    
    public void setColour(String colour) {
    	this.colour = colour;
    }
	
    public void print() {
		String format = "ID: " + this.id + ", Year: " + this.age + ", Colour: " + this.colour;
		System.out.println(format);
	}   	
}
