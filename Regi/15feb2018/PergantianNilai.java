import java.util.Scanner;

public class PergantianNilai {
	public static void main( String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// Deklarasi
		int a, b, temp;

		// Input
		System.out.print( "\nMasukan angka pertama: " );
		a = keyboard.nextInt();

		System.out.print( "\nMasukan angka kedua: " );
		b = keyboard.nextInt();

		// Proses
		temp = a;
		a = b;
		b = temp;

		// Output
		System.out.println( "\na = " + a );
		System.out.println( "\nb = " + b );
	}
}