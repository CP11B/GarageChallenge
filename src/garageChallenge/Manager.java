package garageChallenge;

import java.util.ArrayList;

import objects.Person;


public class Manager {

	
	private static ArrayList<Vehicle> garageList = new ArrayList<>();
	
	public void addVehicle(int id) {
		this.garageList.add(id);
	}
	
	public static void removeVehicleById(int id) {
		this.garageList.remove(id);
		System.out.println("..... has been removed.");
	}
	
	public static void printGarage() {garageListvehicles) {
			System.out.println(vehicle + " has been removed.");
		}
	}
	
	// method to iterate to tell me what is in garage (list)
	
	// method to bill (if (vehicle is instance of Car))
}
