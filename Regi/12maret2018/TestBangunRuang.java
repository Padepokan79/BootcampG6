import java.util.Scanner;

public class TestBangunRuang {

	private static Scanner keyboard;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		keyboard = new Scanner(System.in);
		int pilih = 0;
		
		do {
			System.out.println("\nPerhitungan Ruang");
			System.out.println("1. Kubus.");
			System.out.println("2. Balok.");
			System.out.println("3. Tabung.");
			System.out.println("0. exit.");
			
			System.out.println("\nPilih Bangun yang ingin di hitung:");
			pilih = keyboard.nextInt();
			
			switch(pilih) {
				case 1: {
					Kubus kubus = new Kubus();
					
					System.out.println("\nMenghitung Ruang Kubus.");
					System.out.println("Masukkan Panjang Sisi dalam Centimeter:");
					int sisi = keyboard.nextInt();
					
					kubus.luasKubus(sisi);
					kubus.volumeKubus(sisi);
					
					System.out.println("\nLuas Kubus dengan Sisi " + sisi + " cm Adalah " + kubus.luasKubus(sisi));
					System.out.println("Volume Kubus dengan Sisi " + sisi + " cm Adalah " + kubus.volumeKubus(sisi));			
					break;
				}
				case 2: {
					Balok balok = new Balok();
					
					System.out.println("\nMenghitung Ruang Balok.");
					System.out.println("Masukkan Panjang dalam Centimeter:");
					int panjang = keyboard.nextInt();
					System.out.println("Masukkan Lebar dalam Centimeter:");
					int lebar = keyboard.nextInt();
					System.out.println("Masukkan Tinggi dalam Centimeter:");
					int tinggi = keyboard.nextInt();
					
					balok.luasBalok(panjang, lebar, tinggi);
					balok.volumeBalok(panjang, lebar, tinggi);
					
					System.out.println("\nLuas Balok dengan Adalah " + balok.luasBalok(panjang, lebar, tinggi));
					System.out.println("Volume Balok dengan Adalah " + balok.volumeBalok(panjang, lebar, tinggi));
					break;
				}
				case 3: {
					Tabung tabung = new Tabung();
					
					System.out.println("\nMenghitung Ruang Tabung.");
					System.out.println("Masukkan Panjang Jari-Jari dalam Centimeter:");
					int jariJari = keyboard.nextInt();
					System.out.println("Masukkan Tinggi Tabung:");
					int tinggi = keyboard.nextInt();
					
					tabung.luasTabung(jariJari, tinggi);
					tabung.volumeTabung(jariJari, tinggi);
					
					System.out.println("\nLuas Tabung Adalah " + tabung.luasTabung(jariJari, tinggi));
					System.out.println("Volume Tabung Adalah " + tabung.volumeTabung(jariJari, tinggi));
					break;
				}
				case 0: {
					System.exit(0);
					break;
				}
				default: {
					System.out.println("\nMaaf pilihan anda tidak tersedia");
					break;
				}
			}
		} while (pilih != 0);
	}
}
