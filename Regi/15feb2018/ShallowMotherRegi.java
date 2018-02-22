import java.util.Scanner;

public class ShallowMotherRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		double income, cute;
		boolean allowed;

		System.out.print( "\nEnter your age: " );
		age = keyboard.nextInt();

		System.out.print( "\nEnter your yearly income: " );
		income = keyboard.nextDouble();

		System.out.print( "\nHow cute are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = ( age >= 17 && age < 30 && ( income >= 5000000 && cute >= 8 ) );

		System.out.println( "\nAllowed to date my child? " + allowed );
	}
}