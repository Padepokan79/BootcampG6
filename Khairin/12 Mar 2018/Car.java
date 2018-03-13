
public class Car { // a class that calculate milis per gallon
	double startMiles;
	double endMiles;
	double gallon;
	
	Car (int start){
		startMiles = start;
	}
	
	void fillUp( int miles, double gallons ) {
		endMiles = miles;
		this.gallon = gallons;		
	}
	
	double calculateMPG() {
	return (endMiles-startMiles)/gallon;
	}
	
	void temp() {
		startMiles = endMiles;
	}
	

}
