import java.util.Scanner;

public class IkanTravel {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int kursi;

		System.out.println( "\n==============================================" );
		System.out.println( "\nSelamat Datang di Ikan Travel" );

		// Inputan
		System.out.print( "\nMasukan Jumlah Calon Penumpang: " );
		kursi = keyboard.nextInt();

		System.out.println( "\n==============================================" );

		// Proses IF menampilkan bis yang tersedia
		if ( kursi < 12 ) {
			System.out.println( "\nBis yang tersedia untuk anda: " );
			System.out.print( "\nBis Dengan Kursi 6 Executive 	Rp. 2.000.000" );
		}
		else if ( kursi < 18 ) {
			System.out.println( "\nBis yang tersedia untuk anda: " );
			System.out.print( "\nBis Dengan Kursi 12 		Rp. 1.300.000" );
			System.out.print( "\nBis Dengan Kursi 6 Executive 	Rp. 2.000.000" );
		}
		else if ( kursi < 32 ) {
			System.out.println( "\nBis yang tersedia untuk anda: " );
			System.out.print( "\nBis Dengan Kursi 18 		Rp. 1.500.000" );
			System.out.print( "\nBis Dengan Kursi 12 		Rp. 1.300.000" );
			System.out.print( "\nBis Dengan Kursi 6 Executive 	Rp. 2.000.000" );
		}
		else if ( kursi < 45 ) {
			System.out.println( "\nBis yang tersedia untuk anda: " );
			System.out.print( "\nBis Dengan Kursi 32 		Rp. 1.800.000" );
			System.out.print( "\nBis Dengan Kursi 18 		Rp. 1.500.000" );
			System.out.print( "\nBis Dengan Kursi 12 		Rp. 1.300.000" );
			System.out.print( "\nBis Dengan Kursi 6 Executive 	Rp. 2.000.000" );
		}
		else if ( kursi < 60 ) {
			System.out.println( "\nBis yang tersedia untuk anda: " );
			System.out.print( "\nBis Dengan Kursi 45 		Rp. 2.000.000" );
			System.out.print( "\nBis Dengan Kursi 32 		Rp. 1.800.000" );
			System.out.print( "\nBis Dengan Kursi 18 		Rp. 1.500.000" );
			System.out.print( "\nBis Dengan Kursi 12 		Rp. 1.300.000" );
			System.out.print( "\nBis Dengan Kursi 6 Executive 	Rp. 2.000.000" );
		}
		else if ( kursi >= 60 ) {
			System.out.println( "\nBis yang tersedia untuk anda: " );
			System.out.print( "\nBis Dengan Kursi 60 		Rp. 2.300.000" );
			System.out.print( "\nBis Dengan Kursi 45 		Rp. 2.000.000" );
			System.out.print( "\nBis Dengan Kursi 32 		Rp. 1.800.000" );
			System.out.print( "\nBis Dengan Kursi 18 		Rp. 1.500.000" );
			System.out.print( "\nBis Dengan Kursi 12 		Rp. 1.300.000" );
			System.out.print( "\nBis Dengan Kursi 6 Executive 	Rp. 2.000.000" );
		}
		System.out.println();
		System.out.println( "\n==============================================" );

		// Proses IF Menampilkan Rekomendasi bis
		if ( kursi >= 1 && kursi <= 6 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan Kursi 6 Executive Rp. 2.000.000 Total Harga Rp. 2.000.000" );
		}
		if ( kursi >= 7 && kursi <= 11 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n2 Bis Dengan Kursi 6 Executive Rp. 2.000.000 Total Harga Rp. 4.000.000" );
		}
		if ( kursi == 12 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 1.300.000" );
		}
		if ( kursi >= 13 && kursi <= 17 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n2 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 2.600.000" );
		}
		if ( kursi == 18 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 1.500.000" );
		}
		if ( kursi >= 19 && kursi <= 24 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n2 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 2.600.000" );
		}
		if ( kursi >= 25 && kursi <= 30 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 18 Kursi Rp. 1.500.000 dan 1 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 2.800.000" );
		}
		if ( kursi == 31 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n2 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.000.000" );
		}
		if ( kursi == 32 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 32 Kursi Rp. 1.800.000 dengan Total Harga Rp. 1.800.000" );
		}
		if ( kursi >= 33 && kursi <= 36 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n2 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.000.000" );
		}
		if ( kursi >= 37 && kursi <= 44 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 32 Kursi Rp. 1.800.000 dan 1 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 3.100.000" );
		}
		if ( kursi == 45 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 45 Kursi Rp. 2.000.000 dengan Total Harga Rp. 2.000.000" );
		}
		if ( kursi >= 46 && kursi <= 50 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 45 Kursi Rp. 2.000.000 dan 1 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 3.300.000" );
			System.out.println( "\n1 Bis Dengan 32 Kursi Rp. 1.800.000 dan 1 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.300.000" );
		}
		if ( kursi >= 51 && kursi <= 57 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 45 Kursi Rp. 2.000.000 dan 1 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 3.300.000" );
		}
		if ( kursi >= 58 && kursi <= 59 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 45 Kursi Rp. 2.000.000 dan 1 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.500.000" );
		}
		if ( kursi == 60 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 60 Kursi Rp. 2.300.000 dengan Total Harga Rp. 2.300.000" );
		}
		if ( kursi >= 61 && kursi <= 63 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 45 Kursi Rp. 2.000.000 dan 1 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.500.000" );
		}
		if ( kursi == 64 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 60 Kursi Rp. 2.300.000 dan 1 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 3.600.000" );
			System.out.println( "\n2 Bis Dengan 32 Kursi Rp. 1.800.000 dengan Total Harga Rp. 3.600.000" );
		}
		if ( kursi >= 65 && kursi <= 72 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 60 Kursi Rp. 2.300.000 dan 1 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 3.600.000" );
		}
		if ( kursi >= 73 && kursi <= 77 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 60 Kursi Rp. 2.300.000 dan 1 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.800.000" );
			System.out.println( "\n1 Bis Dengan 45 Kursi Rp. 2.000.000 dan 1 Bis Dengan 32 Kursi Rp. 1.800.000 dengan Total Harga Rp. 3.800.000" );
		}
		if ( kursi == 78 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 60 Kursi Rp. 2.300.000 dan 1 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.800.000" );
		}
		if ( kursi >= 79 && kursi <= 90 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n2 Bis Dengan 45 Kursi Rp. 2.000.000 dengan Total Harga Rp. 4.000.000" );
		}
		if ( kursi >= 91 && kursi <= 92 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 60 Kursi Rp. 2.300.000 dan 1 Bis Dengan 32 Kursi Rp. 1.800.000 dengan Total Harga Rp. 4.100.000" );
		}
		if ( kursi >= 93 && kursi <= 105 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n1 Bis Dengan 60 Kursi Rp. 2.300.000 dan 1 Bis Dengan 45 Kursi Rp. 2.000.000 dengan Total Harga Rp. 4.300.000" );
		}
		if ( kursi >= 106 && kursi <= 120 ) {
			System.out.println( "\nRekomendasi Bis Untuk anda: " );
			System.out.println( "\n2 Bis Dengan 60 Kursi Rp. 2.300.000 dengan Total Harga Rp. 4.600.000" );
		}
	}
}