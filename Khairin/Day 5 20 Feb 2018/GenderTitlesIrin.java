import java.util.Scanner;

public class GenderTitlesIrin {

	public static void main( String[] args ) {
		ambilTitle();
	}

	public static void ambilTitle() {
		Scanner keyboard = new Scanner(System.in);
		String title;

		System.out.print( "First name: " );
		String first = keyboard.next();

		System.out.print( "Last name: " );
		String last = keyboard.next();

		System.out.print( "Gender (M/F): " );
		String gender = keyboard.next();

		System.out.print( "Age: " );
		int age = keyboard.nextInt();

		if ( age < 20 ) // Kondisi 1
		{
			title = first;
		}

		else // Kondisi 2
		{
			if ( gender.equals( "F") ) {
				System.out.print( "Are you married, "+first+"? (Y/N): " );
				String married = keyboard.next();
				if ( married.equals("Y") ) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}

			else {
				title = "Mr. ";
			}
		}


		System.out.println( "\n" + title + " " + last );

	}
}