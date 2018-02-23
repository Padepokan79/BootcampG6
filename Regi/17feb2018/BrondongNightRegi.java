import java.util.Scanner;

public class BrondongNightRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String hari, jenisKelamin;
		double penampilan;
		int umur;
		boolean hariBenar, jkCewekBenar, jkCowokBenar, reservasi;

		System.out.print( "\n--Brondong Night Reservation--" );
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
		hariBenar = hari.equalsIgnoreCase("selasa");
		jkCewekBenar = ( jenisKelamin.equalsIgnoreCase("cewek") );
		jkCowokBenar = ( jenisKelamin.equalsIgnoreCase("cowok") );
		
		// Proses Reservasi
		reservasi = ( hariBenar && jkCewekBenar && penampilan >= 8 && ( umur >= 30 && umur <= 45 ) || 
					  hariBenar && jkCowokBenar && penampilan < 8 && ( umur >= 20 && umur <= 25 ) );

		// Hasil Reservasi
		System.out.println( "\nProses reservasi anda: " + reservasi );
	}
}