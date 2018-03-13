
public class Car {
	double startMiles, endMiles, gallons;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	Car(double first){
		startMiles = first;
	}
	
	void fillUp(double miles, double gallons) {
		endMiles= miles;
		this.gallons=gallons;
	}
	
	double calculateMPG() {
		return (endMiles - startMiles)/gallons;
	}
	
	boolean gasHog() {
		boolean isTrue=false;
		
		if(calculateMPG() < 15.0) {
			isTrue=true;
		}
		
		return isTrue;
	}
	
	boolean economyCar() {
		boolean isTrue=false;
		
		if(calculateMPG() > 30.0) {
			isTrue=true;
		}
		
		return isTrue;
	}
	
	void displayTheResult() {
		if(gasHog()) {
			System.out.println("Gas Hog!");
		}
		else if(economyCar()) {
			System.out.println("Economy car!");
		}
	}
}
