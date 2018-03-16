package LatihanKartikaSari;

import java.util.ArrayList;

public class TestBelanjaKartikaSari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalHarga = 0;
		
		ArrayList<AlmondCrispyCheese> keranjangBelanja = new ArrayList<AlmondCrispyCheese>();
		ArrayList<CoklatKoin> keranjangBelanja2 = new ArrayList<CoklatKoin>();
		
		AlmondCrispyCheese almondCrispyCheese1 = new AlmondCrispyCheese("Almond Crispy Cheese Kartika Sari", "Coklat", "Krem & Coklat", 
				"Gula, Tepung, Telur, Kacang Almond, Susu", 45000, 170, "24 April 2018", "Sedang", 30);
		CoklatKoin coklatKoin1 = new CoklatKoin("Golden Choc", "Tiramisu", "Coklat Keemasan", "Coklat, Tiramisu", 20000, 100, "25 Mei 2018", 
				4);
		
		keranjangBelanja.add(almondCrispyCheese1);
		keranjangBelanja2.add(coklatKoin1);
		
		System.out.println("Daftar Belanja");
		
		for (AlmondCrispyCheese almondCrispyCheese : keranjangBelanja) {
			System.out.println("\nNama Produk: " + almondCrispyCheese.getNama());
			System.out.println("Rasa: " + almondCrispyCheese.getRasa());
			System.out.println("Warna: " + almondCrispyCheese.getWarna());
			System.out.println("Komposisi: " + almondCrispyCheese.getKomposisi());
			System.out.println("Harga: " + almondCrispyCheese.getHarga());
			System.out.println("Berat Bersih: " + almondCrispyCheese.getBerat() + " Gr");
			System.out.println("Expired: " + almondCrispyCheese.getExpired());
			System.out.println("Ukuran: " + almondCrispyCheese.ukuranToples);
			System.out.println("Jumlah Isi Per Toples: " + almondCrispyCheese.jumlahIsiPerToples);
			
			totalHarga = totalHarga + almondCrispyCheese.getHarga();
		}
		
		for (CoklatKoin coklatKoin : keranjangBelanja2) {
			System.out.println("\nNama Produk: " + coklatKoin.getNama());
			System.out.println("Rasa: " + coklatKoin.getRasa());
			System.out.println("Warna: " + coklatKoin.getWarna());
			System.out.println("Komposisi: " + coklatKoin.getKomposisi());
			System.out.println("Harga: " + coklatKoin.getHarga());
			System.out.println("Berat Bersih: " + coklatKoin.getBerat() + " Gr");
			System.out.println("Expired: " + coklatKoin.getExpired());
			System.out.println("Diameter: " + coklatKoin.diameter);
			
			totalHarga = totalHarga + coklatKoin.getHarga();
		}
		
		System.out.println("\nTotal Harga: " + totalHarga);

	}

}
