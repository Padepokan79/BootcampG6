package main;

public class PantryTester3 {
	public static void main(String[] args) {
		Jam goose = new Jam("Gooseberry", "7/4/86", 12);
	    Jam apple = new Jam("Crab Apple", "9/30/99", 8);
	    Jam rhub  = new Jam("Rhubarb", "10/31/99", 16);

	    Pantry hubbard = new Pantry(goose, apple);
	    hubbard.print();

	    if (hubbard.select(3))
	      hubbard.spread(2);
	    else
	      System.out.println("Selection not available");
	    hubbard.print();

	    hubbard.replace(rhub, 3);
	    hubbard.print();

	    if ( hubbard.select(3) )
	      hubbard.spread(2);
	    else
	      System.out.println("Selection not available");
	    hubbard.print();
	}
}
