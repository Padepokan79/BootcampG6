import java.util.Scanner;

public class ForgetfulMachine {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "\nWhat city is the capital of France?\n" );
		keyboard.next();

		System.out.println( "\nWhat is 6 multiplied by 7?\n" );
		keyboard.nextInt();

		System.out.println( "\nEnter a number between 0.0 and 1.0.\n" );
		keyboard.nextDouble();

		System.out.println( "\nis there anything else you would like to say?\n" );
		keyboard.next();
	}
}