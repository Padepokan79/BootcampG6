import java.util.Scanner;

public class ClubReservationIlham {
	public static void main(String[] args) {
		//inisialisasi object scanner
		Scanner keyboard = new Scanner(System.in);

		//inisialisasi variabel yang diperlukan
		int usia;
		double penampilan;
		String hari, jenisKelamin, nama;
		boolean selasa, kamis, jumat, sabtu; // variabel untuk cek kondisi saat hari tersebut

		System.out.println("Selamat datang di Reservation Club");
		
		//menerima inputan user
		System.out.print("Masukkan nama: \t");
		nama = keyboard.next();
		System.out.print("Masukkan hari: \t");
		hari = keyboard.next();
		System.out.print("Masukkan jenis kelamin anda (perempuan / laki-laki): ");
		jenisKelamin = keyboard.next();
		System.out.print("Masukkan usia anda: \t");
		usia = keyboard.nextInt();
		System.out.print("Masukkan penampilan anda (dalam skala 1.0 s/d 10.0): ");
		penampilan = keyboard.nextDouble();

		//proses cek reservation
		//cek kondisi hari senin rabu kamis
		if (hari.equalsIgnoreCase("senin") || hari.equalsIgnoreCase("rabu") || hari.equalsIgnoreCase("minggu")) {
			System.out.println(nama + ", Reservation diterima (umum)");
		} else {
			//selain hari senin rabu kamis
			//hari kondisi selasa
			if (selasa = (hari.equalsIgnoreCase("selasa") && (jenisKelamin.equalsIgnoreCase("perempuan") && penampilan >= 8 && usia <= 45 && usia >= 30) || (jenisKelamin.equalsIgnoreCase("laki-laki") && penampilan < 8 && usia <= 25 && usia >= 20))) {
			 	System.out.println(nama + ", Reservation diterima (Brondong Night 5c)");
			} 
			//hari kondisi kamis
			if (kamis = (hari.equalsIgnoreCase("kamis") && jenisKelamin.equalsIgnoreCase("perempuan") && penampilan >= 8 && usia <= 30 && usia >= 21)) {
				System.out.println(nama + ", Reservation diterima (Ladies Night)");
			} 
			//hari kondisi jumat
			if (jumat = (hari.equalsIgnoreCase("jumat") && (jenisKelamin.equalsIgnoreCase("perempuan") || jenisKelamin.equalsIgnoreCase("laki-laki")) && usia > 40)) {
			 	System.out.println(nama + ", Reservation diterima (Melodies Memori)");	
			} 
			//hari kondisi sabtu
			if (sabtu = (hari.equalsIgnoreCase("sabtu") && (jenisKelamin.equalsIgnoreCase("perempuan") || jenisKelamin.equalsIgnoreCase("laki-laki")) && penampilan >= 8 && usia <= 30 && usia >= 21)) {
				System.out.println(nama + ", Reservation diterima (Jomblo Night)");	 	
			} 
			//apabila kondisi hari selasa dan kamis dan jumat dan sabtu tidak terpenuhi
			if (!(selasa || kamis || jumat || sabtu)) {
				System.out.println(nama + ", Reservation ditolak");
			}		 
		}
	}
}