//
//public class Car {
//	double startMiles, endMiles, gallons;
//	
//	public Car() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	Car(double first, double last, double gals) {
//		startMiles = first;
//		endMiles = last;
//		gallons = gals;
//	}
//	
//	double calculateMPG() {
//		return(endMiles - startMiles)/gallons;
//	}
//	
//	boolean gasHog() {
//		return calculateMPG() <= 15.0;
//	}
//	
//	boolean economyCar() {
//		return calculateMPG() >= 30.0;
//
//	}
//
//}

public class Car {
	double startMiles, endMiles, gallons;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	Car(double first) {
		startMiles = first;
	}
	
	void fillUp( double miles, double gallons ) {
		endMiles = miles;
		this.gallons = gallons;
	}
	
	double calculateMPG() {
		return(endMiles - startMiles)/gallons;
	}
	
	boolean gasHog() {
		return calculateMPG() <= 15.0;
	}
	
	boolean economyCar() {
		return calculateMPG() >= 30.0;

	}
	
}