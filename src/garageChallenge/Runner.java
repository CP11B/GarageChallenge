package garageChallenge;

public class Runner {

	public static void main(String[] args) {

		Car car1 = new Car(1, 2006, "red", "hatchback");	
		Motorbike bike1 = new Motorbike(2, 2020, "black", "sport");
		Lorry lorry1 = new Lorry(3, 2013, "white", "building materials");
		Lorry lorry2 = new Lorry(4, 20017, "brown", "steel pipes");
				
		Manager manager = new Manager();
    	Manager.addVehicle(1);
    	Manager.addVehicle(2);
    	Manager.addVehicle(3);
    	Manager.addVehicle(4);	
    	
    	Manager.printGarage();
    	
    	//Manager.billVehichle();
    	//Manager.removeVehicle();
    	
	}		
}
