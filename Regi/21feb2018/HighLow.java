import java.util.Scanner;

public class HighLow {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;

		secret = 1 + (int)( 100*Math.random() );

		System.out.println( "\nI'm thinking of a number between 1-100." );
		System.out.println( "\nThe secret number is " + secret );
		System.out.println( "\nTry to guess it!" );
		System.out.print( "> " );
		guess = keyboard.nextInt();

		while ( secret != guess ) {
			if ( guess < secret ) {
				System.out.println( "\nSorry your guess is to low." );
				System.out.print( "\nTry again.\n> " );
				guess = keyboard.nextInt();
			}
			if ( guess > secret ) {
				System.out.println( "\nSorry your guess is to high." );
				System.out.println( "\nTry again.\n> " );
				guess = keyboard.nextInt();
			}
		}

		System.out.println( "\nYou guessed it! What are the odds?!?" );
	}
}