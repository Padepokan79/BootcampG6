import java.util.Scanner;

public class JombloNightRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String hari, jenisKelamin;
		double penampilan;
		int umur;
		boolean hariBenar, jkBenar, reservasi;

		System.out.print( "\n--Jomblo Night Reservation--" );
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
		hariBenar = hari.equalsIgnoreCase("sabtu");
		jkBenar = ( jenisKelamin.equalsIgnoreCase("cewek") || jenisKelamin.equalsIgnoreCase("cowok") );

		// Proses Reservasi
		reservasi = ( hariBenar && jkBenar && penampilan >= 8 && ( umur >= 21 && umur <= 30 ) );

		// Hasil Reservasi
		System.out.println( "\nProses reservasi anda: " + reservasi );
	}
}