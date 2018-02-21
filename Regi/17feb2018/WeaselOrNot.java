import java.util.Scanner;

public class WeaselOrNot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep, nope;

		// Inputan
		System.out.print( "Type the word \"weasel\", please: " );
		word = keyboard.next();

		// Proses
		yep = word.equals("weasel");
		nope = ! word.equals("weasel");

		// Output
		System.out.println( "You typed what was requested: " + yep );
		System.out.println( "You ignored polite instructions: " + nope );
	}
}