import java.util.Scanner;
import java.util.Random;

public class GuessingGameRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int jawaban, ronde = 1, rondeMenang = 0;

		while ( ronde <= 10 ) {
			
			// random
			jawaban = rand.nextInt(10)+1;
			System.out.println( "\n===========================================" );
			System.out.println( "\nThe correct number was: " + jawaban );
			System.out.println( "\nRonde " + ronde );
			System.out.println( "\nI am thinking of a number from 1 to 10." );
			System.out.println( "\nYou must guess what it is in three tries." );

			int guess = 0, chance = 1;

			// while untuk chance
			while ( jawaban != guess && chance <= 3 ) {
				System.out.print( "\nEnter a guess: " );
				guess = keyboard.nextInt();

				// if jawaban salah
				if ( (jawaban-guess) == 1 || (jawaban-guess) == -1) {
					System.out.println( "HOT" );
				}
				else if ( (jawaban-guess) == 2 || (jawaban-guess) == -2) {
					System.out.println( "WARM" );
				}
				else if ( (jawaban-guess) >= 3 || (jawaban-guess) <= -3) {
					System.out.println( "COLD" );
				}
			chance ++;
			}

			// if jawaban benar
			if ( jawaban == guess) {
				rondeMenang ++;
			}
		
		System.out.println( "\nYou have won " + rondeMenang + " out of " + ronde + " rounds" );
		ronde ++;
		}

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