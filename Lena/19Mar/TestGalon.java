package soal3Galon;

import java.util.ArrayList;

public class TestGalon {
	public static void main(String[] args) {
		System.out.println("Seorang tukang isi ulang galon menjual setiap harinya kecuali hari minggu:");
		System.out.println("Sega\t12 galon\tseharga Rp 4000/galon");
		System.out.println("Ron89\t8 galon\tseharga Rp 4700/galon");
		System.out.println("Le Man\t17 galon\tseharga Rp 5400/galon");
		System.out.println("berapa total pendapatan dalam seminggu dan berapa galon Le Man yang terisi ulang pada hari rabu-minggu?");
		
		Galon sega = new Galon("Sega", 4000);
		Galon ron89 = new Galon("Ron89", 4700);
		Galon leman	= new Galon("Le Man", 5400);
		
		ArrayList<Integer> listJumlahGalonTerjual = new ArrayList<Integer>();
		
		listJumlahGalonTerjual.add(12);
		listJumlahGalonTerjual.add(8);
		listJumlahGalonTerjual.add(17);
		
		int totalPendapatan=0,jumlahLeman=0;
		
		for(int i=0; i<6 ; i++) {
			totalPendapatan= totalPendapatan + listJumlahGalonTerjual.get(0)*sega.getHarga() + listJumlahGalonTerjual.get(1)*ron89.getHarga() + listJumlahGalonTerjual.get(2)*leman.getHarga();
			
			if(i>=2) {
				jumlahLeman += listJumlahGalonTerjual.get(2);
			}
		}
		
		System.out.println("\n\nTotal pendapatan penjualan dalam seminggu: Rp "+totalPendapatan);
		System.out.println("\nJumlah galon Le Man yang terisi ulang pada hari rabu-minggu: "+jumlahLeman);
	}
}
