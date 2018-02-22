import java.util.Scanner;

public class GenapIrin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		String write;


		System.out.println( "Sebutkan bilangan genap dari 1 sampai 20:");

		for ( n = 2; n <= 20; n += 2) {
			
			System.out.println( n );
		}
	}
}