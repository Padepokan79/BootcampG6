package main;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPemasukan = 0;
		int jumlahLakuApelPerHari = 12, jumlahLakuManggaPerHari = 10, jumlahLakuJerukPerhari = 15;
		int jumlahLakuRambutanPerHari = 13;
		int jumlahLakuKeseluruhan = 20;
		
		String [] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu"};
		
		// Total Pemasukan Buah Apel
		System.out.println("\nPemasukan Penjualan Apel");
		for (int i = 0; i < hari.length; i++) {
			if (hari[i].equals("Jum'at")) {
				Apel apel = new Apel(hari[i], jumlahLakuKeseluruhan);
				totalPemasukan = totalPemasukan + apel.totalPemasukan();
			} else {
				Apel apel = new Apel(hari[i], jumlahLakuApelPerHari);
				totalPemasukan = totalPemasukan + apel.totalPemasukan();
			}			
		}	
		
		// Total Pemasukan Buah Mangga
		System.out.println("\nPemasukan Penjualan Mangga");
		for (int i = 0; i < hari.length; i++) {
			if (hari[i].equals("Jum'at")) {
				Mangga mangga = new Mangga(hari[i], jumlahLakuKeseluruhan);
				totalPemasukan = totalPemasukan + mangga.totalPemasukan();
			} else {
				Mangga mangga = new Mangga(hari[i], jumlahLakuManggaPerHari);
				totalPemasukan = totalPemasukan + mangga.totalPemasukan();
			}			
		}	
		
		// Total Pemasukan Buah Jeruk
		System.out.println("\nPemasukan Penjualan Jeruk");
		for (int i = 0; i < hari.length; i++) {
			if (hari[i].equals("Jum'at")) {
				Jeruk jeruk = new Jeruk(hari[i], jumlahLakuKeseluruhan);
				totalPemasukan = totalPemasukan + jeruk.totalPemasukan();
			} else {
				Jeruk jeruk = new Jeruk(hari[i], jumlahLakuJerukPerhari);
				totalPemasukan = totalPemasukan + jeruk.totalPemasukan();
			}			
		}
		
		// Total Pemasukan Buah Rambutan
		System.out.println("\nPemasukan Penjualan Rambutan");
		for (int i = 0; i < hari.length; i++) {
			if (hari[i].equals("Jum'at")) {
				Rambutan rambutan = new Rambutan(hari[i], jumlahLakuKeseluruhan);
				totalPemasukan = totalPemasukan + rambutan.totalPemasukan();
			} else {
				Rambutan rambutan = new Rambutan(hari[i], jumlahLakuRambutanPerHari);
				totalPemasukan = totalPemasukan + rambutan.totalPemasukan();
			}			
		}			
		
		// Total Keseluruhan Pemasukan
		System.out.println("\nTotal Pemasukan Keseluruhan = " + totalPemasukan);
	}

}
