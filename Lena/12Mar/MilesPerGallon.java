import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double startMiles=0, gallons, endMiles;
		
		System.out.print("New car odometer: "+(int)startMiles);
		
		for(int i=0 ; i<2 ;i++) {
			System.out.print("\n\nFilling Station Visit\nOdometer reading: ");
			endMiles = scan.nextDouble();
			System.out.print("Gallons to fill tank: ");
			gallons = scan.nextDouble();
			
			Car car=new Car(startMiles);
			
			car.fillUp(endMiles, gallons);
			
			System.out.println("\nMilles per gallon is "+(int)car.calculateMPG());
			car.displayTheResult();
			
			startMiles = endMiles;
		}
	}

}
