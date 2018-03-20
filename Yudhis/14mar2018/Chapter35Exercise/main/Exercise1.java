package main;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inChars;
		
		// TODO Auto-generated method stub
		System.out.println("Welcome to Mother Hubbard's Pantry!");
		System.out.println("\nThe jams are: ");
		
		Jam goose = new Jam("Gooseberry", "7/4/86", 12);
	    Jam apple = new Jam("Crab Apple", "9/30/99", 8);
	    Jam rhub  = new Jam("Rhubarb", "10/31/99", 3);

	    Pantry hubbard = new Pantry(goose, apple, rhub);
	    hubbard.print();
	    
	    do {
	    	System.out.println("Enter your selection (1, 2, 3):");
	    	inChars = input.next();
	    	
	    	if (Integer.valueOf(inChars) >= -1 && Integer.valueOf(inChars) <= 3) {
	    		if (Integer.valueOf(inChars) == -1) {
		    		System.out.print("Good-by");
		    	} else {
			    	hubbard.select(Integer.valueOf(inChars));
			    	
			    	System.out.println("Enter amount to spread: ");
			    	hubbard.spread(input.nextInt());
			    	System.out.println("\nThe jams are: ");
			    	hubbard.print();
		    	}
			} else {
				System.out.println("Selection is out of range. Please try again.");
			}
	    } while(Integer.valueOf(inChars) != -1);
	}

}
