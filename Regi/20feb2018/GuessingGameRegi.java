import java.util.Scanner;
import java.util.Random;

public class GuessingGameRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		boolean hasil = false;
		int i, jawaban, guess;

		// random
		jawaban = rand.nextInt(10)+1;
		System.out.println( "\nThe correct number was: " + jawaban );

		//for
		for ( i = 1 ; i <= 3 ; i++) {
			System.out.print( "\nEnter a guess: " );
			guess = keyboard.nextInt();

			if ( jawaban == guess ) {
				hasil = true;
				System.out.println( "\nRIGHT! You have won the game" );
				break;
			}
			else {
				System.out.println( "WRONG" );
			}
		}

		// jawaban salah
		if ( hasil == false ) {
		System.out.println( "\nThe correct number was: " + jawaban + " You have lost the game" );
		}
	}
}