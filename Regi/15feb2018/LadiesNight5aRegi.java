import java.util.Scanner;

public class LadiesNight5aRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String hari, jenisKelamin;
		double penampilan;
		int umur;
		boolean hariBenar, jkBenar, reservasi;

		System.out.print( "\n--Ladies Night 5a Reservation--" );
		System.out.println();

		// Inputan
		System.out.print( "\nMasukan Hari: " );
		hari = keyboard.next();

		System.out.print( "\nMasukan Jenis Kelamin (cewek/cowok): " );
		jenisKelamin = keyboard.next();

		System.out.print( "\nSeberapa Menarik Anda? (skala 0.0 to 10.0): " );
		penampilan = keyboard.nextDouble();

		System.out.print( "\nMasukan Umur Anda: " );
		umur = keyboard.nextInt();

		// Proses Compare Strings
		hariBenar = hari.equalsIgnoreCase("kamis");
		jkBenar = jenisKelamin.equalsIgnoreCase("cewek");

		// Proses Reservasi
		reservasi = ( hariBenar && jkBenar && penampilan >= 8 && ( umur >= 21 && umur <= 30 ) );

		// Hasil Reservasi
		System.out.print( "\nProses reservasi anda: " + reservasi );
	}
}