import java.util.Scanner;

public class HabisDibagiIrin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		String write;


		System.out.println( "Sebutkan bilangan ganjil dari 20 sampai 40:");

		for ( n = 30  ; n <=90 ; n ++ ) {
			if ( n % 3 == 0 && n % 5 == 0 ){
			System.out.println( n );
		}
		}
	}
}