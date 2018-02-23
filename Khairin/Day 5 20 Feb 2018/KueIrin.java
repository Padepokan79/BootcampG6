import java.util.Scanner;

public class KueIrin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int n, kue = 200;


		// 15 menit = 3 x 30
		// 30 menit = 6
		// 60 menit = 12
		// 7 jam 30 menit = 450 menit
		// 450*15

		System.out.println( ":");

		for ( n = 15 ; n <= 450 ; n += 15) {
			kue -= 3;
		}
		System.out.println( kue);
	}
}