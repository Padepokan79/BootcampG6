package keretaApi;

import java.util.ArrayList;

public class TestKeretaApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kereta gerbongEkonomi = new Kereta("Ekonomi", 18000);
		Kereta gerbongBisnis = new Kereta("Bisnis", 35000);
		Kereta gerbongEksekutif = new Kereta("Eksekutif", 80000);

		ArrayList<Integer> listPenumpangEkonomi = new ArrayList<Integer>();
		ArrayList<Integer> listPenumpangBisnis = new ArrayList<Integer>();
		ArrayList<Integer> listPenumpangEksekutif = new ArrayList<Integer>();
		
		int besarPemasukanPerHari=0, totalPemasukkanSeminggu=0;
		
		listPenumpangEkonomi.add(120);
		listPenumpangEkonomi.add(100);
		listPenumpangEkonomi.add(50);
		listPenumpangEkonomi.add(30);
		listPenumpangEkonomi.add(20);
		listPenumpangEkonomi.add(150);
		listPenumpangEkonomi.add(110);
		
		listPenumpangBisnis.add(50);
		listPenumpangBisnis.add(15);
		listPenumpangBisnis.add(13);
		listPenumpangBisnis.add(10);
		listPenumpangBisnis.add(20);
		listPenumpangBisnis.add(55);
		listPenumpangBisnis.add(60);
		
		listPenumpangEksekutif.add(40);
		listPenumpangEksekutif.add(21);
		listPenumpangEksekutif.add(11);
		listPenumpangEksekutif.add(16);
		listPenumpangEksekutif.add(12);
		listPenumpangEksekutif.add(35);
		listPenumpangEksekutif.add(40);
		
		for(int i=0; i< 7 ; i++) {
			besarPemasukanPerHari = listPenumpangEkonomi.get(i)*gerbongEkonomi.getHargaTiket()+
									listPenumpangBisnis.get(i)*gerbongBisnis.getHargaTiket() +
									listPenumpangEksekutif.get(i)*gerbongEksekutif.getHargaTiket();
			System.out.println("Pemasukan hari ke-"+(i+1)+" : Rp "+besarPemasukanPerHari);
			totalPemasukkanSeminggu = totalPemasukkanSeminggu + besarPemasukanPerHari;
		}
		
			System.out.println("Total pemasukkan selama 1 minggu: Rp "+totalPemasukkanSeminggu);
		
		

	}

}
