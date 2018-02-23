import java.util.Scanner;
import java.util.Random;

public class GameGuessingEvolution2DoWhileYudhis {
	public static void main(String[] args) {
		// Inisialisasi object Random dan Scanner
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		// Inisialisasi variable
		int jawaban, tebakan, i, ronde = 1, win = 0;
		boolean kebenaran;

		// Perulangan ronde
		do {
			jawaban = rand.nextInt(10)+1;
			i = 1;
			kebenaran = false;

			System.out.println("\nRound " + ronde + ": ");
			System.out.println("I am thinking of a number from 1 to 10.");
			System.out.println("You must guess what it is in three tries.");
			System.out.println("Correct : " + jawaban);
			System.out.println("Enter a guess : "); 
			
			do {
				tebakan = input.nextInt();

				if (tebakan - jawaban >= 3 || tebakan - jawaban <= -3) {
					System.out.println("cold");
				} else if (tebakan - jawaban == 2 || tebakan - jawaban == -2) {
					System.out.println("warm");
				} else if (tebakan - jawaban == 1 || tebakan - jawaban == -1) {
					System.out.println("hot");
				} else if (tebakan == jawaban) {
					kebenaran = true;
					win = win + 1;

					System.out.println("RIGHT!");
					System.out.println("You have won " + win + " out of " + ronde + ".");
				} 

				i++;
			} while (kebenaran == false && i <= 3);

			if (kebenaran == false) {
				System.out.println("The correct number was " + jawaban + ".");
				System.out.println("You have won " + win + " out of " + ronde + ".");
			}

			ronde++;
		} while (ronde <= 10);	

		// Cek jumlah win
		switch (win) { 
			case 8: System.out.println("\nYour rating: advanced.");
					break;
			case 9: System.out.println("\nYour rating: professionals.");
					break;
			case 10: System.out.println("\nYour rating: hacker.");
					 break;
			default: System.out.println("\nYour rating: amateur.");
					break;
		}

	}	
}