package garageChallenge;

import java.util.ArrayList;


public class Garage {
	
	private ArrayList<Vehicle> garage = new ArrayList<>();
	
	public void addVehicle(Vehicle vehicle) { 
		garage.add(vehicle); 
	} 
	
	public void printGarage() { 
		for (int i = 0; i < garage.size(); i++) {
			Vehicle current = garage.get(i);
			current.print();
		}
	}	
}
	// method to bill (if (vehicle is instance of Car))

