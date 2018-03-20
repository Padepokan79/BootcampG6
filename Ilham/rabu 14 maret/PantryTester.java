import java.util.Scanner;

public class PantryTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Jam goose = new Jam("Gooseberry", "7/4/86", 12);
		Jam apple = new Jam("Crab Apple", "9/30/99", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/99", 16);
		
		Pantry hubbard = new Pantry(goose, apple, rhub);

		int select, spread;		
		
		do {
			System.out.println();
			System.out.println("The jams are: ");
			hubbard.print();
			System.out.println("Enter your selection (1, 2, or 3): ");
			select = input.nextInt();
			if(select != -1) {
				System.out.println("Enter amount to spread: ");
				spread = input.nextInt();
				
				hubbard.select(select);
				hubbard.spread(spread);
			}
		} while(select != -1);
		System.out.println("Good-by");
	}

}
