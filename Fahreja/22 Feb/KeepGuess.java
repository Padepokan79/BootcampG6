import java.util.Scanner;
public class KeepGuess{
	public static void main(String[] args) {
		Scanner keyboard = new  Scanner(System.in);
		int secret, guess;

		secret = 1 +(int)(Math.random()*10);

		System.out.println("I have chosen a number between 1 and 10");
		System.out.println("Try to guess it.");
		System.out.println("Your guess : ");
		guess = keyboard.nextInt();

		while ( secret!= guess) {
			System.out.println("That in incorrect. Guess again.");
			System.out.println("Your guess : ");
			guess = keyboard.nextInt();
		}
		System.out.println( "That's right! You're a good guesser." );
	}
	
}