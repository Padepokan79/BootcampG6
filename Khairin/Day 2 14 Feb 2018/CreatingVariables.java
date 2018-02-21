public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, height;
		double seconds, e , checking, score;
		String firstName, lastName, title, place, day;
		x = 10;
		y = 400;
		age = 39;
		height = 170; 
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		score = 5.50;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		place = "Bandung";
		day = "Wednesday";

		System.out.println( "The variable x contains " + x);
		System.out.println( "The value" + y + " is stored in the variable y.");
		System.out.println( "The experiment took " + seconds + "seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName ); 
		System.out.println( "Her height is " + height + " cm");
		System.out.println( "His score on test is " + score );
		System.out.println( "The interview took place in " + place + " on " + day); 
	}
}