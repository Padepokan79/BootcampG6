package progExercises35;
import java.util.Scanner;

public class Exercise1 {

	private static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		keyboard = new Scanner(System.in);
		
		Jam goose = new Jam("Gooseberry", "7/4/86", 12);
		Jam apple = new Jam("Crab Apple", "9/30/99", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/99", 16);
		
		System.out.println("Welcome to Mother Hubbard's Pantry!");
		
		int pilih = 0;
		int amt = 0;
		
		while (pilih != -1) {
			System.out.println();
			System.out.println("The jams are:");
			Pantry hubbard = new Pantry(goose, apple, rhub);
			hubbard.print();
			
			System.out.println("Enter your selection (1, 2, or 3): ");
			pilih = keyboard.nextInt();
			switch(pilih) {
			case -1:
				System.out.println("Good-by");
				break;
			case 1:
				System.out.println("Enter amount to spread: ");
				amt = keyboard.nextInt();
				goose.spread(amt);
				break;
			case 2:
				System.out.println("Enter amount to spread: ");
				amt = keyboard.nextInt();
				apple.spread(amt);
				break;
			case 3:
				System.out.println("Enter amount to spread: ");
				amt = keyboard.nextInt();
				rhub.spread(amt);
				break;
			default:
				System.out.println("Please enter 1, 2, or 3!");
			}
		}
	}

}
