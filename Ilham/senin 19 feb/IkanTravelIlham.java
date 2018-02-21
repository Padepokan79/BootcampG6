import java.util.Scanner;

public class IkanTravelIlham {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int jumlahPenumpang;
		double rekomendasi;

		System.out.println("--- Selamat datang di IKAN Travel ---");
		System.out.print("Berapa jumlah penumpang bis? ");
		jumlahPenumpang = keyboard.nextInt();
		System.out.println("\nList bis yang tersedia ...");
		if (jumlahPenumpang >= 60) {
			System.out.println("Bis dengan Kursi 60 \t\t Rp. 2.300.000");
		}
		if (jumlahPenumpang >= 45) {
			System.out.println("Bis dengan Kursi 45 \t\t Rp. 2.000.000");
		}
		if (jumlahPenumpang >= 32) {
			System.out.println("Bis dengan Kursi 32 \t\t Rp. 1.800.000");
		}
		if (jumlahPenumpang >= 18) {
			System.out.println("Bis dengan Kursi 18 \t\t Rp. 1.500.000");
		}
		if (jumlahPenumpang >= 12) {
			System.out.println("Bis dengan Kursi 12 \t\t Rp. 1.300.000");
		}
		if (jumlahPenumpang >= 6 || jumlahPenumpang <= 6) {
			System.out.println("Bis dengan Kursi 6 Executive \t Rp. 2.000.000");
		}

		/*
			6 --> 2.0
			12 --> 1.3
			18 --> 1.5
			12 + 12 = 24 --> 2.6
			12 + 18 = 30 --> 2.8
			32 --> 1.8
			18 + 18 = 36 --> 3.0
			32 + 12 = 44 --> 3.1
			45 --> 2.0
			32 + 18 = 50 --> 3.3
			60 --> 2.3
			45 + 18 = 63 --> 3.5
			32 + 32 = 64 --> 3.6
			60 + 12 = 72 --> 3.6
			45 + 32 = 77 --> 3.8
			60 + 18 = 78 --> 3.8
			45 + 45 = 90 --> 4.0
			60 + 32 = 92 --> 4.1
			60 + 45 = 105 --> 4.3
			60 + 60 = 120 --> 4.6

			regi
			5 6 11 12 17 18 20 25 30 31 32 34 40 45 48 51 57 58 60 61 64 66 75 78 85 91 100 107
		*/

		System.out.println("\nRekomendasi Bis untuk anda : ");
		if (jumlahPenumpang <= 6 ) {
			System.out.println("1 Bis Dengan 6 Kursi Executive Rp. 2.000.00 dengan Total Harga Rp. 2.000.000");
		}
		else if (jumlahPenumpang < 12) {
			System.out.println("2 Bis Dengan 6 Kursi Executive Rp. 2.000.00 dengan Total Harga Rp. 4.000.000");
		}		
		else if (jumlahPenumpang <= 12) {
			System.out.println("1 Bis Dengan 12 Kursi Rp. 1.300.00 dengan Total Harga Rp. 1.300.000");
		}
		else if (jumlahPenumpang < 18) {
			System.out.println("2 Bis Dengan 12 Kursi Rp. 1.300.00 dengan Total Harga Rp. 2.600.000");			
		}
		else if (jumlahPenumpang == 18) {
			System.out.println("1 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 1.500.000");			
		}
		else if (jumlahPenumpang <= 24) {
			System.out.println("2 Bis Dengan 12 Kursi Rp. 1.300.00 dengan Total Harga Rp. 2.600.000");			
		}
		else if (jumlahPenumpang <= 30) {
			System.out.println("1 Bis Dengan 18 Kursi Rp. 1.500.000 dan 1 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 2.800.000");
		}
		else if (jumlahPenumpang < 32) {
			System.out.println("2 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.000.000");
		}
		else if (jumlahPenumpang == 32) {
			System.out.println("1 Bis Dengan 32 Kursi Rp. 1.800.000 dengan Total Harga Rp. 1.800.000");
		}
		else if (jumlahPenumpang <= 36) {
			System.out.println("2 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.000.000");				
		}
		else if (jumlahPenumpang <= 44) {
			System.out.println("1 Bis Dengan 32 Kursi Rp. 1.800.000 dan 1 Bis Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 3.100.000");
		}
		else if (jumlahPenumpang == 45) {
			System.out.println("1 Bis Dengan 45 Kursi Rp. 2.000.000 dengan Total Harga Rp. 2.000.000");			
		}
		else if (jumlahPenumpang <= 50) {
			System.out.println("1 Bis Dengan 32 Kursi Rp. 2.000.000 dan 1 Bis Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.500.000");						
		}
		else if (jumlahPenumpang < 60) {
			System.out.println("2 Bis Dengan 32 Kursi Rp. 1.800.000 dengan Total Harga Rp. 3.600.000");
		}
		else if (jumlahPenumpang == 60) {
			System.out.println("1 Bis Dengan 60 Kursi Rp. 2.300.000 dengan Total Harga Rp. 2.300.000");						
		}
		else if (jumlahPenumpang <= 63) {
			System.out.println("1 Bis Dengan 45 Kursi Rp. 2.000.000 dan 1 Kursi Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.500.000");									
		}
		else if (jumlahPenumpang <= 64) {
			System.out.println("2 Bis Dengan 32 Kursi Rp. 1.800.000 dengan Total Harga Rp. 3.600.000");
		}
		else if (jumlahPenumpang <= 72) {
			System.out.println("1 Bis Dengan 60 Kursi Rp. 2.300.000 dan 1 Kursi Dengan 12 Kursi Rp. 1.300.000 dengan Total Harga Rp. 3.600.000");									
		}
		else if (jumlahPenumpang <= 77) {
			System.out.println("1 Bis Dengan 45 Kursi Rp. 2.000.000 dan 1 Kursi Dengan 32 Kursi Rp. 1.800.000 dengan Total Harga Rp. 3.800.000");			
		}
		else if (jumlahPenumpang <= 78) {
			System.out.println("1 Bis Dengan 60 Kursi Rp. 2.300.000 dan 1 Kursi Dengan 18 Kursi Rp. 1.500.000 dengan Total Harga Rp. 3.800.000");			
		}
		else if (jumlahPenumpang <= 90) {
			System.out.println("2 Bis Dengan 45 Kursi Rp. 2.000.000 dengan Total Harga Rp. 4.000.000");												
		}
		else if (jumlahPenumpang <= 92) {
			System.out.println("1 Bis Dengan 60 Kursi Rp. 2.300.000 dan 1 Bis Dengan 32 Kursi dengan Total Harga Rp. 4.100.000");												
		} 
		else if (jumlahPenumpang <= 105) {
			System.out.println("1 Bis Dengan 60 Kursi Rp. 2.300.000 dan 1 Bis Dengan 45 Kursi dengan Total Harga Rp. 4.300.000");												
		}
		else if (jumlahPenumpang <= 120) {
			System.out.println("2 Bis Dengan 60 Kursi Rp. 2.300.000 dengan Total Harga Rp. 4.600.000");												
		} 
		else {
			System.out.println("Bebaslah!");											
		}
	}
}