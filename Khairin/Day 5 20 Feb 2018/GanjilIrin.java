import java.util.Scanner;

public class GanjilIrin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		String write;


		System.out.println( "Sebutkan bilangan ganjil dari 20 sampai 40:");

		for ( n = 21 ; n <=40 ; n += 2) {
			
			System.out.println( n );
		}
	}
}