import java.util.Scanner ;

class MilesPerGallon
{
  public static void main( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);

    double startMiles, endMiles, gallons;

    System.out.println("New car odometer reading: " ); 
    startMiles = scan.nextDouble();
    
    for (int i=1 ; i<=2; i++) {
    	System.out.println("Filling Station Visit \nodometer reading" ); 
        endMiles = scan.nextDouble();

        System.out.println("Gallon to fill tank " ); 
        gallons = scan.nextDouble();

        //construc
        Cars car = new Cars( startMiles );
        //method
        car.fillUp(endMiles, gallons);
        System.out.println( "Miles per gallon : " + car.calculateMPG() );
        
        if (car.gasHog() == true) {
        	System.out.println ("Gas Hog");
        }
        
        if (car.economyCar()== true) {
        	System.out.println("Economy Car !");
        }
       startMiles = endMiles; 
    }
  }
}