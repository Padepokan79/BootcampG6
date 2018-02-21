import java.util.Scanner;

public class IkanTravel{
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variabel yg diperlukan
		int jPenumpang, sisaPenumpang = 0, jBus = 0;

		// Masukan variabel yg digunakan
		System.out.println("SELAMAT DATANG DI IKAN TRAVEL 6c");
		System.out.println("================================");
		System.out.print("Berapa jumlah penumpang? "); jPenumpang = input.nextInt();

		System.out.println("\nBus yg tersedia : ");

		// Proses pengecekan jumlah penumpang
		if (jPenumpang >= 60) {
			System.out.println("Bis Dengan Kursi 60               Rp. 2.300.000");
		}
		if (jPenumpang >= 45) {
			System.out.println("Bis Dengan Kursi 45               Rp. 2.000.000");
		}
		if (jPenumpang >= 32) {
			System.out.println("Bis Dengan Kursi 32               Rp. 1.800.000");
		}
		if (jPenumpang >= 18) {
			System.out.println("Bis Dengan Kursi 18               Rp. 1.500.000");
		}
		if (jPenumpang >= 12) {
			System.out.println("Bis Dengan Kursi 12               Rp. 1.300.000");
		}
		if (jPenumpang <= 6  || jPenumpang > 6) {
			System.out.println("Bis Dengan Kursi 6 Executive      Rp. 2.000.000");
		}

		// Proses penjumlahan penumpang penuh
		System.out.println("\n* Rekomendasi bus untuk anda "); 
		if (jPenumpang <= 6) {
			System.out.println("- 1 Bis Dengan Kursi 6 Executive  Rp. 2.000.000"); 
			System.out.println("Total                             Rp. 2.000.000"); 	
		} else if (jPenumpang >= 7 && jPenumpang <= 11) {
			System.out.println("- 2 Bis Dengan Kursi 6 Executive  Rp. 2.000.000");
			System.out.println("Total                             Rp. 4.000.000"); 
		} else if (jPenumpang == 12) {
			System.out.println("- 1 Bis Dengan Kursi 12           Rp. 1.300.000");
			System.out.println("Total                             Rp. 1.300.000"); 
		} else if (jPenumpang >= 13 && jPenumpang <= 17) {
			System.out.println("- 2 Bis Dengan Kursi 12           Rp. 1.300.000"); 
			System.out.println("Total                             Rp. 2.600.000");
		} else if (jPenumpang == 18) {
			System.out.println("- 1 Bis Dengan Kursi 18           Rp. 1.500.000"); 
			System.out.println("Total                             Rp. 1.500.000");
		} else if (jPenumpang >= 19 && jPenumpang <= 24) {
			System.out.println("- 2 Bis Dengan Kursi 12           Rp. 1.300.000"); 
			System.out.println("Total                             Rp. 2.600.000");
		} else if (jPenumpang >= 25 && jPenumpang <= 30) {
			System.out.println("- 1 Bis Dengan Kursi 18           Rp. 1.500.000"); 
			System.out.println("- 1 Bis Dengan Kursi 12           Rp. 1.300.000");
			System.out.println("Total                             Rp. 2.800.000"); 
		} else if (jPenumpang == 31) {
			System.out.println("- 2 Bis Dengan Kursi 18           Rp. 1.500.000"); 
			System.out.println("Total                             Rp. 3.000.000");
		} else if (jPenumpang == 32) {
			System.out.println("- 1 Bis Dengan Kursi 32           Rp. 1.800.000"); 
			System.out.println("Total                             Rp. 1.800.000");
		} else if (jPenumpang >= 33 && jPenumpang <= 36) {
			System.out.println("- 2 Bis Dengan Kursi 18           Rp. 1.500.000"); 
			System.out.println("Total                             Rp. 3.000.000");
		} else if (jPenumpang >= 37 && jPenumpang <= 44) {
			System.out.println("- 1 Bis Dengan Kursi 32           Rp. 1.800.000"); 
			System.out.println("- 1 Bis Dengan Kursi 12           Rp. 1.300.000"); 
			System.out.println("Total                             Rp. 3.100.000");
		} else if (jPenumpang == 45) {
			System.out.println("- 1 Bis Dengan Kursi 45           Rp. 2.000.000"); 
			System.out.println("Total                             Rp. 2.000.000");
		} else if (jPenumpang >= 46 && jPenumpang <= 50) {
			System.out.println("- 1 Bis Dengan Kursi 45           Rp. 2.000.000"); 
			System.out.println("- 1 Bis Dengan Kursi 12           Rp. 1.300.000\natau\n"); 

			System.out.println("- 1 Bis Dengan Kursi 32           Rp. 1.800.000"); 
			System.out.println("- 1 Bis Dengan Kursi 18           Rp. 1.500.000"); 
			System.out.println("Total                             Rp. 3.300.000");
		} else if (jPenumpang >= 51 && jPenumpang <= 57) {
			System.out.println("- 1 Bis Dengan Kursi 45           Rp. 2.000.000");
			System.out.println("- 1 Bis Dengan Kursi 12           Rp. 1.300.000");
			System.out.println("Total                             Rp. 3.300.000");  
		} else if (jPenumpang >= 58 && jPenumpang <= 59) {
			System.out.println("- 1 Bis Dengan Kursi 45           Rp. 2.000.000"); 
			System.out.println("- 1 Bis Dengan Kursi 18           Rp. 1.500.000"); 
			System.out.println("Total                             Rp. 3.500.000");
		} else if (jPenumpang == 60) {
			System.out.println("- 1 Bis Dengan Kursi 60           Rp. 2.300.000"); 
			System.out.println("Total                             Rp. 2.300.000");
		} else if (jPenumpang >= 61 && jPenumpang <= 63) {
			System.out.println("- 1 Bis Dengan Kursi 45           Rp. 2.000.000"); 
			System.out.println("- 1 Bis Dengan Kursi 18           Rp. 1.500.000"); 
			System.out.println("Total                             Rp. 3.500.000");
		} else if (jPenumpang == 64) {
			System.out.println("- 1 Bis Dengan Kursi 60           Rp. 2.300.000"); 
			System.out.println("- 1 Bis Dengan Kursi 12           Rp. 1.300.000\natau\n"); 

			System.out.println("- 2 Bis Dengan Kursi 32           Rp. 1.800.000"); 
			System.out.println("Total                             Rp. 3.600.000");
		} else if (jPenumpang >= 65 && jPenumpang <= 72) {
			System.out.println("- 1 Bis Dengan Kursi 60           Rp. 2.300.000"); 
			System.out.println("- 1 Bis Dengan Kursi 12           Rp. 1.300.000"); 
			System.out.println("Total                             Rp. 3.600.000");
		} else if (jPenumpang >= 73 && jPenumpang <= 77) {
			System.out.println("- 1 Bis Dengan Kursi 60           Rp. 2.300.000"); 
			System.out.println("- 1 Bis Dengan Kursi 18           Rp. 1.500.000\natau\n"); 

			System.out.println("- 1 Bis Dengan Kursi 45           Rp. 2.000.000"); 
			System.out.println("- 1 Bis Dengan Kursi 32           Rp. 1.800.000"); 
			System.out.println("Total                             Rp. 3.800.000");
		} else if (jPenumpang == 78) {
			System.out.println("- 1 Bis Dengan Kursi 60           Rp. 2.300.000"); 
			System.out.println("- 1 Bis Dengan Kursi 18           Rp. 1.500.000");
			System.out.println("Total                             Rp. 3.800.000"); 
		} else if (jPenumpang >= 79 && jPenumpang <= 90) {
			System.out.println("- 2 Bis Dengan Kursi 45           Rp. 2.000.000");
			System.out.println("Total                             Rp. 4.000.000"); 
		} else if (jPenumpang >= 91 && jPenumpang <= 92) {
			System.out.println("- 1 Bis Dengan Kursi 60           Rp. 2.300.000"); 
			System.out.println("- 1 Bis Dengan Kursi 32           Rp. 1.800.000"); 
			System.out.println("Total                             Rp. 4.100.000");
		} else if (jPenumpang >= 93 && jPenumpang <= 105) {
			System.out.println("- 1 Bis Dengan Kursi 60           Rp. 2.300.000"); 
			System.out.println("- 1 Bis Dengan Kursi 45           Rp. 2.000.000"); 
			System.out.println("Total                             Rp. 4.300.000");
		} else if (jPenumpang >= 106 && jPenumpang <= 120) {
			System.out.println("- 2 Bis Dengan Kursi 60           Rp. 2.300.000"); 
			System.out.println("Total                             Rp. 4.600.000");
		} 

