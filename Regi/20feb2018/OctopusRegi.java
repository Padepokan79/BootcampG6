import java.util.Scanner;

public class OctopusRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		String kata;
		int xAwal, xAkhir = 1;

		System.out.print( "\nMasukan Kata: " );
		kata = keyboard.next();

		for ( xAwal = 0; xAwal < kata.length(); xAwal++ ) {
			System.out.println( kata.substring(xAwal,xAkhir) );
			xAkhir++;
		}
	}
}