import java.util.Scanner;
import java.util.Random;

public class GuessingGameYudhis {
	public static void main(String[] args) {
		// Inisialisasi object Random dan Scanner
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		// Inisialisasi variable
		int jawaban = rand.nextInt(10)+1, tebakan;
		boolean kebenaran = false;

		System.out.println("I am thinking of a number from 1 to 10.");
		System.out.println("You must guess what it is in three tries.");
		System.out.println("Correct : " + jawaban);
		System.out.println("Enter a guess : ");

		for (int i = 1; i <= 3; i++ ) {
			tebakan = input.nextInt();

			if (tebakan == jawaban) {
				kebenaran = true;

				System.out.println("RIGHT!");
				System.out.println("You have won the game");

				break;
			} else {
				System.out.println("wrong");
			}		
		}

		if (kebenaran == false) {
			System.out.println("The correct number was " + jawaban + ".");
			System.out.println("You have lost the game.");	
		}	
	}	
}