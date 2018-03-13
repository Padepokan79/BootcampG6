import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int start, end; //nama variabel boleh beda dengan variabel pada class tetapi tipe data tetap sama
		double gal;
		boolean gasHog, economyCar;
		
		System.out.print("New odometer reading: " ); 
	    start = input.nextInt();
	    Car mob = new Car(start); 
	    
	    for (int i = 0; i<=1; i++) {
		    System.out.print("Odometer reading: " ); 
		    end = input.nextInt();
	
		    System.out.print("Gallons to fill tank: " ); 
		    gal  = input.nextDouble();
		    
		    mob.fillUp(end, gal);
		
		    System.out.println( "Miles per gallon: "  + mob.calculateMPG() );
			// TODO Auto-generated method stub
		    
		    if(mob.calculateMPG() < 15.0) {
		    	gasHog = true;
		    	System.out.println("Gas Hog!");
		    	System.out.println();
		    }
		    else if (mob.calculateMPG() > 30.0) {
		    	economyCar = true;
		    	System.out.println("Economy Car!");
		    	System.out.println();
		    }
	
		    mob.temp();
	    }
	}	
}
