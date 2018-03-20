package exercise35;

import java.util.Scanner;

public class PantryTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Jam goose = new Jam("Gooseberry", "7/4/86", 12);
		Jam apple = new Jam("Crab Apple", "9/30/99", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/99", 3);
	
		Pantry hubbard = new Pantry(goose, apple, rhub);
		
		int menu, amount;
		
		System.out.println("Welcome to Mother Hubbard's Pantry!");
		
		do {
			hubbard.print();
			System.out.println("\nEnter your selection (1, 2, 3 or -1 for exit): ");
			menu = scan.nextInt();
			
			if(menu == 1 || menu == 2 || menu == 3) {
				System.out.println("Enter amount to spread: ");
				amount = scan.nextInt();
				
				hubbard.select(menu);
				hubbard.spread(amount);
			}
			else if(menu == -1) {
				System.out.println("Good Bye!");
			}
			else {
				System.out.println("Inputan anda salah!");
			}
			
			
			
		}while(menu != -1);	
		
	}
}
