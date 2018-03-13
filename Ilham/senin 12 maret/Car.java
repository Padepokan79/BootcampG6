
public class Car {
	double firstMiles;
	double miles;
	double gallons;
	
	Car(double firstMiles) {
		this.firstMiles = firstMiles;
	}
	
	void fillUp(int miles, double gallons) {
		this.miles = miles;
		this.gallons = gallons;
	}
	
	double calculateMPG() {
		return (miles - firstMiles) / gallons;
	}
	
	boolean gasHog() {
		if (calculateMPG() < 15.0) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean economyCar() {
		if (calculateMPG() > 30.0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	void resetFirstMiles() {
		firstMiles = miles;
	}
	
}
