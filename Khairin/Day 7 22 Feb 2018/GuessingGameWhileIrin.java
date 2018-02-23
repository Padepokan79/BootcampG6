import java.util.Scanner;

// NUMBER GUESSING GAME

public class GuessingGameWhileIrin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int secret, guess, kesempatan, round = 1, won = 0;

		while( round <= 10 ){ 

		secret = 1 + (int)( 10*Math.random() );
		kesempatan = 1;

		System.out.println( "\nROUND " + round );
		System.out.println( "I'm thinking of a number between 1-10." );
		System.out.println("You must guess what it is in three tries." + secret );
		System.out.println("Enter a guess:");
		guess = keyboard.nextInt();

		while ( secret != guess && kesempatan <= 2 ) { 
			if ( guess+3 == secret || guess-3 == secret ) {
				System.out.print( "COLD\n");	 
			}
			if ( guess+2 == secret || guess-2 == secret ) {
				System.out.print( "WARM\n");
			}
			if ( guess+1 == secret || guess-1 == secret ) {
				System.out.print( "HOT\n");
			}
			guess = keyboard.nextInt();
			kesempatan ++;
		}

		if ( secret == guess ) {
				System.out.println( "You guessed it! What are the odds?! You have won " + (won+1) + " out of " + round + " rounds." );
				kesempatan = 2; won ++;
			}

		else { System.out.println("Wrong, the correct number wa " + secret  );
			System.out.println("You have won " + won + " out of " + round + " rounds.");					
		}
		round ++;
		}
	if ( won <= 7 ){
		System.out.println("You are an Amateurs!");
	}
	else if ( won == 8  ){
		System.out.println("You are an Advance!");
	}
	else if ( won == 9  ){
		System.out.println("You are a Professionals!");
	}
	else if ( won == 10  ){
		System.out.println("You are a Hackers!");
	}
	}

}