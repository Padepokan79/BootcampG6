import java.util.Scanner;

public class BrondongNightIrin {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String day, gender; 
		int age;
		double cute;
		boolean reservation;

		System.out.println("====================================================="); 
		System.out.println("                    \tCLUB RESERVATION                 ");
		System.out.println("                      \t BRONDONG NIGHT                   ");
		System.out.println("====================================================="); 
		System.out.print(  "\nEnter the day of reservation\t\t\t: "    );
		day = keyboard.next();

		System.out.print(  "Enter your gender\t\t\t\t: " );
		gender = keyboard.next();

		System.out.print(  "Enter your age\t\t\t\t\t: "                 );

		age = keyboard.nextInt();

		System.out.print(  "How cute are you, on a scale from 0.0 to 10.0?\t " );
		cute = keyboard.nextDouble();

		reservation = ( day.equalsIgnoreCase("tuesday") && (gender.equalsIgnoreCase("female") && age >= 30 && age <=45 && cute >=8) || (gender.equalsIgnoreCase("male") && age >=20 && age <= 25 & cute >= 8));

		System.out.println("-------------------------------------------------------");

		System.out.println( "Reservation Allowed?\t\t\t\t " + reservation );
		System.out.println("=======================================================");
	}
}