package main;

import java.util.Scanner;

public class Car {
	
	double startMiles;
	double endMiles;
	double gallons;
	
	public Car(double firstOdometer) {
		// TODO Auto-generated constructor stub
		startMiles = firstOdometer;
	}
	
	void fillUp() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nFilling Station Visit");
		
		System.out.println("odometer reading" ); 
	    endMiles = scan.nextDouble();
	    
	    System.out.println("gallons to fill tank" ); 
	    gallons = scan.nextDouble();
	    
	    System.out.println("Miles per gallon: " + calculateMPG());
	    
	    startMiles = endMiles;
	}
	
	double calculateMPG() {
		return (endMiles - startMiles) / gallons;
	}
	
	boolean gasHog() {
		if (calculateMPG() < 15.0) {
			System.out.println("Gas Hog!");
			return true;
		} else {
			return false;
		}
	}
	
	boolean economyCar() {
		if (calculateMPG() > 30.0) {
			System.out.println("Economy Car!");
			return true;
		} else {
			return false;
		}
	}
	
}
