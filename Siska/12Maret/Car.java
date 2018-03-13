class Car {
	double startMiles;
	double endMiles;
	double gallon;
	
	Car (double first, double last, double gals){
		startMiles = first;
		endMiles = last;
		gallon = gals;
	}
	
	double calculateMPG() 
	{
		return (endMiles - startMiles)/gallon;
	}
	
	boolean gasHog() {
		if (calculateMPG() < 15.0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean economyCar() {
		if (calculateMPG() > 30.0) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	
}
