import java.util.Scanner;

public class ArrayLinearSearch {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828 };
		int toFind;
		boolean found = false;

		System.out.print("There are " + orderNumbers.length);
		System.out.println(" orders in the database.");

		System.out.println("Orders: ");

		for ( int num : orderNumbers ) {
			System.out.println( num + " " );
		}
		System.out.println();

		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();

		for ( int num : orderNumbers ) {
			if ( toFind == num ) {
				System.out.println( toFind + " found.");
				found = true;
			}

		}
		if ( found == false ) {
				System.out.println( toFind + " is not found.");
			}
	}
}