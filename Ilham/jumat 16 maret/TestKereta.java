import java.util.ArrayList;
import java.util.List;

public class TestKereta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kereta keretaGerbongEkonomi = new Kereta("Ekonomi", 18000);
		Kereta keretaGerbongBisnis = new Kereta("Bisnis", 35000);
		Kereta keretaGerbongExecutive = new Kereta("Executive", 80000);
		
		ArrayList<Integer> jumlahPenumpangEkonomiPerHari = new ArrayList<Integer>();
		ArrayList<Integer> jumlahPenumpangBisnisPerHari = new ArrayList<Integer>();
		ArrayList<Integer> jumlahPenumpangExecutivePerHari = new ArrayList<Integer>();
		
		int besarPemasukanPerHari, besarPemasukanTujuhHari = 0;
		
		//jumlah penumpang ekonomi perhari
		jumlahPenumpangEkonomiPerHari.add(120);
		jumlahPenumpangEkonomiPerHari.add(100);
		jumlahPenumpangEkonomiPerHari.add(50);
		jumlahPenumpangEkonomiPerHari.add(30);
		jumlahPenumpangEkonomiPerHari.add(20);
		jumlahPenumpangEkonomiPerHari.add(150);
		jumlahPenumpangEkonomiPerHari.add(110);
		
		//jumlah penumpang bisnis perhari
		jumlahPenumpangBisnisPerHari.add(50);
		jumlahPenumpangBisnisPerHari.add(15);
		jumlahPenumpangBisnisPerHari.add(13);
		jumlahPenumpangBisnisPerHari.add(10);
		jumlahPenumpangBisnisPerHari.add(20);
		jumlahPenumpangBisnisPerHari.add(55);
		jumlahPenumpangBisnisPerHari.add(60);
		
		//jumlah penumpang executive perhari
		jumlahPenumpangExecutivePerHari.add(40);
		jumlahPenumpangExecutivePerHari.add(21);
		jumlahPenumpangExecutivePerHari.add(11);
		jumlahPenumpangExecutivePerHari.add(16);
		jumlahPenumpangExecutivePerHari.add(12);
		jumlahPenumpangExecutivePerHari.add(35);
		jumlahPenumpangExecutivePerHari.add(40);
		
		for (int index = 0; index < 7; index++) {
			besarPemasukanPerHari = (keretaGerbongEkonomi.getHargaTiket() * jumlahPenumpangEkonomiPerHari.get(index)) 
									+ (keretaGerbongBisnis.getHargaTiket() * jumlahPenumpangBisnisPerHari.get(index)) 
									+ (keretaGerbongExecutive.getHargaTiket() * jumlahPenumpangExecutivePerHari.get(index));
			besarPemasukanTujuhHari += besarPemasukanPerHari; 
			System.out.println("Pemasukan Kereta Api Hari ke-" + (index+1) + " sebesar Rp." + besarPemasukanPerHari);
		}
		System.out.println("\nPemasukan Kereta Api Dalam 7 Hari sebesar Rp." + besarPemasukanTujuhHari);
	}

}
