package KereteJalurBandungBekasi;

import java.util.ArrayList;

public class TestKereta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalPemasukanPerHari = 0, totalPemasukanSelamaSeminggu = 0;
		
		ArrayList<Integer> penumpangKeretaEkonomi = new ArrayList<Integer>();
		ArrayList<Integer> penumpangKeretaBisnis = new ArrayList<Integer>();
		ArrayList<Integer> penumpangKeretaExecutive = new ArrayList<Integer>();
		
		Kereta keretaGerbongEkonomi = new Kereta(18000);
		Kereta keretaGerbongBisnis = new Kereta(35000);
		Kereta keretaGerbongExecutive = new Kereta(80000);
		
		penumpangKeretaEkonomi.add(120);
		penumpangKeretaEkonomi.add(100);
		penumpangKeretaEkonomi.add(50);
		penumpangKeretaEkonomi.add(30);
		penumpangKeretaEkonomi.add(20);
		penumpangKeretaEkonomi.add(150);
		penumpangKeretaEkonomi.add(110);
		
		penumpangKeretaBisnis.add(50);
		penumpangKeretaBisnis.add(15);
		penumpangKeretaBisnis.add(13);
		penumpangKeretaBisnis.add(10);
		penumpangKeretaBisnis.add(20);
		penumpangKeretaBisnis.add(55);
		penumpangKeretaBisnis.add(60);
		
		penumpangKeretaExecutive.add(40);
		penumpangKeretaExecutive.add(21);
		penumpangKeretaExecutive.add(11);
		penumpangKeretaExecutive.add(16);
		penumpangKeretaExecutive.add(12);
		penumpangKeretaExecutive.add(35);
		penumpangKeretaExecutive.add(40);
		
		for(int i = 0; i < penumpangKeretaExecutive.size(); i++) {
			totalPemasukanPerHari = (int) ((keretaGerbongEkonomi.getHargaTicketKereta() * penumpangKeretaEkonomi.get(i))
			+ (keretaGerbongBisnis.getHargaTicketKereta() * penumpangKeretaBisnis.get(i)) + (keretaGerbongExecutive.getHargaTicketKereta()
			* penumpangKeretaExecutive.get(i)));
			System.out.println("Hari ke : " + (i + 1) + " Jumlah pemasukan " + totalPemasukanPerHari);
			totalPemasukanSelamaSeminggu = totalPemasukanSelamaSeminggu + totalPemasukanPerHari;
		}
		System.out.println("Total Pemasukan Selama Seminggu : " + totalPemasukanSelamaSeminggu);
	}

}
