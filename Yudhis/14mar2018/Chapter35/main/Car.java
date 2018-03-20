package main;

public class Car {
	// data
	private int startMiles; // Starting odometer reading
	private int endMiles; // Ending odometer reading
	private double gallons; // Gallons of gas used between the readings
	
	// constructor
	public Car(int first, int last, double gas) {
		// TODO Auto-generated constructor stub
		startMiles = first;
		endMiles = last;
		gallons = gas;
	}
	
	// methods
	double calculateMPG() {
		return (endMiles - startMiles) / gallons;
	}
	
	void fillUp(int newOdo, double fillUpGals) {
		startMiles = endMiles;
		endMiles = newOdo;
		gallons = fillUpGals;
	}
}
