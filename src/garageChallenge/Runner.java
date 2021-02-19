package garageChallenge;

public class Runner {

	public static void main(String[] args) {
		
		Car car1 = new Car(1, 2006, "red", "hatchback");	
		Motorbike bike1 = new Motorbike(2, 2020, "black", "sport");
		Lorry lorry1 = new Lorry(3, 2013, "white", "building materials");
		Lorry lorry2 = new Lorry(4, 20017, "brown", "steel pipes");
		
		Garage garage = new Garage();
		
    	garage.addVehicle(car1);
    	garage.addVehicle(bike1);
    	garage.addVehicle(lorry1);
    	garage.addVehicle(lorry2);	
    	
    	garage.printGarage();
    	
    	//Manager.billVehichle();
    	//Manager.removeVehicle();
    	
	}		
}

//Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). 
//Each derived class should have its own attributes in addition to the normal Vehicle attributes.
//Using a List<> implementation, store all your Vehicles in a Garage class.
//Create a method in Garage that iterates through each Vehicle, 
//calculating a bill for each type of Vehicle in a different way, 
//depending on the type of Vehicle it is (this does not need to be complex).
//Garage should have methods that add a Vehicle, remove a Vehicle by its ID or its type, 
//fix a Vehicle (which calculates the bill) and to empty the Garage.
//Garage should have a method to remove multiple Vehicles by their type.