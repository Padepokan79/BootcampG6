import java.util.Scanner;

public class ClubReservationRegi {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		String hari, nama, jenisKelamin;
		double penampilan;
		int umur;
		boolean jkCewekBenar, jkCowokBenar, jkBenar, reservasi = false;

		System.out.print( "\n--Club Reservation--" );
		System.out.println();

		// Inputan
		System.out.print( "\nMasukan Hari: " );
		hari = keyboard.next();

		System.out.print( "\nMasukan Nama: " );
		nama = keyboard.next();

		System.out.print( "\nMasukan Jenis Kelamin (cewek/cowok): " );
		jenisKelamin = keyboard.next();

		System.out.print( "\nSeberapa Menarik Anda? (skala 0.0 to 10.0): " );
		penampilan = keyboard.nextDouble();

		System.out.print( "\nMasukan Umur Anda: " );
		umur = keyboard.nextInt();

		// Proses Compare Strings Untuk Jenis Kelamin
		jkCewekBenar = jenisKelamin.equalsIgnoreCase("cewek");
		jkCowokBenar = jenisKelamin.equalsIgnoreCase("cowok");
		jkBenar = ( jenisKelamin.equalsIgnoreCase("cewek") || jenisKelamin.equalsIgnoreCase("cowok") );

		// Proses IF
		if ( hari.equalsIgnoreCase("kamis") && jkCewekBenar && penampilan >= 8 && ( umur >= 21 && umur <= 30 ) ) {
			System.out.println( "\nProses reservasi Ladies Nights anda berhasil" );
			reservasi = true;
		}
		if ( hari.equalsIgnoreCase("jumat") && jkBenar && umur > 40 ) {
			System.out.println( "\nProses reservasi Melodies Memori anda berhasil" );
			reservasi = true;
		}
		if ( hari.equalsIgnoreCase("sabtu") && jkBenar && penampilan >= 8 && ( umur >= 21 && umur <= 30 ) ) {
			System.out.println( "\nProses reservasi Jomblo Night anda berhasil" );
			reservasi = true;
		}
		if ( hari.equalsIgnoreCase("selasa") && ( jkCewekBenar && penampilan >= 8 && ( umur >= 30 && umur <= 45 ) ) || ( jkCowokBenar && penampilan < 8 && ( umur >= 20 && umur <= 25 ) ) ) {
			System.out.println( "\nProses reservasi Brondong Night anda berhasil" );
			reservasi = true;
		}
		if ( hari.equalsIgnoreCase("senin") || hari.equalsIgnoreCase("rabu") || hari.equalsIgnoreCase("minggu") ) {
			System.out.println( "\nProses reservasi Umum anda berhasil" );
			reservasi = true;
		}
		if ( reservasi == false ) {
			System.out.println( "\nMaaf proses reservasi anda belum berhasil" );
		}
	}
}