//import java.util.Scanner;
//
//public class MilesPerGallon {
//
//	private static Scanner keyboard;
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		keyboard = new Scanner(System.in);
//		
//		double startMiles, endMiles, gallons;
//		
//		System.out.print("Enter First Reading: ");
//		startMiles = keyboard.nextDouble();
//		System.out.print("Enter Second Reading: ");
//		endMiles = keyboard.nextDouble();
//		System.out.print("Enter Gallons: ");
//		gallons = keyboard.nextDouble();
//		
//		Car car = new Car(startMiles, endMiles, gallons);
//		
//		System.out.println("\nMiles per Gallon is " + car.calculateMPG());
//		
//		if(car.gasHog() == true) {
//			System.out.println("Gas Hog!");
//		}
//		else {
//			if(car.economyCar() == true) {
//				System.out.println("Economy Car!");
//			}
//		}
//
//	}
//
//}

import java.util.Scanner;

public class MilesPerGallon {

	private static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		keyboard = new Scanner(System.in);
		
		double startMiles = 0, endMiles, gallons;
		
		System.out.println("\nNew car odometer reading:\n" + startMiles);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Filling Station Visit");
			System.out.print("Odometer Reading: ");
			endMiles = keyboard.nextDouble();
			System.out.print("gallons to fill tank: ");
			gallons = keyboard.nextDouble();
			
			Car car = new Car(startMiles);
			car.fillUp(endMiles, gallons);
			
			System.out.println("\nMiles per Gallon is " + car.calculateMPG());
			
			if(car.gasHog() == true) {
				System.out.println("Gas Hog!");
			}
			else {
				if(car.economyCar() == true) {
					System.out.println("Economy Car!");
				}
			}
			startMiles = endMiles;
			System.out.println();
		}
	}
}
