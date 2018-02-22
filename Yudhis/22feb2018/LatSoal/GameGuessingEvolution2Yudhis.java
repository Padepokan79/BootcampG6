import java.util.Scanner;
import java.util.Random;

public class GameGuessingEvolution2Yudhis {
	public static void main(String[] args) {
		// Inisialisasi object Random dan Scanner
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		// Inisialisasi variable
		int jawaban, tebakan, i, ronde = 1, win = 0;
		boolean kebenaran;

		// Perulangan ronde
		while (ronde <= 10) {
		
			jawaban = rand.nextInt(10)+1;
			i = 1;
			kebenaran = false;

			System.out.println("\nRound " + ronde + ": ");
			System.out.println("I am thinking of a number from 1 to 10.");
			System.out.println("You must guess what it is in three tries.");
			System.out.println("Correct : " + jawaban);
			System.out.println("Enter a guess : "); 
			
			// Perulangan cek jawaban
			while (i <= 3 && kebenaran == false) {
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
			}

			if (kebenaran == false) {
				System.out.println("The correct number was " + jawaban + ".");
				System.out.println("You have won " + win + " out of " + ronde + ".");
			}

			ronde++;

		}	

		// Cek jumlah win
		if (win <= 7) {
			System.out.println("\nYour rating: amateur.");
		} else if (win == 8) {
			System.out.println("\nYour rating: advanced.");
		} else if (win == 9) {
			System.out.println("\nYour rating: professionals.");
		} else {
			System.out.println("\nYour rating: hacker.");
		}

	}	
}