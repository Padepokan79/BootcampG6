import java.util.Scanner;

public class PantryTester {
	  public static void main ( String[] args ) {
	    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
	    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
	    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );
	    Scanner nilai = new Scanner(System.in);
	    int pilih ;
	    
	    Pantry hubbard = new Pantry( goose, apple, rhub );
	    do {
	    hubbard.print();
	    System.out.println("Enter your selection(1,2 or 3) : ");
	    pilih = nilai.nextInt();
	    hubbard.select(pilih);
	    System.out.println("Enter amount to spread :");
	    hubbard.spread(nilai.nextInt());
	    System.err.println("");
	    }while(pilih !=0);
	  }
	}