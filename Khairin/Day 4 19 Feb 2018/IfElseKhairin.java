import java.util.Scanner;

public class IfElseKhairin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String day, gender, name, type;
		int age;
		double allure;
		boolean condition = false;
	

		System.out.println( "Enter the day of reservation: ");
		day = keyboard.next();

		
		System.out.println( "Enter your Name: ");
		name = keyboard.next();

		System.out.println( "Enter your Gender: ");
		gender = keyboard.next();

		System.out.println( "Enter your Age: ");
		age = keyboard.nextInt();

		System.out.println( "How much your allure on a scale from 0.0 to 10.0? ");
		allure = keyboard.nextDouble();



		if ( day.equalsIgnoreCase("tuesday") && (gender.equalsIgnoreCase("female") && age >= 30 && age <=45 && allure >=8) || (gender.equalsIgnoreCase("male") && age >=20 && age <= 25 & allure >= 8) ) {
			System.out.println( "\tYou are allowed to Brondong Night 5C Reservation");
			condition = true;
		}	

		if ( day.equalsIgnoreCase("thursday") && gender.equalsIgnoreCase("female") && age >= 21 && age < 30 && allure >= 8) {
			System.out.println( "\tYou are allowed to Ladies Night 5A Reservation");
			condition = true;			
		}
		
		if ( day.equalsIgnoreCase("saturday") && (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")) && age >= 21 && age <= 30 && allure >=8 ) {
			System.out.println("\tYou are allowed to enter Jomblo Night 5B Reservation");
			condition = true;
		}
		
		if ( day.equalsIgnoreCase("friday") && (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")) && age > 40) {
			System.out.println("\tYou are allowed to enter Melodies Memori Reservation");
			condition = true;
		}
		if ( day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Sunday") ) {
			System.out.println( "You are allowed " ) ;
			condition = true;
		}

		if (condition == false){
			System.out.println("\tYou are not allowed to enter the Reservation on " + day );
		}
		
	}
}