		/*
		// Proses penjumlahan penumpang penuh
		System.out.println("\n* Rekomendasi bus untuk anda"); 
		if (jPenumpang >= 60) {
			jBus = jPenumpang / 60;
			sisaPenumpang = jPenumpang % 60;
			System.out.println("- " + jBus + " Bis Dengan 60 Kursi Rp. 2.300.000");
		} else if (jPenumpang >= 45) {
			jBus = jPenumpang / 45;
			sisaPenumpang = jPenumpang % 45;
			System.out.println("- " + jBus + " Bis Dengan 45 Kursi Rp. 2.000.000");
		} else if (jPenumpang >= 32) {
			jBus = jPenumpang / 32;
			sisaPenumpang = jPenumpang % 32;
			System.out.println("- " + jBus + " Bis Dengan 32 Kursi Rp. 1.800.000");
		} else if (jPenumpang >= 18) {
			jBus = jPenumpang / 18;
			sisaPenumpang = jPenumpang % 18;
			System.out.println("- " + jBus + " Bis Dengan 18 Kursi Rp. 1.500.000");
		} else if (jPenumpang >= 12) {
			jBus = jPenumpang / 12;
			sisaPenumpang = jPenumpang % 12;
			System.out.println("- " + jBus + " Bis Dengan 12 Kursi Rp. 1.300.000");
		} else {
			jBus = jPenumpang / 6;
			sisaPenumpang = jPenumpang % 6;
			System.out.println("- 1 Bis Dengan 6 Kursi Rp. 2.000.000");
		}

		// Proses penjumlahan sisa penumpang
		if (sisaPenumpang > 45) {
			System.out.println("- 1 Bis Dengan 60 Kursi Rp. 2.300.000");
		} else if (sisaPenumpang > 32) {
			System.out.println("- 1 Bis Dengan 45 Kursi Rp. 2.000.000");
		} else if (sisaPenumpang > 18) {
			System.out.println("- 1 Bis Dengan 32 Kursi Rp. 1.800.000");
		} else if (sisaPenumpang > 12) {
			System.out.println("- 1 Bis Dengan 18 Kursi Rp. 1.500.000");
		} else if (sisaPenumpang > 0) {
			System.out.println("- 1 Bis Dengan 12 Kursi Rp. 1.300.000");
		}
		*/

	}
}