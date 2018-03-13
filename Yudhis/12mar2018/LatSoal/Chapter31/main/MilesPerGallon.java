package main;

import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double startMiles;
		
		System.out.println("New car odometer reading: " ); 
	    startMiles = scan.nextDouble();
	    
	    Car car = new Car(startMiles);
	    
	    car.fillUp();
	    car.gasHog();
	    car.economyCar();
	    
	    car.fillUp();
	    car.gasHog();
	    car.economyCar();
	}

}
