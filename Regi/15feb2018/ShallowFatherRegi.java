import java.util.Scanner;

public class ShallowFatherRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int ageWanita = 20, agePria, selisih = 5;
		double income, cute;
		boolean allowed;

		System.out.print( "\nEnter your age: " );
		agePria = keyboard.nextInt();

		System.out.print( "\nEnter your yearly income: " );
		income = keyboard.nextDouble();

		System.out.print( "\nHow cute are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = ( agePria >= ageWanita - selisih && agePria <= ageWanita + selisih && ( income >= 5000000 || cute >= 8 ) );

		System.out.println( "\nAllowed to date my child? " + allowed );
	}
}