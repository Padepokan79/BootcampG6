package exercise35;

public class PantryTester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jam goose = new Jam("Gooseberry", "7/4/86", 12);
		Jam apple = new Jam("Crab Apple", "9/30/99", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/99", 3);
		
		Pantry hubbard = new Pantry(goose, apple);
		hubbard.print();
		
		if(hubbard.select2(3)) {
			hubbard.spread(2);
		}
		else {
			System.out.println("Selection not available");
		}
		
		hubbard.print();
		
		hubbard.replace( rhub, 3 );
	    hubbard.print();

	    if ( hubbard.select2(3) )
	      hubbard.spread(2);
	    else
	      System.out.println("Selection not available");
	    hubbard.print();
	}

}
