import java.util.Scanner;
import java.util.Random;

public class GuessingGameDoWhileRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int jawaban, guess, chance, ronde = 1, rondeMenang = 0;
		boolean benar;

		do {
			chance = 1;
			benar = false;
			
			// random
			jawaban = rand.nextInt(10)+1;
			System.out.println( "\n===========================================" );
			System.out.println( "\nHint: " + jawaban );
			System.out.println( "\nRonde: " + ronde );
			System.out.println( "\nI am thinking of a number from 1 to 10." );
			System.out.println( "\nYou must guess what it is in three tries." );

			// while untuk chance
			do {
				System.out.print( "\nEnter a guess: " );
				guess = keyboard.nextInt();

				// if jawaban
				if ( (jawaban-guess) == 1 || (jawaban-guess) == -1) {
					System.out.println( "\nHOT" );
				}
				else if ( (jawaban-guess) == 2 || (jawaban-guess) == -2) {
					System.out.println( "\nWARM" );
				}
				else if ( (jawaban-guess) >= 3 || (jawaban-guess) <= -3) {
					System.out.println( "\nCOLD" );
				}
				else if ( jawaban == guess ) {
					benar = true;	
					rondeMenang ++;
					System.out.println("\nRIGHT!");
					System.out.println("\nYou have won " + rondeMenang + " out of " + ronde + ".");
				}

				chance ++;
			} while ( benar == false && chance <= 3 );
		
			if ( benar == false ) {
				System.out.println( "\nThe correct number was: " + jawaban );
				System.out.println( "\nYou have won " + rondeMenang + " out of " + ronde + " rounds" );
			}
			
			ronde ++;
		} while ( ronde <= 10 );

		System.out.println( "\n===========================================" );

		// if untuk rating
		if ( rondeMenang >= 0 && rondeMenang <= 7 ) {
			System.out.println( "\nYour rating: amateur" );
		}
		else if ( rondeMenang == 8 ) {
			System.out.println( "\nYour rating: advance" );
		}
		else if ( rondeMenang == 9 ) {
			System.out.println( "\nYour rating: professionals" );
		}
		else if ( rondeMenang == 10 ) {
			System.out.println( "\nYour rating: hackers" );
		}
		
	}
}