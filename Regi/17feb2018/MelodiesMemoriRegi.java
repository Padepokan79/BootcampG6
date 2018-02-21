import java.util.Scanner;

public class MelodiesMemoriRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String hari, jenisKelamin;
		int umur;
		boolean hariBenar, jkBenar, reservasi;

		System.out.print( "\n--Melodies Memori Reservation--" );
		System.out.println();

		// Inputan
		System.out.print( "\nMasukan Hari: " );
		hari = keyboard.next();

		System.out.print( "\nMasukan Jenis Kelamin (cewek/cowok): " );
		jenisKelamin = keyboard.next();

		System.out.print( "\nMasukan Umur Anda: " );
		umur = keyboard.nextInt();

		// Proses Compare Strings
		hariBenar = hari.equalsIgnoreCase("jumat");
		jkBenar = ( jenisKelamin.equalsIgnoreCase("cewek") || jenisKelamin.equalsIgnoreCase("cowok") );

		// Proses Reservasi
		reservasi = ( hariBenar && jkBenar && umur > 40 );

		// Hasil Reservasi
		System.out.println( "\nProses reservasi anda: " + reservasi );
	}
}