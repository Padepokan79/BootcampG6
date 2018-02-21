import java.util.Scanner;

public class ShallowGrandMotherRegi {
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

		allowed = ( age > 27 && age < 42 && ( income > 50000 || cute >= 8.5 ) );

		System.out.println( "\nAllowed to date my grandchild? " + allowed );
	}
}