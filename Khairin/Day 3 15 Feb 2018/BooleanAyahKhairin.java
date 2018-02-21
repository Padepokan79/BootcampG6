import java.util.Scanner;

public class BooleanAyahKhairin {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age, ageDaughter, ageMax, ageMin;
		double income, cute;
		boolean allowed;


		ageDaughter = 20;
		ageMax = ageDaughter+5;
		ageMin = ageDaughter-5;

		System.out.print( "Enter your age: " );
		age = keyboard.nextInt();

		System.out.print( "Enter your yearly income: " );
		income = keyboard.nextDouble();

		System.out.print( "How cute are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = ( age <= ageMax && age >= ageMin && (income >= 5000000 || cute >= 8) );

		System.out.println( "Allowed to date my daughter? " + allowed );
	}
}