import java.util.Scanner;

public class MilesPerGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

	    double firstMiles, gallons;
	    int miles;

	    System.out.println("New car odometer reading: " ); 
	    firstMiles = scan.nextDouble();

	    Car car = new Car(firstMiles);

	    for (int i = 1; i <= 2; i++) {	   
		    System.out.println("Filling Station Visit" );
		    System.out.println("Odometer Reading: " ); 
		    miles = scan.nextInt();
	
		    System.out.println("Gallons to fill tank: " ); 
		    gallons  = scan.nextDouble();
		    
		    car.fillUp(miles, gallons);
		    
		    System.out.println( "Miles per gallon is "  + car.calculateMPG() );
		    if (car.gasHog()) {
		    	System.out.println("Gas Hog!");
		    } else if (car.economyCar()) {
		    	System.out.println("Economy Car!");
		    } else {
		    	System.out.println("Standart!");
		    }
		    
		    car.resetFirstMiles();
	    }
	}

}
