// ilham 07-03-2018

import java.util.Scanner;

public class LatihanSoalNoTujuh {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String nama, jenisKelamin, pilihan;
		int umur;
		boolean undangan, hadiah;
		double penampilan;

		System.out.println("Selamat Datang, Silahkan Isi Data Diri Anda");
		System.out.println("===========================================");
		System.out.print("Masukkan Nama Anda: ");
		nama = keyboard.nextLine();
		System.out.print("Berapa Umur Anda: ");
		umur = keyboard.nextInt();
		System.out.print("Masukkan Jenis Kelamin (Pria/Wanita): ");
		jenisKelamin = keyboard.next();
		System.out.print("Penampilan (0.0 - 10.0): ");
		penampilan = keyboard.nextDouble();
		System.out.print("Apakah Anda Memiliki Undangan (ya/tidak): ");
		pilihan = keyboard.next();
		if (pilihan.equalsIgnoreCase("ya")) {
			undangan = true;
		} else {
			undangan = false;
		}
		System.out.print("Apakah Anda Membawa Hadiah (ya/tidak): ");
		pilihan = keyboard.next();
		if (pilihan.equalsIgnoreCase("ya")) {
			hadiah = true;
		} else {
			hadiah = false;
		}

		if (undangan) {
			System.out.println("Silahkan Masuk.");
		} else {
			if (hadiah && umur <= 20) {
				System.out.println("Silahkan Masuk.");			
			}
			else if (jenisKelamin.equalsIgnoreCase("wanita") && umur <= 20 && penampilan >= 8) {
				System.out.println("Silahkan Masuk.");							
			}
			else {
				System.out.println("Anda Di Larang Masuk.");			
			}
		}

	}
}