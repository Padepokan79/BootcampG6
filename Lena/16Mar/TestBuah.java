package penjualBuah;

import java.util.ArrayList;

public class TestBuah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buah apel = new Buah("Apel", 20000);
		Buah mangga = new Buah("Mangga", 16000);
		Buah jeruk = new Buah("Jeruk", 15000);
		Buah rambutan = new Buah("Rambutan", 10000);
		
		ArrayList<Integer> listJumlahApelTerjual = new ArrayList<Integer>();
		ArrayList<Integer> listJumlahManggaTerjual = new ArrayList<Integer>();
		ArrayList<Integer> listJumlahJerukTerjual = new ArrayList<Integer>();
		ArrayList<Integer> listJumlahRambutanTerjual = new ArrayList<Integer>();
	
		int besarPenghasilanPerHari, totalPenghasilanSeminggu=0;
		
		listJumlahApelTerjual.add(12);
		listJumlahApelTerjual.add(20);
		
		listJumlahManggaTerjual.add(10);
		listJumlahManggaTerjual.add(20);
		
		listJumlahJerukTerjual.add(15);
		listJumlahJerukTerjual.add(20);
		
		listJumlahRambutanTerjual.add(13);
		listJumlahRambutanTerjual.add(20);
		
		for(int i=0 ; i<7; i++) {
			int index = 0;
			if(i==4) {
				index = 1;
			}
					
			besarPenghasilanPerHari = listJumlahApelTerjual.get(index)*apel.getHarga() +
					  listJumlahJerukTerjual.get(index)*jeruk.getHarga() +
					  listJumlahManggaTerjual.get(index)*mangga.getHarga() +
					  listJumlahRambutanTerjual.get(index)*rambutan.getHarga();
			
			System.out.println("Penghasilan hari ke-"+(i+1)+" : Rp "+besarPenghasilanPerHari);
			totalPenghasilanSeminggu = totalPenghasilanSeminggu + besarPenghasilanPerHari;
		}
		
			System.out.println("Total penghasilan selama 1 minggu: Rp "+totalPenghasilanSeminggu);
		
	}

}
